package Optional;

import java.util.Optional;

public class Main {


    public static void main(String[] args) {
        orElseThrow("juan");
    }

    public static void probarOptional(String nombre){
        System.out.println(nombre.length());
    }

    public static void crearOptional(){
        Optional opt = Optional.empty();
        opt.get();
    }

    public static void orElseThrow(String nombre){
        Optional<String> opt = Optional.ofNullable(nombre);
        opt.orElseThrow(NullPointerException::new);

        String nombre1 = opt.get();
        System.out.println(nombre1);
    }

    public static void orElseOptional(String nombre){
        Optional<String> opt = Optional.ofNullable(nombre);
        //Optional<String> opt1 = Optional.of(nombre);
        String nombreOfNull = opt.orElse("vacio");
        //String nombreOfNull2 = opt1.orElse("vacio");
        System.out.println(nombreOfNull);
        //System.out.println(nombreOfNull2);
    }


}
