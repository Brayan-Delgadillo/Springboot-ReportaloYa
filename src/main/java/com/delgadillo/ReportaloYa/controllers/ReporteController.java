package com.delgadillo.ReportaloYa.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delgadillo.ReportaloYa.models.ReporteModel;
import com.delgadillo.ReportaloYa.services.ReporteService;

@RestController
@RequestMapping("/reportes")
public class ReporteController {
	@Autowired
	ReporteService reporteService;
	
	@GetMapping()
	public ArrayList<ReporteModel> obtenerReportes() {
		return reporteService.obtenerReportes();
	}
	
	@PostMapping()
	public ReporteModel guardarReporte(@RequestBody ReporteModel reporte) {
		return this.reporteService.guardarReporte(reporte);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<ReporteModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
		return this.reporteService.obtenerPorId(id);
	}
	
	@GetMapping(path = "/query-colegio")
	public ArrayList<ReporteModel> obtenerReportePorColegio(@RequestParam("colegio") String colegio) {
		return this.reporteService.obtenerPorColegio(colegio);
	}
	
	@GetMapping(path = "/query-grado")
	public ArrayList<ReporteModel> obtenerReportePorGrado(@RequestParam("grado") String grado) {
		return this.reporteService.obtenerPorGrado(grado);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.reporteService.eliminarReporte(id);
		if (ok) {
			return "Se eliminó el reporte con id " + id;
		} else {
			return "No se pudó eliminar el reporte con id " + id;
		}
	}
}
