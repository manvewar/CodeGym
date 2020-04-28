import java.util.Scanner;

public class nameOfCrush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên");
        final String BoSon = "BOSON";
        final String MeSon = "MESON";
        final String NYC = "NYC";

        String nameofCrush = scanner.nextLine();

        while (nameofCrush == BoSon || nameofCrush == MeSon || nameofCrush == NYC) {
            System.out.println("Nhập sai tên");
            nameofCrush = scanner.nextLine();
        }
    }
}
