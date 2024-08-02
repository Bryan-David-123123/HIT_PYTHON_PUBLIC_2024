n=int(input())
t=()
sum=0
for index in range(n):
    tmp=int(input())
    sum+=tmp
    t+=(tmp,)
print("average=",sum/n)