import java.util.*;
class powerof2 {
    public static  boolean check(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        while(n>1)
        {     
            if(n%2!=0) return false;
            n/=2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = in.nextInt();
        if(check(n))
        System.out.println("Yes ");
        else
        System.out.println("No");
    }
}