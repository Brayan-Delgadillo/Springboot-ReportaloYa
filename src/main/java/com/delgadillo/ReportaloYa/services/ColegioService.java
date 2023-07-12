package com.delgadillo.ReportaloYa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delgadillo.ReportaloYa.models.ColegioModel;
import com.delgadillo.ReportaloYa.repositories.ColegioRepository;

@Service
public class ColegioService {
	@Autowired
	ColegioRepository colegioRepository;
	
	public ArrayList<ColegioModel> obtenerColegios() {
		return (ArrayList<ColegioModel>) colegioRepository.findAll();
	}
	
	public ColegioModel guardarColegio(ColegioModel reporte) { 
		return colegioRepository.save(reporte);
	}
	
	public Optional<ColegioModel> obtenerPorId(Long id) {
		return colegioRepository.findById(id);
	}
	public boolean eliminarColegio(Long id) {
		try {
			colegioRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}
