def solution(N):
    binary = bin(N)[2:]
    arr = binary.strip("0").split("1")
    arr = [x for x in arr if x != '']
    
    if len(arr)<1:
        return 0
    else:
        arr_len = [len(x) for x in arr]
        return max(arr_len)
    

if __name__ == '__main__':
    print(solution(354132)) # result = 2