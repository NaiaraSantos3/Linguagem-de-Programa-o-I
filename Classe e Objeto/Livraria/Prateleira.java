
//https://cidadedesaopaulo.com/wp-content/uploads/2022/07/livrariacultura.jpg//

public class Prateleira { 
    private String corredor;
    private String lado;
    private double nivel;
        
     public Prateleira(String corredor, String lado, double nivel) {
        this.corredor=corredor;
        this.lado=lado;
        this.nivel=nivel;
     }

    public boolean cair() {//
        return true;
    }

    public String getCorredor (){
        return corredor;
    }

    public void setCorredor(String corredor){
        this.corredor = corredor;
    }
    
    public String getLado(){
        return lado; 
    }

    public void setLado(){
        this.lado = lado;
    }

    public double getNivel(){
        return nivel;
    }
    
    public void setNivel(){
        this.nivel = nivel;
    }


}

