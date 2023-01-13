public class Disco extends Multimedia {
    private String genero;

    public Disco(String titulo, String autor, String formato, int duracion, String genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("Multimedia [titulo=" + getTitulo() + ", autor=" + getAutor() + ", formato=" + getFormato()
                + ", duracion=" + getDuracion() + ", genero=" + getGenero()
                + "]");
    }
}
