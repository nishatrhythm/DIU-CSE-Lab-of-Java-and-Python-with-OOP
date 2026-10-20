print("For Loop with range(1, 6):")
for i in range(1, 6):
    print(i, end=" ")
print("\n")

print("While Loop countdown:")
countdown = 5
while countdown > 0:
    print(countdown, end=" ")
    countdown -= 1
print("\n")

print("Iterating over a list:")
languages = ["Python", "Java", "C++", "JavaScript"]
for idx, lang in enumerate(languages, start=1):
    print(f"{idx}. {lang}")

print("\nBreak and Continue demonstration:")
for num in range(1, 10):
    if num == 3:
        continue
    if num == 7:
        break
    print(num, end=" ")
print("\n")

target = 15
numbers = [2, 4, 6, 8, 10]
for n in numbers:
    if n == target:
        print("Found target!")
        break
else:
    print("Target not found in the list.")