package BuscaBinaria;

import java.util.Scanner;
import java.util.*;

public class ChamadaBinaria {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        int leitura;
        int posicao;
        int compara=0;

        BuscaBinaria elemento=new BuscaBinaria(100);
        System.out.println(elemento);
        System.out.println("Digite um numero, ou digite -1 para encerrar o programa: ");
        leitura=tc.nextInt();
        System.out.println();
        while (leitura!=-1) {
            posicao = elemento.pesquisaBinaria(leitura);
            if (posicao == -1)
                System.out.println("O valor " + leitura + " não foi encontrado");
            else
                System.out.println("O valor " + leitura + " esta na posição " + posicao);
            /*int result = (int) Math.pow(2, 10) - 1;
            int result2 = result / 2;
            System.out.println("Quantidade de comparação " + result);
            System.out.println("Media de comparação " + result2);*/
            System.out.println("Digite um numero, ou digite -1 para encerrar o programa: ");
            leitura=tc.nextInt();
            System.out.println();
        }
    }
}
