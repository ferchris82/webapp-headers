package org.chrisferdev.apiservlet.webapp.headers.services;

import org.chrisferdev.apiservlet.webapp.headers.models.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
}
