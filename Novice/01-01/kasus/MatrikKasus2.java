import java.util.Scanner;

public class MatrikKasus2{
    public static void main(String[] args){
        int i, j, k, m, n;
        int matrik1[][] = new int[5][5];
        int matrik2[][] = new int[5][5];
        int hasil[][] = new int[5][5];
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah baris matriks: ");
        m = input.nextInt();
        System.out.print("Masukan jumlah kolom matriks: ");
        n = input.nextInt();

        System.out.println("Masukan elemen matriks pertama: ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                matrik1[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukan elemen matriks kedua: ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                matrik2[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil penjumlahan matrik: ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                hasil[i][j] = matrik1[i][j] + matrik2[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
        System.out.println();
        }
    }
}