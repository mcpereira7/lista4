package lista4;

import java.util.Random;
import java.util.Scanner;

public class criarMatriz {

    static Scanner sc = new Scanner(System.in);

    static int tamanho() {
        int t;
        System.out.println("Tamanho");
        System.out.println("Linha / Coluna: ");
        t = sc.nextInt();
        return t;
    }

    static int[][] criaMatriz(int linha, int coluna) {
        System.out.println("Criar Matriz");
        int[][] matriz = new int[linha][coluna];
        return matriz;
    }

    static double[][] criaMatrizDouble(int linha, int coluna) {
        System.out.println("Criar Matriz");
        double[][] matriz = new double[linha][coluna];
        return matriz;
    }

    static int[] criaVetor(int tamanho) {
        //System.out.print("Criar Vetor \nInforme o tamanho do vetor:");
        int[] vetor = new int[tamanho];
        return vetor;
    }

    static double[] criaVetorDouble(int tamanho) {
        //System.out.print("Criar Vetor \nInforme o tamanho do vetor:");
        double[] vetor = new double[tamanho];
        return vetor;
    }

    static int[][] populaMatriz(int[][] matriz) {
        System.out.println("Popula Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();

            }
        }
        return matriz;
    }

    static int[] populaVetorRandom(int[] vetor) {
        Random rd = new Random();
        System.out.println("Populando Vetor Randomicamente");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100)+1;

        }
        return vetor;
    }
    static int[] populaVetor(int[] vetor) {
        System.out.println("Popula Vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Matriz[%d]: ", i);
            vetor[i] = sc.nextInt();

        }
        return vetor;
    }

    static double[] populaVetorDouble(double[] vetor) {
        System.out.println("Popula Matriz");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Matriz[%d]: ", i);
            vetor[i] = sc.nextDouble();

        }
        return vetor;
    }

    static double[][] populaMatrizDouble(double[][] matriz) {
        System.out.println("Popula Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();

            }
        }
        return matriz;
    }

    static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]: %d\t", i, j, matriz[i][j]);
            }
            System.out.println("\n ");
        }

    }

    public static void main(String[] args) {
        int linhas = tamanho();
        int colunas = tamanho();
        int[][] matris = criaMatriz(linhas, colunas);
        matris = populaMatriz(matris);
        imprimeMatriz(matris);
    }

}
