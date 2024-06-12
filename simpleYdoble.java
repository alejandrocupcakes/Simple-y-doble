package com.mycompany.condicionalessimplesydobles;

import javax.swing.JOptionPane;

public class simpleYdoble {
    public static void main(String[] args) {
         String baterias = JOptionPane.showInputDialog("Ingresar el porcentaje de bateria");
        int bateria=Integer.parseInt(baterias);
 if (bateria>50) {
    System.out.println("tiene carga");
} else {
    System.out.println("debe cargado");
}

    }
}
