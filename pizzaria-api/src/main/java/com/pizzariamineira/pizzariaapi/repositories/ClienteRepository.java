package com.pizzariamineira.pizzariaapi.repositories;

import com.pizzariamineira.pizzariaapi.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
