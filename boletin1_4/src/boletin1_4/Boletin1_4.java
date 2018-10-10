/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

/**
 *
 * @author jalvarezotero
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        double Num1, Num2;
        System.out.println("Introduzca Num1");
        Num1=ler.nextDouble();
        System.out.println("Introduzca Num2");
        Num2=ler.nextDouble();
        System.out.println("Suma="+(Num1+Num2)+"\nResta="+(Num1-Num2)+"\nProducto="+(Num1*Num2)+"\nCociente="+(Num1/Num2));
        
        
    }
    
}
