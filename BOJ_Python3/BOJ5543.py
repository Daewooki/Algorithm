# BOJ5543

hambuger = []
drink = []

for i in range(3):
    cost=int(input())
    hambuger.append(cost)
for i in range(2):
    cost=int(input())
    drink.append(cost)
print(min(hambuger)+min(drink)-50)
