package com.softdev.financeiro.modelo;

public class ContaPagar extends Conta {

	public ContaPagar() {

	}

	// private Fornecedor fornecedor; //ele criou o fornecedor aqui e nao na Conta
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.setFornecedor(fornecedor);
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void pagar() throws OperacaoContaException {

		if (this.getSituacaoConta().equals(SituacaoConta.CANCELADA)) {
			
			String mensagem1="Pagamento n�o efetuado. Esta conta est� CANCELADA: ["+ this.getDescricao() + " valor: " + this.getValor()+"]";
						
			throw new OperacaoContaException(mensagem1);
		}
			/*
			System.out.println("Pagamento n�o efetuado. Esta conta est� CANCELADA:");
			System.out.println("Descri��o da conta: " + this.getDescricao() + " valor: " + this.getValor()
					+ " vencimento: " + this.getDataVencimento() + " fornecedor: " + this.getFornecedor().getNome()
					+ " situacao conta: " + this.getSituacaoConta());
			System.out.println("-----------------------------");
			*/
		

		if (this.getSituacaoConta().equals(SituacaoConta.PAGA)) {
			
			String mensagem2="Pagamento n�o efetuado. Esta conta j� est� PAGA: ["+ this.getDescricao() + " valor: " + this.getValor()+"]";
			
			throw new OperacaoContaException(mensagem2);
			
			/*
			System.out.println("Pagamento n�o efetuado. Esta conta j� est� PAGA:");
			System.out.println("Descri��o da conta: " + getDescricao() + " valor: " + getValor() + " vencimento: "
					+ getDataVencimento() + " fornecedor: " + this.getFornecedor().getNome() + " situacao conta: "
					+ this.getSituacaoConta());
			System.out.println("-----------------------------");
			*/
		}

		if (this.getSituacaoConta().equals(SituacaoConta.PENDENTE)) {

			this.setSituacaoConta(SituacaoConta.PAGA);

			System.out.println("-----------------------------");
			System.out.println("Pagamento efetuado:");
			System.out.println("Descri��o da conta: " + getDescricao() + " valor: " + getValor() + " vencimento: "
					+ getDataVencimento() + " fornecedor: " + this.getFornecedor().getNome() + " situacao conta: "
					+ this.getSituacaoConta());
			System.out.println("-----------------------------");
		}

	}

	@Override
	public void exibirDetalhes() {

		System.out.println("                Conta a Pagar");
		System.out.println("===================================================");
		System.out.println("Fornecedor: " + this.getFornecedor().getNome());
		System.out.println("Descri��o: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situa��o: " + this.getSituacaoConta());
		System.out.println("====================================================");
	}

}
