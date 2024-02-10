"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
from abc import ABC, abstractmethod

class Animal(ABC):
    def eat(self):
        print("Method eat is supplied by Animal")

class Real(Animal, ABC):
    def is_real(self):
        print("Method isReal is supplied by Real")

class Swimmer(Real, ABC):
    def swim(self):
        print("Method swim is supplied by Swimmer")

    @abstractmethod
    def breathe(self):
        pass

class Trilobite(Swimmer):
    def is_extinct(self):
        print("Method isExtinct is supplied by Trilobite")

    def breathe(self):
        print("Method breathe is supplied by Trilobite")

def main():
    my_trilobite = Trilobite()
    my_trilobite.swim()
    my_trilobite.eat()
    my_trilobite.is_extinct()
    my_trilobite.is_real()
    my_trilobite.breathe()

    # The following code would raise a TypeError as Swimmer is an abstract class
    # my_swimmer = Swimmer()
    # my_swimmer.swim()

if __name__ == "__main__":
    main()
