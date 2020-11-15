package org.formation.service;

import org.formation.model.ModeReception;

public class SimpleLivraisonService implements LivraisonServiceIF {

	@Override
	public boolean isPossible(int codePostal, ModeReception modeReception) {
		
		if ( modeReception.equals(ModeReception.MAGASIN)) {
			return true;
		}
		if ( modeReception.equals(ModeReception.LIVRAISON)) {
			return codePostal > 75000 && codePostal < 96000;
		}
		if ( modeReception.equals(ModeReception.LIVRAISON_EXPRESS)) {
			return codePostal > 75000 && codePostal < 76000;
		}
		return false;
	}

}
