package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        for (int i = 1; i <= 100; i++) {
            switch (i % 15) {
                case 0:
                    System.out.println("FizzBuzz");
                    break;
                case 3:
                case 6:
                case 9:
                case 12:
                    System.out.print("Fizz, ");
                    break;
                case 5:
                case 10:
                    System.out.print("Buzz, ");
                    break;
                default:
                    System.out.print(i + ", ");
            }
        }
    }
}
