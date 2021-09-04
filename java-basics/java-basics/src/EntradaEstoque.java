import java.util.Scanner;

public class EntradaEstoque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos");
		int quantidadeProdutos = entrada.nextInt();
		
		entrada.nextLine();
		
		Estoque estoque = new Estoque();
		estoque.produtos = new Produto[quantidadeProdutos];
		
		for(int i=0;i<estoque.produtos.length;i++) {
			estoque.produtos[i] = new Produto();
			System.out.println("Produto "+i);
			//System.out.println("------------------------");
			
			System.out.print("Descrição:");
			estoque.produtos[i].descricao = entrada.next();
			System.out.print("Quantidade:");
			estoque.produtos[i].quantidade = entrada.nextInt();
			System.out.println("------------------------");
						
		}
		
		estoque.listarProdutos();
		estoque.totalProdutos();
		
	}
	

}
