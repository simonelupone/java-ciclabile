package org.collections.java;

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
        if (listaInteri.length == 0) {
            return false;
        }
        return listaInteri.length > current;
    }

    public int getElementoSuccessivo() throws ArrayIndexOutOfBoundsException {

        if (current >= listaInteri.length) {

            System.out.println("Hai raggiunto la fine dell'array.");
            System.out.println("Vuoi azzerare il contatore? (s/n))");

            String choice = sc.nextLine().toLowerCase();

            switch (choice) {
                case "s":
                    current = 0;
                    break;
                case "n":
                    throw new ArrayIndexOutOfBoundsException(
                            "Indice più grnade dell'array. Per continuare il ciclo devi resettare il contatore!");
                default:
                    System.out.println("Scegli (s/n)");
                    break;
            }

            sc.close();
        }

        int number = listaInteri[current];

        System.out.println("number: " + number);

        current++;

        return number;
    }

}
