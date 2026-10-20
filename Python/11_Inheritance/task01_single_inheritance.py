class Animal:
    def __init__(self, name, species):
        self.name = name
        self.species = species

    def make_sound(self):
        return "Some generic sound"

    def describe(self):
        print(f"Name: {self.name}, Species: {self.species}, Sound: {self.make_sound()}")

class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name, species="Canine")
        self.breed = breed

    def make_sound(self):
        return "Woof Woof!"

    def fetch(self, item):
        print(f"{self.name} the {self.breed} fetched the {item}!")

if __name__ == "__main__":
    generic_animal = Animal("Creature", "Unknown")
    generic_animal.describe()

    pet = Dog("Rex", "Golden Retriever")
    pet.describe()
    pet.fetch("ball")