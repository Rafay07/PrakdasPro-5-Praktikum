import java.util.Scanner;

public class PemilihanHariDenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;
        
        System.out.print("Input Day Number: ");
        dayName = sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                dayType = "Weekday";
                break;
            case "6":
            case "7":
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid Type Number";
        }
        
        System.out.println(dayName + " is a " + dayType);

        sc.close();
    }
}
