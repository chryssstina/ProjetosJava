import java.util.ArrayList;
import java.util.List;

public class AreaGeografica implements Monitoravel{

    private String nome;
    private int areaKm;
    private List<FenomenoClimatico> fenomeno;

    public AreaGeografica(String nome, int areaKm) {
        this.nome = nome;
        this.areaKm = areaKm;
        this.fenomeno = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<FenomenoClimatico> getFenomeno() {
        return fenomeno;
    }

    public void setFenomeno(List<FenomenoClimatico> fenomeno) {
        this.fenomeno = fenomeno;
    }

    public int getAreaKm() {
        return areaKm;
    }

    public void setAreaKm(int areaKm) {
        this.areaKm = areaKm;
    } 


    public void addFenomeno(FenomenoClimatico fenomenoClimatico){
        fenomeno.add(fenomenoClimatico);

    }

    @Override
    public void gerarRelatorio(){
        System.out.println("Local: "+getNome());
        System.out.println("Aproximadamente " +getAreaKm()+ "km");
        System.out.println("O local foi afetado por: ");
            for (FenomenoClimatico fenomenoAtual : fenomeno) {
                System.out.println(fenomenoAtual.getTipo());            
            }
    }

}