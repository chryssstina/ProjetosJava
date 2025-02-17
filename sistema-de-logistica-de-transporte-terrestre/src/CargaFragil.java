public class CargaFragil extends Carga{

    private String item;
    private int quantidade;

    public CargaFragil(double peso, String tipoCarga, double valor, String item, int quantidade) {
        super(peso, tipoCarga, valor);
        this.item = item;
        this.quantidade = quantidade;
    }
    
    @Override
    public void valorSeguro() {
        double seguro = this.valor*0.25;
        System.out.println("O valor do seguro da carga "+item+" é de "+seguro+" reais.");
    }

    @Override
    public void inforCarga() {
       System.out.println("Carga Frágil:");
       System.out.println("Tipo da Carga: "+item);
       System.out.println("Quantidade Transportada: "+quantidade);
       System.out.println("Peso Transportado: "+peso);
       System.out.println("Valor da Carga Acrescentado do Seguro: "+((this.valor*0.25)+valor));
       System.out.println("--------------------------");
    }
    

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   
    
}
