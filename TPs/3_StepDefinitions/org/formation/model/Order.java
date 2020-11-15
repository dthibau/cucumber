package org.formation.model;

import lombok.Data;

@Data
public class Order {

	private long id;	
	private Caddie caddie;	
	private ModeReception modeReception;	
	private Client client;
}
