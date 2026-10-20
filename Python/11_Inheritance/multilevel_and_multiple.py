class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self):
        print(f"My name is {self.name} and I am {self.age} years old.")

class Student(Person):
    def __init__(self, name, age, student_id):
        super().__init__(name, age)
        self.student_id = student_id

    def study(self):
        print(f"{self.name} (ID: {self.student_id}) is studying.")

class GraduateResearchAssistant(Student):
    def __init__(self, name, age, student_id, lab_name, stipend):
        super().__init__(name, age, student_id)
        self.lab_name = lab_name
        self.stipend = stipend

    def conduct_research(self):
        print(f"{self.name} is researching in {self.lab_name} with stipend ${self.stipend}.")

class Swimmer:
    def swim(self):
        print("Swimming in the pool.")

class Runner:
    def run(self):
        print("Running on the track.")

class Triathlete(Swimmer, Runner):
    def compete(self):
        print("Competing in triathlon:")
        self.swim()
        self.run()

if __name__ == "__main__":
    gra = GraduateResearchAssistant("Hasan", 25, "191-15-999", "AI Research Lab", 2000)
    gra.introduce()
    gra.study()
    gra.conduct_research()

    print("\n--- Multiple Inheritance Demonstration ---")
    athlete = Triathlete()
    athlete.compete()
    print("Method Resolution Order (MRO):", [cls.__name__ for cls in Triathlete.__mro__])