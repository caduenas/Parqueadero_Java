package com.parqueadero.parqueadero.Mundo;
import javax.swing.*;
import java.util.ArrayList;



public class Controlador {
    public ArrayList <Espacio> Lista_espacios = new ArrayList<>();
    private int cantidad_espacios;
    public void crear(){
        cantidad_espacios = Integer.parseInt(JOptionPane.showInputDialog("Por favor escriba la cantidad de espacios"));
        for (int i = 0; cantidad_espacios > i; i++){
            Lista_espacios.add(i,new Espacio(String.valueOf((i+1))));
        }

    }
    public void consultar(){
        for (int i = 0; i < cantidad_espacios ; i++) {
            JOptionPane.showMessageDialog(null,"Numero de espacio: " +Lista_espacios.get(i).getNumero() + "\n" + "Estado: " + Lista_espacios.get(i).getEstado(),"Informacion",JOptionPane.INFORMATION_MESSAGE);
        }

    }
}

