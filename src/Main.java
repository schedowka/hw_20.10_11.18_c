import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] mass = new int[4];
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        mass[0] = 15;
        mass[1] = 30;
        mass[2] = 45;
        mass[3] = 60;
        for (int j = 0; j < mass.length; j++) {
            mass[j] = mass[j]+num;

            System.out.println(mass[j]);
        }
    }
}