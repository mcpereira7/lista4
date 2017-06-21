package lista4;

import java.util.Random;
import java.util.Scanner;
import static lista4.criarMatriz.*;

public class exercicios {

    static Scanner sc = new Scanner(System.in);

    // Exercício 1
    static int[] exec1(int tamanho) {
        int[] newVetor = criaVetor(0);
        int[] vInt = new int[tamanho];
        Random rd = new Random();
        for (int i = 0; i < vInt.length; i++) {
            vInt[i] = rd.nextInt(15);
            System.out.printf("Posição %d = %d \n", i, vInt[i]);
        }
        return vInt;
    }

    // Exercício 2
    static void exec2() {
        System.out.println("Somar os valores de números reais.");
        double[] array = new double[5];
        double result = 0;
        System.out.println("Solicitar os valores do array.");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Informe o valor da poição %d: ", (i + 1));
            array[i] = sc.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.printf("A soma dos elementos do array é: %.2f\n", result);
        //return result;

    }

    // Exercício 3
    static int maiorValorVetor(int[] vetor) {
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    // Exercício 4
    static double menorValorVetor(double[] vetor) {
        double menor = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor || menor == 0) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    // Exercício 5
    static double mediaVetor(int[] vetor) {
        double media = 0, soma = 0;
        int n = vetor.length;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }

        return media = soma / n;
    }

// Exercício 6
    static int produtoVetor(int[] vetor) {
        int prod = 1;
        for (int i = 0; i < vetor.length; i++) {
            prod = prod * vetor[i];
        }
        return prod;
    }

    // Exercício 7
    static int multiplicaVetorPorNun(int[] vetor,int multiplicador) {
        int resultado=0;
        for (int i = 0; i < vetor.length; i++) {
            resultado =  vetor[i]*multiplicador;
            System.out.printf("%d x %d = %d",vetor[i],multiplicador,resultado);
            System.out.println("");
            resultado=0;
            
        }
return resultado;
    }
    
    // Exercício 8
    static String verificaValorVetor(int [] vetor, int n1){
        String existe = "";
        for (int i=0; i<vetor.length; i++){
            if(n1==vetor[i]){
                //System.out.println("O número "+n1+" existe no vetor");
                existe = "O número "+n1+" existe no vetor";
            }else{
                existe="O número "+n1+" não existe no vetor";
            }
        }
        return existe;
    }
    
    // Exercício 9
    static int [] vetorProduto(int [] vetorA, int [] vetorB){
        int [] vetor = new int [vetorA.length];
        for (int i =0; i<vetor.length; i++){
            vetor[i] = vetorA[i]*vetorB[i];
        }
        for(int i =0; i<vetor.length; i++){
            System.out.printf("\n%d x %d = %d", vetorA[i], vetorB[i], vetor[i]);
        }
        return vetor;
    }
    
    // Exercício 10
    static void produtoVetorImpar(double [] vetor, double nD){
        for (int i=0; i<vetor.length; i++){
            if (i%2!=0){
                System.out.printf("\n%.2f na posição %d multiplicado por %.2f é igual a %.2f", vetor[i], i,nD, (vetor[i]*nD));
            }
        }
    }
    
    // Exercício 11
    static void maiorQueMediaPar(double [] vetor){
        double media, cont=0, soma=0;
        for(int i=0; i<vetor.length; i++){
            if(i%2==0){
                soma=soma + vetor[i];
                cont++;
            }
        }
        media=soma/cont;
        System.out.println("A média dos valores nas posições par é: "+media);
        for(int i =0; i<vetor.length; i++){
            if(vetor[i]>media){
                System.out.println(vetor[i]+" é maior que a média");
            }
        }
    }

    // Exercício 12
    static void maiorSomaMaiorMedia(int [] vetorA, int [] vetorB){
        int somaA=0, mediaA, somaB=0, mediaB;
        for(int i = 0; i<vetorA.length; i++){
            somaA = somaA+vetorA[i];
            somaB = somaB+vetorB[i];
        }
        mediaB=(somaB/vetorB.length);
        mediaA=(somaA/vetorA.length);
        if(somaA>somaB || mediaA>mediaB){
            System.out.printf("VetorA tem a maior soma %d e a maior média %d \n", somaA, mediaA);
        }else{
            System.out.printf("VetorB tem a maior soma %d e a maior média %d \n", somaB, mediaB);
        }
    }
    
    // Exercício 13
    static int [] novoVetor(int [] vetorA, int [] vetorB){
        int [] vetorC = new int[vetorA.length*2];
        int cont=vetorC.length;
        for(int i = 0; i<vetorC.length; i++){
            vetorC[i]=vetorA[i];
            vetorC[cont]=vetorB[i];
                    cont--;
        }
        
        return vetorC;
    }
}
