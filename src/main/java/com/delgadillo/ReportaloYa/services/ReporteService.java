package com.delgadillo.ReportaloYa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delgadillo.ReportaloYa.models.ReporteModel;
import com.delgadillo.ReportaloYa.repositories.ReporteRepository;

@Service
public class ReporteService {
	@Autowired
	ReporteRepository reporteRepository;
	
	public ArrayList<ReporteModel> obtenerReportes() {
		return (ArrayList<ReporteModel>) reporteRepository.findAll();
	}
	
	public ReporteModel guardarReporte(ReporteModel reporte) { 
		return reporteRepository.save(reporte);
	}
	
	public Optional<ReporteModel> obtenerPorId(Long id) {
		return reporteRepository.findById(id);
	}
	
	public ArrayList<ReporteModel> obtenerPorColegio(String colegio) {
		return reporteRepository.findByColegio(colegio);
	}
	
	public ArrayList<ReporteModel> obtenerPorGrado(String grado) {
		return reporteRepository.findByGrado(grado);
	}
	
	public boolean eliminarReporte(Long id) {
		try {
			reporteRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}
