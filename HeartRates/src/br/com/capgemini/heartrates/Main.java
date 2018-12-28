package br.com.capgemini.heartrates;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		HeartRates heartRates = new HeartRates();
		Conta conta = new Conta();
		System.out.println("Qual o seu nome? ");
		heartRates.setNome(input.nextLine());
		
		
		System.out.println("Qual o seu sobrenome? ");
		heartRates.setSobrenome(input.nextLine());
		
		System.out.println("Em que dia você nasceu? ");
		heartRates.setDiaNascimento(Integer.parseInt(input.nextLine()));
		
		System.out.println("Em que mes você nasceu? ");
		heartRates.setMesNascimento(Integer.parseInt(input.nextLine()));
		
		System.out.println("Em que ano você nasceu? ");
		heartRates.setAnoNascimento(Integer.parseInt(input.nextLine()));
		
	
		int idade =  conta.calcularIdade(heartRates);
		
		System.out.println("Sua idade é: " + idade);
		System.out.println("Sua frequencia cardiaca é: " + conta.calculaFrequenciaCardiaca(idade));
		System.out.println("" + conta.retornaFrequenciaAlvo(idade));
		
	}

}

