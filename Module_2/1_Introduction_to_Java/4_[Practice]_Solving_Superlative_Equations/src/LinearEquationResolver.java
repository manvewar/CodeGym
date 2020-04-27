import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        // Chương trình cần nhận giá trị các hệ số từ người dùng.
        // Ở đây sử dụng thư viện Scanner trong gói java.util để đọc giá trị mà
        // người dùng nhập vào console (luồng in):

        System.out.print("a:");
        double a = scanner.nextDouble();

        System.out.println("b:");
        double b = scanner.nextDouble();
        // Do hệ số hàm bậc nhất có thể là số nguyên hoặc số thực nên ta sử dụng
        // hàm nextDouble và lưu giá trị vào biến có kiểu double

        if (a != 0){
            double solution = -b/a;
            System.out.printf("The solution is %f!", solution);
        }
        // Khi a!=0, phương trình bậc nhất có một nghiệm




    }
}
