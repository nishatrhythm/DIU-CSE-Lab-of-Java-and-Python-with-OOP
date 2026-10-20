import numpy as np

a = np.array([10, 20, 30, 40])
b = np.array([1, 2, 3, 4])

print("Array a:", a)
print("Array b:", b)
print("a + b:", a + b)
print("a - b:", a - b)
print("a * b:", a * b)
print("a / b:", a / b)
print("a ** 2:", a ** 2)

print("\nBroadcasting (a + 5):", a + 5)
print("Broadcasting (a * 2):", a * 2)

matrix = np.array([
    [10, 20, 30],
    [40, 50, 60]
])

print("\nMatrix:\n", matrix)
print("Total sum:", matrix.sum())
print("Mean:", matrix.mean())
print("Standard deviation:", matrix.std())
print("Min value:", matrix.min())
print("Max value:", matrix.max())

print("Sum along columns (axis=0):", matrix.sum(axis=0))
print("Sum along rows (axis=1):", matrix.sum(axis=1))
print("Index of max element (argmax):", matrix.argmax())