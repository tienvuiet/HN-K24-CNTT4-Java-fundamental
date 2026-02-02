package session07.gioi1;

public class Main {

    static void main(String[] args) {

        double[] score = {6.4, 4.4,8.0};
        double diemTb = ScoreUtils.calculateAverage(score);
        System.out.println("Diem trung binh ca lop: "+diemTb );
        for(int i = 0 ; i< score.length; i++){
            if(ScoreUtils.checkPass(score[i])){
                System.out.printf("Diem %.0f: Dat\n", score[i]);
            }else{

                System.out.printf("Diem %.0f: Truot\n", score[i]);
            }
        }
    }
}
