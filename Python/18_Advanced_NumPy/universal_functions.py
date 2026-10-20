import numpy as np

data = np.array([1, 4, 9, 16, 25], dtype=float)

print("Original data:", data)
print("Square root (np.sqrt):", np.sqrt(data))
print("Exponential (np.exp):", np.exp(data))
print("Natural log (np.log):", np.log(data))

angles = np.array([0, np.pi / 6, np.pi / 4, np.pi / 2])
print("\nAngles in radians:", angles)
print("Sine values (np.sin):", np.round(np.sin(angles), 4))
print("Cosine values (np.cos):", np.round(np.cos(angles), 4))

arr1 = np.array([10, 20, 30])
arr2 = np.array([3, 5, 7])
print("\nBinary ufuncs:")
print("np.add(arr1, arr2):", np.add(arr1, arr2))
print("np.multiply(arr1, arr2):", np.multiply(arr1, arr2))
print("np.maximum(arr1, [15, 15, 15]):", np.maximum(arr1, [15, 15, 15]))
print("np.floor([1.7, 2.3, 3.9]):", np.floor([1.7, 2.3, 3.9]))
print("np.ceil([1.7, 2.3, 3.9]):", np.ceil([1.7, 2.3, 3.9]))