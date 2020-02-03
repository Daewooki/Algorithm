# BOJ4673

self_number_set = set(range(1, 10001))
generated_number_set = set()

for i in range(1, 100001):
    for j in str(i):
        i+= int(j)
    generated_number_set.add(i)
        
self_number_set = self_number_set - generated_number_set

for i in sorted(self_number_set):
    print(i)

