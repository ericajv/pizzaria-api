package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="bebidas")
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBebida;

    @Column
    private String nome;
    @Column
    private float preco;
    @OneToMany(mappedBy = "bebida")
    private List<BebidaPedida> bebidaPedida;

    public Bebida() {
    }

    public int getId() {
        return idBebida;
    }

    public void setId(int id) {
        this.idBebida = id;
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

    public List<BebidaPedida> getBebidaPedida() {
        return bebidaPedida;
    }

    public void setBebidaPedida(List<BebidaPedida> bebidaPedida) {
        this.bebidaPedida = bebidaPedida;
    }
}
