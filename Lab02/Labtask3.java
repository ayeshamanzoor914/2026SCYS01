import java.util.Scanner;

public class Labtask3 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int n = a.nextInt();

        int c = n;
        int d = (c / 60);
        int e = c % 60;

        System.out.print(c + " :" + d + " :" + e);
    }
}