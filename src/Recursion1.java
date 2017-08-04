/**
 * Created by Megmeehey on 04.08.17.
 * Codingbat.com Recursion-1 code practice at
 * http://codingbat.com/java/Recursion-1
 */
public class Recursion1 {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 1) {
            return 2 + bunnyEars2(bunnies - 1);
        } else {
            return 3 + bunnyEars2(bunnies - 1);
        }
    }

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + triangle(rows - 1);
        }
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumDigits(n / 10);
        }
    }

    public int count7(int n) {
        if (n == 0) {
            return 0;
        } else {
            if (n % 10 == 7) {
                return 1 + count7(n / 10);
            } else {
                return count7(n / 10);
            }
        }
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        } else {
            if (n % 10 == 8) {
                if (n / 10 % 10 == 8) {
                    return 2 + count8(n / 10);
                } else {
                    return 1 + count8(n / 10);
                }
            } else {
                return count8(n / 10);
            }
        }
    }

    public int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return base * powerN(base, n-1);
        }
    }

    public int countX(String str) {
        if (str.indexOf('x') == -1) {
            return 0;
        } else {
            return 1 + countX(str.substring(str.indexOf('x') + 1));
        }
    }

    public int countHi(String str) {
        if (str.indexOf("hi") == -1) {
            return 0;
        } else {
            return 1 + countHi(str.substring(str.indexOf("hi") + 2));
        }
    }

    public String changeXY(String str) {
        // return str.replaceAll('x', 'y'); :)
        if (str.indexOf('x') == -1) {
            return str;
        } else {
            return changeXY(str.replace('x', 'y'));
        }
    }

    public String changePi(String str) {
        if (str.indexOf("pi") == -1) {
            return str;
        } else {
            return changePi(str.replace("pi", "3.14"));
        }
    }

    public String noX(String str) {
        if (str.indexOf('x') == -1) {
            return str;
        } else {
            return noX(str.replace("x", ""));
        }
    }
}
