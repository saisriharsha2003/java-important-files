import math
def isprime(n):
    is_prime=True
    if n<=1:
        return False
    else:
        for i in range(2,int(math.sqrt(n))):
            if n%i==0:
                is_prime=False
        return is_prime
print(isprime(3))