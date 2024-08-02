n,m=map(int,input().split())
string_numbers=input()
numbers=[int(num) for num in string_numbers.split()]
if len(numbers)!=n:
    print("Khong hop le")
    quit()

string_numbers=input()
a=[int(num) for num in string_numbers.split()]
string_numbers=input()
b=[int(num) for num in string_numbers.split()]
if len(a)!=m or len(b)!=m:
    print("Khong hop le")
    quit()

numbers=set(numbers)
a=set(a)
b=set(b)

# diem_cong=numbers&a
# diem_tru=numbers&b
print(len(numbers&a)-len(numbers&b))