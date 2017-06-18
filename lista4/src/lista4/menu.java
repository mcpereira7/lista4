package lista4;

import java.util.Scanner;

public class menu {

    static int menuExercicios(int opção) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha qual exercício deseja executar:");
        System.out.println("1. Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor.");
        System.out.println("2. Dado um ​ vetor de números reais, fazer um programa que some todos os elementos do vetor e imprima o\n"
                + "   resultado.");
        System.out.println("3. Dado um ​ vetor​ de números inteiros, fazer um programa que imprima o maior elemento do vetor.");
        System.out.println("4. Dado um ​ vetor​ de números reais, fazer um programa que imprima o menor elemento do vetor.");
        System.out.println("5. Dado um ​ vetor​ de números inteiros, fazer um programa que imprima a média dos elementos do vetor.");
        System.out.println("6. Dado um ​ vetor​ de números inteiros, fazer um programa que imprima o produto dos elementos do vetor.");
        System.out.println("7. Dado um ​ vetor​ de números inteiros e um número inteiro, fazer um programa que multiplique todos os\n"
                + "   elementos do vetor pelo número real dado e imprima o resultado.");
        System.out.println("8. Dado um ​ vetor de números inteiros e um número inteiro, fazer um programa que verifique se o número\n"
                + "   está presente no vetor.");
        System.out.println("9. Dados dois ​ vetores A e B de mesma dimensão, fazer um programa que calcule e imprima o produto de\n"
                + "   cada elemento de A pelo correspondente elemento de B. O resultado deve ser armazenado em um vetor\n"
                + "   C.");
        System.out.print("\nExercício: ");
        opção = sc.nextInt();
        System.out.println("");
        return opção;
    }

}
