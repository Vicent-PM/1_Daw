public class AppMain {
    public static void main(String[] args) {

        Caja caja1 = new Caja(9.7, 4.3, 5.0);

        Caja caja2 = new Caja(7.0, 2.7, 10);

        Persona vicente = new Persona(null, null, null, null, 1000);
        vicente.meterDinero(1000);
        boolean resultado = vicente.sacarDinero(500);
        if (resultado) {
            System.out.println("La operacion ha ido correctamente");
        }else {
            System.out.println("No hay suficiente dinero");
        }

        Caja cajaEstandar = new Caja();

        Caja cajaCuadrada = new Caja(20);

        caja1.calculaVolumen();
        caja2.calculaVolumen();

        double volumen = caja1.calculaVolumen();

        caja1.setDimension(4, 4, 4.3);
        caja1.calculaVolumen();
        caja1.imprimirCaja();
        cajaEstandar.imprimirCaja();
        cajaCuadrada.imprimirCaja();

    }
}
