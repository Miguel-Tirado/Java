public class Switch {
    public static void main (String args[]) {
        int month = 1;
        String monthDes;

        switch (month) {
            case 1: monthDes = "January";
                    break;
            case 2: monthDes = "Febuary";
                    break;
            case 3: monthDes = "March";
                    break;
            case 4: monthDes = "April";
                    break;
            case 5: monthDes = "May";
                    break;
            case 6: monthDes = "June";
                    break;
            case 7: monthDes = "July";
                    break;
            case 8: monthDes = "August";
                    break;
            case 9: monthDes = "September";
                    break;
            case 10: monthDes = "October";
                    break;
            case 11: monthDes = "November";
                    break;
            case 12: monthDes = "December";
                    break;
            default: monthDes = "Invalid Month";
                    break;
        }

        System.out.println(monthDes);
    }
}