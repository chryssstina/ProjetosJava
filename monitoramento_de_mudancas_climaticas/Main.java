public class Main {
    public static void main(String[] args) {

        FenomenoClimatico fenomeno1 = new FenomenoClimatico("Chuva", 3.9, "45 minutos");
        AreaGeografica area1 = new AreaGeografica("Suassurana", 150);


       
        fenomeno1.addArea(area1);
        fenomeno1.calcularImpactoAmbiental();
        fenomeno1.gerarRelatorio();


        System.out.println("-------------------------");
        
        area1.addFenomeno(fenomeno1);
        area1.gerarRelatorio();

        System.out.println("-------------------------");

        Relatorio relatorio1 = new Relatorio("123abc", "2024-12-08");
        relatorio1.gerarRelatorio();


    }
}

