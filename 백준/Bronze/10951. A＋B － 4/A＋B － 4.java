import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
           
            System.out.println(num1+num2);
        }
        scanner.close();
    }
}