public class SwitchDemo{
    public static void main(String[] args){

        int month = 9;
        String monthString;
        switch (month){
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "Maret";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "Mei";
                break;
            case 6: monthString = "Juni";
                break;
            case 7: monthString = "Juli";
                break;
            case 8: monthString = "Agustus";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "Oktober";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "Desember";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }

}