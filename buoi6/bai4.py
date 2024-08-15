def Tong(n):
    s=0
    while(n!=0):
       s+=(n%10)
       n//=10
    return s

n=int(input())
dem=0
while(n>=10):
    dem+=1
    n=Tong(n)
    if n<10:
        dem+=1
print(dem)