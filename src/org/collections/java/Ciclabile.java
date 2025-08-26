package org.collections.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ciclabile {
    private int[] listaInteri;
    private int current;

    Scanner sc = new Scanner(System.in);

    public Ciclabile(int[] listaInteri) {
        this.listaInteri = listaInteri;
        if (listaInteri.length > 0)
            current = 0;
    }

    public Ciclabile() {
        this.listaInteri = new int[0];
        this.current = 0;
    }

    public int[] getListaInteri() {
        return listaInteri;
    }

    public int getInteroDaIndice(int index) {
        return listaInteri[index];
    }

    public void setListaInteri(int[] listaInteri) {
        this.listaInteri = listaInteri;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean hasAncoraElementi() {
        if (listaInteri.length <= 1) {
            return false;
        }
        // return listaInteri.length > current;

        // ogni volta che modulo di current per length è != 0 da false,
        // se no vuol dire che ci sono elementi
        return current % listaInteri.length != 0;
    }

    public int getElementoSuccessivo() throws ArrayIndexOutOfBoundsException {

        // if (current >= listaInteri.length) {

        // System.out.println("Hai raggiunto la fine dell'array.");
        // System.out.println("Vuoi azzerare il contatore? (s/n))");

        // String choice = sc.nextLine().toLowerCase();

        // switch (choice) {
        // case "s":
        // current = 0;
        // break;
        // case "n":
        // throw new ArrayIndexOutOfBoundsException(
        // "Indice più grnade dell'array. Per continuare il ciclo devi resettare il
        // contatore!");
        // default:
        // System.out.println("Scegli (s/n)");
        // break;
        // }

        // sc.close();
        // }

        // int number = listaInteri[current];

        // System.out.println("number: " + number);

        // current++;

        // return number;

        // oppure senza fare la domanda e ciclando automaticamene
        if (listaInteri.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array vuoto!");
        }

        // il modulo di current per la lunghezza dell'array da sempre
        // il resto progressivo fino a tornare 0
        // (tipo array lungo 4 si resetterà a 4, 8, 12 perchè resto 0)
        int elemento = listaInteri[current % listaInteri.length];
        current++;
        return elemento;
    }

    public void addElement(int element) {
        int[] nuovoArray = new int[listaInteri.length + 1];
        for (int i = 0; i < listaInteri.length; i++) {
            nuovoArray[i] = listaInteri[i];
        }
        nuovoArray[nuovoArray.length - 1] = element;
        listaInteri = nuovoArray;
    }

    @Override
    public String toString() {
        return "Ciclabile{" +
                "array=" + Arrays.toString(listaInteri) +
                ", posizione=" + current +
                '}';
    }
}
