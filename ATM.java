package Entity;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền gửi và kỳ hạn gửi
        System.out.print("Nhập số tiền gửi (VND): ");
        double principal = scanner.nextDouble();

        System.out.print("Nhập kỳ hạn gửi (tháng): ");
        int term = scanner.nextInt();

        // Loại tiền gửi
        String currencyType = "VND";

        // Lãi suất theo kỳ hạn
        double interestRate = 0;
        String termString = "";

        // Sử dụng cấu trúc switch để xác định lãi suất và chuỗi kỳ hạn
        switch (term) {
            case 6:
                interestRate = 5.1;
                termString = "6 tháng";
                break;
            case 9:
                interestRate = 5.5;
                termString = "9 tháng";
                break;
            case 12:
                interestRate = 6.4;
                termString = "12 tháng";
                break;
            case 24:
                interestRate = 6.5;
                termString = "24 tháng";
                break;
            case 36:
                interestRate = 6.5;
                termString = "36 tháng";
                break;
            default:
                System.out.println("Kỳ hạn không hợp lệ. Vui lòng chọn kỳ hạn là 6, 9, 12, 24 hoặc 36 tháng.");
                scanner.close();
                return;
        }

        // Tính toán lãi suất
        double interest = principal * (interestRate / 100);  // Tiền lãi theo kỳ hạn
        double totalAmount = principal + interest;           // Tiền lãi + gốc

        // Hiển thị kết quả
        System.out.println("+-------------------+-----------+---------------+-----------------+-----------------+");
        System.out.println("| Số tiền gửi (VND) | Kỳ hạn     | Loại tiền gửi | Tiền lãi theo kỳ | Lãi + Gốc       |");
        System.out.println("+-------------------+-----------+---------------+-----------------+-----------------+");
        System.out.printf("| %-17.0f | %-9s | %-13s | %-15.0f | %-15.0f |\n",
                principal, termString, currencyType, interest, totalAmount);
        System.out.println("+-------------------+-----------+---------------+-----------------+-----------------+");

        scanner.close();
    }
}
