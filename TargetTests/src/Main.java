import Faturamento.Dia;
import Faturamento.VetorFaturamento;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //--------------------Fibonacci
        Fibonacci fibonacci = new Fibonacci(34, 10);
        fibonacci.fibonacciCheck();

        //--------------------Vetor
        ArrayList<Dia> listaDias = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 19; i++){
            listaDias.add(new Dia(i + 1, random.nextInt(2000)));
        }
        VetorFaturamento vetor = new VetorFaturamento();
        vetor.minMaxFaturamento(listaDias);

        //---------------------Participação Estados
        ParticipacaoFaturaMensal part = new ParticipacaoFaturaMensal();
        part.mostraParticipacao();
        //----------------------String Inversor
        StringInvertor stringInvertor = new StringInvertor();
        stringInvertor.invertor("Frase invertida");
        }
    }
