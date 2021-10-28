package com.mobydigital.ignaciomansilla.TestBackend.models.enums;

public enum TipoDocumento {

    DNI("DNI"),
    LC("LC"),
    LE("LE");

    private final String string;

    TipoDocumento(final String string) {this.string = string;}

    public String obtener() {return string;}
}
