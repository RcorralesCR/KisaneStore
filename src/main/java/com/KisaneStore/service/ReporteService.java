/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.KisaneStore.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;



// Emite un reporte
public interface ReporteService {
   
    public ResponseEntity<Resource> generaReporte(
       String reporte,      // Nombre del archivo donde esta guardado el reporte = "usuarios"
       Map<String, Object> parametros,  // Para pasar reporte "Obtiene parametros" ejem
       String tipo       // tipo de archivo csv,pdf...etc 
    )throws IOException;
    

}
