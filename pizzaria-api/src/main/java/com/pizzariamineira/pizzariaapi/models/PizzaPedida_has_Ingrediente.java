package com.pizzariamineira.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "PizzaPedida_has_Ingrediente")
public class PizzaPedida_has_Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPizzaPhasIng;

    @ManyToOne
    @JoinColumn
    private PizzaPedida pizzaPedida;

    @ManyToOne
    @JoinColumn
    private Ingrediente ingrediente;

    public PizzaPedida_has_Ingrediente() {
    }

    public int getIdPizzaPhasIng() {
        return idPizzaPhasIng;
    }

    public void setIdPizzaPhasIng(int idPizzaPhasIng) {
        this.idPizzaPhasIng = idPizzaPhasIng;
    }

    public PizzaPedida getPizzaPedida() {
        return pizzaPedida;
    }

    public void setPizzaPedida(PizzaPedida pizzaPedida) {
        this.pizzaPedida = pizzaPedida;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}
