import java.nio.charset.MalformedInputException;

public class abc12 {
    public static void main(String[] args) {
        int month = 14;
        String monthString;
        switch (month)
        {
            case 1:
            monthString = "january";
            break;

            case 2:
            monthString = "february";
            break;

            case 3:
            monthString = "march";
            break;

            case 4:
            monthString = "april";
            break;

            case 5:
            monthString = "may";
            break;

            case 6:
            monthString = "june";
            break;

            case 7:
            monthString = "jully";
            break;

            case 8:
            monthString = "august";
            break;

            case 9:
            monthString = "september";
            break;

            case 10:
            monthString = "october";
            break;

            case 11:
            monthString = "november";
            break;

            case 12:
            monthString = "december";
            break;

            default: 
            monthString = "Invalid month";
            break;
            
        }
        System.out.println(monthString);
    }
}
