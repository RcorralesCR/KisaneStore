package com.KisaneStore.dao;

import com.KisaneStore.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao 
        extends JpaRepository <Categoria, Long>{
    
}
