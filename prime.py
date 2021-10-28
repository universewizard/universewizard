def prime(number):
    if number>1:
        for i in range(2,number):
            if (number%i==0):
                return False
        return True
    else:
        return False
p=int(input())
print(prime(p))
