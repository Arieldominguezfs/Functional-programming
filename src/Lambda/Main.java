package Lambda;

public class Main implements PorDefecto {


    public static void main(String[] args) {
        System.out.println();


        MiNombre nameLambda = (x,y) -> {
            System.out.println(x);
            System.out.println(y);
        };


        Sumar sumar = (n1, n2) -> n1 + n2;

        nameLambda.miNombre("Ariel", "Dominguez");

        System.out.println(sumar.sumar(2, 3));
        Main m = new Main();
        System.out.println(m.nombrePorDefector("Ariel"));

    }

    @Override
    public void mostrarNombre(String name) {

    }
}
