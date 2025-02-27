/*
 * Defina uma sequência de Fibonacci generalizada, de f0 a f1 como sequência fibg(f0, f1, 0), fibg(f0, f1, 1), fibg(f0, f1, 2), ..., onde:
fibg(f0, f1, 0) = f0
fibg(f0, f1, 1) = f1
fibg(f0, f1, n) = fibg(f0, f1, n − 1) + fibg(f0, f1, n − 2), se n > 1
 */
package ex10;

public class Exe10 {
    public static void main(String[] args){
        int f0 = 3;
        int f1 = 5;
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.println("fibg(" + f0 + ", " + f1 + ", " + i + ") = " + fibg(f0, f1, i));
        }
    }
    
    public static int fibg(int f0, int f1, int n) {
        if (n == 0) {
            return f0;
        } else if (n == 1) {
            return f1;
        } else {
            return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
        }
    }
}
