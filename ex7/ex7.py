#A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.

def ex7(n):
    if len(n) == 0:
        return 0, 1

    soma_restante, produto_restante = ex7(n[1:])

    soma = n[0] + soma_restante
    
    produto = n[0] * produto_restante

    return soma, produto
 

def main():
    
    n = [1,2,3,4]  
    result,result2 = ex7(n)
    print(f"The result for n={n} is: {result,result2}")

if __name__ == "__main__":
    main()