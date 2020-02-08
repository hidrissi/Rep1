package org.ING.Logiciel;

import java.util.Random;

public class Fonctions {
	
	
	int counter =0;
	
	// generate a table of random numbers
	public  int[] randomTab(final int size) {
		int[] tab = new int[size];
		for (int i = 0; i < tab.length; i++) {Random r = new Random(); tab[i] = r.nextInt();
		}
		return tab;
		}
	
	// display random table in console
	public void affichertableau(int[] table) {
		for (int i = 0; i < table.length; i++) {System.out.println(table[i] + " ");}		
	}
	
	public int[] reverseTable(int[] table) {
		int n = table.length;
		int[] rev = new int[n];
		for (int i = n-1; i >=0; i--) {rev[i] = table[n-i-1];}
		return rev;
	} 

	public void count() {
		while(true) {counter ++;}
	}
	
	// Sort random table by Insertion
	public  int[] triparInsertion(int[] t) {
		for (int j = 2; j < t.length; j++) {
			int cle = t[j];
			int i = j - 1;
			while ((i >= 0) && (t[i] > cle)) {
				t[i + 1] = t[i]; i = i - 1;
			}
			t[i + 1] = cle;
		}
		return t;
	}
	
	//sort random table by bubble
	public  int[] triABulle(int[] tableau) {
		boolean permut = true;
		while (permut) {
			permut = false;
			for (int i = 0; i < (tableau.length - 1); i++) {
				if (tableau[i] > tableau[i + 1]) {
					int tmp = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = tmp;
					permut = true;
				}}
		} 
		return tableau;
	}

	// sort random table by selection
	public int[] triSelection(int[] tableau) {
		int min = 0;
		for (int i = 0; i < (tableau.length - 1); i++) {
			min = i;
			for (int j = i + 1; j < tableau.length; j++) {
				if (tableau[j] < tableau[min]) {
					min = j;
				}
			}
			int tmp = tableau[min];
			tableau[min] = tableau[i];
			tableau[i] = tmp;
		} return tableau;
	}
	
	
	public boolean estVide(int[] tableau) {
		
		if (tableau.length == 0) return true;
		else return false;	
	}

}
