import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any Two numbers");
        int k = Sc.nextInt();
        int l = Sc.nextInt();
        int maxg =1;
        for(int i=2;i<Math.max(l, k);i++)
        {
            if(k%i==0&&l%i==0&&i<maxg)
            {
                maxg=i;
            }
        }
        System.out.println("GCD:"+maxg);
    }
}