public class Van extends Veiculo{

    public Van(String placa, String capacidadeCarga, String tipoCombustivel, double altura, double largura, String tipoCarroceria){
        super(placa, capacidadeCarga, tipoCombustivel, altura, largura, tipoCarroceria);
    }

    public void custoManutencao(){
        System.out.println("Custo de manutenção para van");
    }
}
