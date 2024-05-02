package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="pizzas")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPizza;
    @Column
    private String nome;
    @Column
    private float precoBase;
    @Column
    private boolean personalizada;
    @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL)
    private List<PizzaPedida> PizzaPedida;

    public Pizza() {
    }

    public int getId() {
        return idPizza;
    }

    public void setId(int id) {
        this.idPizza = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public boolean isPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(boolean personalizada) {
        this.personalizada = personalizada;
    }

    public List<PizzaPedida> getPizzaPedida() {
        return PizzaPedida;
    }

    public void setPizzaPedida(List<PizzaPedida> pizzaPedida) {
        PizzaPedida = pizzaPedida;
    }
}
