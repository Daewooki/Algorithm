# BOJ1120

MIN = 50

a, b = input().split()

for i in range(0, len(b)-len(a)+1):
    cnt = 0
    for j in range(0, len(a)):
        if a[j] != b[j+i]:
            cnt+=1
    if MIN>cnt:
        MIN = cnt
            
print(MIN)
