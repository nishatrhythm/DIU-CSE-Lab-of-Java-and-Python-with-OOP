def enroll_student(name, course="CSE110", semester="Spring 2026"):
    print(f"Enrolled: {name} | Course: {course} | Semester: {semester}")

def sum_all(*numbers):
    total = 0
    for num in numbers:
        total += num
    return total

def print_student_info(**details):
    print("--- Student Profile ---")
    for key, value in details.items():
        print(f"{key.capitalize()}: {value}")

enroll_student("Sakib")
enroll_student("Nadia", course="CSE220")
enroll_student("Rony", semester="Fall 2026", course="SWE121")

print("\nSum of 2 numbers:", sum_all(10, 20))
print("Sum of 5 numbers:", sum_all(5, 10, 15, 20, 25))

print()
print_student_info(name="Farhana", id="221-15-1234", department="CSE", cgpa=3.92)

