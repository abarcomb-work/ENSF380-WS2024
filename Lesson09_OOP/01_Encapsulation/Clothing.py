
"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""

class Clothing:
    def __init__(self, colour, material):
        self.colour = colour
        self.material = material

    @property
    def colour(self):
        return self._colour

    @colour.setter
    def colour(self, value):
        self._colour = value

    @property
    def material(self):
        return self._material

    @material.setter
    def material(self, value):
        self._material = value

# Example usage
if __name__ == "__main__":
    garment = Clothing("black", "cotton")
    print(f"Colour: {garment.colour}, Material: {garment.material}")
