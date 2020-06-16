package it.dstech.gestione;

import java.util.ArrayList;
import java.util.List;

public class Verifica {

	public int addizione(int a, int b) {
		int somma= a+b;
		return somma;
	}

	public int sottrazione(int a, int b) {
		int sottrai= a-b;
		return sottrai;
	}
	
	public int moltiplicazione(int a, int b) {
		int moltiplica= a*b;
		return moltiplica;
	}
	
	public int divisione(int a, int b) {
		int dividi= a/b;
//		if (b!=0) {
			return dividi;
//		}else {
//		System.out.println("non puoi dividere per 0");
//		}
	}
	
}