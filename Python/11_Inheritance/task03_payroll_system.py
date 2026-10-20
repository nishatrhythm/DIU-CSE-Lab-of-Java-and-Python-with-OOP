class Employee:
    def __init__(self, emp_id, name):
        self.emp_id = emp_id
        self.name = name

    def calculate_pay(self):
        raise NotImplementedError("Subclass must implement calculate_pay()")

    def print_paystub(self):
        print(f"ID: {self.emp_id} | Name: {self.name} | Pay: ${self.calculate_pay():.2f}")

class SalariedEmployee(Employee):
    def __init__(self, emp_id, name, weekly_salary):
        super().__init__(emp_id, name)
        self.weekly_salary = weekly_salary

    def calculate_pay(self):
        return self.weekly_salary

class HourlyEmployee(Employee):
    def __init__(self, emp_id, name, hours_worked, hourly_rate):
        super().__init__(emp_id, name)
        self.hours_worked = hours_worked
        self.hourly_rate = hourly_rate

    def calculate_pay(self):
        if self.hours_worked <= 40:
            return self.hours_worked * self.hourly_rate
        overtime = self.hours_worked - 40
        return (40 * self.hourly_rate) + (overtime * self.hourly_rate * 1.5)

class CommissionEmployee(SalariedEmployee):
    def __init__(self, emp_id, name, weekly_salary, sales_amount, commission_rate):
        super().__init__(emp_id, name, weekly_salary)
        self.sales_amount = sales_amount
        self.commission_rate = commission_rate

    def calculate_pay(self):
        base_pay = super().calculate_pay()
        commission = self.sales_amount * self.commission_rate
        return base_pay + commission

if __name__ == "__main__":
    staff = [
        SalariedEmployee("E101", "Mahmud", 1200.0),
        HourlyEmployee("E102", "Anis", 45, 25.0),
        CommissionEmployee("E103", "Zubair", 800.0, 15000.0, 0.05)
    ]

    print("===== WEEKLY PAYROLL REPORT =====")
    for emp in staff:
        emp.print_paystub()