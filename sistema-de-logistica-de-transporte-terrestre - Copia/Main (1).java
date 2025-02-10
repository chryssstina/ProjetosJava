
//package LogisticaTransporte;

public class Main {
    public static void main(String[] args){
        Rota rota1 = new Rota(500, "ruim", "3");
        Manutencao manu = new Manutencao("05/10/2000", 200.00, "Troca do oleo");
        
        rota1.calcularTempoEstimado();
        manu.detalhesManutencao();
    }
    
}
