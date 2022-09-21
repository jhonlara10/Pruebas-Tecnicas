package com.prueba.ejemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.ejemplo.dto.ResponseDTO;
import com.prueba.ejemplo.service.EjemploService;

/**
 * Controller for expose the services
 * 
 * @author jhonlara10
 */
@RestController
@RequestMapping("/ejemplo")
public class EjemploController {

	@Autowired
	private EjemploService ejemploService;

	// 1- Equipos
	@GetMapping("/teams")
	public ResponseDTO getTeams() {
		ResponseDTO response = new ResponseDTO();
		response.setTeams(ejemploService.getTeams());
		return response;
	}

	// 2- Equipos ordenados por mayor puntuación
	@GetMapping("/teams-points")
	public ResponseDTO getTeamsPoints() {
		ResponseDTO response = new ResponseDTO();
		response.setTeams(ejemploService.getTeamsPoints());
		return response;
	}

	// 3- Equipos agrupados por países
	@GetMapping("/teams-country")
	public ResponseDTO getTeamsCountry() {
		ResponseDTO response = new ResponseDTO();
		response.setTeams(ejemploService.getTeamsCountry());
		return response;
	}

	// 4- Equipos agrupados por países y ordenados alfabéticamente por su nombre
	@GetMapping("/teams-full")
	public ResponseDTO getTeamsFull() {
		ResponseDTO response = new ResponseDTO();
		response.setTeams(ejemploService.getTeamsFull());
		return response;
	}

}
