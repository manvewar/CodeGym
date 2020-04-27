import java.util.Scanner;

public class UsingOperator {
    public static void main(String[] args) {
        float width;
        float height;
        // Khai báo các biến chiều cao và chiều rộng

        Scanner scanner = new Scanner(System.in);
        // Sử dụng đối tượng scanner để lấy dữ liệu nhập vào từ người dùng

        System.out.println("Enter width:");
        width = scanner.nextFloat();

        System.out.println("Enter height:");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is:" + area);
    }

}
