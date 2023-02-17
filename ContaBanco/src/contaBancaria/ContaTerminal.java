package contaBancaria;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) throws Exception{
		
		NumberFormat formatter = new DecimalFormat("#,##0.00");
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		float saldo;
		
		
		System.out.println("Por favor, informe seu Nome:");
		nomeCliente = leitor.nextLine();
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia:");
		agencia = leitor.next();
		
		System.out.println("Por favor, informe seu N�mero:");
		numero = leitor.nextInt();
		
		System.out.println("Digite o valor para dep�sito inicial:");
		saldo = leitor.nextFloat();
		
		
		System.out.println("Ol� ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " .concat(agencia) + ", conta " + numero + " e seu saldo " + formatter.format(saldo) + " j� est� dispon�vel para saque.");
		
		
		
	}
}
