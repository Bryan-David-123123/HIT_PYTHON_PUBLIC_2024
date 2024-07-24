while True:
    try:
        n=int(input('n='))
        if not(1<=n<=100):
            print("Yeu cau nhap lai n:")
            continue
        l=list(map(int,input().split()))
        if len(l)!=n:
            print("Yeu cau nhap lai:")
            continue
        if all(1<=x<=1000 for x in l):
            break
        else:
            print("Yeu cau nhap lai:")
    except ValueError:
        print("Yeu cau nhap lai:")
k=[]
for i in l:
    if i%2!=0:
       k.append(i)
print(len(k)) 
print(k)