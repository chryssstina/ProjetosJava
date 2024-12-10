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

    public void listaFenomenosNaArea(){
        for (FenomenoClimatico fenomenoAtual : fenomeno) {
            System.out.println(fenomenoAtual.getTipo()); 
        }
    } 


    @Override
    public void gerarRelatorio(){
        System.out.println("|=>  INFORMAÇÕES DO LOCAL");
        System.out.println("Região: "+getNome());
        System.out.println("Possui aproximadamente " +getAreaKm()+ "km");
        System.out.println("A região foi afetada por: ");
        listaFenomenosNaArea();
        System.out.println();
           
    }

}
