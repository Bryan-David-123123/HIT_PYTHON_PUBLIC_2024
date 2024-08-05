n=int(input())
if n<1 or n>100:
    print("Khong hop le")
    quit()
string_numbers=input()
numbers=string_numbers.split()

for i in range(len(numbers)):
    for j in range(10):
        if i==0 and j!=int(numbers[0]) and j!=0:
            numbers[0]=j
            break
        if j!=int(numbers[i]) and j>int(numbers[i-1]):
            numbers[i]=j
            break
print(max(numbers))