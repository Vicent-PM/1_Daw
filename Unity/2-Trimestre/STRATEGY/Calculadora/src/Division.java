import Interfaces.Operacion;

public class Division implements Operacion {

    @Override
    public float execute(float ... terms) {
        float total = terms[0];

        if(terms.length == 0){
            return 0;
        }
        for (int i = 1; i < terms.length; i++) {
            total -= terms[i];
        };
        return total;
    }

}
