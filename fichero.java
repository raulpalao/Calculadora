import java.util.Scanner;

public class SumaNumeros
{
    public static void main( String[] args )
    {
        int n1, n2, suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();
    
        suma = n1 + n2;

        System.out.println( "La suma de " + n1 + " más " + n2 + " es " + suma + "." );

        //resta
        int n3, n4, resta;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n3 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n4 = teclado.nextInt();

        resta = n1 + n2;

        System.out.println( "La resta de " + n1 + " menos " + n2 + " es " + resta + "." );

        //division
        int n5, n6, division;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n5 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n6 = teclado.nextInt();

        division = n5 + n6;

        System.out.println( "La division de " + n5 + " y " + n6 + " es " + division + "." );
    }
}
