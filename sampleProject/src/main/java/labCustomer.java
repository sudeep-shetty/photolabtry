import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class labCustomer {
    public static void main(String[] args) {
        System.out.println("Make a reservation: 1");
        System.out.println("Check-In: 2");
        System.out.println("Get results: 3");
        System.out.println("Cancel Reservation: 4");
        System.out.print("Enter choice: ");
        Scanner scan;
        scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n<1||n>4) {
            System.out.println("Re enter choice");
            n = scan.nextInt();
        }
        MakeReservation.printDates();
    }
}
class MakeReservation{
    static void printDates() {
        //https://stackoverflow.com/questions/28177370/how-to-format-localdate-to-string
        //https://howtodoinjava.com/java/date-time/java8-next-previous-date/#:~:text=time.-,LocalDate,and%20subtracting%201%20from%20today.
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String date1 = localDate.format(formatter);
        String date2 = localDate.plusDays(1).format(formatter);
        String date3 = localDate.plusDays(2).format(formatter);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
    static void printSlots(){

    }
}