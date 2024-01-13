"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
def add(one, two):
    return one + two

def subtract(one, two):
    return one - two

def multiply(one, two):
    return one * two

def divide(one, two):
    if two == 0:
        return 0
    return one / two

def main():
    one = 9.0
    two = 0.1
    print("Add:", add(one, two))
    print("Subtract:", subtract(one, two))
    print("Multiply:", multiply(one, two))
    print("Divide:", divide(one, two))

if __name__ == "__main__":
    main()
