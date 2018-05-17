/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenm5_castro;

import java.util.Scanner;

/**
 *
 * @author Castro
 */
public class PantryTester2 {

    /**
     *Metode main on executarem i crearem la majoria de clasess anteriors com Jam i pantry
     * @param args
     */
    public static void main(String[] args) {
        //declarem el scaner per escriure
		Scanner scan = new Scanner(System.in);
                //declarem variables
		int num, amount;
                
                //creem varies Jam
		Jam goose = new Jam("Gooseberry", "7/4/2015", 12);
		Jam apple = new Jam("Crab Apple", "9/30/2015", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/2014", 3);
		Jam rhub2 = new Jam("Rhubarb", "10/31/2014", 3);
                //Creem un pantry
		Pantry hubbard = new Pantry(goose, apple, rhub);

                //missatges que es mostren per pantalla
		System.out.println("Welcome to Mother Hubbard's Party!");
		System.out.println("The jams are: ");
		hubbard.print();
		do {
                        //missatge per introduir valors 1 o 2 o 3
			System.out.println("Enter your selection (1,2,or 3):");
			num = scan.nextInt();
                        
                        //condicio depenen del que hagi introduit l'usuari
			if (num == 1 || num == 2 || num == 3) {
				hubbard.select(num);
				System.out.println("Enter amount to spread:");
				amount = scan.nextInt();
				hubbard.spread(amount);
				System.out.println("The jams are: ");
				hubbard.print();
			} else {
                            //si no mostra misatge de error 
				System.out.println("Selection out-of-range, please enter again or '-1' for exit!");
			}
                        
                        //metode  que si num es diferent de -1 es mantingui en bucle i cuan selecionin -1 li surti missatge per la pantalla 
		} while (num != -1);
		System.out.println("Good-by!");
		scan.close();
	}
}