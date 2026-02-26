package session13.Xuatsac2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Xuatsac2 {
    private static List<Medicine> prescriptionList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = getValidIntInput("Lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    adjustQuantity();
                    break;
                case 3:
                    deleteMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicines();
                    break;
                case 6:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n=== CHƯƠNG TRÌNH KÊ ĐƠN THUỐC ===");
        System.out.println("1. Thêm thuốc vào đơn");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc khỏi đơn");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá rẻ (dưới 50.000 VNĐ)");
        System.out.println("6. Thoát");
    }

    private static int getValidIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } else {
                System.out.println("Vui lòng nhập số nguyên hợp lệ!");
                scanner.nextLine();
            }
        }
    }

    private static double getValidDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } else {
                System.out.println("Vui lòng nhập số thực hợp lệ!");
                scanner.nextLine();
            }
        }
    }

    private static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String drugId = scanner.nextLine().trim();

        for (Medicine med : prescriptionList) {
            if (med.getDrugId().equals(drugId)) {
                int additional = getValidIntInput("Thuốc đã tồn tại. Nhập số lượng thêm: ");
                med.setQuantity(med.getQuantity() + additional);
                System.out.println("Đã cộng dồn số lượng thành công!");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String drugName = scanner.nextLine().trim();

        double unitPrice = getValidDoubleInput("Nhập đơn giá (VNĐ): ");

        int quantity = getValidIntInput("Nhập số lượng: ");

        prescriptionList.add(new Medicine(drugId, drugName, unitPrice, quantity));
        System.out.println("Thêm thuốc mới thành công!");
    }

    private static void adjustQuantity() {
        System.out.print("Nhập mã thuốc cần điều chỉnh: ");
        String drugId = scanner.nextLine().trim();

        for (Medicine med : prescriptionList) {
            if (med.getDrugId().equals(drugId)) {
                int newQty = getValidIntInput("Nhập số lượng mới (0 để xóa): ");
                if (newQty == 0) {
                    prescriptionList.remove(med);
                    System.out.println("Đã xóa thuốc khỏi đơn.");
                } else {
                    med.setQuantity(newQty);
                    System.out.println("Đã cập nhật số lượng.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy mã thuốc!");
    }

    private static void deleteMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String drugId = scanner.nextLine().trim();

        boolean removed = prescriptionList.removeIf(m -> m.getDrugId().equals(drugId));
        if (removed) {
            System.out.println("Xóa thuốc thành công!");
        } else {
            System.out.println("Không tìm thấy mã thuốc!");
        }
    }

    private static void printInvoice() {
        if (prescriptionList.isEmpty()) {
            System.out.println("Đơn thuốc hiện đang trống.");
            return;
        }

        System.out.println("\n=================== HÓA ĐƠN THUỐC ===================");
        System.out.printf("%-10s %-25s %12s %10s %15s\n",
                "Mã thuốc", "Tên thuốc", "Đơn giá", "SL", "Thành tiền");
        System.out.println("-----------------------------------------------------");

        double grandTotal = 0;

        for (Medicine m : prescriptionList) {
            double itemTotal = m.getTotalPrice();
            grandTotal += itemTotal;
            System.out.printf("%-10s %-25s %12.0f %10d %15.0f\n",
                    m.getDrugId(), m.getDrugName(), m.getUnitPrice(), m.getQuantity(), itemTotal);
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("TỔNG TIỀN PHẢI TRẢ: %,.0f VNĐ\n", grandTotal);
        System.out.println("=====================================================");

        prescriptionList.clear();
        System.out.println("Đã xóa toàn bộ đơn thuốc để chuẩn bị cho đơn mới.");
    }

    private static void findCheapMedicines() {
        System.out.println("\n=== THUỐC GIÁ RẺ (dưới 50.000 VNĐ) ===");
        boolean found = false;

        for (Medicine m : prescriptionList) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Hiện không có thuốc nào dưới 50.000 VNĐ trong đơn.");
        }
    }
}
