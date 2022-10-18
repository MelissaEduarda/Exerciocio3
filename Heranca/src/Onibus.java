
public class Onibus extends Veiculo{

	protected int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos=assentos;
	}
	
	public void setAssentos(int assentos){
		this.assentos = assentos;
	}
	
	public int getAssentos(){
		return this.assentos;
	}
	
@Override
	public void exibirDados(){
		System.out.println("Ano do veículo: " + this.ano + " Placa do veículo: " + this.placa + " Assentos do veículo: " + this.assentos);
		System.out.println(" ");
	}
	
	
	
	
	
	
	
}
