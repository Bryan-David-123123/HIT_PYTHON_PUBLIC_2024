s1=input('Nhap chuoi s1:')
s2=input('Nhap chuoi s2:')
# print(s1[::-1])
# a=int(input())
# b=int(input())
# print(s2[a:b:-1])
# s3=s1[::2]
# print(s3)


res=[]
len_s1=len(s1)
len_s2=len(s2)
for i in range(max(len_s1,len_s2)):
    if i<len_s1:
        res.append(s1[i])
    if i<len_s2:
        res.append(s2[i])
result=''.join(res)
print(result)



# letter1=s1[0]
# letter2=s2[0]
# s1=s1.replace(letter1,letter2)
# s2=s2.replace(letter2,letter1)
# print(s1)
# print(s2)