n = int(input())
hs = []
for _ in range(n):
    name, score =input().split()
    score = float(score)
    hs.append((name, score))
lst = [score for name, score in hs]
lst1 = list(set(lst))
lst1.sort()
score2 = lst1[1]
lst2 = [ name for name, score in hs if score == score2]
for name in lst2:
    print(name)