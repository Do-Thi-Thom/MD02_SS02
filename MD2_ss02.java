package ra;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MD2_ss02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      EX 01: cho nguoi dung nhap vao so tu nhien kiem tra chan le
//        -Tao scanner
//        -Cau lenh nhap
//        -Tao bien luu gia tri nhap
//        -Dung cau lenh if else de kiem tra so chia het cho 3 va 5
        System.out.println("Moi nhap vao so tu nhien:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 5 == 0 && number % 3 == 0){
            System.out.printf(" %d chia het cho 3 va 5", number);
        }else {
            System.out.printf("%d khong chia het cho 3 va 5", number);
        }
    }
}
