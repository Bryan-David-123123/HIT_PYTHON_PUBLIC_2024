def format_phone_number(s):
    for i in s:
        if not(ord(i)>=48 and ord(i)<=57):
            s=s.replace(i,'')
    if s[0]!='0' or len(s)!=10:
        return "Invalid phone number"
    return s
my_string=input()
print(format_phone_number(my_string))