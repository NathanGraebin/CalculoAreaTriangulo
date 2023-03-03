/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float raio;
        float areaCirculo;
        float PI;

        Scanner Ler = new Scanner(System.in);
        int op = -1;

        while (op != 0) {

            System.out.println("1 - SOMAR");
            System.out.println("2 - Calcular area de um circulo");
            op = Ler.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Informe o Primeiro Número ");
                    int primeiroNumero = Ler.nextInt();

                    System.out.println("Informe o Primeiro Número ");
                    int segundoNumero = Ler.nextInt();

                    int resultadoDaSoma = primeiroNumero + segundoNumero;

                    System.out.println("O resultado é de : " + resultadoDaSoma);

                    break;

                case 2:
                    System.out.println("Informe o raio ");
                    raio = Ler.nextFloat();

                    areaCirculo =  (raio * raio) * 22 / 7 ;
                        
                    
                    // FORMATAÇÃO
                    System.out.printf("O resultado é de :" + "%.2f", areaCirculo);
                    System.out.println("");
                    System.out.printf("O resultado é de :" + "%,f", areaCirculo);
                    System.out.println("");
                    System.out.printf("O resultado é de :" + "%.02f", areaCirculo);
                    System.out.println("");
                    System.out.println("O resultado é de : " + (areaCirculo/100) + " metros");
                    break;

                case 3:

                    break;

            }
        }
    }

}
