matrix_a = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

matrix_b = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
]

print("Matrix A:")
for row in matrix_a:
    print(row)

element = matrix_a[1][2]
print(f"\nElement at row 1, col 2: {element}")

sum_matrix = []
for r in range(len(matrix_a)):
    row_sum = []
    for c in range(len(matrix_a[0])):
        row_sum.append(matrix_a[r][c] + matrix_b[r][c])
    sum_matrix.append(row_sum)

print("\nMatrix Addition (A + B):")
for row in sum_matrix:
    print(row)

transposed = [[matrix_a[row][col] for row in range(len(matrix_a))] for col in range(len(matrix_a[0]))]
print("\nTransposed Matrix A:")
for row in transposed:
    print(row)