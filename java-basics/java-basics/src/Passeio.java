
public class Passeio {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.cachorro=new Cachorro();
		p1.nome = "José";
		p1.cachorro.nome="bidu";
		
		
		Caminhada caminhada = new Caminhada();
		caminhada.andar(p1);
		

	}

}
