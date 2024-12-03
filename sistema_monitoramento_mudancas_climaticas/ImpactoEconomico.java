public class ImpactoEconomico {
  
    private AreaGeografica areaAfetada;
    private FenomenoClimatico tipoFenomeno;
    
    public ImpactoEconomico(AreaGeografica areaAfetada, FenomenoClimatico tipoFenomeno){
      this.areaAfetada = areaAfetada;
      this.tipoFenomeno = tipoFenomeno;
    }
    
    
     public AreaGeografica getAreaAfetada() {
        return areaAfetada;
    }
    public void setAreaAfetada(AreaGeografica areaAfetada) {
        this.areaAfetada = areaAfetada;
    }
    
    
    public FenomenoClimatico getTipoFenomeno() {
        return tipoFenomeno;
    }
    public void setTipoFenomeno(FenomenoClimatico tipoFenomeno) {
        this.tipoFenomeno = tipoFenomeno;
    }
    
    
    public void calcularNivelImpacto(){
      double impacto = tipoFenomeno.getDuracao() * tipoFenomeno.getIntensidade() * areaAfetada.getArea() * 10;
      
          if(tipoFenomeno.getNome().equals("Chuva")){
            double nivel = impacto*50;
            System.out.println("Nível do impacto: "+nivel);
            
          }else if(tipoFenomeno.getNome().equals("Terremoto")){
            double nivel = impacto*120;
            System.out.println("Possíveis gastos: "+nivel+ " R$");
            
          }else{
             System.out.println("Erro de cálculo ou de fenômeno");
          }
    }
    
    
    
    
}