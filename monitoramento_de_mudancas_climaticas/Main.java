import java.util.List;

public class Main {
    public static void main(String[] args) {


        FenomenoClimatico fenomeno1 = new FenomenoClimatico("Chuva", 3.9, "1 hora e 27 minutos");
        FenomenoClimatico fenomeno2 = new FenomenoClimatico("Chuva", 8.7, "45 minutos");
        FenomenoClimatico fenomeno3 = new FenomenoClimatico("Terremoto", 6.1, "7 segundos");
        FenomenoClimatico fenomeno4 = new FenomenoClimatico("Terremoto", 2.1, "4 segundos");

        AreaGeografica area1 = new AreaGeografica("Iguatu", 3000);
        AreaGeografica area2 = new AreaGeografica("Acopiara", 1200);
        AreaGeografica area3 = new AreaGeografica("Fortaleza", 400);
        AreaGeografica area4 = new AreaGeografica("Rio Branco", 8000);
        AreaGeografica area5 = new AreaGeografica("Boa Vista", 5000);


        fenomeno1.addArea(area1);
        fenomeno2.addArea(area3);
        fenomeno3.addArea(area1);
        fenomeno4.addArea(area2);
        fenomeno4.addArea(area4);
        fenomeno4.addArea(area5);


        area1.addFenomeno(fenomeno1); 
        area1.addFenomeno(fenomeno3);
        area2.addFenomeno(fenomeno4);
        area3.addFenomeno(fenomeno2);
        area4.addFenomeno(fenomeno4);
        area5.addFenomeno(fenomeno4);



        System.out.println("--------------------------------------------");
        System.out.println("|   MONITORAMENTO DE MUDANÇAS CLIMÁTICAS   |");
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println();


        Relatorio relatorio1 = new Relatorio("123abc", "2024-12-05", "João");
        relatorio1.gerarRelatorio();
        area1.gerarRelatorio();
        System.out.println();
        System.out.println();

        Relatorio relatorio2 = new Relatorio("456abc", "2023-07-15", "Ana");
        relatorio2.gerarRelatorio();
        area2.gerarRelatorio();
        System.out.println();


    }
}
