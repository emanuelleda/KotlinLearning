package com.smarthome.model;

public class SmartDevice {

    protected String nome;
    protected String categoria;
    protected boolean estadoDispositivo = false;
    protected String tipoDispositivo;

    public SmartDevice(String nome, String categoria, String tipo){
        this.nome = nome;
        this.categoria = categoria;
        this.tipoDispositivo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void ligar() {
        if (!estadoDispositivo) {
            estadoDispositivo = true;
        }
    }

    public void desligar() {
        if (estadoDispositivo) {
            estadoDispositivo = false;
        }
    }

    public String getEstado() {
        return estadoDispositivo ? "ligado" : "desligado";
    }

    public String mostrarInfo() {
        return String.format("Nome: %s, Categoria: %s, Tipo: %s está: %s",
                nome, categoria, tipoDispositivo, getEstado());
    }
}