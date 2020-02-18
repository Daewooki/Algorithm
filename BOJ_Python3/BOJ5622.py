# UNUVXY
dial = input()

dict = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']

sum = 0
for i in dial:
    for j in dict:
        if i in j:
            sum += dict.index(j)+3
            
            
print(sum)
