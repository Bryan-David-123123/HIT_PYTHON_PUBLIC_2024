def Tong(n):
    sum=0
    for i in range(1,int(n/2+1)):
        if n%i==0:
            sum+=i
    return sum
n=int(input('n='))
for i in range(1,n+1):
    Res=Tong(i)
    if i==Tong(Res) and i<Res:
        print(i,' ',Res)