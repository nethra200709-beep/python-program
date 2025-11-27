def isprime(n):
    for i in range(2,int(n**.5)+1):
        if n%i==0:
            return False
    else:
         return True
        
l=[66,32,42,81,91,97,39,19,85,69]
for n in l:
    if isprime(n):
        print(n)
        
