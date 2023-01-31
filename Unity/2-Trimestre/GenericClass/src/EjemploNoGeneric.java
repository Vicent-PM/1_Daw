import java.util.Collection;

public class EjemploNoGeneric {
    
    //No hay clase generic, por lo tanto si queremos un metodo generic hay que indicarlo con <T>
    public <T> void metodoGeneric(T element){

    }

    public static <T> T addAndReturn(T element, Collection<T> collection){
        collection.add(element);
        return element;
    }
}
