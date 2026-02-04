package session09.kha1;

public class Mainn {
         static void main(String[] args) {

        Bird bird = new Bird();
        System.out.println("=== NHẬP THÔNG TIN CHIM ===");
        bird.input();
        System.out.println("=== THÔNG TIN CHIM ===");
        bird.display();

        System.out.println();

        MamalAnimal mamal = new MamalAnimal();
        System.out.println("=== NHẬP THÔNG TIN ĐỘNG VẬT CÓ VÚ ===");
        mamal.input();
        System.out.println("=== THÔNG TIN ĐỘNG VẬT CÓ VÚ ===");
        mamal.display();
    }
}
