# BOJ10809

code = input()

array = [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,-1, -1]

for i in code:
    if(array[ord(i)-97]==-1):
        array[ord(i)-97] = code.index(i)

for i in array:
     print(i,sep=" ")
