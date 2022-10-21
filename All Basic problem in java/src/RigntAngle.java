import java.util.Scanner;

public class RigntAngle {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern number");
        int n = sc.nextInt();
        int i,j,k,m;
        for(i=0;i<=n;i++)
        {
            if(i!=0)
            {
                System.out.println("\n");
            }
            System.out.println("@");
        }
        for(i=0;i<n;i++)
        {
            System.out.println("*");
        }
        for(i=0;i<n-1;i++)
        {
            System.out.println("\n");
            for(j=0;j<n;j++)
            {
                System.out.println(" ");
            }
            j=i;
            while(j>0)
            {
                for(k=0;k<n-1;k++)
                {
                    System.out.println(" ");
                }
                j--;
            }
            for(j=0;j<n;j++)
            {
                System.out.println("*");
            }
        }
        m=(n+n+((n-1)*(n-2)));
        System.out.println("@");
        for(i=0;i<n;i++)
        {
            System.out.println("\n");
            for(j=0;j<m;j++)
            {
                System.out.println(" ");
            }
            System.out.println("@");
        }
    }
}