n=int(input())
a=[]
for i in range(n):
    a.append(input())
b=tuple(a.copy())
print(b)
b=list(b)
count =0
for i in b:
    if i.isdigit():
        count+=1
print(count)
# print(b.count(i.isdigit() for i in b)) khong chay duoc do count khonf xu ly duoc khoi lenh ben trong