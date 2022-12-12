public class Pelicula extends Multimedia {
    private String actorPrincipal, actrizPrincipal;

    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal,
            String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
    }

    public Pelicula(String titulo, String autor, String formato, String actrizPrincipal, int duracion) {
        super(titulo, autor, formato, duracion);
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public void imprimir() {
        System.out.println("Multimedia [titulo=" + getTitulo() + ", autor=" + getAutor() + ", formato=" + getFormato()
                + ", duracion=" + getDuracion()
                + ", actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + "]");
        ;
    }

}
