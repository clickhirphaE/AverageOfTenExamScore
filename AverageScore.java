


import java.util.Scanner;
public class AverageScore {

    public static void main(String args[]){
        final int EXAM_QUANTITY=10;   //constant definition to limmit exam quantity to 10
        Double exam_score,Average=0.0;   // variable declaration and initialization
        Double Total=0.0;
        Scanner xx=new Scanner(System.in);
        for(int i=1;i<=EXAM_QUANTITY;i++){     //for loop
        System.out.println(" Enter your ("+i+") exam Score:");
        exam_score=xx.nextDouble();
        Total=Total+exam_score;    //exam score total
        Average=Total/EXAM_QUANTITY;    //Average
        }
        System.out.println(" Here is your exam score's total "+Total);
        System.out.println(" Average of ten exam score is:"+Average);
}
}
