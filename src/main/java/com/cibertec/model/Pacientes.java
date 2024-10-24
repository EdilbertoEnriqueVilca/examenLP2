package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "pacientes")
public class Pacientes {
	
	@Id
	private int codpac;
	private String dnipa;
	private String nombrep;
	private String apellidop;
	private String usuario;
	private String telefono;
	
	@Override
	public String toString() {
		return "Paciente[codpac= "+ this.codpac +" , nombrep = " + this.nombrep + " , apellidop= " + this.apellidop + " , usuario = " + this.usuario +" , telefono = " + this.telefono + "]";
	}
	
	
	public int getCodpac() {
		return codpac;
	}
	public void setCodpac(int codpac) {
		this.codpac = codpac;
	}
	public String getDnipa() {
		return dnipa;
	}
	public void setDnipa(String dnipa) {
		this.dnipa = dnipa;
	}
	public String getNombrep() {
		return nombrep;
	}
	public void setNombrep(String nombrep) {
		this.nombrep = nombrep;
	}
	public String getApellidop() {
		return apellidop;
	}
	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
