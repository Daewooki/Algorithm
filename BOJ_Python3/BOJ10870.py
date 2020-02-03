# BOJ10870

# Recursive Fibonacci

num = int(input())

def fibonacci(num):
    if num <= 2:
        return 1
    else:
        return fibonacci(num-1) + fibonacci(num-2)
    
    
if(num>=2):
    print(fibonacci(num))
elif(num==1):
    print(1)
else:
    print(0)
