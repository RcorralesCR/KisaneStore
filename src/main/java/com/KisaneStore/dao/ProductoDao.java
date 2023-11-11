package com.KisaneStore.dao;

import static com.github.mustachejava.util.NodeValue.value;
import com.KisaneStore.domain.Producto;
import java.util.List;
import static javax.management.Query.value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoDao 
        extends JpaRepository <Producto, Long>{
    
   /* 
   //Producto findByDescription (String descripcion);
   // La consulta de productos que tienen esa descripcion
   */
    
    
    // Una consulta ampliada nativa
       // los precios que estan en este filtro los ordene por descripcion
   public List<Producto> findByPrecioBetweenOrderByDescripcion(double pinf, double psup);
   
   
   //Una consulta ampliada tipo JPQL
   
   @Query(value="SELECT a FROM Producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
   public List<Producto> metodoJPQL(@Param("precioInf")double precioInf, @Param("precioSup")double precioSup);

   @Query(nativeQuery = true,//SQL, Consulta Nativa
           value="SELECT * FROM producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
   public List<Producto> metodoNativo(@Param("precioInf")double precioInf, @Param("precioSup")double precioSup);
}



