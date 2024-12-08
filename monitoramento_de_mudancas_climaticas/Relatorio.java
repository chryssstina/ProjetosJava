import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Relatorio implements Monitoravel{

    private String idRelatorio;
    private LocalDate dataRelatorio;

    public Relatorio(String idRelatorio, String dataString) {
        this.idRelatorio = idRelatorio;
        this.dataRelatorio = validarData(dataString);

        //aqui é passado uma String data que, depois de verificada (para saber se está no formato certo),
        //é atribuída ao atributo dataRelatorio
    }

    public LocalDate validarData(String dataString){
        try{
            //conversãoo de dataString para o formaro de LocalData
            return LocalDate.parse(dataString);
        }catch(DateTimeParseException e){
            System.out.println("Data no formato inválido. Digite novamente yyyy-MM-dd");
            return null;
        }
    }

    public String formatarData() {
        if (dataRelatorio != null) {
            DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.print("Data de emissão: ");
            return dataRelatorio.format(formatada); 
            //a classe DateTimeFormatter formata objetos de data em string
            //ofPattern() informa que vai receber uma string
            //depois é retornado a data formatada "dia/mes/ano"
        } else {
            return "Data inválida. Verifique!!"; 
        }
    }


    public String getIdRelatorio() {
        return idRelatorio;
    }
    public void setIdRelatorio(String idRelatorio) {
        this.idRelatorio = idRelatorio;
    }
    public LocalDate getDataRelatorio() {
        return dataRelatorio;
    }
    public void setDataRelatorio(LocalDate dataRelatorio) {
        this.dataRelatorio = dataRelatorio;
    }
    
    @Override
    public void gerarRelatorio(){
        System.out.println("Número ID do relatório: " +getIdRelatorio());
        System.out.println(formatarData());
    }

}
