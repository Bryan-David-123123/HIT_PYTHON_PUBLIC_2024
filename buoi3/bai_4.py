a=input()
l=list(a)
tmp=[]
for i in range(len(l)):
    if not (l[i]==' ' and (l[i-1]==' ' or i==0)):
        tmp.append(l[i])
a=''.join(tmp)
a=a.title()
print(a)