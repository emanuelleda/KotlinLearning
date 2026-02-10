package com.smarthome.devices;

import com.smarthome.model.ComBrilho;
import com.smarthome.model.SmartDevice;

public class LampadaInteligente extends SmartDevice implements ComBrilho {

    private int nivelBrilho = 0;

    public LampadaInteligente(String nome, String categoria, String tipo) {
        super(nome, categoria, tipo);
    }
    @Override
    public void aumentarBrilho() {
        if (nivelBrilho < 100) {
            nivelBrilho++;
            System.out.println("Brilho aumentado para " + nivelBrilho + ".");
        }
    }

    @Override
    public void diminuirBrilho() {
        if (nivelBrilho > 0) {
            nivelBrilho--;
            System.out.println("Brilho diminuído para " + nivelBrilho + ".");
        }
    }

    @Override
    public void ligar() {
        super.ligar();
        this.nivelBrilho = 2;
        System.out.printf("%s ligada. O nível de brilho é %d.%n", nome, nivelBrilho);
    }

    @Override
    public void desligar() {
        super.desligar();
        this.nivelBrilho = 0;
        System.out.println("Lâmpada Inteligente desligada.");
    }
}