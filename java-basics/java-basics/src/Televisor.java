
public class Televisor {

		Integer canal=130;
		Integer volume=20;
		
		void mudarCanal(Integer novocanal) {
			if(canal.intValue()==novocanal.intValue()) {
				System.out.println("Novo canal é também o canal atual");
			}else {
				canal=novocanal.intValue();
				System.out.println("Canal alterado para "+canal);
			}
		}
		
		void mudarVolume(Integer novoVolume) {
			if(novoVolume.intValue()==volume.intValue()) {
				System.out.println("Novo volume é também o volume atual");
			}else {
				volume=novoVolume.intValue();
				System.out.println("Volume alterado para "+volume);
			}
		}
		

}
