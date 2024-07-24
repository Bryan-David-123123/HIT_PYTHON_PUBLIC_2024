n=int(input('n='))
a=[int(input(f'a[{i}]=')) for i in range(n)]
x=int(input('x='))
count_of_x=a.count(x)
a[2:7:1]=[8, 5, 4, 0, 1, 3]
MAX=max(a)
MIN=min(a)
y=int(input('y='))
a.insert(0,y)
b=a[:]
b.sort()
if a==b:
    print("TANG")
elif a==b[::-1]:
    print("GIAM")
else:
    print("NO")


c=[i for i in range(1,n+1)]
d=[]
for i in range(1,n+1):
    tmp=sum(c[:i])
    d.append(tmp)



e= [94, 39, 49, 6, -55, -37, 1, -23, -31, 1000]
e.sort()
e=[abs(i) for i in e]
e.sort()