package com.company;

import java.util.Random;

public class Marcador {

    private int[] marcador = new int[6];
    Random r = new Random();
    int tirada;

    public synchronized void increment(){
        tirada = r.nextInt(6);
        marcador[tirada]++;
    }

    public int[] getMarcador() {
        return marcador;
    }
}
