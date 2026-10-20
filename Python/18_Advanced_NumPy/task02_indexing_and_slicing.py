import numpy as np

matrix = np.array([
    [10, 11, 12, 13],
    [20, 21, 22, 23],
    [30, 31, 32, 33],
    [40, 41, 42, 43]
])

print("4x4 Matrix:\n", matrix)

print("\nElement at (row 1, col 2):", matrix[1, 2])
print("First row:", matrix[0, :])
print("Second column:", matrix[:, 1])
print("Sub-matrix (top-left 2x2):\n", matrix[:2, :2])
print("Sub-matrix (center 2x2):\n", matrix[1:3, 1:3])

mask = matrix > 25
print("\nBoolean Mask (matrix > 25):\n", mask)
print("Filtered elements where matrix > 25:", matrix[mask])

row_indices = np.array([0, 2, 3])
col_indices = np.array([1, 3, 0])
print("\nFancy indexing matrix[[0, 2, 3], [1, 3, 0]]:", matrix[row_indices, col_indices])

matrix[matrix % 2 != 0] = -1
print("\nMatrix after replacing all odd numbers with -1:\n", matrix)