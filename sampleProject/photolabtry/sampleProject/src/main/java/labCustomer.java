import java.util.Scanner;

public class labCustomer {
    public static void main(String[] args) {
        System.out.println("Make a reservation: 1");
        System.out.println("Check-In: 2");
        System.out.println("Get results: 3");
        System.out.println("Cancel Reservation: 4");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int n = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        while(n<1||n>4) {
            System.out.println("Re enter choice");
            n = scan.nextInt();
        }
    }
}
