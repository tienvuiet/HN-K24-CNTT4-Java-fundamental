package session04.gioi2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma the thu vien: ");
        String cardCode = sc.nextLine();

        validateCard(cardCode);
    }
    public static void validateCard(String code) {
        if (!Pattern.matches("^[A-Z]{2}.*", code)) {
            System.out.println("Loi: Tien to phai gom 2 chu cai viet hoa");
            return;
        }
        Pattern yearPattern = Pattern.compile("^[A-Z]{2}(\\d{4}).*");
        Matcher yearMatcher = yearPattern.matcher(code);
        if (yearMatcher.find()) {
            int year = Integer.parseInt(yearMatcher.group(1));
            if (year < 2000 || year > 2100) {
                System.out.println("Loi: Nam vao hoc khong hop le");
                return;
            }
        } else {
            System.out.println("Loi: Thieu nam vao hoc");
            return;
        }
        Pattern fullPattern = Pattern.compile("^[A-Z]{2}\\d{4}\\d{5}$");
        Matcher fullMatcher = fullPattern.matcher(code);
        if (!fullMatcher.matches()) {
            System.out.println("Loi: Dinh dang ma the khong dung");
            return;
        }
        System.out.println("Ma the hop le");
    }
}
