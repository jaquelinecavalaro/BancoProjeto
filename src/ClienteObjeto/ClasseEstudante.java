package ClienteObjeto;


import java.util.Scanner;

public class ClasseEstudante extends Conta{
	
	//JAQUELINE CAVALARO
	
	private double limiteEstudantil = 5000.00; //ESTUDANTE
	
	
	Scanner leia = new Scanner(System.in);
	double valor =0; //SUPER
	
	//CONSTRUTOR - VOU PERGUNTAR ISSO PARA O CLIENTE NA MINHA MAIN!!!
	public ClasseEstudante(String nomeCliente, String cpf, boolean ativa) {
		super(nomeCliente, cpf, ativa);
		
		
	}
	
	public ClasseEstudante(String nomeCliente, String cpf) {
		super(nomeCliente, cpf);
	
		//numeroConta = aleatorio.nextInt(1000);
		
	}
	//FIM CONSTRUTOR

	
	//SET E GET
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}
	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}//FIM GET E SET

	//INICIO METODO
	@Override
	public void credito(double credito) { //ESTOU COLOCANDO DINHEIRO NA CONTA
		
		if(credito > 0) {
			saldo = saldo + credito; //FORMULA PARA ADD DINHEIRO NO SALDO
			System.out.printf("O valor R$ %.2f foi inserido em sua conta!\n", credito);
		}
		else if(credito == 0) {
			System.out.print("ATEN��O! O valor a ser depositado deve ser maior que R$ 0,00 \n");
			System.out.println("Impossivel completar a transa��o! Tente outro valor.");
			
		}else if(credito < 0) {
			System.out.print("O valor informado deve ser positivo!");
			System.out.println("Impossivel completar a transa��o! Tente outro valor.");
		}
	}
	public void debito(double valor) {
		
		if (valor<=getSaldo())	{
			
			saldo=saldo-valor;
			
			System.out.println("Transa��o realizada com sucesso, seu saldo atual �: "+ getSaldo());
			System.out.println("Valor disponivel no Limite Estudantil: "+getLimiteEstudantil());
			
		}
		if (valor > getSaldo() && valor<=limiteEstudantil+getSaldo()) {
		
			System.out.println("Voc� n�o tem saldo suficiente para realizar a opera��o!");
			System.out.println("Deseja utilizar o empr�stimo Estudantil? ");
			System.out.println("Digite 1 para SIM e qualquer tecla para CANCELAR a opera��o!");
			char opcao = leia.next().charAt(contador);
			
			if (opcao == '1') {
				System.out.println("Qual valor deseja resgatar do Emprestimo estudantil? ");
				double valorEmprestimoEstudantil = leia.nextDouble();
				this.limiteEstudantil = this.limiteEstudantil - valorEmprestimoEstudantil;
				this.saldo = this.saldo + valorEmprestimoEstudantil - valor;
				System.out.println("Voc� utilizou o limite Estudantil!");
				System.out.println("Valor disponivel no Limite Estudantil: "+ getLimiteEstudantil());
				System.out.printf("Voc� retirou: %.2f\n", valor);
			}
			else {
				System.out.println("Opera��o CANCELADA!!!");
			}
		
		}
		if (valor > getSaldo() && valor>limiteEstudantil+getSaldo()) {
			System.out.println("Voc� n�o possu� saldo em sua conta e nem limite estudantil dispon�vel!");
			System.out.println("Opera��o cancelada!");
		}
	
	}
	
}