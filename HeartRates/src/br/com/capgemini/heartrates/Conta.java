package br.com.capgemini.heartrates;

import java.time.LocalDate;

public class Conta {
	
	public int calcularIdade(HeartRates heartRate){
		int idade = LocalDate.now().getYear() - heartRate.getAnoNascimento();
		return idade;
			 
		} 
		
		public int calculaFrequenciaCardiaca(int idade) {
			return 220 - idade;
		}
		
		
		public String retornaFrequenciaAlvo(int idade) {
			float fMin = (float) (calculaFrequenciaCardiaca(idade) * 0.5); 
			float fMax = (float) (calculaFrequenciaCardiaca(idade) * 0.85); 
			return "Sua frequência alvo está entre " + fMin + " e " + fMax;
		}

		
	
	
	
}
