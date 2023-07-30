package com.api.market.devmarket.persistence;

import com.api.market.devmarket.persistence.crud.ProductoCrudRepository;
import com.api.market.devmarket.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository le indica a Spring que esta clase se encarga de interactuar con la Base de datos
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    private List<Producto> getAll() {

        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
