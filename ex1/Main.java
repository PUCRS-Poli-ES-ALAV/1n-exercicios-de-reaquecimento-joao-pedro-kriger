public class Main {

    public static void main(String[] args){
        int result = recursiveSum(10,2);
        
        System.out.println(result);
    }

    public static int recursiveSum(int multiplierA, int multiplierB){
        if(multiplierA == 0 )
            return 0;

        return recursiveSum(--multiplierA,multiplierB) + multiplierB;
    }
}