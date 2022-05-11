package com.parqueadero.parqueadero;
import javax.swing.*;
import java.util.ArrayList;

public class Controlador {
    public static void main(String[] args) {
        ArrayList <Espacio> Lista_espacios = new ArrayList<>();
        int cantidad_espacio = Integer.parseInt(JOptionPane.showInputDialog("Por favor escriba la cantidad de espacios"));
        for (int i=0;cantidad_espacio>i;i++){
            Lista_espacios.add(i,new Espacio(String.valueOf(i)));
        }
    }
}
