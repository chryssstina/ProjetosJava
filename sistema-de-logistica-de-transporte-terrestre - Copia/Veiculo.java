public abstract class Veiculo{
    protected String placa;
    protected String capacidadeCarga;
    protected String tipoCombustivel;
    protected double altura;
    protected double largura;
    protected double pesoBrutoTotal; //peso máximo do caminhão com carga
    protected String tipoCarroceria; 

    public Veiculo(String placa, String capacidadeCarga, String tipoCombustivel, double altura, double largura, String tipoCarroceria) {
      if(placa == null || placa.trim().equals("") ||
        capacidadeCarga == null || capacidadeCarga.trim().equals("") ||
        tipoCombustivel == null || tipoCombustivel.trim().equals("") ||
        tipoCarroceria == null || tipoCarroceria.trim().equals("") ||
        altura <= 0 || largura <= 0) {
        throw new IllegalArgumentException("Os valores não podem ser nulos, vazios ou inválidos!");
      }else{
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
        this.tipoCombustivel = tipoCombustivel;
        this.altura = altura;
        this.largura = largura;
        this.tipoCarroceria = tipoCarroceria;
      }
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa==null || placa.equals("")){
            System.out.println("O valor não pode ser nulo ou vazio!");
        }else{
            this.placa = placa;
        }
    }

    public String getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(String capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    } 

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public abstract void custoManutencao();
    
    public void exibirInformacoes(){
      System.out.println("Placa: "+getPlaca()+
                         "\nCapacidade de carga: " +getCapacidadeCarga()+ 
                         "\nCombustível: "+getTipoCombustivel()+
                         "\nDimesões: " +getAltura()+" x "+getLargura()
                         );
      
    }
}