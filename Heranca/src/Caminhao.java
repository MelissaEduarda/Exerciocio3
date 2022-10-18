
public class Caminhao extends Veiculo {
	
	protected int eixos;
	
	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos=eixos;
	}
	
	public void setEixos(int eixos){
		this.eixos = eixos;
	}
	
	public int getEixos(){
		return this.eixos;
	}
	
@Override
	public void exibirDados(){
		System.out.println("Ano do veículo: " + this.ano + " Placa do veículo: " + this.placa + "Eixos do veículo: " + this.eixos);
		System.out.println(" ");
	}
}
