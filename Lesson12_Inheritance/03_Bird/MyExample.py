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

class Bird(Animal):
    def __init__(self, age=0, wingspan=0):
        super().__init__(age)
        self.wingspan = wingspan

    def get_wingspan(self):
        return self.wingspan

    def set_wingspan(self, wingspan):
        self.wingspan = wingspan

    def eat(self):
        print("Peck, peck, peck!")

def main():
    cormorant = Bird(3, 50)
    chicken = Bird()
    chicken.set_wingspan(45)
    chicken.set_age(3)

    print(f"A cormorant is a bird with a {cormorant.get_wingspan()} centimeter wingspan.")
    print(f"A chicken is a bird with a {chicken.get_wingspan()} centimeter wingspan. They peck at food.")
    chicken.eat()

if __name__ == "__main__":
    main()
