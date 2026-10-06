import java.util.Scanner;
public class Labtask2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter minutes:");
        int min = a.nextInt();
        int hours = min / 60;
        int rem = min % 60;

        System.out.println(hours + " : " + rem );
    }
}
