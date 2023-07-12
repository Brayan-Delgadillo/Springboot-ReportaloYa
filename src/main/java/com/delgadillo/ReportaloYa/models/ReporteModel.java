package com.delgadillo.ReportaloYa.models;


import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "reporte")
public class ReporteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	private String nickname;
	private String colegio;
	private String nivel;
	private String grado;
	private String seccion;
	private String descripcion;
	private Date fecha_pub;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getColegio() {
		return colegio;
	}
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_pub() {
		return fecha_pub;
	}
	public void setFecha_pub(Date fecha_pub) {
		this.fecha_pub = fecha_pub;
	}
}
