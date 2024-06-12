package com.mycompany.condicionalessimplesydobles;

import javax.swing.JOptionPane;

public class Condicionalessimplesydobles {

    public static void main(String[] args) {
         String hora = JOptionPane.showInputDialog("Ingresar horas");
        int horas=6;
        if (horas>6){
            System.out.println("ya amanecio");
        } else {
        System.out.println("Todavía no amanece");
        }
    }
}
