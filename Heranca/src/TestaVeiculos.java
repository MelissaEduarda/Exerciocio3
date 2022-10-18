import java.util.ArrayList;

public class TestaVeiculos {

	public static void main(String[] args) {
		
		
		
		Veiculo veiculo = new Veiculo("BLE-321",2024);
		
		Caminhao caminhao = new Caminhao("EFG-5678",2022,9);
		Caminhao caminhaoPipa = new Caminhao("EEE-5555",1982,2);
		
		Onibus onibus = new Onibus("AAA-1111",2000,41);
		Onibus onibusViagem = new Onibus("ABC-1234",2005,45);
		
		caminhao.getPlaca();
		caminhao.getAno();
		caminhao.getEixos();
		caminhao.setPlaca("EFG-5678");
		caminhao.setAno(2022);
		caminhao.setEixos(9);
		
		caminhaoPipa.getPlaca();
		caminhaoPipa.getAno();
		caminhaoPipa.getEixos();
		caminhaoPipa.setPlaca("EEE-5555");
		caminhaoPipa.setAno(1982);
		caminhaoPipa.setEixos(2);
		
		
		onibus.getPlaca();
		onibus.getAno();
		onibus.getAssentos();
		onibus.setPlaca("AAA-1111");
		onibus.setAno(2000);
		onibus.setAssentos(41);
		
		onibusViagem.getPlaca();
		onibusViagem.getAno();
		onibusViagem.getAssentos();
		onibusViagem.setPlaca("ABC-1234");
		onibusViagem.setAno(2005);
		onibusViagem.setAssentos(45);
		
		
		
		veiculo.exibirDados();
		
		caminhao.exibirDados();
		caminhaoPipa.exibirDados();
		
		onibus.exibirDados();
		onibusViagem.exibirDados();
	}

}
