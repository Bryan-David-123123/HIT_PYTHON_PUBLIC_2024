k=int(input('k='))
a=[int(input(f'a[{i}]=')) for i in range(k)]
n=int(input('n='))
m=int(input('m='))
if n*m>k:
    print("NO")
else:
    b = [[0]* m for i in range(n)]
    index=0
    for i in range(n):
        for j in range(m):
            if index<len(a):
                b[i][j]=a[index]
                index+=1
    print(b)