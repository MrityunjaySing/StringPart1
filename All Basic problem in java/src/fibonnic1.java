import java.util.Scanner;
public class fibonnic1 {
    public static void main(String argus[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the fabonnic serise number:\n");
        int n = sc.nextInt();
        int   firstno = 0, secondno=1;
        System.out.println("fabonnic seris"+ n + "term");
        for (int i=1;i<n;i++){
            System.out.println(firstno +"  ");
            int nextterm = firstno + secondno;
            firstno = secondno;
            secondno = nextterm;
        }

    }
}
