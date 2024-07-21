a=float(input('a='))
b=float(input('b='))
c=float(input('c='))
if a+b>c and a+c>b and b+c>a:
    if a==b or b==c or a==c :
        if a==b and b==c :
            print("Tam giac deu")
        else:
            print("Tam giac can")
    elif a**2+b**2==c**2 or a**2+c**2==b**2 or b**2+c**2==a**2:
        print("Tam giac vuong")
    elif a**2+b**2<c**2 or a**2+c**2<b**2 or b**2+c**2<a**2:
        print("Tam giac tu")
    else:
        print("Tam giac nhon")
else:
    print("Khong phai tam giac")