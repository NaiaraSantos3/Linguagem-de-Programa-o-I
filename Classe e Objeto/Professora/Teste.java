package veic;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1=new Carro("verde","hb20","XXX450");
		Bike b1=new Bike ("verde",30, true);
		c1.setVelocidadeatual(120);         
		System.out.println("Nosso carro é "+c1.getCor());
		c1.setCor("azul");
		System.out.println("Nosso carro é "+c1.getCor());
		Carro c2=new Carro("preto","Civic","ttttt222");
		System.out.println("Nossos carros tem as cores "+c1.getCor()+ "  " + c2.getCor());

	}

}
