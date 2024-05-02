package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "fornadas")
public class Fornada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte idFornada;
    @Column
    private byte nunFornada;
    @Column
    private byte qtdPizzas;
    @OneToMany(mappedBy = "fornada")
    private List<Pedido> pedidos;

    public Fornada() {
    }

    public byte getIdFornada() {
        return idFornada;
    }

    public void setIdFornada(byte idFornada) {
        this.idFornada = idFornada;
    }

    public byte getNunFornada() {
        return nunFornada;
    }

    public void setNunFornada(byte nunFornada) {
        this.nunFornada = nunFornada;
    }

    public byte getQtdPizzas() {
        return qtdPizzas;
    }

    public void setQtdPizzas(byte qtdPizzas) {
        this.qtdPizzas = qtdPizzas;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
