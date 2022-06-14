package fr.diginamic.maison;

public class Maison {
	
	private Piece[] pieces;

	public Maison(Piece[] pieces) {
		//super();
		this.pieces = pieces;
	}
	
	public void ajouterPiece(Piece pieceToAdd) {
		if (pieceToAdd != null) {
			Piece[] tempTab = new Piece[this.pieces.length + 1];
			for (int i=0; i<this.pieces.length; i++) {
				tempTab[i] = this.pieces[i];
			}
			tempTab[this.pieces.length] = pieceToAdd;
			this.pieces = tempTab;
		}
		else {
			System.out.println("Ajout impossible, Objet à null !!\n");
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
