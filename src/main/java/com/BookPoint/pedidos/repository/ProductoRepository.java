package com.BookPoint.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookPoint.pedidos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
