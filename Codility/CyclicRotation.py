# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, K):
    if K==len(A) or K==0:
        return A
    else:
        m = K%len(A)
        print(m)
        arr = []
        arr.extend(A[-m:])
        arr.extend(A[:-m])
        return arr

if __name__ == '__main__':
    print(solution([1,2,3,4], 4))