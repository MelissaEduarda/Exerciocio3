
public class Veiculo {

	protected String placa;
	protected int ano;
	
	public Veiculo() {
	}
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getPlaca(){
		return this.placa;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public void exibirDados(){
		System.out.println("Ano do veículo: " + this.ano +" Placa do veículo: " + this.placa);
		System.out.println(" ");
	}
}

