class EmployeeSalary:
    def __init__(self, name, basic_salary):
        self.name = name
        self._basic_salary = None
        self.basic_salary = basic_salary

    @property
    def basic_salary(self):
        return self._basic_salary

    @basic_salary.setter
    def basic_salary(self, value):
        if value < 0:
            raise ValueError("Salary cannot be negative.")
        self._basic_salary = value

    @property
    def annual_salary(self):
        return self._basic_salary * 12

    @basic_salary.deleter
    def basic_salary(self):
        print("Resetting salary to zero.")
        self._basic_salary = 0

if __name__ == "__main__":
    emp = EmployeeSalary("Sumon", 45000)

    print("Employee:", emp.name)
    print("Monthly Salary:", emp.basic_salary)
    print("Annual Salary:", emp.annual_salary)

    emp.basic_salary = 50000
    print("Updated Monthly Salary:", emp.basic_salary)
    print("Updated Annual Salary:", emp.annual_salary)

    try:
        emp.basic_salary = -5000
    except ValueError as e:
        print("Validation caught:", e)

    del emp.basic_salary
    print("Salary after deletion:", emp.basic_salary)