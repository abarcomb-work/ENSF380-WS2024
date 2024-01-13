"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
from clothing import Clothing
class Shirt:
    SLEEVETYPES = ["short", "three-quarter", "long"]

    def __init__(self, colour, material, sleeve):
        self.fabric = Clothing(colour, material)
        self.set_sleeve_type(sleeve)

    def get_material(self):
        return self.fabric.get_material()

    def get_colour(self):
        return self.fabric.get_colour()

    def get_colour_id(self):
        return self.fabric.get_colour_id()

    def get_sleeve_type(self):
        return self.SLEEVETYPES[self.sleeve_type]

    def set_material(self, material):
        self.fabric.set_material(material)

    def set_colour(self, colour):
        self.fabric.set_colour(colour)

    def set_sleeve_type(self, sleeve):
        self.sleeve_type = sleeve if sleeve < len(self.SLEEVETYPES) else 0
if __name__ == "__main__":
    my_shirt = Shirt("white", "cotton", 2)
    print(f"Shirt Colour: {my_shirt.get_colour()}, Material: {my_shirt.get_material()}, Sleeve: {my_shirt.get_sleeve_type()}")
