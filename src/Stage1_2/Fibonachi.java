package Stage1_2;

import java.math.BigInteger;
import java.util.ArrayList;

/*
* Вычислить ряд Фибоначчи.
Ряд Фибоначчи - последовательность чисел, в которой любое число,
* кроме первого и второго, является суммой двух предыдущих: 0, 1, 1, 2, 3, 5, 8, 13, 21...
Количество чисел в ряду Фибоначчи ввести с консоли.
* https://gist.github.com/n0tb0dy/a3323e9f7e8bc0a2f4f0
* */

// classic:  0=0;1=1;2=1;3=2;4=3
// exercise: 0=-,1=0;2=1;3=1;4=2;5=3
public class Fibonachi {
    public static ArrayList<BigInteger> exerciceFibonacci(int number_by_user) {
        ArrayList<BigInteger> lst = new ArrayList(number_by_user);
        BigInteger n1 = new BigInteger("0");
        BigInteger n2 = new BigInteger("1");
        if(number_by_user == 0) {
            return lst;
        }
        lst.add(n1);
        if(number_by_user == 1) {
            return lst;
        }
        lst.add(n2);
        if(number_by_user == 2) {
            return lst;
        }
        for (int i = 2; i < number_by_user; i++) {
            lst.add(lst.get(i-2).add(lst.get(i-1)));
        }
        return lst;
    }
    public static int classicFibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int n0 = 0, n1 = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = n0 + n1;
            n0 = n1;
            n1 = temp;
        }
        return n1;
    }

}
