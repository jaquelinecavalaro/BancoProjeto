package ClienteObjeto;
	// LARISSA
	//classepoupanca
	import java.util.Scanner;

	public class ContaPoupanca extends Conta{
		
	        private int diaAtualPoupanca;
	        private int mesAtualPoupanca;
	        private int diaAniversario;
	        private int mesAniversario;
	        double valor=0;
	        Scanner leia = new Scanner (System.in);

	        //construtores
	        public ContaPoupanca (String nomeCliente, String cpf) {
	        	super (nomeCliente,cpf);
	        }
	        
	        public ContaPoupanca (String nomeCliente, String cpf, int diaAtualPoupanca, int mesAtualPoupanca, int diaAniversario, int mesAniversario)
	        {
	        	super (nomeCliente, cpf);
	        	this.diaAtualPoupanca = diaAtualPoupanca;
	        	this.mesAtualPoupanca = mesAtualPoupanca;
	        	this.diaAniversario = diaAniversario;
	        	this.mesAniversario = mesAniversario; 	
	        }
	        
	       
	        
	        
	        

	        

			public double getValor() {
				return valor;
			}

			public void setValor(double valor) {
				this.valor = valor;
			}

			public int getDiaAtualPoupanca() {
				return diaAtualPoupanca;
			}

			public void setDiaAtualPoupanca(int diaAtualPoupanca) {
				this.diaAtualPoupanca = diaAtualPoupanca;
			}

			public int getMesAtualPoupanca() {
				return mesAtualPoupanca;
			}

			public void setMesAtualPoupanca(int mesAtualPoupanca) {
				this.mesAtualPoupanca = mesAtualPoupanca;
			}

			public int getDiaAniversario() {
				return diaAniversario;
			}

			public void setDiaAniversario(int diaAniversario) {
				this.diaAniversario = diaAniversario;
			}

			public int getMesAniversario() {
				return mesAniversario;
			}

			public void setMesAniversario(int mesAniversario) {
				this.mesAniversario = mesAniversario;
			}



			@Override
	        public void credito(double valor) {
				
				if (valor>0) {
					
					System.out.println("Informe o dia atual: ");
					int diaAtualPoupanca = leia.nextInt();
					
					System.out.println("Informe o m�s atual: ");
					int mesAtualPoupanca = leia.nextInt();
					
					System.out.println("Agora, informe o dia do seu anivers�rio: ");
					int diaAniversario = leia.nextInt();
					
					System.out.println("Informe o m�s de seu anivers�rio: ");
					int mesAniversario = leia.nextInt();
					                                      
					if(diaAtualPoupanca == diaAniversario && mesAtualPoupanca==mesAniversario) {
						
						System.out.println("Voc� tem uma bonifica��o de 0,05% pelo dia de seu anivers�rio!");
						double bonificacao = valor * 0.05;
						System.out.printf("Sua bonifica��o � de: %.2f \n", bonificacao);
						
						saldo = (bonificacao + saldo)+valor;
						
						System.out.printf("Seu saldo atual �: %.2f", saldo);
						
					}else 
					{
						System.out.println("Valor informado inv�lido!");
					}
				}
					
	        }

			
			
			
			@Override
			public void debito(double valor) {
				
		
				if(this.saldo >= valor){
					this.saldo = this.saldo - valor;
					System.out.printf("Voc� retirou %.2f de sua conta, seu saldo atual � de: %.2f", valor, saldo);
				
						
				
			 }
			if (this.saldo < valor) {
				System.out.println("Voc� n�o possu� valor suficiente para realizar o saque!");
				System.out.println("Opera��o cancelada");
			}
			
        }
			
			
			
			
			
			
	}//CHAVE CLASSE


