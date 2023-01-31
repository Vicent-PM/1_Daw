import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import figuras.*;
import interfaces.Geometria;

public class App {
    public static void main(String[] args) throws Exception {
        Geometria trg = new Triangulo("Triangulo 1", 3, 50, 70, 60);
        Geometria cdr = new Cuadrado("Cuadrado 1", 2);
        Geometria crl = new Circulo("Circulo 1", 5);

        Geometria cdr2 = new Cuadrado("Cuadrado 2", 6);
        Geometria crl2 = new Circulo("Circulo 2", 4);

        Set<Geometria> ColGeo1 = new HashSet<>();

        ColGeo1.add(trg);
        ColGeo1.add(cdr);
        ColGeo1.add(crl);

        Set<Geometria> ColGeo2 = new HashSet<>();

        ColGeo2.add(trg);
        ColGeo2.add(cdr2);
        ColGeo2.add(crl2);

        ColGeo1.addAll(ColGeo2);

        Map<String, Geometria> MapGeo = new HashMap<>();

        for(Geometria figura : ColGeo1){
            MapGeo.put(figura.getNombre(), figura);
        }

        for (Map.Entry<String, Geometria> entry : MapGeo.entrySet()) {
            String key = entry.getKey();
            System.out.println("Nombre de la figura: " + key);
            
            Geometria val = entry.getValue();

            System.out.println("Area: " + val.calcularArea());
            System.out.println("Perimetro: " + val.calcularPerimetro());
            
            if(val.getClass().getSimpleName().equals("Triangulo"))
                System.out.println("EL triangulo suma 180 grados: " + ((Triangulo)val).comprobarIntegridad());
            System.out.println();
        }
    }
}
