public class Prejuizo implements Monitoravel{
    private FenomenoClimatico fenomeno;
    private double valorPrejuizo;

    public Prejuizo(FenomenoClimatico fenomeno) {
        this.fenomeno = fenomeno;
        this.valorPrejuizo = calcularPrejuizo(fenomeno);
    }

    
    public FenomenoClimatico getFenomeno() {
        return fenomeno;
    }

    public void setFenomeno(FenomenoClimatico fenomeno) {
        this.fenomeno = fenomeno;
    }
    public double getValorPrejuizo() {
        return valorPrejuizo;
    }
    public void setValorPrejuizo(double valorPrejuizo) {
        this.valorPrejuizo = valorPrejuizo;
    }


    public double calcularPrejuizo(FenomenoClimatico fenomeno) {
        double intensidade = fenomeno.getIntensidade();
        double areaAfetada = 0;

        for (AreaGeografica areaAtual : fenomeno.getAreaAfetada()) {
            areaAfetada += areaAtual.getAreaKm();  
        }

        return intensidade * areaAfetada;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("|=> PREJUÍZO FINANCEIRO");
        System.out.println("Prejuízo de R$ " + valorPrejuizo+ " para esse tipo de " + fenomeno.getTipo());
        System.out.println();
    }

    
}
