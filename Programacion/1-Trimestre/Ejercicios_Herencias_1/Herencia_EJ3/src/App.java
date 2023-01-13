public class App {
    public static void main(String[] args) {
        ListaMultimedia lista1 = new ListaMultimedia(10);

        Pelicula peli1 = new Pelicula("Avatar", "Chris", "MP4", "Eva", 180);
        Pelicula peli2 = new Pelicula("Avatar 2", "Chris", "MP4", 240, "Joe");
        Pelicula peli3 = new Pelicula("Avatar 3", "Chris", "MP4", 280, "Joe", "Eva");

        lista1.addObjeto(peli1);
        lista1.addObjeto(peli2);
        lista1.addObjeto(peli3);

        lista1.imprimirLista();
    }
}
