a=input()
danh_sach=a.split()
s=[char for i in danh_sach for char in i]
s=set(s)
print(list(s))