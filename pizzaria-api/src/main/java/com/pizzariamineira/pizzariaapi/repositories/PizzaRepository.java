package com.pizzariamineira.pizzariaapi.repositories;

import com.pizzariamineira.pizzariaapi.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository <Pizza, Long> {
}
