package com.prueba.ejemplo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.ejemplo.dto.TeamDTO;
import com.prueba.ejemplo.service.EjemploService;

@SpringBootTest
public class EjemploServiceTests {

	@Autowired
	EjemploService ejemploService;

	@Test
	public void getTeams() {
		List<TeamDTO> teamsReturn = ejemploService.getTeams();
		assertNotNull(teamsReturn);
		assertTrue(teamsReturn.size() > 0);
		assertTrue(teamsReturn.get(0).getName().equals("Bayern Munich"));
	}

	@Test
	public void getTeamsFull() {
		List<TeamDTO> teamsReturn = ejemploService.getTeamsFull();
		assertNotNull(teamsReturn);
		assertTrue(teamsReturn.size() > 0);
		assertTrue(teamsReturn.get(0).getName().equals("Bayer Leverkusen"));
		assertTrue(teamsReturn.get(0).getCountry().equals("Alemania"));
	}

	@Test
	public void getTeamsCountry() {
		List<TeamDTO> teamsReturn = ejemploService.getTeamsCountry();
		assertNotNull(teamsReturn);
		assertTrue(teamsReturn.size() > 0);
		assertTrue(teamsReturn.get(0).getCountry().equals("Argentina"));
	}

	@Test
	public void getTeamsPoints() {
		List<TeamDTO> teamsReturn = ejemploService.getTeamsPoints();
		assertNotNull(teamsReturn);
		assertTrue(teamsReturn.size() > 0);
		assertTrue(teamsReturn.get(0).getName().equals("Real Madrid"));
		assertTrue(teamsReturn.get(0).getPoints() == 2031);
	}

}
