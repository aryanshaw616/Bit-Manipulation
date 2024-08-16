import java.util.*;
class minBitFlips {
    public static int minBitFlips1(int start, int goal) {
        int xor = (start ^ goal);
        int c = 0;
        while (xor != 0) {
            if ((xor & 1) == 1)
                c++;
            xor >>= 1;
        }
        System.out.println("Total number of bit flips needed: " + c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start value: ");
        int start = sc.nextInt();
        System.out.print("Enter goal value: ");
        int goal = sc.nextInt();
        minBitFlips1(start, goal);
    }
}
