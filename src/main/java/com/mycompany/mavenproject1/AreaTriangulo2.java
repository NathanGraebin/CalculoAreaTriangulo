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
         
        double alturaCentimetros;
        double larguraCentimetros;
      
        
        System.out.println("Qual é Altura em centrimetros");
        alturaCentimetros = Ler.nextFloat();
        
        System.out.println("Qual é Largura em centrimetros");
        larguraCentimetros = Ler.nextFloat();
        
        double areaEmCentimetros = ((alturaCentimetros*larguraCentimetros)/2);
       
        
        double areaConvertidaEmMetros = areaEmCentimetros / 100;
        
        System.out.println("a area do triangulo é de : " + areaEmCentimetros + " cm ");
        
        System.out.println("a area do triangulo é de : " + areaConvertidaEmMetros + " metros ");
         
        
        
        
    }
}
