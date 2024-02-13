import java.util.*;
public class volume{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double vol;
        vol=1.3333333*3.14*a*a*a;
        System.out.printf("%.2f",vol);
    }
}