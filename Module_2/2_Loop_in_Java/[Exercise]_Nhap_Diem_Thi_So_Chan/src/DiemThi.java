import java.util.Scanner;

public class DiemThi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đúng điểm thi vào xem nào");
        int diemthi = scanner.nextInt();
        while (diemthi % 2 != 0 || diemthi < 0 || diemthi > 100 ){
            System.out.println("Nhập sai mia nó rồi");
            diemthi = scanner.nextInt();


        }
    }




    }

