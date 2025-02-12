import java.io.*;
import java.lang.*;

class Buffered{
    public static void main(String args[]) throws IOException
    {
        //InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a Value = ");
        int a = Integer.parseInt(br.readLine());
	System.out.print("Enter str Value = ");
        String str = br.readLine();
        System.out.println("You Enter a Value = "+a);
        System.out.println("You Enter str value = "+str);
        br.close();

    }
    
}


