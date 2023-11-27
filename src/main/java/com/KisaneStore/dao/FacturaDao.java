package com.KisaneStore.dao;

import com.KisaneStore.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao 
        extends JpaRepository <Factura, Long>{
    
}
