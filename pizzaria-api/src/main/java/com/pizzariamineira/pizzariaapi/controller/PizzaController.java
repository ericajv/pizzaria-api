package com.pizzariamineira.pizzariaapi.controller;

import com.pizzariamineira.pizzariaapi.models.Pizza;
import com.pizzariamineira.pizzariaapi.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pizza")
public class PizzaController {
    @Autowired
    private PizzaRepository pizzaRepository;

    @PostMapping("/cadastro")
    public Pizza cadastrarPizza(){

        Pizza pizza = new Pizza();

        pizza.setNome("frango");
        pizza.setPersonalizada(true);
        pizza.setPrecoBase(30.30F);

        pizza = this.pizzaRepository.save(pizza);

        return pizza;
    }
    @GetMapping("/mostrar")
    public List<Pizza> findAll(){
        List<Pizza> pizzas = this.pizzaRepository.findAll();
        return pizzas;
    }
    @GetMapping("/mostrar/{id}")
    public Pizza findById (@PathVariable long id){
        Optional<Pizza>resultado = this.pizzaRepository.findById(id);
        if(resultado.isEmpty()){
            throw new RuntimeException("Pizza não encontrada!");
        }else{
            return resultado.get();
        }

    }
    @DeleteMapping("/excluir/{id}")
    public Pizza deleteById(@PathVariable long id){
     Pizza pizza = findById(id);
     this.pizzaRepository.deleteById(id);
     return pizza;
    }
    @PutMapping("/editar/{id}")
    public Pizza updateById(@RequestBody Pizza pizza, @PathVariable int id){
        this.findById(id);
        pizza.setId(id);
        pizza=this.pizzaRepository.save(pizza);
        return pizza;
    }

}
