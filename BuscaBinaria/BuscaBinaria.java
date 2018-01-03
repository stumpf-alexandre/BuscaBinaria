package BuscaBinaria;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class BuscaBinaria {
    private int[] valores;
    private static Random gerador = new Random();

    public BuscaBinaria(int tamanho){
        valores = new int[tamanho];
        for (int i=0; i<tamanho; i++)
            valores[i]=gerador.nextInt(100);
        Arrays.sort(valores);
    }

    public int pesquisaBinaria(int pesquisa){
        int numMenor=0;
        int numMaior=valores.length-1;
        int media;
        while (numMenor<=numMaior){
            media=(numMenor+numMaior)/2;
            System.out.println(saida(numMenor, numMaior));
            if (pesquisa == valores[media])
                return media;
            else if (pesquisa < valores[media])
                numMaior=media-1;
            else
                numMenor = media+1;
        }
        return -1;
    }

    public String saida(int elem1, int elem2){
        StringBuffer analise =new StringBuffer();
        for (int i=0; i<elem1; i++)
            analise.append( "   " );
        for (int i=elem1; i<=elem2; i++)
            analise.append(valores[i]+" ");
        analise.append( "\n" );
        return analise.toString();
    }

    @Override
    public String toString() {
        return saida(0, valores.length-1);
    }
}