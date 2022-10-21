import java.util.*;
import java.util.Scanner.*;
public class twoDArray {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        m = sc.nextInt();
        System.out.println("Enter the number of colum:");
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the array element");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();



        System.out.println("Elements of the array are: ");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)

                System.out.print(arr[i][j] + " ");
//throws the cursor to the next line
                System.out.println();

        }
    }
}