package com.smarthome.devices;

import com.smarthome.model.ComVolume;
import com.smarthome.model.SmartDevice;

public class SmartTvDevice extends SmartDevice implements ComVolume {

    private int volumeSom = 2;
    private int numeroCanal = 1;

    public SmartTvDevice(String nome, String categoria, String tipo) {
        super(nome, categoria,tipo);
    }

    @Override
    public void aumentarVolume() {
        if (volumeSom < 100) {
            volumeSom++;
            System.out.println("Volume do som aumentado para " + volumeSom + ".");
        }
    }

    @Override
    public void diminuirVolume() {
        if (volumeSom > 0) {
            volumeSom--;
            System.out.println("Volume do som diminuído para " + volumeSom + ".");
        }
    }

    public void proximoCanal() {
        if (numeroCanal < 200) {
            numeroCanal++;
            System.out.println("Número do canal aumentado para " + numeroCanal + ".");
        }
    }

    public void canalAnterior() {
        if (numeroCanal > 0) {
            numeroCanal--;
            System.out.println("Número do canal diminuído para " + numeroCanal + ".");
        }
    }

    @Override
    public void ligar() {
        super.ligar();
        System.out.printf(
                "%s está ligada. Volume definido em %d e o canal é o %d.%n",
                nome, volumeSom, numeroCanal
        );
    }

    @Override
    public void desligar() {
        super.desligar();
        System.out.println(nome + " desligada.");
    }
}
