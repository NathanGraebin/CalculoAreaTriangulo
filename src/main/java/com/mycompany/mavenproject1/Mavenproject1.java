/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner Ler = new Scanner(System.in);
        
        int numero = 10;
        
        if(numero > 20){
            System.out.println("Olá Mundo!");
        }
        else{
        System.out.println("Olá UNIPAR");}
        
        int altura;
        int comprimento;
        
        System.out.println("Qual é altura");
        altura = Ler.nextInt();
        
        System.out.println("Qual é comprimento");
        comprimento = Ler.nextInt();
        
        int resultado = (altura*comprimento)/2;
        
        System.out.println("a area do triangulo é de : " + resultado);
        
        //##########################################################//
        
        
        
        
                
    }
}
