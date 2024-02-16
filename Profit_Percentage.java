import java.util.*;
public class percentage{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        double profit=sp-cp;
        double pp=(profit/cp)*100;
        System.out.printf("%.2f" ,pp);
    }
}