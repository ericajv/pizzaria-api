package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "bebidaPedida")
public class BebidaPedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBebidaPedida;
    @Column
    private byte quantidade;

    @ManyToOne
    @JoinColumn
    private Pedido pedido;

    @ManyToOne
    @JoinColumn
    private Bebida bebida;

    public BebidaPedida() {
    }

    public byte getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(byte quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public int getIdBebidaPedida() {
        return idBebidaPedida;
    }

    public void setIdBebidaPedida(int idBebidaPedida) {
        this.idBebidaPedida = idBebidaPedida;
    }
}
