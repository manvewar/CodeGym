import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertNumbertoWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number_int;
        String announce ="";
        String number_str ;
        do{
            System.out.print("Nhập số cần chuyển đổi: ");
            number_int = in.nextInt();
        }while(number_int> 999);
        number_str= String.valueOf(number_int);

        switch (number_str.length()){
            case 1:
                announce= docSo1ChuSo(number_str);
                System.out.printf("Số %s đổi sang chữ là %s",number_str,announce);
                break;
            case 2:
                if(number_int<20){
                    announce = docSoTu10Den20(number_str);
                    System.out.printf("Số %s đổi sang chữ là %s",number_str,announce);
                }else{
                    announce= docSo2ChuSoLonHon20(number_str);
                    System.out.printf("Số %s đổi sang chữ là %s",number_str,announce);
                }
                break;
            case 3:
                announce=docSo3ChuSo(number_str);
                System.out.printf("Số %s đổi sang chữ là %s",number_str,announce);
                break;
            default :
                System.out.printf("Không thể chuyển đổi số lớn hơn 1000",number_str);

            }
        }
    }