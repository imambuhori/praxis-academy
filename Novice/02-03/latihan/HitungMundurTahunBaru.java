public class HitungMundurTahunBaru{
    public static void main(String args[])
        throws InterruptedException{
            int hitungMundur[] = {10, 9, 8, 7,
            6, 5, 4, 3, 2, 1};

        for(int a = 0;
        a < hitungMundur.length;
        a++){

            Thread.sleep(1500);
            System.out.println(hitungMundur[a] + ".....");
        }
        System.out.println("SELAMAT TAHUN BARU 2020");
    }
}