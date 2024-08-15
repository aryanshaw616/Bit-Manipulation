import java.util.*;
class swap2nos {
    static List<Integer> get(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        List<Integer> res = new ArrayList<>();
        res.add(a);
        res.add(b);
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number (b): ");
        int b = scanner.nextInt();
        List<Integer> result = get(a, b);
        System.out.println("After swapping:");
        System.out.println("a = " + result.get(0));
        System.out.println("b = " + result.get(1));
    }
}
