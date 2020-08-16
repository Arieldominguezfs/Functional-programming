package Orden_superior;

public class HighOrderFunction  implements  sumarInterface{

    public void pruebaSumar(sumarInterface inter, int a, int b){
        System.out.println(inter.apply(a,b));
    }


    public static void main(String[] args) {

        HighOrderFunction highOrderFunction = new HighOrderFunction();
        sumarInterface sumar = (x,y) -> x*y;
        highOrderFunction.pruebaSumar(sumar, 2, 4);

    }

    public int sumar(int a, int b){
        return  a + b;
    }

    @Override
    public int apply(int a, int b) {
        return a + b;
    }


}
