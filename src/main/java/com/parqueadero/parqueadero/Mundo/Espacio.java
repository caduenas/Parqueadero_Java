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
    public String getEstado() {
        if (!estado){
            return "Libre";
        }else {
            return "Ocupado";
        }
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
