/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabanco;

/**
 *
 * @author Domingues
 */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá, por favor, digite o número da sua Conta!");
        int Numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da sua agência!");
        String Agencia = scanner.next();
        
        System.out.println("Por favor, digite o seu nome!");
        String Nome = scanner.next();
        
        System.out.println("Digite o seu saldo!");
        double Saldo = scanner.nextDouble();
        
        System.out.println("Olá " + Nome + ", " + 
                "obrigado por criar uma conta em nosso banco, sua agência é " +
                Agencia + ", " + "conta " + Numero + ", e seu saldo " + Saldo +
                " já está disponível para saque.");
        
    }
    
}
