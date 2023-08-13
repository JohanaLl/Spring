package com.api.market.devmarket.persistence.mapper;

import com.api.market.devmarket.domain.PurchaseItem;
import com.api.market.devmarket.persistence.entity.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    //Lo que se quiere obtener y lo que recibe
    //source fuente -- como se llama dentro de compras producto
    //target destino -- a que atributo de purchase item se hace referencia
    @Mappings({
            @Mapping(source = "id.idProducto", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(CompraProducto producto);
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "id.idCompra", ignore = true)
    })
    CompraProducto toComprasProducto(PurchaseItem item);
}
