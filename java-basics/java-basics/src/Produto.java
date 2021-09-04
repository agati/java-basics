
public class Produto {
	
	 String descricao;
	int quantidade;
	
	void descrever() {
		System.out.println(descricao +": "+quantidade+" itens");
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
