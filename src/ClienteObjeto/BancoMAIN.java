package ClienteObjeto;


import java.util.Random;
import java.util.Scanner;
import ClienteObjeto.ClasseEstudante;

public class BancoMAIN {
	
	public static void main(String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		 String nomeCliente;
		 char opcao=' ';
		 char tipoConta=' ';
		 String cpf;
		 int x=0;
		 
		 do {
		System.out.println("GRUPO 4");
		System.out.println("BEM-VINDO AO BANCO DiMAdeira");
		System.out.println("Sempre da Pau");
		
		System.out.println("Deseja Ativar a conta? 1 - Ativar ou qualquer tecla para sair");
		opcao = leia.next().toUpperCase().charAt(0);
		
		if (opcao == '1') {
		System.out.println("Escolha seu tipo de conta: ");
		System.out.println("1 - Conta Poupan�a\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Estudantil\n6 - Para sair: ");
		tipoConta = leia.next().charAt(0);
		
		//ESCOLHA TIPO CONTA
				if (tipoConta == '1') {
					
					System.out.println("A conta selecionada foi Poupan�a!");
					
					
					System.out.println("Informe seu nome: ");
					nomeCliente = leia.next();
					
					System.out.println("Informe seu CPF: ");
					cpf = leia.next();
					
					ContaPoupanca dadosPoupanca = new ContaPoupanca (nomeCliente, cpf);
					
					System.out.printf("Ol� Sr(a). %s seu numero de conta �: %d\n", nomeCliente, dadosPoupanca.getNumero());
					
					
					for (x=0; x<=10; x++) {
						
						do {
							
						System.out.println("Qual opera��o deseja realizar? ");
					
						System.out.println("1 - Credito (Adicionar valor a conta): ");
					
						System.out.println("2 - Debito (retirar valor da conta): ");
						opcao = leia.next().charAt(0);
						
						if (opcao != '1' && opcao != '2') {
							
							System.out.println("Op��o selecionada INVALIDA!");
						}
					
						if (opcao == '1') {
						
							System.out.println("Qual valor deseja creditar? ");
							double valor = leia.nextDouble();
							dadosPoupanca.setValor(valor);
							dadosPoupanca.credito(valor);
							
						}
					
						if (opcao == '2') {
							System.out.println("Qual valor deseja debitar? ");
							double valor = leia.nextDouble();
							dadosPoupanca.setValor(valor);
							dadosPoupanca.debito(valor);
							
						}
						
						
					}while (opcao != '1' && opcao != '2');  //FINAL LOOPING
						
					}
					
				}
				if (tipoConta == '2') { //ALTERA��O CONTA CORRENTE COME�A AQUI
					
					System.out.println("A conta selecionada foi Corrente!");
					
					System.out.println("Informe seu nome: ");
					nomeCliente = leia.next();
					
					System.out.println("Informe seu CPF: ");
					cpf = leia.next();
					
					ContaCorrente corrente = new ContaCorrente (nomeCliente,cpf);
					
					System.out.printf("Ol� Sr(a) %s , o numero da sua conta �: %d \n", nomeCliente, corrente.getNumero());
					
					for (x =0; x<=10; x++) {
						//System.out.println(x);
						if (x>=10) {
							break;
							
						}
						do {
					System.out.println("Qual opera��o deseja realizar? ");
					
					System.out.println("1 - Credito (Adicionar valor a conta): ");
				
					System.out.println("2 - Debito (retirar valor da conta): ");
					opcao = leia.next().charAt(0);
					
					if (opcao != '1' && opcao != '2') {
						
						System.out.println("Op��o selecionada INVALIDA!");
					}
					
					if (opcao == '1') {
						System.out.println("Qual valor deseja creditar? ");
						double valor = leia.nextDouble();
						corrente.setValor(valor);
						corrente.credito(valor);
						System.out.printf("O saldo atual de sua conta �: %.2f\n", corrente.getSaldo());
						
					}

					if (opcao =='2') {
						
						System.out.println("Qual valor deseja debitar? ");
						double valor = leia.nextDouble();
						corrente.setValor(valor);
						
						
						corrente.debito(valor);
						System.out.printf("O saldo atual da sua conta �: %.2f\n", corrente.getSaldo());
						
					}
					
					}while (opcao != '1' && opcao != '2');
					
					
				}
					//TALAO CHEQUE
					System.out.println("Voc� acabou com seus 10 movimentos em sua conta!");
					System.out.printf("Mas possu� tal�es dispon�veis, deseja retirar? 1 - SIM ou qualquer tecla para N�O\n");
					char opcaotalao = leia.next().charAt(0);
					
					if (opcaotalao == '1') {
						 int talaoquant = 3;
						 
						System.out.printf("Voc� possu� %d tal�es dispon�veis, quanto(s) deseja retirar?", talaoquant);
						int talao = leia.nextInt();
						corrente.setPedirTalao(talao);
						talaoquant = talaoquant - talao;
						System.out.printf("Solicita��es efetuada com sucesso! Voc� possu� agora %d tal�es dispon�veis.\n", talaoquant);
						
					}
					else {
						System.out.println("Opera��o cancelada!");
					}
				}
					//ALTERA��O CONTA CORRENTE TERMINA AQUIII
					
				if (tipoConta == '3') { //CONTA 3
					
					System.out.println("A conta selecionada foi Especial!");
					
					System.out.println("Informe seu nome: ");
					nomeCliente = leia.next();
					
					System.out.println("Informe seu CPF: ");
					cpf = leia.next();
					
					ContaEspecial especial = new ContaEspecial (nomeCliente,cpf);
					
					System.out.printf("Ol� Sr(a) %s , o numero da sua conta �: %d \n", nomeCliente, especial.getNumero());
					
					for ( x =0; x<=10; x++) {
						
						do {
					System.out.println("Qual opera��o deseja realizar? ");
					
					System.out.println("1 - Credito (Adicionar valor a conta): ");
				
					System.out.println("2 - Debito (retirar valor da conta): ");
					opcao = leia.next().charAt(0);
					
					if (opcao != '1' && opcao != '2') {
						
						System.out.println("Op��o selecionada INVALIDA!");
					}
					
					if (opcao == '1') {
						System.out.println("Qual valor deseja creditar? ");
						double valor = leia.nextDouble();
						especial.setValor(valor);
						especial.credito(valor);
						System.out.printf("O saldo atual de sua conta �: %.2f\n", especial.getSaldo());
						
					}

					if (opcao =='2') {
						
						System.out.println("Qual valor deseja debitar? ");
						double valor = leia.nextDouble();
						especial.setValor(valor);
						
						especial.debito(valor);
						System.out.printf("O saldo atual da sua conta �: %.2f\n", especial.getSaldo());
						
					}
					
					}while (opcao != '1' && opcao != '2');
					
					}
					
				}
				if (tipoConta == '4') {
					
					System.out.println("A conta selecionada foi Empresarial!");
				}
				if (tipoConta == '5') { //COMECO ESTUDANTE
					
					System.out.println("A conta selecionada foi Estudantil!");
					
					System.out.println("Informe seu nome: ");
					nomeCliente = leia.next();
					
					System.out.println("Informe seu CPF: ");
					cpf = leia.next();
					
					ClasseEstudante estudante = new ClasseEstudante (nomeCliente,cpf);
					
					System.out.printf("Ol� Sr(a) %s , o numero da sua conta �: %d \n", nomeCliente, estudante.getNumero());
				
					//LOOPING
					for (x =0; x<=10; x++) {
						
					do {
						
					System.out.println("Qual opera��o deseja realizar? ");
				
					System.out.println("1 - Credito (Adicionar valor a conta): ");
				
					System.out.println("2 - Debito (retirar valor da conta): ");
					opcao = leia.next().charAt(0);
					
					if (opcao != '1' && opcao != '2') {
						
						System.out.println("Op��o selecionada INVALIDA!");
					}
					if (opcao == '1') {
						System.out.println("Qual valor deseja creditar? ");
						double valor = leia.nextDouble();
						estudante.setValor(valor);
						estudante.credito(valor);
						System.out.printf("O saldo atual de sua conta �: %.2f\n", estudante.getSaldo());
						
					}

					if (opcao =='2') {
						
						System.out.println("Qual valor deseja debitar? ");
						double valor = leia.nextDouble();
						estudante.setValor(valor);
						
						estudante.debito(valor);
						System.out.printf("O saldo atual da sua conta �: %.2f\n", estudante.getSaldo());
						
					}
					
					}while (opcao != '1' && opcao != '2');  //FINAL LOOPING
					}
				} //FIM ESTUDANTE 
				if (tipoConta == '6') {
					
					System.out.println("Voc� saiu da opera��o!");
				}
				//FIM ESCOLHA DE CONTA
		
				
		else {
			System.out.println("Voc� encerrou a opera��o!");
		}
	

	}
		 }while (opcao == '6' || tipoConta == '6');

	}//STRING
		}//CLASSE
