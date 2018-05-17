/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenm5_castro;

/**
 *
 * @author alumne
 */
public class Pantry {
    //inicialització de variables
	private Jam jar1;
	private Jam jar2;
	private Jam jar3;
	private Jam selected;

        
        //Creem el constructor amb 3 variables JAM
	Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}

    /**
     * Metode per mostrar els jars del 1 al 3 per pantalla
     *
     */
    public void print() {
		System.out.print("1: ");
		jar1.print();
		System.out.print("2: ");
		jar2.print();
		System.out.print("3: ");
		jar3.print();
	}

    /**
     * 
     * Es un metode que li pasem per parametre un int tipus jarNumber
     * i si es igual a 1 seleciona el jar1 si es igual a 2 selecionas el jar 2 i si es 3 seleciones el 3 
     *
     * @param jarNumber
     */
    public void select(int jarNumber) {
		if (jarNumber == 1) {
			selected = jar1;
		} else if (jarNumber == 2) {
			selected = jar2;
		} else {
			selected = jar3;
		}
	}

    /**
     *
     * Metode que li pasem per parametre un int 
     * @param oz
     */
    public void spread(int oz) {
		selected.spread(oz);
	}
}