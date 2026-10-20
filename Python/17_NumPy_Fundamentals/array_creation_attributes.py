import numpy as np

arr1d = np.array([10, 20, 30, 40, 50])
print("1D Array:", arr1d)

arr2d = np.array([[1, 2, 3], [4, 5, 6]])
print("2D Array:\n", arr2d)

print("Dimensions (ndim):", arr2d.ndim)
print("Shape:", arr2d.shape)
print("Size (total elements):", arr2d.size)
print("Data type (dtype):", arr2d.dtype)
print("Item size in bytes:", arr2d.itemsize)

range_arr = np.arange(0, 20, 2)
print("\nnp.arange(0, 20, 2):", range_arr)

linear_space = np.linspace(0, 1, 5)
print("np.linspace(0, 1, 5):", linear_space)

zeros_matrix = np.zeros((2, 4))
print("np.zeros((2, 4)):\n", zeros_matrix)

ones_matrix = np.ones((3, 3), dtype=int)
print("np.ones((3, 3)):\n", ones_matrix)

identity = np.eye(3)
print("Identity Matrix:\n", identity)