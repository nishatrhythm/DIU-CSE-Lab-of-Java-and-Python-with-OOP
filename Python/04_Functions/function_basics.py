def greet_student(name):
    return f"Hello, {name}! Welcome to the lab."

def calculate_stats(numbers):
    total = sum(numbers)
    count = len(numbers)
    average = total / count if count > 0 else 0
    return total, average, count

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

message = greet_student("Tanzim")
print(message)

marks = [85, 90, 78, 92, 88]
total, avg, count = calculate_stats(marks)
print(f"Total: {total}, Average: {avg:.2f}, Count: {count}")

test_numbers = [2, 7, 12, 19, 24]
for num in test_numbers:
    print(f"Is {num} prime? {is_prime(num)}")