def divide_numbers(a, b):
    try:
        val1 = float(a)
        val2 = float(b)
        result = val1 / val2
    except ValueError as ve:
        print("Value Error: Invalid number provided ->", ve)
    except ZeroDivisionError as zde:
        print("Zero Division Error: Cannot divide by zero ->", zde)
    else:
        print(f"Calculation Successful: {val1} / {val2} = {result}")
    finally:
        print("Execution finished for divide_numbers().\n")

if __name__ == "__main__":
    divide_numbers(10, 2)
    divide_numbers(10, 0)
    divide_numbers(10, "abc")