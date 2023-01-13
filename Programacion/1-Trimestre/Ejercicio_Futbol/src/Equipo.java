public class Equipo {
    private String nombre;
    private Jugador[] listadoEquipo;

    public Equipo(String nombre) {
        this.nombre = nombre;
        listadoEquipo = new Jugador[18];
        for (int i = 0; i < listadoEquipo.length; i++) {
            listadoEquipo[i] = new Jugador(i + 1);
        }
    }

    public String maximoGoleador() {
        Jugador maxGoleador = listadoEquipo[0];

        for (int i = 0; i < listadoEquipo.length; i++) {
            if (listadoEquipo[i].getGoles() > maxGoleador.getGoles()) {
                maxGoleador = listadoEquipo[i];
            }
        }
        return maxGoleador.toString();
    }

    public void jugadoresAmonestados() {
        for (int i = 0; i < listadoEquipo.length; i++) {
            if (listadoEquipo[i].getAmarillas() > 0) {
                listadoEquipo[i].toString();
            }
        }
    }

    public void jugadoresExpulsador() {
        for (int i = 0; i < listadoEquipo.length; i++) {
            if (listadoEquipo[i].isExpulsado() == true) {
                listadoEquipo[i].toString();
            }
        }
    }

    public int totalGoles() {
        int total = 0;
        for (int i = 0; i < listadoEquipo.length; i++) {
            total += listadoEquipo[i].getGoles();
        }
        return total;
    }

    public int totalAmonestaciones() {
        int total = 0;
        for (int i = 0; i < listadoEquipo.length; i++) {
            total += listadoEquipo[i].getAmarillas();
        }
        return total;
    }

    public int totalExpulsiones() {
        int total = 0;
        for (int i = 0; i < listadoEquipo.length; i++) {
            if (listadoEquipo[i].isExpulsado() == true) {
                total += 1;
            }
        }
        return total;
    }

    public Jugador getJugador(int dorsal) {
        for (int i = 0; i < listadoEquipo.length; i++) {
            if (listadoEquipo[i].getDorsal() == dorsal) {
                return listadoEquipo[i];
            } 
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador[] getListadoEquipo() {
        return listadoEquipo;
    }

    public void setListadoEquipo(Jugador[] listadoEquipo) {
        this.listadoEquipo = listadoEquipo;
    }
}