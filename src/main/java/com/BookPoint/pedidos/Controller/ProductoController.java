package com.BookPoint.pedidos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookPoint.pedidos.model.Producto;
import com.BookPoint.pedidos.service.ProductoService;

@RestController
@RequestMapping("api/v1/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping()
    public Producto postProducto(@RequestBody Producto producto){
        return productoService.crearProducto(producto);
    }
}
