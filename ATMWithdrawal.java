package Entity;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền cần rút
        System.out.print("Nhập số tiền cần rút (bội của 50.000): ");
        int amount = scanner.nextInt();

        // Kiểm tra xem số tiền có phải là bội của 50.000 không
        if (amount % 50000 != 0) {
            System.out.println("Số tiền phải là bội của 50.000 VND.");
        } else {
            // Tính số lượng tờ tiền cho mỗi loại
            int originalAmount = amount;  // Lưu lại số tiền ban đầu để in ra
            int count500 = amount / 500000; // Số tờ 500.000
            amount %= 500000;

            int count200 = amount / 200000; // Số tờ 200.000
            amount %= 200000;

            int count100 = amount / 100000; // Số tờ 100.000
            amount %= 100000;

            int count50 = amount / 50000; // Số tờ 50.000
            amount %= 50000;

            // Tổng số tờ tiền
            int totalNotes = count500 + count200 + count100 + count50;

            // Hiển thị kết quả dạng bảng
            System.out.println("+-----------------+-------+-------+-------+-------+------------+");
            System.out.println("| Số tiền rút (VND) | 500k  | 200k  | 100k  |  50k  | Tổng số tờ |");
            System.out.println("+-----------------+-------+-------+-------+-------+------------+");
            System.out.printf("| %-15d | %-5d | %-5d | %-5d | %-5d | %-10d |\n",
                    originalAmount, count500, count200, count100, count50, totalNotes);
            System.out.println("+-----------------+-------+-------+-------+-------+------------+");
        }

        scanner.close();
    }
}


