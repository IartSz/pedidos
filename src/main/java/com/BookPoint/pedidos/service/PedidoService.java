package com.BookPoint.pedidos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookPoint.pedidos.model.Pedido;
import com.BookPoint.pedidos.repository.PedidoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido crear(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listar(){
        return pedidoRepository.findAll();
    }

    public void eliminar(Long id){
        pedidoRepository.deleteById(id);
    }
}
