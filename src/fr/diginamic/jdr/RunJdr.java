package fr.diginamic.jdr;

import java.util.Scanner;

public class RunJdr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;

		Player player = new Player();
		boolean persoCreated = false;
		char choice;

		do {
			persoCreated = player.getName() != "";
			displayGeneralMenu(player);
			choice = scanner.next().charAt(0);

			switch (choice) {
			case 'Q':
			case 'q':
				quit = true;
				break;
			case 'P':
			case 'p':
				if (!persoCreated) {
					player = displayCreationMenuAndCreatePlayer(scanner);
					persoCreated = true;
				}
				break;
			case 'A':
			case 'a':
				if (persoCreated) {
					displayPlayerInfos(player, scanner);
				}

				break;
			case 'C':
			case 'c':
				if (persoCreated) {
					displayCombat(player, scanner);
				}
				break;
			}

		} 
		while (!quit);
		System.out.println("\nFin du programme.");
		scanner.close();
	}

	private static void displayCombat(Player player, Scanner scanner) {
		boolean isCombatOver = false;
		boolean isCreatureChoosen = false;
		char choice;
		int turnNumber = 1;
		int playerAttack = 0;
		int creatureAttack = 0;
		Creature creature = null;

		while (!isCreatureChoosen) {
			displayCreatureChoice();
			choice = scanner.next().charAt(0);
			switch (choice) {
			case 'L':
			case 'l':
				creature = new Creature("Wolf");
				isCreatureChoosen = true;
				break;
			case 'G':
			case 'g':
				creature = new Creature("Gobelin");
				isCreatureChoosen = true;
				break;
			case 'T':
			case 't':
				creature = new Creature("Troll");
				isCreatureChoosen = true;
				break;
			default :
				isCreatureChoosen = false;
				break;
			}
			
			if (isCreatureChoosen) {
				System.out.println("\n Créature choisie : " + creature.toString());
			}
		}
		
		displayCombatHeader(creature);
		do {
			displayTurnHeader(player, turnNumber, creature);

			do {
				choice = scanner.next().charAt(0);
			} while ((choice != 'C') && (choice != 'c'));

			playerAttack = (int) (player.getStrength() + Math.round(10 * Math.random()));
			creatureAttack = (int) (creature.getStrength() + Math.round(10 * Math.random()));
			int diffAttack = 0;

			if (playerAttack >= creatureAttack) {
				diffAttack = playerAttack - creatureAttack;
				creature.setLife(creature.getLife() - diffAttack);
				System.out.println(" Tour gagné par " + player.getName() + " / " + creature.getType() + " perd " + diffAttack + " Pv");
			} 
			else {
				diffAttack = creatureAttack - playerAttack;
				player.setLife(player.getLife() - diffAttack);
				System.out.println(" Tour gagné par " + creature.getType() + " / " + player.getName() + " perd " + diffAttack + " Pv");
			}

			if (player.getLife() <= 0) {
				isCombatOver = true;
				System.out.println("\n Combat perdu !! " + creature.getType() + " a gagné !! Votre personnage va être effacé");
				displayInfos(player);
				player.reset();
				do {
					choice = scanner.next().charAt(0);
				} 
				while ((choice != 'C') && (choice != 'c'));
			}
			if (creature.getLife() <= 0) {
				isCombatOver = true;
				player.setScore(player.getScore() + creature.getLoot());
				System.out.println("\n Combat gagné !! " + creature.getType() + " a perdu !! Score augmenté de : " + creature.getLoot());
				displayInfos(player);
				do {
					choice = scanner.next().charAt(0);
				} 
				while ((choice != 'C') && (choice != 'c'));
			}

			turnNumber++;
		} 
		while (!isCombatOver);

	}

	public static void displayTurnHeader(Player player, int turnNumber, Creature creature) {
		System.out.println();
		System.out.println("******************************************************************************");
		System.out.print("\n Tour n° : " + turnNumber + " / " + player.getName() + " Pv : " + player.getLife() + " St : " + player.getStrength());
		System.out.println(" / " + creature.getType() + " Pv : " + creature.getLife() + " St : " + creature.getStrength()); 
		System.out.println(" 'C' pour combattre");
	}

	public static void displayCombatHeader(Creature creature) {
		System.out.println("\n\n\n\n");
		System.out.println("**************************");
		System.out.println("*                        *");
		System.out.println("*        COMBAT :        *");
		System.out.println("*                        *");
		System.out.println("**************************");
		System.out.println();
		System.out.println(" Adversaire de type : " + creature.getType());
	}

	private static void displayCreatureChoice() {
		System.out.println("\n\n\n\n");
		System.out.println("**************************");
		System.out.println("*                        *");
		System.out.println("*  Choisir l'adversaire  *");
		System.out.println("*                        *");
		System.out.println("**************************");
		System.out.println();
		System.out.println(" Loup : L");
		System.out.println(" Gobelin : G");
		System.out.println(" Troll : T");
	}

	private static void displayInfos(Player player) {
		System.out.println();
		System.out.println(" Infos :");
		System.out.println();
		System.out.println(" Nom : " + player.getName());
		System.out.println(" Force : " + player.getStrength());
		System.out.println(" Vie : " + player.getLife());
		System.out.println(" Score : " + player.getScore());
		System.out.println();
		System.out.println(" 'C' pour continuer");
	}

	private static void displayPlayerInfos(Player player, Scanner scanner) {
		boolean isContinue = false;
		char choice;
		do {
			System.out.println("\n\n\n\n");
			System.out.println("**************************");
			System.out.println("*                        *");
			System.out.println("*       INFOS DU         *");
			System.out.println("*     PERSONNAGE :       *");
			System.out.println("*                        *");
			System.out.println("**************************");
			System.out.println();
			System.out.println(" Nom : " + player.getName());
			System.out.println(" Force : " + player.getStrength());
			System.out.println(" Vie : " + player.getLife());
			System.out.println(" Score : " + player.getScore());
			System.out.println("\n 'C' pour continuer");
			choice = scanner.next().charAt(0);
			if ((choice == 'C') || (choice == 'c')) {
				isContinue = true;
			}
		} while (!isContinue);
	}

	private static Player displayCreationMenuAndCreatePlayer(Scanner scanner) {
		boolean nameOk = false;
		boolean isContinue = false;
		char choice;
		String playerName;

		do {
			System.out.println("\n\n\n\n");
			System.out.println("**************************");
			System.out.println("*                        *");
			System.out.println("*      CREATION DU       *");
			System.out.println("*      PERSONNAGE :      *");
			System.out.println("*                        *");
			System.out.println("**************************");
			System.out.println("\n Saisir le nom : ");
			playerName = scanner.next();
			
			if (playerName != "") {
				nameOk = true;
			}
			else {
				nameOk = false;
			}
			
		} 
		while (!nameOk);

		Player player = new Player(playerName);

		System.out.println("\n Joueur crée : " + player.toString() + "\n");
		do {
			System.out.println(" 'C' pour continuer");
			choice = scanner.next().charAt(0);
			if ((choice == 'C') || (choice == 'c')) {
				isContinue = true;
			}
		} 
		while (!isContinue);
		return player;
	}

	private static void displayGeneralMenu(Player player) {
		boolean isPlayerExists = player.getName() != "";
		System.out.println("\n\n\n\n");
		System.out.println("**************************");
		System.out.println("*                        *");
		System.out.println("*         MENU :         *");
		System.out.println("*                        *");
		System.out.println("**************************");
		System.out.println("*                        *");
		if (!isPlayerExists) {
			System.out.println("*  P : créer Personnage  *");
		}
		
		if (isPlayerExists) {
			System.out.println("*  C : Combattre         *");
			System.out.println("*  A : Afficher infos    *");
		}
		System.out.println("*  Q : Quitter           *");
		System.out.println("*                        *");
		System.out.println("**************************");
	}

}
