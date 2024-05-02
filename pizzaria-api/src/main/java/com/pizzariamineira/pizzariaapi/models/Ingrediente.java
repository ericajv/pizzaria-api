package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ingredientes")
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngrediente;

    @Column
    private String nome;
    @Column
    private float preco;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingrediente")
    private List<PizzaPedida_has_Ingrediente> PizzaPedida_has_Ingrediente;

    public Ingrediente() {
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
