package com.KisaneStore.dao;

import com.KisaneStore.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao 
        extends JpaRepository <Venta, Long>{
    
}
