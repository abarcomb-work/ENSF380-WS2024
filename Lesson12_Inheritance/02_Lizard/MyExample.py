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

class Lizard(Reptile):
    def __init__(self, scales, age, tail_length=0, tongue_length=0):
        super().__init__(age, scales)
        self.tail_length = tail_length
        self.tongue_length = tongue_length

    def get_tail_length(self):
        return self.tail_length

    def set_tail_length(self, tail_length):
        self.tail_length = tail_length

    def get_tongue_length(self):
        return self.tongue_length

    def set_tongue_length(self, tongue_length):
        self.tongue_length = tongue_length

    def run(self):
        print("🦎")

def main():
    chameleon = Lizard("multi-hued", 2)
    gecko = Lizard("green", 1, 3, 1)

    print(f"Chameleons are {chameleon.get_scales()} and this one is {chameleon.get_age()} years old. Watch it run!")
    chameleon.run()

    print(f"This gecko is {gecko.get_scales()} and has a tail {gecko.get_tail_length()} centimeters long, and a tongue of {gecko.get_tongue_length()} centimeter.")
    gecko.eat()

if __name__ == "__main__":
    main()
