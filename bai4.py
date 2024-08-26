class Tamthuc:
    def __init__(self,a,b,c) -> None:
        self.a=a
        self.b=b
        self.c=c
    def __str__(self) -> str:
        return f'{self.a}x^2+{self.b}x+{self.c}'
    
DS=[Tamthuc(1,2,3),
    Tamthuc(4,5,6),
    Tamthuc(1+4,2+5,3+6),
    Tamthuc(1-4,2-5,3-6)]
for i in DS:
    print(i)

# class PERSON:
#     def __init__(self,name,date_of_birth,que_quan) -> None:
#         self.name=name
#         self.birth_of_date=date_of_birth
#         self.que_quan=que_quan
#     def __str__(self) -> str:
#         return f'Ten:{self.name} Ngay sinh:{self.birth_of_date}  Que:{self.que_quan}'

# class KYSU(PERSON):
#     def __init__(self, name, date_of_birth, que_quan,nganh,nam_tot_nghiep) -> None:
#         super().__init__(name, date_of_birth, que_quan)
#         self.nganh=nganh
#         self.nam_tot_nghiep=nam_tot_nghiep
#     def __str__(self) -> str:
#         return super().__str__()+f"  Nganh:{self.nganh} Nam tot nghiep:{self.nam_tot_nghiep}"
# # n=int(input())
# # PERSON('K1',20,'Tu Liem')
# # PERSON('K2',22,'Cau Giay')
# DS=[KYSU('K1',20,'Tu Liem','CNTT',2028),
#     KYSU('K2',22,'Cau Giay','KHMT',2025)]
# for i in DS:
#     print(i)
# KY_moi=max(DS,key=lambda ks:ks.nam_tot_nghiep)
# print(KY_moi)
    