import java.util.*;
public class percentage{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        double loss=cp-sp;
        double a=(loss/cp)*100;
        System.out.printf("%.2f",a);
    }
}