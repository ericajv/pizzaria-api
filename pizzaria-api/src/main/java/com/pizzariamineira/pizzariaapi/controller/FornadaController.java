package com.pizzariamineira.pizzariaapi.controller;

import com.pizzariamineira.pizzariaapi.models.Cliente;
import com.pizzariamineira.pizzariaapi.models.Fornada;
import com.pizzariamineira.pizzariaapi.models.Pedido;
import com.pizzariamineira.pizzariaapi.repositories.FornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornada")
public class FornadaController {

    @Autowired
    private FornadaRepository fornadaRepository;

    @PostMapping("/cadastro")
    public Fornada cadatrarFornada (){
        Fornada fornada = new Fornada();
        fornada = this.fornadaRepository.save(fornada);
        return fornada;
    }

    @GetMapping("/mostrar")
    public List<Fornada> findAll(){
        List<Fornada> fornada = this.fornadaRepository.findAll();
        return fornada;
    }

    @GetMapping("/mostrar/{id}")
    public Fornada findById(@PathVariable long id){
        Optional<Fornada>resultado = this.fornadaRepository.findById(id);
        if(resultado.isEmpty()){
            throw new RuntimeException("fornada não encontrado!");
        }else {
            return resultado.get();
        }
    }

    @DeleteMapping("/excluir/{id}")
    public Fornada deleteById(@PathVariable long id){
        Fornada fornada = findById(id);
        this.fornadaRepository.deleteById(id);
        return fornada;
    }

    @PutMapping("/editar/{id}")
    public Fornada updateById(@PathVariable byte id,  @RequestBody Fornada fornada){
        this.findById(id);
        fornada.setIdFornada(id);
        fornada = this.fornadaRepository.save(fornada);
        return fornada;

    }


}










