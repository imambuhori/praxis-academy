public class BinatangTest{
    public static void main(String[] args){

        Binatang animal = new Binatang();
        animal.nama = "Binatang abstrak";
        animal.berSuara();

        Sapi sapi1 = new Sapi();
        sapi1.nama = "Gober";
        sapi1.berSuara();

        Binatang animal2 = new Sapi();
        animal2.nama = "Bruno";
    }
}