import java.io.*;

class circuiting {
    public static void main(String[] args)
    {
        
        int a = 10, b = 20, c = 30, d = 30;

        
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);

        
       
        if ((a < b) && (c == d)) {
            d = a + b + c + d;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
    }
}
