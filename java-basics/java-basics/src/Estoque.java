
public class Estoque {
	Produto[] produtos;
	
	void listarProdutos() {
		System.out.println("Produtos em Estoque");
		System.out.println("------------------");
		
		for (int i=0;i<produtos.length;i++) {
			produtos[i].descrever();
		}
		
		
	}
	
	void totalProdutos() {
		
		int totalProdutos = 0;
		for (int i=0;i<produtos.length;i++) {
			totalProdutos+=produtos[i].quantidade;
		}
			System.out.println("------------------");
			System.out.println("A quantidade total de produtos no Estoque é: "
					+totalProdutos);
			System.out.println("------------------");
					
	}

}
