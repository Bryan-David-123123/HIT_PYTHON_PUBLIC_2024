numbers=input()
s=set(numbers)
for i in s:
    tmp=numbers.count(i)
    if tmp%5==0 and tmp%10!=0:
        print(i,end=' ')