uni = lambda a: ord(a) 

def Select(l):
    return max(l)

l=list(map(str,input().split()))
a=list(map(uni,l))
MAX=Select(a)
print(chr(MAX))