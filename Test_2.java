import java.util.Scanner;

class Test_2{
    public static void main(String args[]){
        // Program for doing basic operations.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum, dif, multi, mod, div;

        sum= a+b;
        System.out.println("Sum of given two numbers = "+sum);
        if(a>b)
            dif=a-b;
        else
            dif=b-a;
        System.out.println("Difference between two numbers = "+dif);
        multi=a*b;
        System.out.println("Product of entered two numbers = "+multi);
        mod=a%b;
        System.out.println("Remainder obtained after deviding first number by second number = "+mod);
        div=a/b;
        System.out.println("Quotient obtenined after deviding first number by second number = "+div);
    }
}