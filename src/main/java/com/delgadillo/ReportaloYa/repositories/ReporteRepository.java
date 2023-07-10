package com.delgadillo.ReportaloYa.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delgadillo.ReportaloYa.models.ReporteModel;

@Repository
public interface ReporteRepository extends CrudRepository<ReporteModel, Long>{
	public abstract ArrayList<ReporteModel> findByColegio(String colegio);
	public abstract ArrayList<ReporteModel> findByGrado(String grado);
}
