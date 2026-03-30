package CoreJava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intro {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,7,8,9,11);
//
//        System.out.println(list.stream().filter(x -> x%2==0).filter(x -> x>4).findAny());
//
//        String[] strings = {"Ashu", "Sohu", "Nandu","Ashu", "Sohu", "Nandu","Ashu", "Sohu", "Nandu"};
//        Stream<String> stringStream = Arrays.stream(strings);
//        Stream<String> uStream = stringStream.filter(s -> s.endsWith("u")).distinct();
//        System.out.println(uStream.count());

       //Intermediate ops
        List<Integer> list1 = Arrays.asList(2,87,1,87,54,31,87,87,10);
        List<Integer> ans = list1.stream().filter(x -> x>20 && x<80).toList();
       // System.out.println(ans);
        List<Integer> ans2 = list1.stream().map(x -> x*2).sorted().distinct().toList();
        System.out.println(list1);
        System.out.println(ans2);

    }
}
