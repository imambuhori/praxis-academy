public class UjiLingkaran1{
    //method utama
    public static void main(String[] args){
        //menciptakan suatu objek lingkaran1 dengan radius 1.0
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("Luas lingkaran dengan radius " + 
        lingkaran1.radius + " adalah " + lingkaran1.luas());

        //Menciptakan suatu objek lingkaran2 dengan radius 5.0
        Lingkaran lingkaran2 = new Lingkaran(5);
        System.out.println("Luas lingkaran dengan radius " + 
        lingkaran2.radius + " adalah " + lingkaran2.luas());

        //Menciptakan suatu objek lingkaran3 dengan radius 25.0
        Lingkaran lingkaran3 = new Lingkaran(25);
        System.out.println("Luas lingkaran dengan radius " + 
        lingkaran3.radius + " adalah " + lingkaran3.luas());

        //Modifikasi radius lingkaran
        lingkaran2.radius = 100;
        System.out.println("Luas lingkaran dengan radius " +
        lingkaran2.radius + " adalah " + lingkaran2.luas());
    }
}

        //Mendefinisikan kelas Lingkaran dengan dua konstruktor
        class Lingkaran{
            double radius;

            //mengkontruksi suatu objek lingkaran dengan radius 1
            Lingkaran (){
                radius = 1.0;
            }
            //Mengkontruksi suatu objek lingkaran dengan radius tertentu
            Lingkaran (double radiusBaru){
                radius = radiusBaru;
            }
            //Mengembalikan luas lingkaran
            double luas(){
                return radius * radius * Math.PI;
            }
        }