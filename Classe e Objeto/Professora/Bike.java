package veic;

public class Bike {
 private String cor;
 private double aro;
 private boolean cesta;
 
 public Bike(String cor, double aro, boolean cesta) {
	 this.cor=cor;
	 this.aro=aro;
	 this.cesta=cesta;
 }
 
 public boolean derrapar() {
	 return true;
 }

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public double getAro() {
	return aro;
}

public void setAro(double aro) {
	this.aro = aro;
}

public boolean isCesta() {
	return cesta;
}

public void setCesta(boolean cesta) {
	this.cesta = cesta;
}
}
