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
