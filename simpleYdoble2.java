package com.mycompany.condicionalessimplesydobles;

import javax.swing.JOptionPane;

public class simpleYdoble2 {
    public static void main(String[] args) {
         String climas = JOptionPane.showInputDialog("Ingresar temperatura");
        int clima=Integer.parseInt(climas);
 if (clima>20) {
    System.out.println("el ambiente esta calido");
} else {
    System.out.println("el ambiente esta frio");
}
System.out.println("la temperatura es "+climas);
    }
    }
