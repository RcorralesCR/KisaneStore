package com.KisaneStore.domain;

import lombok.Data;

@Data
public class Item extends Producto{
    
    private int cantidad;

    public Item() {    
    }
    
    public Item (Producto producto){
        super.setActivo(producto.isActivo());
        super.setCategoria(producto.getCategoria());
        super.setDescripcion(producto.getDescripcion());
        super.setDetalle(producto.getDetalle());
        super.setExistencias(producto.getExistencias());
        super.setIdProducto(producto.getIdProducto());
        super.setPrecio(producto.getPrecio());
        super.setRutaImagen(producto.getRutaImagen());
        this.cantidad=0;
      
    }
}
