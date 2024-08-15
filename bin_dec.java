import java.util.*;
class bin_dec
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int n =in.nextInt();
        System.out.println(Conv(n));
    }
    static int Conv(int n)
    {  String s=Integer.toString(n);
        int res=0,f=0;
        int k=s.length()-1;
        while(k>=0)
        {
            if(s.charAt(k)=='1')
            res+=Math.pow(2,f);
            k--;
            f++;
        }
        return res;
    }
}