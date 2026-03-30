package CoreJava.Java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExp {
    public static void main(String[] args) {
        MathOperation sum = (a,b) -> a+b;
        MathOperation difference = (a,b) -> Math.abs(a-b);
        MathOperation product = (a,b) -> a*b;

//        System.out.println("Sum : "+sum.operate(5,5));
//        System.out.println("Product: " + product.operate(5,5));

        Predicate<Integer> isAGreater = (a) -> a>10;
       // System.out.println(isAGreater.test(76));
        Predicate<Integer> isASmaller = (a) -> a < 20;
        Predicate<Integer> check = isAGreater.and(isASmaller);
        Predicate<Integer> negated = check.negate();
        System.out.println(negated.test(16));

        Function<Integer,Integer> subtract5 = (a) -> a-5;
        Function<Integer,Integer> doubleIt = (a) -> a*2;
        System.out.println(subtract5.andThen(doubleIt).apply(55));

    }

    public interface MathOperation{
        int operate(int a, int b);
    }
}
