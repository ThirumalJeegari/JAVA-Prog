import java.util.Scanner;
import java.lang.Float;

class ScannerEX3 {
    public static void main(String args[]) {
        System.out.print("Enter the ID, Name, Salary : ");
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] values = input.split(",");
        
        int ID = Integer.parseInt(values[0].trim());
        String Name = values[1].trim();
        float Salary = Float.parseFloat(values[2].trim());
        
        System.out.println("ID = " + ID);
        System.out.println("Name = " + Name);
        System.out.println("Salary = " + Salary);
        
        sc.close();
    }
}
