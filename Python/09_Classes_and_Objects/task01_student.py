class Student:
    university = "Daffodil International University"

    def __init__(self, student_id, name, department, cgpa):
        self.student_id = student_id
        self.name = name
        self.department = department
        self.cgpa = cgpa

    def display_info(self):
        print(f"ID: {self.student_id}")
        print(f"Name: {self.name}")
        print(f"Department: {self.department}")
        print(f"CGPA: {self.cgpa:.2f}")
        print(f"University: {Student.university}")
        print("-" * 30)

    def is_honor_student(self):
        return self.cgpa >= 3.75

if __name__ == "__main__":
    student1 = Student(101, "Arman Khan", "CSE", 3.82)
    student2 = Student(102, "Nabila Sultana", "SWE", 3.65)

    student1.display_info()
    student2.display_info()

    print(f"Is {student1.name} an honor student? {student1.is_honor_student()}")
    print(f"Is {student2.name} an honor student? {student2.is_honor_student()}")