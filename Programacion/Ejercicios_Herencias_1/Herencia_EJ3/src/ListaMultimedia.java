public class ListaMultimedia {
    private Multimedia[] arrayMultimedia;
    private int contador;

    public ListaMultimedia(int tamaño) {
        arrayMultimedia = new Multimedia[tamaño];
    }

    public int dameTamanio() {
        return this.contador;
    }

    public boolean addObjeto(Multimedia m) {
        arrayMultimedia[contador] = m;
        if (contador == arrayMultimedia.length - 1) {
            return true;
        } else {
            contador += 1;
            return false;
        }
    }

    public Multimedia getObjeto(int position) {
        return arrayMultimedia[position];
    }

    public void imprimirLista() {
        for (int i = 0; i < arrayMultimedia.length; i++) {
            if(arrayMultimedia[i] != null){
                arrayMultimedia[i].imprimir();
            }
        }
    }
}
