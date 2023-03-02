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
public class AreaTriangulo2 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
         
        float alturaCentimetros;
        float larguraCentimetros;
      
        
        System.out.println("Qual é altura em centrimetros");
        alturaCentimetros = Ler.nextFloat();
        
        System.out.println("Qual é comprimento em centrimetros");
        larguraCentimetros = Ler.nextFloat();
        
        float areaEmCentimetros = (alturaCentimetros*larguraCentimetros)/2;
       
        
        float areaConvertidaEmMetros = areaEmCentimetros * 100;
        
        System.out.println("a area do triangulo é de : " + areaConvertidaEmMetros);
         
    }
}
