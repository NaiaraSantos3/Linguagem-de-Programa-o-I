import javax.swing.event.CaretListener;

//https://cidadedesaopaulo.com/wp-content/uploads/2022/07/livrariacultura.jpg//

public class Livro { 
    private String genero;
    private String autor;
    private double paginas;
        
     public Livro(String genero, String autor, double paginas) {
        this.genero=genero;
        this.autor=autor;
        this.paginas=paginas;
     }

     public boolean cair() {
        return true;
    }

    public String getGenero (){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getAutor(){
        return autor; 
    }

    public void setAutor(){
        this.autor = autor;
    }

    public double getPaginas(){
        return paginas;
    }

    public void setPaginas(){
        this.paginas = paginas;
    }
}