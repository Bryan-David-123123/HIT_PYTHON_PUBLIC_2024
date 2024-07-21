a=float(input('a='))
b=float(input('b='))
c=float(input('c='))
if a==0:
    if b==0:
        if c==0:
            print('vo so nghiem')
        else:
            print('vo nghiem')
    else:
        print('x=',-c/b)
else:
    delta=b**2-4*a*c
    if delta<0:
        print('vo nghiem')
    elif delta==0:
        print('x1=x2=',-b/(2*a))
    else:
        print('x1=',(-b-delta**0.5)/(2*a))
        print('x2=',(-b+delta**0.5)/(2*a))