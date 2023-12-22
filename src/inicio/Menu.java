package inicio;

import java.util.InputMismatchException;
import java.util.Scanner;

import personalizar.Cores;

public class Menu {
	public static void main(String[] srgs) {
		Scanner leia = new Scanner(System.in);
		int opcao, codigo, quantidade, senha, carrinho;
		String usuario;
		
		while(true){
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND +
                    "*************************************************");

 System.out.println("                                                 ");

 System.out.println("                Farmacia Generation              ");

 System.out.println("*************************************************");
 
 System.out.println("          1 - Criar conta de usuário             ");

 System.out.println("          2 - Listar contas cadastradas          ");
 
 System.out.println("          3 - Buscar conta por número            ");

 System.out.println("          4 - Menu de remédios                   ");
 
 System.out.println("          5 - Visualizar Carrinho de Compras     ");
 
 System.out.println("          6 - Finalizar Pagamaneto               ");
 
 System.out.println("          7 -Sair                                ");
 
 System.out.println("*************************************************");
 
 System.out.println("     Entre com a opção desejada:                 " + Cores.TEXT_RESET);
 
	opcao = leia.nextInt();
    leia.nextLine();
 
    if(opcao == 7) {
     	System.out.println("Farmacia Generation agracede sua preferência!");
     	sobre();
      System.exit(0); }
 
 switch (opcao){
 case 1:
	 System.out.println("Cadastrar novo usuário");
	 System.out.println("Digite nome de usuário: ");
	 usuario = leia.nextLine();
	 System.out.println("Digite uma senha com três números: ");
	 senha = leia.nextInt();
	 System.out.println("Usuário Cadastrado com sucesso!");
	 break;
 case 2:
	 System.out.println("Usuários cadastrados: ");
	 break;
 case 3:
	 System.out.println("Buscar um usuário por id: ");
	 break;
 case 4:
	 System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND +
			            "**********Menu***********");		            
	 System.out.println("   1 - DIPIRONA R$10     ");
	 System.out.println("   2 - AMOXICILINA R$25  ");
	 System.out.println("   3 - Cimegripe R$9     ");
	 System.out.println("   4 - PARACETAMOL R$7   " + Cores.TEXT_RESET);
	 System.out.println("Digite o codigo do produto que deseja adicionar ao carrinho: \n");
	 codigo = leia.nextInt();
	 System.out.println("Agora digite a quantidade do produto: \n");
	 quantidade = leia.nextInt();
	 
	 switch(codigo) {
	 case 1 :
		 System.out.println("Produto adicionado ao carrinho, o total do seu carrinho é: " + (10 * quantidade) + " reais");
		 break;
	 case 2:
		 System.out.println("Produto adicionado ao carrinho, o total do seu carrinho é: " + (25 * quantidade) + " reais");
		 break;
	 case 3:
		 System.out.println("Produto adicionado ao carrinho, o total do seu carrinho é: " + (9 * quantidade) + " reais");
		 break;
	 case 4:
		 System.out.println("Produto adicionado ao carrinho, o total do seu carrinho é: " + (7 * quantidade) + " reais");
		 break;
	 }
	 System.out.println("Para adicionar mais produtos ao seu carrinho, volte ao Menu: ");
	 
	 break;
 case 5:
	 System.out.println("Meu Carrinho: ");
	 break;
 case 6:
	 System.out.println("Finalizar Pagamento\n");
	 System.out.println("O Total da sua compra é: R$");
	 break;
default:
	System.out.println("Opção Invalida!");
	break;
	 
 }
 
		}
	}

	
	public static void sobre() {
		 System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND+
				           "***************************************");
		 System.out.println("Projeto Desenvolvido por:              ");
		 System.out.println("Amanda Cruz - amandaellem2023@gmail.com");
		 System.out.println("https://github.com/amandinhacruz       ");
		 System.out.println("***************************************"
				 + Cores.TEXT_RESET);
	 }
	}
