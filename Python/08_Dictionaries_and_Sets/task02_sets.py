set_a = {1, 2, 3, 4, 5}
set_b = {4, 5, 6, 7, 8}

print("Set A:", set_a)
print("Set B:", set_b)

set_a.add(10)
print("After adding 10 to Set A:", set_a)

set_a.remove(10)
set_a.discard(99)
print("After removing 10 and discarding non-existent 99:", set_a)

union_set = set_a | set_b
print("Union (A | B):", union_set)
print("Union using method:", set_a.union(set_b))

intersection_set = set_a & set_b
print("Intersection (A & B):", intersection_set)
print("Intersection using method:", set_a.intersection(set_b))

difference_set = set_a - set_b
print("Difference (A - B):", difference_set)

symmetric_diff = set_a ^ set_b
print("Symmetric Difference (A ^ B):", symmetric_diff)

duplicates_list = [1, 2, 2, 3, 4, 4, 5, 5, 5]
unique_items = set(duplicates_list)
print("Removing duplicates with set:", unique_items)