from collections import namedtuple

Point = namedtuple("Point", ["x", "y"])
Student = namedtuple("Student", ["id", "name", "department", "cgpa"])

p1 = Point(10, 20)
print("Point 1:", p1)
print("X coordinate:", p1.x)
print("Y coordinate:", p1.y)
print("Access by index p1[0]:", p1[0])

student1 = Student(101, "Sabrina", "CSE", 3.88)
print("\nStudent namedtuple:", student1)
print(f"Name: {student1.name}, Department: {student1.department}, CGPA: {student1.cgpa}")

updated_student = student1._replace(cgpa=3.95)
print("After _replace(cgpa=3.95):", updated_student)

student_dict = student1._asdict()
print("Converted to dictionary:", student_dict)
print("Namedtuple fields:", Student._fields)