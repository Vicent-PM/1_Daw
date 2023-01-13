public class Multimedia {
    private String titulo, autor, formato;
    private int duracion;

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public void imprimir() {
         System.out.println("Multimedia [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion
         + "]");
    }

    public boolean esIgual(Multimedia multi1) {
        if (multi1.titulo == multi1.autor) {
            return true;
        } else {
            return false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    
}
