/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;

/**
 *
 * @author jalvarezotero
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float euros=0,cambio=0,dolares;
        System.out.println("teclear euros: " );
        euros=ler.nextFloat();
        System.out.println("teclear cambio= ");
        dolares=ler.nextFloat();
        euros=euros*dolares;
        System.out.println("euros son "+dolares+" dolares");
    }
    
}
