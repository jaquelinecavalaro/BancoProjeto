package ClienteObjeto;

import java.util.Scanner;
//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM
public class BancoTesteLaco {

public static void main(String [] args) {
		
		Scanner leia = new Scanner (System.in);
		//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

		 String nomeCliente;
		 char opcao=' ';
		 char tipoConta=' ';
		 char opcaoop = ' ';
		 String cpf;
		 int x=0;
		//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

		 do {
		System.out.println("GRUPO 4");
		System.out.println("BEM-VINDO AO BANCO DiMAdeira");
		System.out.println("Sempre da Pau");
		
		System.out.println("Deseja Ativar a conta? 1 - Ativar ou 6 para sair");
		opcao = leia.next().toUpperCase().charAt(0);
	
	
		if (opcao == '1') {
			//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

			System.out.println("Escolha seu tipo de conta: ");
			System.out.println("1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Estudantil\n ou 6 - Para sair: ");
			tipoConta = leia.next().charAt(0);
			
			if (tipoConta == '5') { //COMECO ESTUDANTE
				while (opcaoop != '6') {
					
				
				System.out.println("A conta selecionada foi Estudantil!");
				
				System.out.println("Informe seu nome: ");
				nomeCliente = leia.next();
				
				System.out.println("Informe seu CPF: ");
				cpf = leia.next();
				//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

				ClasseEstudante estudante = new ClasseEstudante (nomeCliente,cpf);
				
				System.out.printf("Olá Sr(a) %s , o numero da sua conta é: %d \n", nomeCliente, estudante.getNumero());
			
				//LOOPING
				
				//for (x =0; x<=10; x++) {
				do {
					
				System.out.println("Qual operação deseja realizar? ");
			
				System.out.println("1 - Credito (Adicionar valor a conta): ");
			
				System.out.println("2 - Debito (retirar valor da conta): ");
				//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

				System.out.println("6 - Para sair da operação: ");
				opcaoop = leia.next().charAt(0);
				
				if (opcaoop != '1' && opcaoop != '2' && opcaoop !='6') {
					
					System.out.println("Opção selecionada INVALIDA!");
				}
				if (opcaoop == '1') {
					System.out.println("Qual valor deseja creditar? ");
					double valor = leia.nextDouble();
					estudante.setValor(valor);
					estudante.credito(valor);
					System.out.printf("O saldo atual de sua conta é: %.2f\n", estudante.getSaldo());
					//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

				}

				if (opcaoop =='2') {
					
					System.out.println("Qual valor deseja debitar? ");
					double valor = leia.nextDouble();
					estudante.setValor(valor);
					
					estudante.debito(valor);
					System.out.printf("O saldo atual da sua conta é: %.2f\n", estudante.getSaldo());
					
				}
				
				//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

				//}
				}while (opcaoop != '1' && opcaoop != '2' && opcaoop !='6');  //FINAL LOOPING DO
				//}//FOR LAÇO DE REPETICAO
			
	
				//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

				
			}//SEGUNDO IF
			
			
			}//PRIMEIRO IF	//QR ATIVAR OU NAO
			else if (opcaoop == '6') {
				System.out.println("Você saiu da operação");
			}
		}//fechando WHILE
		 }while (opcao == '6' || tipoConta == '6'); //NAO MEXER ESTA CORRETO
		//MONTADO PARA FAZER TESTE COM LACO DE REPETICAO IGNOREM

}//string args
}//classe
