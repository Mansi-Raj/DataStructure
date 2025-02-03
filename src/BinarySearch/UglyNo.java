package BinarySearch;

import java.util.*;

public class UglyNo {
    // Function to calculate GCD of three numbers
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public int nthUglyNumber(int n, int a, int b, int c) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> seen = new HashSet<>();
        pq.offer(1L);
        seen.add(1L);

        long ugly = 0;
        for (int i = 0; i < n; i++) {
            ugly = pq.poll();
            if (seen.add(ugly * a))
                pq.offer(ugly * a);
            if (seen.add(ugly * b))
                pq.offer(ugly * b);
            if (seen.add(ugly * c))
                pq.offer(ugly * c);
        }
        return (int) ugly;
    }

    public static void main(String[] args) {
        UglyNo s = new UglyNo();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(s.nthUglyNumber(n, a, b, c));
        sc.close();
    }
}
