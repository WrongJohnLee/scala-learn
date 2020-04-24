import java.util.function.Function;

public class Helloworld_Java {
    public static void main(String[] args) {
        Function foo = (Function<Integer, Integer>) i -> i * i;
        System.out.println(foo.apply(1));
    }

}
