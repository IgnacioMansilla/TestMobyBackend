package com.mobydigital.ignaciomansilla.TestBackend.exception;

public class CandidatoNotFoundException extends RuntimeException{

    private int idCandidato;
    public CandidatoNotFoundException(int idCandidato,String msg){
        super(msg);
        this.idCandidato = idCandidato;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + idCandidato;
    }

}
