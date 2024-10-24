package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.model.Pacientes;
import com.cibertec.repository.IsubjectRepository;

@Controller
public class ProyectoController {

	@Autowired
	private IsubjectRepository repos;
	
	@GetMapping ("/registro")
	public String registrarPaciente(@RequestParam(name = "name", required = false, defaultValue = "paciente") String name, Model model) {
		
		Pacientes pacientes = new Pacientes();
		pacientes.setCodpac(1);
		pacientes.setNombrep("usuario1");
		pacientes.setApellidop("apellido usuario");
		pacientes.setUsuario("user00");
		pacientes.setTelefono("99999999");
		
		/*
	private int codpac;
	private String dnipa;
	private String nombrep;
	private String apellidop;
	private String usuario;
	private String telefono;
	*/
		
		pacientes = repos.save(pacientes);
		model.addAttribute("name", pacientes);
		
		return "registro";
	}
	
	@GetMapping("/listado")
	public String listPacientes(Model model) {
		model.addAttribute("ltsPacientes",repos.findAll());
		return "listado";
	}
	
	
	
}
