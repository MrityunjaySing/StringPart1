public class factorial {
    public static void main(String args[]){
        int num =5, i=1;
        long fact = 1;
        while (i<=num) {
            fact *= i;
            i++;
        }
            System.out.println("your factorial is:\n"+ num + " " +fact);
        }
    }

