package br.senai.sp.jandira.model;

import java.util.Scanner;

public class cachorro {
    String nome, apelido, cor, raca;
    int idade;

    Scanner teclado = new Scanner(System.in);
    public void cadastrarCachorro() {

        System.out.println("============ CADASTRO CACHORRO ============");
        System.out.print("Informe o nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe o apelido: ");
        apelido = teclado.next();
        System.out.print("Informe a cor : ");
        cor = teclado.next();
        System.out.print("Informe a raça : ");
        raca = teclado.next();
        System.out.print("Informe a idade: ");
        idade = teclado.nextInt();
        System.out.println("============ CADASTRO FINALIZADO===========");
    }
}
