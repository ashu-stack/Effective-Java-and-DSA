package CoreJava.Streams;

import java.util.List;

public class StreamQuestions {
    public static void main(String[] args) {

        // Easy: Square all numbers, Filter even numbers, convert to uppercase, strings length > 5
        // Intermediate: sum of elements, remove duplicates, sort in descending order, first element greater than 7
        // Hard: group strings by length, frequency of element, max number, join strings with comma
        // Interview: second highest number, partition into even and odd, print only duplicate elements, find longest string

        List<Integer> list = List.of(1,3,5,7,8,10,21,21,21,10,3,5);
        List<Integer> list1 = list.stream().map(x -> x * x).toList();
        System.out.println("1. Square of all numbers: " + list1);

        List<Integer> list2 = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println("2. Even numbers : " + list2);

        List<String> strings = List.of("Rohit", "Virat", "Bumrah", "Dhoni", "Sachin");
        List<String> strings1 = strings.stream().map(String::toUpperCase).toList();
        System.out.println("3. Uppercase strings : " + strings1);

        List<String> strings2 = strings.stream().filter(x -> x.length() > 5).toList();
        System.out.println("4. Length > 5 : " + strings2 );

        int ans = list.stream().reduce(Integer::sum).get();
        System.out.println("5. Sum of all elements : " + ans);

        List<Integer> distinctElements = list.stream().distinct().toList();
        System.out.println("6. Distinct elements :" + distinctElements);

        List<Integer> sorted = list.stream().sorted((a,b) -> b-a).toList();
        System.out.println("7. Sorted in descending order: " + sorted);

       int first = list.stream().filter(x -> x>7).findFirst().get();
        System.out.println("8. First element greater than 7 : " + first);


    }
}
