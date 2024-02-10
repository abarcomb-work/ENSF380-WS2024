"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
class Animal:
    def __init__(self, age=0):
        self.age = age

    def get_age(self):
        return self.age

    def set_age(self, age):
        self.age = age

    def eat(self):
        print("Nom nom nom")

class Reptile(Animal):
    def __init__(self, age, scales=''):
        super().__init__(age)
        self.scales = scales

    def get_scales(self):
        return self.scales

    def set_scales(self, scales):
        self.scales = scales

def main():
    chameleon = Reptile(2, "multi-hued")
    gecko = Reptile(1)

    print(f"Chameleons are {chameleon.get_scales()} and this one is {chameleon.get_age()} years old.")
    print(f"This gecko is {gecko.get_age()} years old and is enjoying a meal.")
    gecko.eat()

    horse = Animal(7)
    print(f"Our horse is {horse.get_age()} years old.")

if __name__ == "__main__":
    main()
