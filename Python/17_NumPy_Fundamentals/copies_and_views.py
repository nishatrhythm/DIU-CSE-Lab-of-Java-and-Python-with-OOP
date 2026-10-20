import numpy as np

original = np.array([10, 20, 30, 40, 50])
print("Original Array:", original)

view_arr = original.view()
print("\nView created:")
print("view_arr.base is original:", view_arr.base is original)

view_arr[0] = 999
print("After modifying view_arr[0] = 999:")
print("Original:", original)
print("View:", view_arr)

deep_copy = original.copy()
print("\nDeep copy created:")
print("deep_copy.base is original:", deep_copy.base is original)

deep_copy[1] = 888
print("After modifying deep_copy[1] = 888:")
print("Original:", original)
print("Deep Copy:", deep_copy)

slice_view = original[2:5]
print("\nSlice is also a view:")
print("slice_view.base is original:", slice_view.base is original)