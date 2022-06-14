package fr.diginamic.maison;

public class Maison {
	
	private Piece[] pieces;

	public Maison(Piece[] pieces) {
		//super();
		this.pieces = pieces;
	}
	
	public void ajouterPiece(Piece pieceToAdd) {
		
		boolean isOk1 = pieceToAdd != null;
		boolean isOk2 = true;
		boolean isOk3 = true;
		
		if(isOk1) {
			isOk2 = pieceToAdd.getSuperficie() > 0.0d;
			isOk3 = pieceToAdd.getNumeroEtage() >= 0;
		}
		
		if (isOk1 && isOk2 && isOk3) {
			Piece[] tempTab = new Piece[this.pieces.length + 1];
			for (int i=0; i<this.pieces.length; i++) {
				tempTab[i] = this.pieces[i];
			}
			tempTab[this.pieces.length] = pieceToAdd;
			this.pieces = tempTab;
		}
		else {
			String comment = "Ajout refusé, Donnée incorrecte : ";
			if(!isOk1) {
				comment += "Objet à 'null' ";
			}
			if(!isOk2) {
				comment += "Superficie négative ou nulle ";
			}
			if(!isOk3) {
				comment += "Etage négatif ";
			}
			System.out.println(comment + "\n");
		}
		
		
	}
	
	public double getSuperficieMaison() {
		double valToReturn = 0.0d;
		for(Piece maPiece : this.pieces) {
			valToReturn += maPiece.getSuperficie();
		}
		return valToReturn;
	}
	
	public double getSuperficieEtage(int etage) {
		double valToReturn = 0.0d;
		for(Piece maPiece : this.pieces) {
			if (maPiece.getNumeroEtage() == etage) {
				valToReturn += maPiece.getSuperficie();	
			}
		}
		return valToReturn;
	}
	
	public double getSuperficieType(String type) {
		double valToReturn = 0.0d;
		for(Piece maPiece : this.pieces) {
			if (maPiece.getType().equals(type)) {
				valToReturn += maPiece.getSuperficie();	
			}
		}
		return valToReturn;
	}
	
	public int getNombrePieceType(String type) {
		int cpt = 0;
		for(Piece maPiece : this.pieces) {
			if (maPiece.getType().equals(type)) {
				cpt++;	
			}
		}
		return cpt;
	}

	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

}
