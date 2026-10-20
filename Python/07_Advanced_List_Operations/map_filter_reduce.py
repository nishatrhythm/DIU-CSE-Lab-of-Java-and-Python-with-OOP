from functools import reduce

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

squared = list(map(lambda x: x ** 2, numbers))
print("Original numbers:", numbers)
print("Squared with map():", squared)

temperatures_c = [0, 20, 35, 100]
temperatures_f = list(map(lambda c: (c * 9/5) + 32, temperatures_c))
print("Celsius to Fahrenheit:", temperatures_f)

even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print("Filtered evens:", even_numbers)

greater_than_five = list(filter(lambda x: x > 5, numbers))
print("Filtered > 5:", greater_than_five)

sum_total = reduce(lambda acc, x: acc + x, numbers)
print("Sum with reduce():", sum_total)

product_total = reduce(lambda acc, x: acc * x, [1, 2, 3, 4, 5])
print("Product with reduce():", product_total)

max_value = reduce(lambda a, b: a if a > b else b, numbers)
print("Maximum with reduce():", max_value)