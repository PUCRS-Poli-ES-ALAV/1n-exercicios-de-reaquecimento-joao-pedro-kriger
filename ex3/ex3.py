def ex3(n):
    #Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
    if n == 1:
        return 1
    return 1/n + ex3(n-1)
 

def main():
    
    n = 2  
    result = ex3(n)
    print(f"The result for n={n} is: {result}")

if __name__ == "__main__":
    main()