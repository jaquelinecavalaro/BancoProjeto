package ClienteObjeto;

public class ContaCorrente extends Conta {
	//MATHEUS
	
		 int pedirTalao;
		 double valor = 0;
		 int contadortalao=3;
		 /*constructor*/
		
		 public double getValor() {
				return valor;
			}

			public void setValor(double valor) {
				this.valor = valor;
			}
			
		public ContaCorrente (String nomeCliente, String cpf) {
			super(nomeCliente, cpf);
			
		}

		public int getPedirTalao() {
			return pedirTalao;
		}

		public void setPedirTalao(int pedirTalao) {
			this.pedirTalao = pedirTalao;
		}
		/*Metodo*/
		public void talaoCheque() {
			//this.setPedirTalao (this.getPedirTalao()+1);
			if(this.pedirTalao < 3) 
			{
					
				this.setPedirTalao (this.getPedirTalao()+1);
				contadortalao--;
				System.out.println("Lembre-se voce tem direito a 3 Cheques mensais: ");
				
			}else{
				System.out.println("Lamento mais voc� atingiu a quantidade de Cheques mensais: ");
			}
			
		}//Override vai emBaixo ou metodo debito :) lembre-se n�o tem credito especial
		
			@Override
			public void credito(double valor) {
				super.saldo = super.saldo + valor;		
			}
			public void debito(double valor) {
				
				if(super.saldo >= valor) {
				super.saldo = super.saldo - valor;		
			 }else {
				 System.out.println("Voc� n�o possu� valor em sua conta!");
			 }
		
			}

	}
	

