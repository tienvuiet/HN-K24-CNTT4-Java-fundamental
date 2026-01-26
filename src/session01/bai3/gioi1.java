package session01.bai3;

public class gioi1 {
    static void main(String[] args) {
        String book1 = "Java basic";
        String book2 = "Python Intro";
        System.out.printf("Truoc khi hoan doi: Book1: %s, Book2: %s \n", book1, book2);
        String temp = book1;
        book1 = book2;
        book2 = temp;
        System.out.printf("Sau khi hoan doi: Book1: %s, Book2: %s\n", book1, book2);
    }
}
