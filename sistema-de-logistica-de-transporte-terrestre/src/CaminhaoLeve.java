public class CaminhaoLeve extends Veiculo{

    public CaminhaoLeve(String placa, String capacidadeCarga, String tipoCombustivel, double altura, double largura, String tipoCarroceria){
        super(placa, capacidadeCarga, tipoCombustivel, altura, largura, tipoCarroceria);
    }
    

    public void custoManutencao(){
        System.out.println("Custo de manutenção para caminhão leve");
    }
}