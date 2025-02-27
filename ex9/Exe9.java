//Dado um número n, gere todas as possíveis combinações com as n primeiras letras do alfabeto. Ex.: n = 3. Resposta: ABC, ACB, BAC, BCA, CAB, CBA.
package ex9;

public class Exe9 {
    public static void main(String[] args){
        int n = 3;
        
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letras = alfabeto.substring(0, n);
        
        gerarPermutacoes(letras, 0);
    }
    
    public static void gerarPermutacoes(String str, int inicio) {
        if (inicio == str.length() - 1) {
            System.out.println(str);
        } else {
            for (int i = inicio; i < str.length(); i++) {
                str = troca(str, inicio, i);
                gerarPermutacoes(str, inicio + 1);
                str = troca(str, inicio, i);
            }
        }
    }

    public static String troca(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }


}
