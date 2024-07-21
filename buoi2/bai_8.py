def kt(i,j):
    if j in (0,i):
        return 1
    return kt(i-1,j-1)+kt(i-1,j)
n=int(input('n='))
for i in range(n):
    for j in range(i+1):
        print(kt(i,j),end=' ')
    print()