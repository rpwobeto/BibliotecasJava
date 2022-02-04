package EstruturasDeRepeticao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class LoopArrays {

    public static void main(String[] args) {
//Ex1
//        Scanner scanner = new Scanner(System.in);
//
//        String nome;
//        int idade;
//
//        while(true){
//            System.out.println("Nome: " );
//            nome = scanner.next();
//            if(nome.equals("0")) break;
//            System.out.println("Idade: " );
//            idade = scanner.nextInt();
//        }
//
//        System.out.println("Continua aqui: ");

        //Ex2
//        int nota;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nota: ");
//        nota = scanner.nextInt();
//
//        while (nota < 0 || nota > 10){
//            System.out.println("Nota inválida! Digite novamente: ");
//            nota = scanner.nextInt();
//        }
//
//        System.out.println("Nota válida");
//
//
//
//    }
        //Ex3
//        int numero;
//
//        Scanner scanner = new Scanner(System.in);
//
//        int count = 0;
//        int maior = 0;
//        int soma = 0;
//
//        do{
//            System.out.println("Número: ");
//            numero = scanner.nextInt();
//            soma = soma + numero;
//            System.out.println("Soma: " + soma);
//            if(numero > maior) maior = numero;
//            count = count + 1;
//        } while (count < 5);
//        System.out.println("O Maior número digitado é: " + maior + " e a média é: " + soma/5 );
        //Ex4
//
//        Scanner scanner = new Scanner(System.in);
//
//        int quantNumeros;
//        int numero = 0;
//        int quantPares = 0, quantImpares = 0;
//
//        System.out.println("Quantidade de números: ");
//        quantNumeros = scanner.nextInt();
//
//        int count = 0;
//        do {
//            System.out.println("Números: ");
//            numero = scanner.nextInt();
//            if(numero % 2 == 0) quantPares++;
//            else quantImpares++;
//
//            count++;
//
//        } while (count < quantNumeros);
//
//        System.out.println("Quantidade de pares: "  + quantPares);
//        System.out.println("Quantidade de ímpares: "  + quantImpares);
//
        //EX5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tabuada: ");
//        int tabuada = scanner.nextInt();
//
//        System.out.println("Tabuada de " + tabuada);
//
//        for( int i = 1; i <= 10; i++){
//            System.out.println(tabuada + " X " + i + " = " +(tabuada*i));

        //EX6
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Fatorial: ");
//        int fatorial = scanner.nextInt();
//
//        int multiplicar = 1;
//
//        System.out.print(fatorial+"! =");
//        for( int i = fatorial; i >= 1; i--){
//        multiplicar = multiplicar * i;
//        }
//        System.out.println(multiplicar);

        //EX7

//        int[] vetor = {0, -15, 20, 30, -50, -5};
//
//        //System.out.println(vetor.length);
//        System.out.print("Vetor: ");
//
//        int count = 0;
//        while (count <= (vetor.length - 1)) {
//            System.out.print(vetor[count] + " ");
//            count++;
//        }
//
//        System.out.print("\nVetor: ");
//        for (int i = (vetor.length - 1); i >= 0; i--) {
//            System.out.print(vetor[i] + " ");
//
//        }

        //EX8

//        Scanner scanner = new Scanner(System.in);
//
//        String[] consoantes = new String[6];
//        int quantidadeConsoantes = 0;
//
//        int count = 0;
//        do {
//            System.out.println("Letra: ");
//            String letra = scanner.next();
//            if(!(letra.equalsIgnoreCase("a") |
//                    letra.equalsIgnoreCase("e") |
//                    letra.equalsIgnoreCase("i") |
//                    letra.equalsIgnoreCase("o") |
//                    letra.equalsIgnoreCase("u"))){
//                consoantes[count] = letra;
//                quantidadeConsoantes++;
//            }
//            count++;
//
//        } while(count < consoantes.length);
//        System.out.println("Consoantes: ");
//        for (String consoante : consoantes ) {
//            if (consoante != null)
//            System.out.print(consoante + " ");
//        }
//        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);


        //EX9
//        Random random = new Random();
//        int[] numerosAleatorios = new int[20];
//
//        for (int i = 0; i < numerosAleatorios.length; i++ ){
//            int numero = random.nextInt(100);
//            numerosAleatorios[i] = numero;
//        }
//        System.out.print("Números Aleatórios:           ");
//        for (int numero : numerosAleatorios ) {
//            System.out.print(numero + " ");
//        }
//
//        System.out.print("\nSucessores dos números aleatórios: ");
//        for (int numero : numerosAleatorios ) {
//            System.out.print((numero+1) + " ");
//        }
//        System.out.print("\nAntecessores dos números aleatórios: ");
//        for (int numero : numerosAleatorios ) {
//            System.out.print((numero-1) + " ");
//        }
        //EX10

//        Random random = new Random();
//
//        int [] [] matriz = new int [4] [4];
//
//        for(int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j] = random.nextInt(9);
//            }
//        }
//            System.out.println("Matriz: ");
//            for (int [] linha : matriz) {
//                for (int coluna : linha) {
//                    System.out.print(coluna + " ");
//                }
//                System.out.println();
//            }

        }



    }


