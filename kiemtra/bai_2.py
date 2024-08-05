x=int(input())
if x<1 or x>1000:
    print("Khong hop le")
elif x%3==0:
    print(x/3)
else:
    print(x//3+1)