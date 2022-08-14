import java.util.Scanner;

public class prueva {
    public static void main(String[] args) {
        System.out.println("********************CALCULADORA********************");

        //SUMA
        System.out.println("SUMA");
        double uno;
        double dos;
        double suma;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int sum1 = sc.nextInt();

        System.out.println("Ingrese el segundo número");
        int sum2 = sc.nextInt();

        uno  = sum1;
        dos  = sum2;
        suma = uno+dos;

        System.out.println("El resultado de la suma es: "+ suma);
        System.out.println("");

        //RESTA
        System.out.println("RESTA");
        double rest1;
        double rest2;
        double resta;

        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int op = r.nextInt();

        System.out.println("Ingrese un número");
        int op2 = r.nextInt();

        rest1 = op;
        rest2 = op2;
        resta = op - op2;

        System.out.println("El resultado de la resta es: " +resta);
        System.out.println("");

        //MULTIPLICACION
        System.out.println("MULTIPLICACION");

        double mult1;
        double mult2;
        double multiplicacion;

        Scanner m = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int mul = m.nextInt();

        System.out.println("Ingrese un número");
        int mul1 = m.nextInt();

        mult1 = mul;
        mult2 = mul1;
        multiplicacion = mult1 * mult2;

        System.out.println("El resultado de la multiplicación es: "+multiplicacion);
        System.out.println("");

        //DIVICION
        System.out.println("DIVICION");

        double div1;
        double div2;
        double divicion;

        Scanner d = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int di = d.nextInt();

        System.out.println("Ingrese un número");
        int di2 = d.nextInt();

        div1 = di;
        div2 = di2;
        divicion = di / di2;

        System.out.println("El resultado de la divición es: " + divicion);
        System.out.println("");


    }
}