def calculate(operation,*args):
    if operation=='add':
        return sum(args)
    elif operation=='multiply':
        Tich=1
        for i in args:
            Tich*=i
        return Tich
    elif operation=='max':
        return max(args)
    elif operation=='min':
        return min(args)
    else:
        return 'Invalid operation'
s=input('Nhap opertaion:')
a,b,c=1,2,4
print(calculate(s,a,b,c))