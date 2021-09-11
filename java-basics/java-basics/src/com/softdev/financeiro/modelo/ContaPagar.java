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
			
			String mensagem1="Pagamento não efetuado. Esta conta está CANCELADA: ["+ this.getDescricao() + " valor: " + this.getValor()+"]";
						
			throw new OperacaoContaException(mensagem1);
		}
			/*
			System.out.println("Pagamento não efetuado. Esta conta está CANCELADA:");
			System.out.println("Descrição da conta: " + this.getDescricao() + " valor: " + this.getValor()
					+ " vencimento: " + this.getDataVencimento() + " fornecedor: " + this.getFornecedor().getNome()
					+ " situacao conta: " + this.getSituacaoConta());
			System.out.println("-----------------------------");
			*/
		

		if (this.getSituacaoConta().equals(SituacaoConta.PAGA)) {
			
			String mensagem2="Pagamento não efetuado. Esta conta já está PAGA: ["+ this.getDescricao() + " valor: " + this.getValor()+"]";
			
			throw new OperacaoContaException(mensagem2);
			
			/*
			System.out.println("Pagamento não efetuado. Esta conta já está PAGA:");
			System.out.println("Descrição da conta: " + getDescricao() + " valor: " + getValor() + " vencimento: "
					+ getDataVencimento() + " fornecedor: " + this.getFornecedor().getNome() + " situacao conta: "
					+ this.getSituacaoConta());
			System.out.println("-----------------------------");
			*/
		}

		if (this.getSituacaoConta().equals(SituacaoConta.PENDENTE)) {

			this.setSituacaoConta(SituacaoConta.PAGA);

			System.out.println("-----------------------------");
			System.out.println("Pagamento efetuado:");
			System.out.println("Descrição da conta: " + getDescricao() + " valor: " + getValor() + " vencimento: "
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
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("====================================================");
	}

}
