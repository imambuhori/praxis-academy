import firstpackage.Person;

public class TestFirstPackage{
    public static void main(String[] args){
             
        Person orang = new Person();

        //set nama depan dan nama belakang
        orang.setnamaDepan("Imam");
        orang.setnamaBelakang("Buchori");

        //Cetak hasilnya
        System.out.println("Java bean Data: " + orang.getnamaDepan() + 
        " " + orang.getnamaBelakang());
    }
}