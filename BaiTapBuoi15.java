import java.util.Scanner;
import java.util.regex.Pattern;

public class BaiTapBuoi15 {
    public static void sapxep(String car[], int n) {
//        String car[] = {"Mec", "BMW", "Toyota", "Honda", "Vinfast"};
        String temp = car[0];
        for (int i = 0; i < car.length; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].compareTo(car[j])>0) {
                    temp = car[j];
                    car[j] = car[i];
                    car[i] = temp;
                }
            }
        }
        System.out.println("Mảng được sắp theo thứ tự alphabet: ");
        inmang(car,n);
    }

    public static void inmang(String arr[],int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void nhapmang (String arr[], int n) {
        Scanner sc = new Scanner(System.in);
        {
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập tên người thứ " + i + ": ");
                arr[i] = sc.nextLine();
//                while (ktra(arr[i])==false)
//                {
//                    System.out.print("Nhập lại tên người thứ " + i + ": ");
//                    arr[i] = sc.nextLine();
////                    if (ktra(arr[i])==false) break;
//                }
            }
        }
    }
    public static boolean ktra(String chuoi)
    {
        String chuoich = "[.^\\d]";
        if (Pattern.matches(chuoich, chuoi) ==true)
        {        return true;}
        return false;
    }
}
