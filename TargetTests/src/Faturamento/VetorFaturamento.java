package Faturamento;

import java.util.ArrayList;
import java.util.Iterator;
public class VetorFaturamento {

    public void minMaxFaturamento(ArrayList<Dia> array){
        loopMin(array);
        loopMax(array);
        mediaFat(array);
        System.out.println(" ----------------------");
    }

    public void loopMin(ArrayList<Dia> array){
        int temp = Integer.MAX_VALUE;
        int diaMenorFat = 0;

        for (Dia d:array){
            if (d.faturamento < temp) {
                temp = d.faturamento;
                diaMenorFat = d.nmrDia;
            }
        }
        String response = "O dia com menor faturamento é: " + diaMenorFat + " com o faturamento de " + temp;
        System.out.println(response);
    }

    public void loopMax(ArrayList<Dia> array){
        int temp = Integer.MIN_VALUE;
        int diaMaiorFat = 0;

        for (Dia d:array){
            if (d.faturamento > temp) {
                temp = d.faturamento;
                diaMaiorFat = d.nmrDia;
            }
        }
        String response = "O dia com maior faturamento é: " + diaMaiorFat + " com o faturamento de " + temp;
        System.out.println(response);
    }

    public void mediaFat (ArrayList<Dia> array){
        int total = 0;
        int diasValidos = 0;
        for (Dia d:array){
            if (d.faturamento > 0){
                diasValidos++;
            }
            total += d.faturamento;
        }

        int diasComMediaMaior = 0;
        int mediaFat = total/diasValidos;

        for (Dia d:array){
            if(d.faturamento > mediaFat){
                   diasComMediaMaior++;
            }
        }
        String response = "A média faturada é de " + mediaFat + " com " + diasValidos + " dias válidos e " +
                           diasComMediaMaior + " dias com faturamentos acima da média.";
        System.out.println(response);
    }
}

