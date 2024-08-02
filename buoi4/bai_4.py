n=int(input())
string_numbers=input()
numbers=[int(num) for num in string_numbers.split()]
numbers.sort()
sum_max=int(input())
sum=0
i=0
while sum<=sum_max:
    sum+=numbers[i]
    i+=1
i-=1
s=[]
for index in range(i):
    # print(numbers[index],end=' ') 
    s.append(numbers[index])
s=set(s)
print(s)