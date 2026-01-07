public class switchs {
    public static void main (String [] args)
    {
        int day =7;
        String DAYS_NAME[] = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thuresday",
            "Friday",
            "Saturday",
            "Sunday",
        };
    
        if(day >= 1 && day <= 7){
            System.out.println(DAYS_NAME[day-1]);
        }
        else{
            System.out.println("Invalide");
        }

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thuresday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
