
//package LogisticaTransporte;

public class Main {
    public static void main(String[] args){
        Rota rota1 = new Rota(500, "ruim", "3");
        Manutencao manu = new Manutencao("05/10/2000", 200.00, "Troca do oleo");
        CargaFragil fragil = new CargaFragil(100, "Carga frágil", 1000, "Espelhos", 50);
        CargaPerigosa perigo = new CargaPerigosa(1000, "Carga perigosa", 10000, "gasolina", 100);
        CargaViva viva = new CargaViva(10000, "Carga Viva", 2000, "Boi", 50);
        
        rota1.calcularTempoEstimado();
        manu.detalhesManutencao();
        fragil.valorSeguro();
        fragil.inforCarga();
        perigo.valorSeguro();
        perigo.inforCarga();
        viva.valorSeguro();
        viva.inforCarga();
    }
    
}
