/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author jalvarezotero
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double millas;                         
      double m1=1852;         //m1 lo quiero declarar como constante, asi que final double M1=1852(y pasaria a ser una constante.
    Scanner ler = new Scanner(System.in);
    System.out.print("Introduzca millas para pasar a metros");
    millas = ler.nextDouble();
    System.out.println((millas*m1)+" metros");
    }
    
}
