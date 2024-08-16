import java.util.*;
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        return (n >> k & 1) == 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.print("Enter the bit position (0-indexed): ");
        int k = s.nextInt();
        boolean r = checkKthBit(n, k);
        if (r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
