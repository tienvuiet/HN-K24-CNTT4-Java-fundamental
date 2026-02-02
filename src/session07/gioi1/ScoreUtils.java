package session07.gioi1;

public class ScoreUtils {
    public static  boolean checkPass(double score){
         if(score >= 5.0){
             return true;
         }else{
             return false;
         }
    }
    public static  double calculateAverage(double[] scores){
        double total = 0;
        for (int i = 0 ;i< scores.length; i++){
            total += scores[i];
        }
        return total/scores.length;
    }

}
