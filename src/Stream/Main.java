package Stream;

import Stream.model.User;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    private static List<User> users;

    public static void main(String[] args) {
       setUp();
/*
        Stream stream = Stream.of(users);
        users.stream().forEach(x -> System.out.println(x.getNombre()));

 */
   //     testFlapMap();
       // testLimitSkip();

      //  testSorterd();

       // testMaxMin();

        //testDistinct();
        //AllMatchAnyMatchNoneMatch();
       // SumAverageRange();

        //testReduce();

      //  testJoining();

        //testToSet();

        //testsumarizingDouebl();
        //testPArtiningBy();
        testReduce();

    }

    private static void testFlapMap(){
        List<List<String>> ret = new ArrayList<>();
        ret.add(Arrays.asList("Juan", "Maria"));
        ret.add(Arrays.asList("Luis", "Juan carlos"));
        System.out.println(ret.toString());

        System.out.println(ret.stream().flatMap(x -> x.stream()).map(x -> x.toUpperCase()).collect(Collectors.toList()).stream().count());

        System.out.println(ret.stream().count());


    }

    private static void testLimitSkip(){
        List<Integer> ret = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(ret.stream().limit(2).collect(Collectors.toList()));
    }

    private static void testCount(){
        List<String> ret = new ArrayList<>(Arrays.asList("hola"));
    }

    private static void testSorterd(){
        users.stream().sorted(Comparator.comparing(User::getNombre)).forEach(k -> System.out.println(k.getNombre() ));

    }


    private static void testDistinct(){
        String[] letters = {"a", "b", "c", "d", "a", "k"};

        List<String> lett = Arrays.stream(letters).distinct().collect(Collectors.toList());
        System.out.println(lett);

    }


    private static void AllMatchAnyMatchNoneMatch(){
        List<Integer> numeros = Arrays.asList(2,3,5,6,6,8,8);
        System.out.println(numeros.stream().allMatch(k ->k>2));
        System.out.println(numeros.stream().anyMatch(k ->k>2));
        System.out.println(numeros.stream().noneMatch(k ->k>2));
    }


    private static void SumAverageRange(){
        List<Integer> numeros = Arrays.asList(6,3,5,6,6,8,8);
        System.out.println(numeros.stream().mapToInt(Integer::intValue).average().orElse(0));
        System.out.println(numeros.stream().mapToInt(Integer::intValue).sum());
        System.out.println(IntStream.range(1,3).sum());
    }

    private static void testMaxMin(){
       users.stream().min(Comparator.comparing(User::getId)).stream().forEach(k -> System.out.println(k.getId()));
       users.stream().max(Comparator.comparing(User::getId)).stream().forEach(k -> System.out.println(k.getId()));
    }

    private static void testReduce(){
        Integer suma = users.stream().map(k -> k.getId()).reduce(0, Integer::sum);
        System.out.println(suma);
    }

    private static void testJoining(){
        String names =  users.stream().map(User::getNombre).collect(Collectors.joining(" - "));
        System.out.println(names);
    }

    private static void testToSet(){
       users.stream().map(User::getNombre).collect(Collectors.toSet()).forEach(k-> System.out.println(k));
    }

    private static void testPArtiningBy(){
        List<Integer> numeros = Arrays.asList(5,6,7,8,3,4,5,67,4,2,6,6);
        Map<Boolean, List<Integer>> esMayor = numeros.stream().collect(Collectors.partitioningBy(e -> e > 5));

        esMayor.get(true).stream().forEach(e -> System.out.println(e));
        //esMayor.get(false).stream().forEach(e -> System.out.println(e));
    }


    private static void setUp(){
        users = new ArrayList<>();
        users.add(new User(1, "Alberto"));
        users.add(new User(2, "Juan"));
        users.add(new User(3, "Marcos"));
        users.add(new User(4, "Luis"));
        users.add(new User(5, "Camila"));
        users.add(new User(6, "Camila"));
        users.add(new User(7, "Marcos"));
    }
}
