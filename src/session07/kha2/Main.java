package session07.kha2;

public class Main {
    static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println("Primitive: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

//        a và b là 2 ô nhớ khác nhau
//        b chỉ copy giá trị 10
//        Đổi b → không ảnh hưởng a
//        Primitive sao chép GIÁ TRỊ

        Student s1 = new Student("SV01", "Tien vu viet");
        Student s2 = s1;
        s2.tenSv =  "VU Tien";
        System.out.println("Reference:");
        System.out.println("ten sv s1 = " + s1.tenSv );
        System.out.println("Ten sv s2 = "+ s2.tenSv);

        // s1, s2 cung tro toi object
        // doi qua s2 ob thay doi
        // s1 thay cung thay doi
        // reference sao chep dia chi
    }
}
