package com.delgadillo.ReportaloYa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delgadillo.ReportaloYa.models.ColegioModel;

@Repository
public interface ColegioRepository extends CrudRepository<ColegioModel, Long>{

}
