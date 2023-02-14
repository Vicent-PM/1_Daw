import java.time.LocalDateTime;
import java.util.function.*;

import org.w3c.dom.Text;

public class App {
    public static void main(String[] args) throws Exception {

        Supplier<String> anonym = () -> {
            return "hola";
        };

        Supplier<LocalDateTime> currentLocalTime = () -> {
            return LocalDateTime.now();
        };

        System.out.println(anonym.get());
        System.out.println(currentLocalTime.get());

        Consumer<String> printer = (String text) -> {
                System.out.println(text);
        };

        printer.accept("saludo");

        Function<Integer, Integer> powerOf2 = (Integer number) -> {
            return number * number;
        };

        System.out.println(powerOf2.apply(4));

        Predicate<Integer> isPositive = (Integer number) -> {
            return number > 0;
        };

        if(isPositive.test(12)){
            System.out.println("El numero es positivo");
        }
    }
}
