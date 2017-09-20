/**
 * Created by Megmeehey on 22.06.17.
 * Codingbat.com Logic-2 code practice at
 * http://codingbat.com/java/Logic-2
 */
public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        int b = goal / 5;
        int rem = goal % 5;
        if (big < b) {
            rem += 5 * (b - big);
        }
        return small >= rem;
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (b != a && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != b && c != a) {
            sum += c;
        }
        return sum;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        sum += a;
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return sum;
        }
        else {
            sum += b;
        }
        if (c == 13) {
            return sum;
        }
        else {
            sum += c;
            return sum;
        }
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
            return 0;
        } else {
            return n;
        }
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int divided = num / 10;
        if (num % 10 >= 5) {
            return 10 * (divided + 1);
        } else {
            return 10 * divided;
        }
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) <= 1) {
            if (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) {
                return true;
            }
            return false;
        }
        if (Math.abs(c - a) <= 1) {
            if (Math.abs(b - a) >= 2 && Math.abs(c - b) >= 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (Math.abs(21 - a) > Math.abs(21 - b)) {
            return b;
        } else {
            return a;
        }
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = 0;
        if ((a >= b) && (a <= c) || (a <= b) && (a >= c)) {
            mid = a;
        }
        if ((b >= a) && (b <= c) || (b <= a) && (b >= c)) {
            mid = b;
        }
        if ((c >= b) && (c <= a) || (c <= b) && (c >= a)) {
            mid = c;
        }
        return mid - min == max - mid;
    }

    public int makeChocolate(int small, int big, int goal) {
        int b = goal / 5;
        int rem = goal % 5;
        if (big < b) {
            rem += 5 * (b - big);
        }
        if (small >= rem) {
            return rem;
        } else {
            return -1;
        }
    }
}
