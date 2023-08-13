package com.api.market.devmarket.persistence;

import com.api.market.devmarket.domain.Purchase;
import com.api.market.devmarket.domain.repository.PurchaseRepository;
import com.api.market.devmarket.persistence.crud.CompraCrudRepository;
import com.api.market.devmarket.persistence.entity.Compra;
import com.api.market.devmarket.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private PurchaseMapper mapper;
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    /*El .map sive para operartodo lo que venga demtro del optional*/
    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
