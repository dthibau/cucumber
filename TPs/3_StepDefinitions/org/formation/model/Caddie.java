package org.formation.model;

import lombok.Data;

@Data
public class Caddie {

	private boolean empty;

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	
}
