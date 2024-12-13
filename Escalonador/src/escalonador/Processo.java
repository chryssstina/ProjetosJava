
public class Processo {
	
	int id;
	int tempoChegada;
	int tempoExecucao;
	int tempoConclusao;
	int tempoEspera;
	int tempoInicio;
	int tempoTurnArround;
	int tempoInterrupcao;
	
	
	public Processo(int id, int tempoChegada, int tempoExecucao) {
		this.id = id;
		this.tempoChegada = tempoChegada;
		this.tempoExecucao = tempoExecucao;
	}
	
	
	public int getTempoChegada() {
        return tempoChegada;
    }

    	public int getTempoExecucao() {
        return tempoExecucao;
    }

	
}
