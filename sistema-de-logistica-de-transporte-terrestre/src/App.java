public class App {
    public static void main(String[] args) {
        CaminhaoLeve caminhao1 = new CaminhaoLeve("ABC123", "2 toneladas", "Diesel", 5.0, 6.0, "Frigo");
        caminhao1.exibirInformacoes();
        caminhao1.custoManutencao();
        
        System.out.println();
        Funcionario funcionario1 = new Funcionario("João", "123.456.789.10", "Operador Logístico");
        funcionario1.exibirInformacoes();
    }
}
