package com.ikasgela;

public class Cronometro {

    private long horaInicio;

    public Cronometro(long horaInicio) {
        this.horaInicio = horaInicio;
    }

    public long TiempoTranscurrido() {
        return System.nanoTime() - this.horaInicio;
    }

}
