import java.util.*;
class Dec_Bin
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n =in.nextInt();
        System.out.println(Conv(n));
    }
    static String Conv(int n)
    {
        String res="";
        while(n!=0)
        {
            if(n%2==1) res+="1";
            else res+="0";
            n=n/2;
        }
        StringBuilder str = new StringBuilder(res);
        res =(str.reverse()).toString();
        return res;
    }
}