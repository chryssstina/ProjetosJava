import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Relatorio implements Monitoravel{

    private String idRelatorio;
    private LocalDate dataRelatorio;
    private String autor;

    public Relatorio(String idRelatorio, String dataString, String autor) {
        this.idRelatorio = idRelatorio;
        this.dataRelatorio = validarData(dataString);
        this.autor = autor;
        
         //aqui é passado uma String data que, depois de verificada (para saber se está no formato certo),
        //é atribuída ao atributo dataRelatorio
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

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

   

    //----------INÍCIO DA VALIDAÇÃO E FORMATAÇÃO DA DATA
    public LocalDate validarData(String dataString){
        try{
            //conversãoo de dataString para o formaro de LocalData
            return LocalDate.parse(dataString);
        }catch(DateTimeParseException e){
            System.out.println("Data no formato inválido. Digite novamente no padrão yyyy-MM-dd");
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

//----------FIM DA VALIDAÇÃO E FORMATAÇÃO DA DATA


    
    @Override
    public void gerarRelatorio(){ 
        System.out.println("--------------------");
        System.out.println("|  RELATÓRIO " +getIdRelatorio()+ " |");
        System.out.println("--------------------");
        System.out.println("Número de identificação ID : " +getIdRelatorio());
        System.out.println(formatarData());
        System.out.println("Relatório gerador por: "+getAutor());
        System.out.println();
    }

}
