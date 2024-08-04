n=int(input())
string_numbers=input()
numbers=[int(num) for num in string_numbers.split()]
numbers.sort()
sum_max=int(input())
sum=0
i=0
while i<n and sum+numbers[i]<=sum_max:
    sum+=numbers[i]
    i+=1
s=set(numbers[:i])
# s=[]
# for index in range(i):
#     # print(numbers[index],end=' ') 
#     s.append(numbers[index])
print(s)
