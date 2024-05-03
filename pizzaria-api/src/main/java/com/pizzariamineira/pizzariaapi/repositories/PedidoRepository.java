package com.pizzariamineira.pizzariaapi.repositories;

import com.pizzariamineira.pizzariaapi.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
