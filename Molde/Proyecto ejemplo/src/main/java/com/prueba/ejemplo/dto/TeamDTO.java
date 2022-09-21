package com.prueba.ejemplo.dto;

import lombok.Getter;
import lombok.Setter;

public class TeamDTO {

	private @Setter @Getter String name;

	private @Setter @Getter String country;

	private @Setter @Getter int points;

	public TeamDTO(String name, String country, int points) {
		this.name = name;
		this.country = country;
		this.points = points;
	}

	@Override
	public String toString() {
		return String.valueOf(name);
	}

}
