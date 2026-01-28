package session04.kha1;

import java.util.Scanner;

public class kha1 {
    public static  String khoangTrangThua(String a){
        return a.trim().replaceAll("\\s+", " ");
    }
    public  static String vietHoaChuCaiDau(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap vao ten sach: ");
        String title = sc.nextLine();
        System.out.printf("Nhap vao tac gia: ");
        String author = sc.nextLine();
        title = khoangTrangThua(title).toUpperCase();
        author = vietHoaChuCaiDau(khoangTrangThua(author));

        StringBuilder result = new StringBuilder();

        result.append(title)
                        .append("- Tac gia: ")
                                .append(author);
        System.out.printf("%s", result);

    }
}
