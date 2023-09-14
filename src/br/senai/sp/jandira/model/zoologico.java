package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.cachorro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class zoologico {


    Scanner teclado = new Scanner(System.in);

    List<cachorro> ListCachorro = new ArrayList<>();


    public void menu(){

        cachorro objcachorro = new cachorro();

        boolean continuar = true;

        while (continuar){

            System.out.println("========= Menu ==========");
            System.out.println("1 - Cachorro ");
            System.out.println("2 - Listar cachorro ");
            System.out.println("3 - Sair ");
            System.out.println("=========================");

            int opcaoUser = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoUser){
                case 1:
                    objcachorro.cadastrarCachorro();
                    adicionarAnimal(objcachorro);
                    System.out.println(ListCachorro.size());

                    break;

                case 2:
                    listarCachorro();


                    break;

                case 3:
                    System.out.println("Finalizando...");
                    continuar = false;


                    break;

            }

        }

    }
    public void adicionarAnimal(cachorro cachorro){

        ListCachorro.add(cachorro);

    }
    public void listarCachorro(){

        for(cachorro cachorro : ListCachorro){
            System.out.println(cachorro.nome);
            System.out.println(cachorro.apelido);
            System.out.println(cachorro.raca);
            System.out.println(cachorro.cor);
            System.out.println(cachorro.idade);;

        }

    }

}
