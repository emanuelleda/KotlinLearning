package com.smarthome;

import com.smarthome.devices.LampadaInteligente;
import com.smarthome.devices.SmartTvDevice;
import com.smarthome.service.CasaInteligente;

public class MainHome {
    public static void main(String[] args) {

        // 1. Instanciação dos dispositivos
        SmartTvDevice tv = new SmartTvDevice("Android TV", "Entretenimento", "Residencial");
        LampadaInteligente lampada = new LampadaInteligente("Google Lamp", "Utilidades", "Sala");

        // 2. Inicialização da Central de Controle
        CasaInteligente minhaCasa = new CasaInteligente(tv, lampada);

        System.out.println("=== TESTANDO SMART TV ===");
        minhaCasa.ligarTv();
        minhaCasa.aumentarVolumeTv();
        minhaCasa.mudarCanalTvParaProximo();
        System.out.println(tv.mostrarInfo()); // Exibe nome, categoria e estado atual

        System.out.println("\n=== TESTANDO LÂMPADA INTELIGENTE ===");
        minhaCasa.ligarLuz();
        minhaCasa.aumentarBrilhoLuz();
        System.out.println(lampada.mostrarInfo());

        System.out.println("\n=== STATUS DO SISTEMA ===");
        System.out.println(String.format("Dispositivos ativos no momento: %d",
                minhaCasa.getContadorDispositivosLigados()));

        System.out.println("\n=== FINALIZANDO DIA ===");
        minhaCasa.desligarTodosOsDispositivos();

        System.out.println(String.format("Contagem final de ativos: %d",
                minhaCasa.getContadorDispositivosLigados()));
    }
}