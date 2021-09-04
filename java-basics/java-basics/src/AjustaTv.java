
public class AjustaTv {

	public static void main(String[] args) {
		Televisor tv = new Televisor();

		// Não deveria mudar o volume e o canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);

		// Deveria mudar o volume e o canal
		tv.mudarVolume(300);
		tv.mudarCanal(110);

	}

}
