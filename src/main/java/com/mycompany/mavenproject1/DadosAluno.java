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
public class DadosAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Ler = new Scanner(System.in);
        
        System.out.println("Qual nome do aluno ? ");
        String nomeAluno = Ler.next();
        
        System.out.println("Qual sexo do mesmo ? ");
        char sexo = Ler.next().charAt(0);
        
        System.out.println("Aluno :" + nomeAluno);
        
        sexo = Character.toLowerCase(sexo);
        
        switch (sexo) {
            case 'm':
                System.out.println("Você é do sexo Masculino");
                break;
            case 'f':
                System.out.println("Você é do sexo Feminino");
                break;
            case 'g':
                System.out.println("GATO");
                break;
            case 'h':
                System.out.println("HOHOHO");
            default:
                System.out.println("Você é um ET");
                break;
        }
    }
    
}
