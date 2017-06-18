package lista4;

import java.util.Scanner;
import static lista4.exercicios.*;
import static lista4.menu.*;
import static lista4.criarMatriz.*;

public class Lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opção = menuExercicios(0);
        int t1, t2, n1, n2;
        int[] vetor, vetorA, vetorB;
        double[] vetorD;
        double nD;
        String retorno;
        // int []vInt = criaVetor(tamanho);
        double num1;
        switch (opção) {
            case 1:
                System.out.print("Informe o tamanho do vetor: ");
                t1 = sc.nextInt();
                vetor = criaVetor(t1);
                vetor = exec1(t1);
                break;
            case 2:
                exec2();
                break;
            case 3:
                System.out.print("Informe o tamanho do vetor: ");
                t1 = sc.nextInt();
                vetor = criaVetor(t1);
                vetor = populaVetor(vetor);
                n1 = maiorValorVetor(vetor);
                System.out.println("\nMaior valor do vetor é: " + n1);
                break;
            case 4:
                System.out.print("Informe o tamanho do vetor: ");
                t1 = sc.nextInt();
                vetorD = criaVetorDouble(t1);
                vetorD = populaVetorDouble(vetorD);
                nD = menorValorVetor(vetorD);
                System.out.println("\nMenor valor do vetor é: " + nD);
                break;
            case 5:
                System.out.print("Informe o tamanho do vetor: ");
                t1 = sc.nextInt();
                vetor = criaVetor(t1);
                vetor = populaVetor(vetor);
                nD = mediaVetor(vetor);
                System.out.println("\nMédia dos valores do vetor é: " + nD);
                break;
            case 6:
                System.out.print("Informe o tamanho do vetor: ");
                t1 = sc.nextInt();
                vetor = criaVetor(t1);
                vetor = populaVetor(vetor);
                n1 = produtoVetor(vetor);
                System.out.println("\nO produto dos elementos do vetor é: " + n1);
                break;
            case 7:
                System.out.println("Os elementos do vetor são randomicamente escolhidos variando entre 1 e 100");
                System.out.print("Informe o tamanho do vetor: ");
                t1 = sc.nextInt();
                System.out.print("Informe o multiplicador: ");
                n1=sc.nextInt();
                vetor = criaVetor(t1);
                vetor = populaVetorRandom(vetor);
                multiplicaVetorPorNun(vetor,n1);
                break;
            case 8:
                System.out.print("Informe o tamanho do vetor: ");
                t1=sc.nextInt();
                System.out.print("Informe o número a ser verificado no vetor: ");
                n1 = sc.nextInt();
                vetor = criaVetor(t1);
                vetor = populaVetorRandom(vetor);
                retorno = verificaValorVetor(vetor, n1);
                System.out.println(retorno);
                break;
            case 9:
                System.out.print("Informe o tamanho do vetor: ");
                t1=sc.nextInt();
                vetorA = criaVetor(t1);
                vetorB = criaVetor(t1);
                vetor = criaVetor(t1);
                System.out.println("Valores para o vetorA");
                vetorA = populaVetor(vetorA);
                System.out.println("Valores para o vetorB");
                vetorB = populaVetor(vetorB);
                vetor = vetorProduto(vetorA, vetorB);
                System.out.println("");
                break;
        }

    }

}
