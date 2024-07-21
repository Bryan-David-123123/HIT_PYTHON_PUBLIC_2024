n=int(input('n='))
sum=0
for i in range(1,2*n+2,2):
    sum+=i
for i in range(2,2*n+1,2):
    sum-=i
print(sum)