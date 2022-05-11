package com.parqueadero.parqueadero.Mundo;

public class Espacio {
    private String numero;
    private Boolean estado;
    public Espacio(String numero) {
        this.numero = numero;
        this.estado = false;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
