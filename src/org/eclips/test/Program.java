package org.eclips.test;

public class Program {


	public static void main(String[] args) {
		System.out.println(totale("bon", "jour"));
		System.out.println(totale("Hi","bon", "jour", "ciao"));
	}
	public static int totale(String ... args) {
		var resultat = 0;
		for (String elt :  args) {
			resultat = resultat + elt.length();
		}
		return resultat;
	}
}
	/*
	 * public static int somme(int a, int b) { return a + b ; } public static int
	 * somme(int a, int b, int c) { return a + b + c; }
	 */

		
			
		
	

	
 

	
	
	