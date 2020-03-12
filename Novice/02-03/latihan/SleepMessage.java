public class SleepMessage{
    public static void main(String args[])
    throws InterruptedException{
        String importantInfo[] = {
            "Ibe eat rice",
            "Does eat rice",
            "Little cat eat Mujaer fish",
            "A kid will eat Mujaer fish too"
        };
        int importantInfo2[] = {1, 3, 90, 88};

        for(int i = 0;
        i < importantInfo.length;
        i++){

            //jeda 3 detik
            Thread.sleep(3000);
            //Print a message
            System.out.println(importantInfo[i]);
        }

        for(int j = 0;
        j < importantInfo2.length;
        j++){
            Thread.sleep(5000);
            System.out.print(importantInfo2[j]);
            System.out.println();
        }
        
    }
}