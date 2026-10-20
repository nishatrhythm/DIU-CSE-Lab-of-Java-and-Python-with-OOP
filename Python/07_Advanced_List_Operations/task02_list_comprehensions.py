squares = [x ** 2 for x in range(1, 11)]
print("Squares 1 to 10:", squares)

evens = [x for x in range(1, 21) if x % 2 == 0]
print("Even numbers 1 to 20:", evens)

labels = ["Even" if x % 2 == 0 else "Odd" for x in range(1, 8)]
print("Even/Odd labels:", labels)

words = ["python", "object", "oriented", "programming", "lab"]
upper_words = [w.upper() for w in words if len(w) > 4]
print("Uppercase words with length > 4:", upper_words)

pairs = [(x, y) for x in [1, 2, 3] for y in [10, 20]]
print("Cartesian pairs:", pairs)

matrix = [[row * 3 + col + 1 for col in range(3)] for row in range(3)]
print("Generated 3x3 matrix:", matrix)