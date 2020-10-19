import java.io.*;
public class GCD {

    public static void main(String[] args) {

       int n1 = 10, n2 = 150, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
        System.out.println("the required number is" + a +"/" + b);
    }
}
