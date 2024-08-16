class Divide_without {
    public int divide(int d, int r) {
        if (d == Integer.MIN_VALUE && r == -1) return Integer.MAX_VALUE;
        
        boolean n = d < 0 ^ r < 0;
        
        d = Math.abs(d);
        r = Math.abs(r);
        int q = 0, s = 0;
        
        while (d - r >= 0) {
            for (s = 0; d - (r << s << 1) >= 0; s++);
            q += 1 << s;
            d -= r << s;
        }
        
        int result = n ? -q : q;
        System.out.println("Dividend: " + d);
        System.out.println("Divisor: " + r);
        System.out.println("Result: " + result);
        return result;
    }
}
