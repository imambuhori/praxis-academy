import java.util.Scanner;

public class PembagianDenganException{

    //method untuk menghitung hasil PembagianDenganException
    public static int hitungPembagian(int angka1, int angka2){
        if(angka2 == 0){
            throw new ArithmeticException("Angka pembagi tidak bole noll");
        }
        return(angka1/angka2);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //minta user memasukan dua integer
        System.out.println("Masukan dua integer");
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
    
        try {
            int hasil = hitungPembagian(angka1, angka2);
            System.out.println("Hasil dari " + angka1 + " dibagi " + angka2 + " adalah: " + hasil);
        }
        catch(ArithmeticException exception){
            System.out.println("Exception: suatu integer " 
            + " tidak dapat dibagi nol");
        }
        System.out.println("Eksekusi program dilanjutkan ...");
    }

}