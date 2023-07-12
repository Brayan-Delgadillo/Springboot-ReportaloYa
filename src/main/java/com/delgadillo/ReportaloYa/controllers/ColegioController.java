package com.delgadillo.ReportaloYa.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delgadillo.ReportaloYa.models.ColegioModel;
import com.delgadillo.ReportaloYa.services.ColegioService;

@RestController
@RequestMapping("/colegios")
public class ColegioController {
	@Autowired
	ColegioService colegioService;
	
	@GetMapping()
	public ArrayList<ColegioModel> obtenerColegios() {
		return colegioService.obtenerColegios();
	}
	
	@PostMapping()
	public ColegioModel guardarColegio(@RequestBody ColegioModel reporte) {
		return this.colegioService.guardarColegio(reporte);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.colegioService.eliminarColegio(id);
		if (ok) {
			return "Se eliminó el colegio con id " + id;
		} else {
			return "No se pudó eliminar el colegio con id " + id;
		}
	}
}
