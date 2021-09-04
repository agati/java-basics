
public class Principal2 {

	public static void main(String[] args) {

		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa e Cia Negócios Imobiliários");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");

		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("03/09/2021");
		conta1.setFornecedor(imobiliaria);

		/*
		ContaPagar conta2 = new ContaPagar();
		conta2.setDescricao("Compras do mês");
		conta2.setValor(390d);
		conta2.setDataVencimento("19/05/2012");
		conta2.setFornecedor(mercado);
		
		ContaPagar conta3 = new ContaPagar();
		conta3.setDescricao("Aluguel da Filial");
		conta3.setValor(700d);
		conta3.setDataVencimento("11/05/2012");
		conta3.setFornecedor(mercado);
		*/
		
		ContaPagar conta2 = new ContaPagar(mercado, "Compras do Mes", 390d, "19/05/2012");
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");

		conta1.pagar();
		conta2.pagar();
		conta3.pagar();

	}

}
