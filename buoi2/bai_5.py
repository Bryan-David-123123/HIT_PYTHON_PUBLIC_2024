def Check(n):
    sum=0
    a=n
    while n>0:
        sum+=(n%10)**3
        n//=10
    return sum==a
n=int(input('n='))
for i in range(1,n+1):
    if Check(i):
        print(i,end=' ')