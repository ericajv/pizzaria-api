package com.pizzariamineira.pizzariaapi.controller;

import com.pizzariamineira.pizzariaapi.models.Cliente;
import com.pizzariamineira.pizzariaapi.models.Pedido;
import com.pizzariamineira.pizzariaapi.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping("/cadastro")
    public Pedido cadatrarPedido (){
      Pedido pedido = new Pedido();
        pedido = this.pedidoRepository.save(pedido);
        return pedido;
    }
    @GetMapping("/mostrar")
    public List<Pedido> findAll(){
        List<Pedido> pedidos = this.pedidoRepository.findAll();
        return pedidos;
    }
    @GetMapping("/mostrar/{id}")
    public Pedido findById(@PathVariable long id){
        Optional<Pedido>resultado = this.pedidoRepository.findById(id);
        if(resultado.isEmpty()){
            throw new RuntimeException("O pedido nao foi encontrado");
        }else {
            return resultado.get();
        }
    }
    @PutMapping("/editar/{id}")
    public Pedido updateById(@PathVariable byte id, @RequestBody Pedido pedido){
        this.findById(id);
        pedido.setIdPedido(id);
        pedido= this.pedidoRepository.save(pedido);
        return pedido;

    }
    @DeleteMapping("/excluir/{id}")
    public Pedido deleteById(@PathVariable long id){
        Pedido pedido = findById(id);
        this.pedidoRepository.deleteById(id);
        return pedido;
    }

}
