"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
class CalculatorOO:
    def __init__(self, one, two):
        self.one = one
        self.two = two

    def add(self):
        return self.one + self.two

    def subtract(self):
        return self.one - self.two

    def multiply(self):
        return self.one * self.two

    def divide(self):
        if self.two == 0:
            return 0
        return self.one / self.two

def main():
    one = 9.0
    two = 0.1
    calculator = CalculatorOO(one, two)
    print("Add:", calculator.add())
    print("Subtract:", calculator.subtract())
    print("Multiply:", calculator.multiply())
    print("Divide:", calculator.divide())

if __name__ == "__main__":
    main()
