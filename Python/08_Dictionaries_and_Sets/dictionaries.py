student = {
    "id": 101,
    "name": "Nafisa Rahman",
    "department": "CSE",
    "cgpa": 3.82,
    "skills": ["Python", "Java", "SQL"]
}

print("Original Dictionary:", student)
print("Student Name:", student["name"])
print("CGPA with get():", student.get("cgpa"))
print("Email (with default fallback):", student.get("email", "Not Provided"))

student["cgpa"] = 3.90
student["semester"] = 5
print("\nAfter updating and adding key:")
print(student)

student.update({"city": "Dhaka", "campus": "Ashulia"})
print("\nAfter update():", student)

removed_val = student.pop("semester")
print(f"Popped 'semester': {removed_val}")

print("\nKeys:")
for k in student.keys():
    print("-", k)

print("\nValues:")
for v in student.values():
    print("-", v)

print("\nKey-Value Pairs:")
for k, v in student.items():
    print(f"{k}: {v}")

num_squares = {x: x ** 2 for x in range(1, 6)}
print("\nDictionary Comprehension:", num_squares)