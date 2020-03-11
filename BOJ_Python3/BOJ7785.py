#input 속도 가속을 위해서 input()이 아닌 sys.stdin.readline을 쓰면 빠르다고 함.
import sys
input=sys.stdin.readline

people={}

for i in range(int(input())):
    text=input().strip().split(" ")
    if text[1] == 'enter':
        people[text[0]]=True
    elif text[1] == 'leave':
        people[text[0]]=False

ans=[]

#True인 애들만 모음
for i in people:
    if people[i]==True:
        ans.append(i)

#내림차순 정렬
ans.sort(reverse=True)

for i in ans:
    print(i)
