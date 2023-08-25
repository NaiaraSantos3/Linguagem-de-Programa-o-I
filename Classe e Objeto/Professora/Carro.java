package veic;

public class Carro {
	
	private double velocidadeatual;
	private String placa;
	private String cor;
	private String modelo;
	
	
	public Carro(String cor,String modelo, String placa) {
		this.cor=cor;
		this.modelo=modelo;
		this.placa=placa;
		
	}
	
	
	public void andar(double distancia) {
		if(velocidadeatual<=0) {
			velocidadeatual=30;
		}
		
		System.out.println("Estamos andando"+ distancia);
	}
	public void frear(double forca)
	{
		velocidadeatual=0;
		System.out.println("Estamos parando"+ forca);
		
		
	}
	
	public boolean capotar() {
		return true;
	}
	public double getVelocidadeatual() {
		return velocidadeatual;
	}
	public void setVelocidadeatual(double velocidadeatual) {
		this.velocidadeatual = velocidadeatual;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public String getModelo() {
		return modelo;
	}
	
	
	

}
