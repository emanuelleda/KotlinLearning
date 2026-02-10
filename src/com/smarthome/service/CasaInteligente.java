package com.smarthome.service;

import com.smarthome.devices.SmartTvDevice;
import com.smarthome.devices.LampadaInteligente;

public class CasaInteligente {

    private final SmartTvDevice smartTvDevice;
    private final LampadaInteligente smartLightDevice;
    private int contadorDispositivosLigados = 0;

    public CasaInteligente(SmartTvDevice tv, LampadaInteligente lampada) {
        this.smartTvDevice = tv;
        this.smartLightDevice = lampada;
    }

    public int getContadorDispositivosLigados() {
        return contadorDispositivosLigados;
    }

    public void ligarTv() {
        if (!smartTvDevice.getEstado().equals("ligado")) {
            contadorDispositivosLigados++;
            smartTvDevice.ligar();
        }
    }

    public void desligarTv() {
        if (smartTvDevice.getEstado().equals("ligado")) {
            contadorDispositivosLigados--;
            smartTvDevice.desligar();
        }
    }

    public void aumentarVolumeTv() {
        if (smartTvDevice.getEstado().equals("ligado")) {
            smartTvDevice.aumentarVolume();
        }
    }

    public void mudarCanalTvParaProximo() {
        if (smartTvDevice.getEstado().equals("ligado")) {
            smartTvDevice.proximoCanal();
        }
    }

    public void ligarLuz() {
        if (!smartLightDevice.getEstado().equals("ligado")) {
            contadorDispositivosLigados++;
            smartLightDevice.ligar();
        }
    }

    public void desligarLuz() {
        if (smartLightDevice.getEstado().equals("ligado")) {
            contadorDispositivosLigados--;
            smartLightDevice.desligar();
        }
    }

    public void aumentarBrilhoLuz() {
        if (smartLightDevice.getEstado().equals("ligado")) {
            smartLightDevice.aumentarBrilho();
        }
    }

    public void desligarTodosOsDispositivos() {
        desligarTv();
        desligarLuz();
        System.out.println("Todos os dispositivos foram desligados.");
    }
}