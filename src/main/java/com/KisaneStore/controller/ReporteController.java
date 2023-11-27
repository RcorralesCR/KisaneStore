/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KisaneStore.controller;

import com.KisaneStore.service.ReporteService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reportes")
public class ReporteController {

    @Autowired
    ReporteService reporteService;

    @GetMapping("/principal")
    public String listado(Model model) {
        return "/reportes/principal";
    }

    @GetMapping("/usuarios")
    public ResponseEntity<Resource>
            ReporteUsuarios(@RequestParam String tipo)
            throws IOException {
        var reporte = "usuarios";
        return reporteService.generaReporte(reporte, null, tipo);
    }

    @GetMapping("/ventas")
    public ResponseEntity<Resource>
            ReporteVentas(@RequestParam String tipo)
            throws IOException {
        var reporte = "ventas";
        return reporteService.generaReporte(reporte, null, tipo);
    }

    @GetMapping("/productos")
    public ResponseEntity<Resource>
            ReporteProductos(@RequestParam String tipo)
            throws IOException {
        var reporte = "productos";
        return reporteService.generaReporte(reporte, null, tipo);
    }

    @GetMapping("/facturas")
    public ResponseEntity<Resource>
            ReporteFacturas(@RequestParam String tipo)
            throws IOException {
        var reporte = "facturas";
        return reporteService.generaReporte(reporte, null, tipo);
    
    }

}