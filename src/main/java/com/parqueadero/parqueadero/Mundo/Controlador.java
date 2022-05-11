package com.parqueadero.parqueadero.Mundo;
import javax.swing.*;
import java.util.ArrayList;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Controlador {
    public ArrayList <Espacio> Lista_espacios = new ArrayList<>();
    public void crear(){
        int cantidad_espacio = Integer.parseInt(JOptionPane.showInputDialog("Por favor escriba la cantidad de espacios"));
        for (int i=0;cantidad_espacio>i;i++){
            Lista_espacios.add(i,new Espacio(String.valueOf(i)));
        }

    }
    public void consultar(){
        for (int i = 0; i < 5 ; i++) {
            JOptionPane.showMessageDialog(null,"");
        }

    }
}

