numbers = [42, 17, 89, 5, 23, 71, 10, 64]

print("Original list:", numbers)
print("Slice [2:6]:", numbers[2:6])
print("First 4 elements [:4]:", numbers[:4])
print("Elements from index 4 onwards [4:]:", numbers[4:])
print("Every second element [::2]:", numbers[::2])
print("Reversed list [::-1]:", numbers[::-1])

sorted_copy = sorted(numbers)
print("Sorted copy:", sorted_copy)
print("Original remains unchanged:", numbers)

numbers.sort(reverse=True)
print("Sorted in-place descending:", numbers)

names = ["Zahid", "abir", "babul", "Chowdhury"]
names.sort(key=str.lower)
print("Sorted names ignoring case:", names)

target = 23
if target in numbers:
    pos = numbers.index(target)
    print(f"Found {target} at index {pos}")
else:
    print(f"{target} not found")