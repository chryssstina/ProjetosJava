import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

//Escalonador do tipo FCFS
//Usar o RANDON para gerar valores aleatórios 
public class Escalonador {

	public static void main(String args[]) {
	  Random gerador = new Random();
	  
	  int quantMinProcessos = 2;
	  int quantMaxProcessos = 100;
	  
	  //O método nextInt(n) gera um número entre 0 e n-1
	  //Aqui é add 1 para que o valor vá até o máximo 
	  int quantTotalProcessos = gerador.nextInt(quantMaxProcessos - quantMinProcessos + 1 + quantMinProcessos);
	  
		List<Processo> processos = new ArrayList<>(); 
		
		for(int i=1; i<=quantTotalProcessos;i++){
		   int id=i; 
		   int tempoChegada=gerador.nextInt(10)+1; //supor que 10seg
		   int tempoExecucao=gerador.nextInt(30);
		   processos.add(new Processo(id,tempoChegada,tempoExecucao));
		   
		
      		//primeiro compara o tempo de chagada e depois o tempo de execução
      		processos.sort(Comparator.comparingInt(Processo::getTempoChegada)
                                       .thenComparingInt(Processo :: getTempoExecucao));

		
        		int tempoAtual = 0;
        		for(Processo processoAtual : processos) {
        			processoAtual.tempoInicio = Math.max(processoAtual.tempoChegada, tempoAtual);
        			processoAtual.tempoInterrupcao = gerador.nextInt(4);

        			processoAtual.tempoConclusao = processoAtual.tempoInicio + processoAtual.tempoExecucao + processoAtual.tempoInterrupcao;
        			processoAtual.tempoEspera = processoAtual.tempoInicio - processoAtual.tempoChegada;
        			processoAtual.tempoTurnArround = processoAtual.tempoConclusao - processoAtual.tempoChegada;
        			
        			//processoAtual.tempoTotalInterrupcao = processoAtual.tempoFimInterrupcao - processoAtual.tempoInicioInterrupcao; 
        			
        			
        			//garante que o atual só execute quando o anterior terminar
        			tempoAtual = processoAtual.tempoConclusao;

        		}
		}
		
		
		
		System.out.println
		//("ID - Chegada - Execução - Início - Interrupção - Conclusão - Espera - TurnArround;
		("ID\tCh\tTExe\tIn\tInter\tCon\tEsp\tTnArr");
		int somaEspera = 0, somaTurnArround = 0;
		for(Processo processoAtual : processos) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n", 
					processoAtual.id, 
					processoAtual.tempoChegada, 
					processoAtual.tempoExecucao,
					processoAtual.tempoInicio,
					processoAtual.tempoInterrupcao,
					processoAtual.tempoConclusao,
					processoAtual.tempoEspera,
					processoAtual.tempoTurnArround);
			
			somaEspera += processoAtual.tempoEspera;
			somaTurnArround += processoAtual.tempoTurnArround;
		}
		
		System.out.printf("\n Tempo médio de espera: " +(double) somaEspera/processos.size());
		System.out.printf("\n Tempo médio de TurnArround: " +(double) somaTurnArround/processos.size());
		
	}
}
