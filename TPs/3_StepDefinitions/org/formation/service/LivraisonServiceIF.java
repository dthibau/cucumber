package org.formation.service;

import org.formation.model.ModeReception;

public interface LivraisonServiceIF {

	public boolean isPossible(int codePostal, ModeReception modeReception);
}
