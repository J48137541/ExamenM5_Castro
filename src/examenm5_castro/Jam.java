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
public class Jam {
    //declaracio de totes les variables de la clase Jam
	private String contents;
	private String date;
	private int capacity;
	private static int numTotalJars, noJam = 0;

        
        //es el contructor de Jam que te 3 parametres, 2 Strings i 1 int
	Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
		numTotalJars++;
	}

    /**
     *
     * Metode boolean que retorna un true si la capacitat es = a 0
     * @return
     */
    public boolean empty() {
		return (capacity == 0);
	}

    /**
     * En el primer metode es per visualitzar els contents + data + capacitat
     * 
     * En el segond metode es per veure el número total de Jars creats des de l'inici
     * 
     * En el tercer metode es per veure el número de Jars que s'han quedat sense melmelada des de l'inici dels temps 
     *
     */
    public void print() {
		System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
		System.out.println("El número total de Jars creats des de l'inici dels temps són: " + Jam.getNumTotalJars());
		System.out.println("El número de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
	}

    /**
     * Aquest metode primer comprova que no estigui vuit i despres si el liquid es mes petit que la capacitat
     * mostra el liquid i el contents. Si es mes grand mostra la capacitat i el contingut i suma 1 a noJAM
     *
     * Si no fa lo de dalt salta al altra condicio que mostra per pantalla un missatge
     * 
     * @param fluidOz
     */
    public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz < capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
				capacity = 0;
				noJam++;			}
		} else {
			System.out.println("No jam in the Jar!");
		}
	}

    /**
     *int que retorna el numero total de Jars
     * 
     * @return
     */
    public static int getNumTotalJars() {
		return numTotalJars;
	}

    /**
     * Int que retorna el numero de noJam
     *
     * @return
     */
    public static int getNoJam() {
		return noJam;
	}
}
