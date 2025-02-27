#A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.

def ex7(n):
    if n.length() == 0:
        soma = n[0]
        produto = n[0]
        return soma,produto
    
    return 
 

def main():
    
    n = [1,2,3,4]  
    result,result2 = ex7(n)
    print(f"The result for n={n} is: {result}")

if __name__ == "__main__":
    main()