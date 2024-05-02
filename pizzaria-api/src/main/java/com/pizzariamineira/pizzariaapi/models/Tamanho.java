package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tamanhos")
public class Tamanho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte idTamanho;
    @Column
    private String nome;
    @Column
    private float desconto;
    @OneToMany(mappedBy = "tamanho", cascade = CascadeType.ALL)
    private List<PizzaPedida> PizzaPedida;

    public Tamanho() {
    }

    public byte getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(byte idTamanho) {
        this.idTamanho = idTamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public List<PizzaPedida> getPizzaPedida() {
        return PizzaPedida;
    }

    public void setPizzaPedida(List<PizzaPedida> pizzaPedida) {
        PizzaPedida = pizzaPedida;
    }
}
