# BOJ1316

cnt=0

def check(seq):
    stack = list()
    for i,s in enumerate(seq):
        if s not in stack:
            stack.append(s)
        else:
            if(i!=0) and seq[i] != seq[i-1]:
                return 0
    return 1

for i in range(int(input())):
    seq = input()
    cnt += check(seq)

print(cnt)
