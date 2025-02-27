/*
Gerador da sequência dada por:
F(1) = 1
F(2) = 2
F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2). * 
 */
package ex5;

public class Exe5 {
    public static void main(String[] args){
        int result = F(5);
        System.out.println("Chamada Recursiva: " + result);
    }
    
    public static int F(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return 2 * F(n - 1) + 3 * F(n - 2);
        }
    }
}
