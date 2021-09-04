
public class ContaPagar {

	Fornecedor fornecedor = new Fornecedor();	
	String descricao;
	double valor;
	String dataVencimento;
	
	
	ContaPagar(){
		//construtor vazio
	}
	
	
	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	

	void pagar(){
		System.out.println("-----------------------------");
		System.out.println("Descrição da conta: "+descricao+" valor: "+valor+" vencimento: "+
		dataVencimento+" fornecedor: "+fornecedor.nome);
		System.out.println("-----------------------------");
		
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
}
