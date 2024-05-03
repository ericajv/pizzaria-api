package com.pizzariamineira.pizzariaapi.controller;

import com.pizzariamineira.pizzariaapi.models.Cliente;
import com.pizzariamineira.pizzariaapi.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/cadastro")
    public Cliente cadastrarCliente(){

        Cliente cliente = new Cliente();

        cliente.setNome("erica");
        cliente.setEndereco("boa esperanca");
        cliente.setLogin("erica@email.com");
        cliente.setTelefone(123146564);
        cliente.setSenha("1234");

        cliente = this.clienteRepository.save(cliente);

        return cliente;
    }

    @GetMapping("/mostrar")
    public List<Cliente> findAll(){
        List<Cliente> clientes = this.clienteRepository.findAll();
        return clientes;
    }

    @GetMapping("/mostrar/{id}")
        public Cliente findById(@PathVariable long id){
            Optional<Cliente>resultado = this.clienteRepository.findById(id);
            if(resultado.isEmpty()){
                throw new RuntimeException("Usuário não encontrado!");
            }else {
                return resultado.get();
            }
        }


    @DeleteMapping("/excluir/{id}")
    public Cliente deleteById(@PathVariable long id){
        Cliente cliente = findById(id);
        this.clienteRepository.deleteById(id);
        return cliente;
    }

    @PutMapping("/editar/{id}")
    public Cliente updateById(@PathVariable long id,  @RequestBody Cliente cliente){
        this.findById(id);
        cliente.setId(id);
        cliente = this.clienteRepository.save(cliente);
        return cliente;

    }


}










