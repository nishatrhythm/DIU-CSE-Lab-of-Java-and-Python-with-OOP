val = 20

val += 10
print("After val += 10:", val)

val -= 5
print("After val -= 5:", val)

val *= 2
print("After val *= 2:", val)

val //= 4
print("After val //= 4:", val)

x = 15
y = 20

print("x == y:", x == y)
print("x != y:", x != y)
print("x < y and y > 10:", x < y and y > 10)
print("x > 50 or y == 20:", x > 50 or y == 20)
print("not (x == 15):", not (x == 15))

item_list = [10, 20, 30, 40]
print("20 in item_list:", 20 in item_list)
print("99 not in item_list:", 99 not in item_list)

a = [1, 2, 3]
b = [1, 2, 3]
c = a
print("a is c:", a is c)
print("a is b:", a is b)
print("a == b:", a == b)

sample_data = [-15, 30, 45, -5, 10]
print("Length:", len(sample_data))
print("Sum:", sum(sample_data))
print("Minimum:", min(sample_data))
print("Maximum:", max(sample_data))
print("Absolute of -15:", abs(-15))
print("Round 3.14159 to 2 digits:", round(3.14159, 2))