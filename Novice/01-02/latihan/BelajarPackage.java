import sensus.*;

public class BelajarPackage{
    public static void main(String args[]){
        
        int norum;
        String naKK;
        
        rumah baru = new rumah(100,"Tuban");
        baru.setKel(new keluarga(5,"Agung Imamudin"));
        
        System.out.println("No rumah    : " + baru.getnorum() + "\nAlamat   : "
        + baru.getalamat() + "\nNama KK     : "+baru.getkeluarga().getnama() 
        + "\nAnggota kel.: " + baru.getkeluarga().getno());
 }
} 