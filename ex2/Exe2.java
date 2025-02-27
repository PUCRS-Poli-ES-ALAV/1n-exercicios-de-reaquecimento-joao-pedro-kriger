// Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
package ex2;

public class Exe2{
    public static void main(String[] args){
        int result = recursiveIncrement(3,2);
        System.out.println("Chamada Recursiva: " + result);
    }

    public static int recursiveIncrement(int x, int y){
        if (x == 0) return y;
        if (y == 0) return x;
        return 1 + recursiveIncrement(x, y - 1);
    }
}