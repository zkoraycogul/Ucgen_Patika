import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Birinci Kenari Giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci Kenari Giriniz : ");
        b = input.nextInt();
        System.out.print("Ucuncu Kenari Giriniz : ");
        c = input.nextInt();
        double u = (a+b+c)/2,alan;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin Alani = " + alan);




    }
}
