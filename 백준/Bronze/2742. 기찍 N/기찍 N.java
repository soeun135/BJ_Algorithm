import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=num;i>0;i--){
            System.out.println(i);
        }
        scanner.close();
    }
}