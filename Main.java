import com.sun.tools.attach.AgentInitializationException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws CheckException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài tập 1: Bài tập sắp xếp hãng xe");
        System.out.println("Bài tập 2: Nhập tên học sinh và chuẩn hóa tên");
        System.out.print("Nhập bài muốn kiểm tra: ");
        int bt = sc.nextInt();
        switch (bt){
            case 1: {
                String car[] = {"Mec", "BMW", "Toyota", "Honda", "Vinfast"};
                BaiTapBuoi15.sapxep(car,5);
                break;
            }
            case 2: {
                System.out.print("Nhập số lượng tên học sinh muốn nhập: ");
                int n = sc.nextInt();
                String hoten[];
                hoten= new String [n];
                BaiTapBuoi15.nhapmang(hoten,n);
                BaiTapBuoi15.sapxep(hoten,n);
                break;

            }
            default:
                System.out.println("Không có bài tập này");
        }
    }
}