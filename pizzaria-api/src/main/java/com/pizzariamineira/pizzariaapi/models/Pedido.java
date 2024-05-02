package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte idPedido;

    @Column
    private LocalDateTime dataHora;
    @ManyToOne
    @JoinColumn
    private Cliente cliente;
    @ManyToOne
    @JoinColumn
    private Fornada fornada;

    @OneToMany(mappedBy = "pedido")
    private List<BebidaPedida> BebidaPedida;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL )
    private List<PizzaPedida> PizzaPedida;


    public Pedido() {
    }

    public byte getIdFornada() {
        return idPedido;
    }

    public void setIdFornada(byte idFornada) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornada getFornada() {
        return fornada;
    }

    public void setFornada(Fornada fornada) {
        this.fornada = fornada;
    }

    public List<BebidaPedida> getBebidaPedida() {
        return BebidaPedida;
    }

    public void setBebidaPedida(List<BebidaPedida> bebidaPedida) {
        BebidaPedida = bebidaPedida;
    }

    public List<PizzaPedida> getPizzaPedida() {
        return PizzaPedida;
    }

    public void setPizzaPedida(List<PizzaPedida> pizzaPedida) {
        PizzaPedida = pizzaPedida;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
