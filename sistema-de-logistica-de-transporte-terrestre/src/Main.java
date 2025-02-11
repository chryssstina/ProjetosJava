public class Main {
    public static void main(String[] args) {
        Rota rota1 = new Rota(500, "boa", "5");
        CaminhaoLeve caminhao1 = new CaminhaoLeve("ABC123", "2 toneladas", "Diesel", 5.0, 6.0, "Frigo");
        Manutencao manu = new Manutencao("20/07/2001", 500, "pintura", caminhao1);

        rota1.calcularTempoEstimado();
        manu.detalhesManutencao();
        manu.notifica(40028922);
        manu.notifica("viniciusbeta@gmail.com", "Pifou");

        
    }
}
