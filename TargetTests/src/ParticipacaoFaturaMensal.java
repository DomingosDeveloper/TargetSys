public class ParticipacaoFaturaMensal {
    double SP = 67836.43;
    double RJ = 36678.66;
    double MG= 29229.88;
    double ES= 27165.48;
    double outros = 19849.53;

    double total = RJ + SP + MG + ES + outros;

    public void mostraParticipacao(){
        System.out.println("A participação de SP é: " + new StringBuilder(regraDeTres(SP, total)));
        System.out.println("A participação de RJ é: " + new StringBuilder(regraDeTres(RJ, total)));
        System.out.println("A participação de MG é: " + new StringBuilder(regraDeTres(MG, total)));
        System.out.println("A participação de ES é: " + new StringBuilder(regraDeTres(ES, total)));
    }

    public String regraDeTres(double valor, double total){
        double contraPeso = valor * 100.00;
        double x = contraPeso/total;
        String response = (String.format("%,.2f", x)) + "%";
        return response;
    }
}
