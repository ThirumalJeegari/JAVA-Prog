import java.io.*;

class shortCircuiting {
    public static void main (String[] args) {
        
      
        int a = 10, b = 20, c = 15;
        
        System.out.println("Value of b: " +b);
        

        if((a > c) || (++b > c))
            System.out.println("Inside if");
        
        
        System.out.println("Value of b: " +b);
      
    }
}
