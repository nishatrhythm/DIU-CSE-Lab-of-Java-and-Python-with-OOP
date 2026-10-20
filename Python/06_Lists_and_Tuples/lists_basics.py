fruits = ["apple", "banana", "cherry"]

print("Initial list:", fruits)
print("First item:", fruits[0])
print("Last item:", fruits[-1])

fruits.append("orange")
print("After append('orange'):", fruits)

fruits.insert(1, "mango")
print("After insert(1, 'mango'):", fruits)

fruits.extend(["grape", "watermelon"])
print("After extend:", fruits)

fruits[0] = "green apple"
print("After updating index 0:", fruits)

removed_item = fruits.pop()
print(f"Popped item: {removed_item} | List now: {fruits}")

fruits.remove("banana")
print("After remove('banana'):", fruits)

print("Length of list:", len(fruits))
print("'mango' in fruits:", "mango" in fruits)