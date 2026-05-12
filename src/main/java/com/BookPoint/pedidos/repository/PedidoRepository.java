package com.BookPoint.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookPoint.pedidos.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
