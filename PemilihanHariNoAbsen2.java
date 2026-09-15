import java.util.Scanner;

public class PemilihanHariNoAbsen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;
        
        System.out.print("Input Day Name: ");
        dayName = sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "Weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid Type Dayname";
        }
        
        System.out.println(dayName + " is a " + dayType);

        sc.close();
    }
}
