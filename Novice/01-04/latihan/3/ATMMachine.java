import java.util.Scanner;
import java.io.*;

public class ATMMachine{
    public static void checkBalance(){
        System.out.println("\tYour current balance is" + BalanceInquiry.getBalance());
    }

    public static void withdrawMoney(){
        if(BalanceInquiry.balance == 0){
            System.out.println("\tSaldo anda kosong.");
            System.out.println("\tAnda tidak bisa tarik tunai!");
            System.out.println("\tAnda harus deposit uang terlebih dahulu.");
        }
        else if(BalanceInquiry.balance <= 50000){
            System.out.println("\tSaldo Anda tidak cukup untuk tarik tunai");
            System.out.println("\tPeriksa saldo Anda.");
        }
        else if(Withdraw.withdraw > BalanceInquiry.balance){
            System.out.println("\tJumlah yang Anda masukan lebih besar dari saldo");
            System.out.println("\tPeriksa jumlah yang Anda masukan");
        }
        else{
            BalanceInquiry.balance = BalanceInquiry.balance - Withdraw.withdraw;
            System.out.println("Anda tarik tunai sejumlah Rp. " + Withdraw.withdraw);
        }
    }

    public static void depositMoney(){
        System.out.println("\tJumlah saldo Anda " + Deposit.getDeposit());
    }

    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        int select = 0;
        int choice = 0;

        System.out.println("==============================");
        System.out.println("\tSelamat datang di ATM ");
        System.out.println("==============================");
        System.out.println();

        do
        {try
            {
                do{
                    System.out.println("\tSilahkan pilih menu transaksi");
                    System.out.println("\tPilih [1] Deposit");
                    System.out.println("\tPilih [2] Tarik Tunai");
                    System.out.println("\tPilih [3] Cek Saldo");
                    System.out.println("\tPilih [4] Exit");

                    System.out.println("\n\tApa yang ingin kamu lakukan?");
                    select = read.nextInt();

                    if(select > 4){
                        System.out.println("\n\tSilahkan pilih ulang transaksi");
                    }
                    else{
                        switch(select){
                            case 1:
                            System.out.print("\n\tMasukan jumlah uang yang akan disetor: ");
                            Deposit.deposit = read.nextDouble();
                            BalanceInquiry.balance = Deposit.deposit + BalanceInquiry.balance;
                            depositMoney();
                            break;

                            case 2:
                            System.out.print("\n\tTarik tunai, pastikan saldo Anda cukup");
                            System.out.println();
                            System.out.print("\tMasukan jumlah yang ditarik tunai: ");
                            Withdraw.withdraw = read.nextDouble();
                            withdrawMoney();
                            break;

                            case 3:
                            checkBalance();
                            break;

                            default:
                            System.out.print("\n\tKeluar transaksi");
                            break;

                        }
                    }
                }while(select > 4);
                do{
                    try{
                        System.out.println("\n\tCoba transaksi lain?");
                        System.out.println("\n\tPilih [1] Yes \n\tPilih [2] No");
                        System.out.println("\n\tMasukan pilihan: ");
                        choice = read.nextInt();

                        if(choice > 2){
                            System.out.print("\n\tSilahkan pilih yang benar.");
                        }
                    }

                    catch(Exception e){
                        System.out.println("\tSalah masukan! Silahkan masukan nomor yang benar.");
                        read = new Scanner(System.in);
                        System.out.println("\tMasukan pilihan Anda: ");
                        choice = read.nextInt();
                    }
                }while(choice > 2);
            }
            catch(Exception e){
                System.out.println("\tSalah masukan! Silahkan masukan nomor yang benar");
                read = new Scanner(System.in);
                System.out.println("\tMasukan pilihan Anda: ");
                select = read.nextInt();
            }
        }while(choice <= 1);
        System.out.println("\n\tTerimakasih telah menggunakan ATM ini.");
    }
}