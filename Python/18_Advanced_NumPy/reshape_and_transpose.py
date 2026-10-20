import numpy as np

arr = np.arange(1, 13)
print("1D Array (1 to 12):", arr)

reshaped_3x4 = arr.reshape((3, 4))
print("\nReshaped to (3, 4):\n", reshaped_3x4)

reshaped_2x6 = arr.reshape((2, -1))
print("\nReshaped to (2, 6) using -1:\n", reshaped_2x6)

transposed = reshaped_3x4.T
print("\nTransposed (4, 3):\n", transposed)

raveled = reshaped_3x4.ravel()
flattened = reshaped_3x4.flatten()
print("\nFlattened array:", flattened)

a = np.array([[1, 2], [3, 4]])
b = np.array([[5, 6], [7, 8]])

vstack_result = np.vstack((a, b))
print("\nVertical Stack (vstack):\n", vstack_result)

hstack_result = np.hstack((a, b))
print("\nHorizontal Stack (hstack):\n", hstack_result)

concat_axis0 = np.concatenate((a, b), axis=0)
print("\nConcatenate axis 0:\n", concat_axis0)