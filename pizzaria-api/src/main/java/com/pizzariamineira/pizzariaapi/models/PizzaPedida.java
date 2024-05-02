package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="pizzaPedida")
public class PizzaPedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizzaPedida;
    @Column
    private byte quantidade;

    @ManyToOne
    @JoinColumn
    private Pizza pizza;

    @ManyToOne
    @JoinColumn
    private Pedido pedido;

    @ManyToOne
    @JoinColumn
    private Tamanho tamanho;
    @OneToMany(mappedBy = "pizzaPedida")
    private List<PizzaPedida_has_Ingrediente> PizzaPedida_has_Ingrediente;

    public PizzaPedida() {
    }

    public long getIdPizzaPedida() {
        return idPizzaPedida;
    }

    public void setIdPizzaPedida(long idPizzaPedida) {
        this.idPizzaPedida = idPizzaPedida;
    }

    public byte getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(byte quantidade) {
        this.quantidade = quantidade;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public List<PizzaPedida_has_Ingrediente> getPizzaPedida_has_Ingrediente() {
        return PizzaPedida_has_Ingrediente;
    }

    public void setPizzaPedida_has_Ingrediente(List<PizzaPedida_has_Ingrediente> pizzaPedida_has_Ingrediente) {
        PizzaPedida_has_Ingrediente = pizzaPedida_has_Ingrediente;
    }
}
