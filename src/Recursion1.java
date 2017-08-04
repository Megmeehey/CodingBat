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
            return base * powerN(base, n - 1);
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

    public boolean array6(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        } else {
            if (nums[index] == 6) {
                return true;
            } else {
                return array6(nums, index + 1);
            }
        }
    }

    public int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        } else {
            if (nums[index] == 11) {
                return 1 + array11(nums, index + 1);
            } else {
                return array11(nums, index + 1);
            }
        }
    }

    public boolean array220(int[] nums, int index) {
        if (nums.length == 0) {
            return false;
        }
        if (index == nums.length - 1) {
            return false;
        } else {
            if (nums[index] * 10 == nums[index + 1]) {
                return true;
            } else {
                return array220(nums, index + 1);
            }
        }
    }

    public String allStar(String str) {
        if (str.length() == 0) {
            return str;
        }
        int ind = str.lastIndexOf('*');
        if (ind + 2 == str.length()) {
            return str;
        } else {
            return allStar(str.substring(0, ind + 2) + "*" + str.substring(ind + 2));
        }
    }

    public String pairStar(String str) {
        return pStar(str, 0);
    }

    public String pStar(String str, int index) {
        if (str.length() == 0 || str.length() == 1 || str.length() - 1 == index) {
            return str;
        }
        if (str.charAt(index) == str.charAt(index + 1)) {
            return pStar(str.substring(0, index + 1) + "*" + str.substring(index + 1), index + 2);
        } else {
            return pStar(str, index + 1);

        }
    }

    public String endX(String str) {
        return eX(str, "");
    }

    public String eX(String str, String xes) {
        if (str.indexOf('x') == -1) {
            return str + xes;
        } else {
            return eX(str.replaceFirst("x", ""), xes + "x");
        }
    }

    public int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        } else {
            if (str.charAt(0) == str.charAt(2)) {
                return 1 + countPairs(str.substring(1));
            } else {
                return countPairs(str.substring(1));
            }
        }
    }

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        } else {
            int aind = str.indexOf("abc");
            int bind = str.indexOf("aba");
            if (aind != -1 && bind != -1) {
                return 1 + countAbc(str.substring(Math.min(aind,bind) + 2));
            } else if (aind != -1) {
                return 1 + countAbc(str.substring(aind + 2));
            } else if (bind != -1) {
                return 1 + countAbc(str.substring(bind + 2));
            } else {
                return 0;
            }
        }
    }

    public int count11(String str) {
        if (str.indexOf("11") == -1) {
            return 0;
        } else {
            return 1 + count11(str.replaceFirst("11", ""));
        }
    }

    public String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return sClean(str, 0);
        }
    }

    public String sClean(String str, int index) {
        if (index == str.length() - 1) {
            return str;
        }
        if (str.charAt(index) == str.charAt(index + 1)) {
            return sClean(str.substring(0, index + 1) + str.substring(index + 2), index);
        } else {
            return sClean(str, index + 1);
        }
    }

    public int countHi2(String str) {
        if (str.indexOf("hi") == -1) {
            return 0;
        } else {
            if (str.indexOf("hi") != 0 && str.charAt(str.indexOf("hi") - 1) == 'x') {
                return countHi2(str.substring(str.indexOf("hi") + 2));
            } else {
                return 1 + countHi2(str.substring(str.indexOf("hi") + 2));
            }
        }
    }

    public String parenBit(String str) {
        return str.substring(str.indexOf('('), str.indexOf(')') + 1);
    }

    public boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    public int strCount(String str, String sub) {
        if (str.indexOf(sub) == -1) {
            return 0;
        } else {
            return 1 + strCount(str.substring(str.indexOf(sub) + sub.length()), sub);
        }
    }

    public boolean strCopies(String str, String sub, int n) {
        if (str.indexOf(sub) == -1) {
            return n <= 0;
        } else {
            return strCopies(str.substring(str.indexOf(sub) + 1), sub, n - 1);
        }
    }

    public int strDist(String str, String sub) {
        return sDist(str, sub, 0);
    }

    public int sDist(String str, String sub, int lastIndex) {
        if (str.indexOf(sub) == -1) {
            return 0;
        } else {
            return Math.max(strDist(str.substring(str.indexOf(sub) + 1), sub), str.indexOf(sub) - lastIndex + sub.length() + 1);
        }
    }
}