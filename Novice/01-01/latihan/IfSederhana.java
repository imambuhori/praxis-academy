import java.util.Scanner;

public class IfSederhana{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan suatu integer");
        int angka = input.nextInt();

        if (angka % 2 == 0)
        System.out.println("Bilangan genap");
        
        if (angka % 2 != 0)
        System.out.println("Bilangan ganjil");
    }
}