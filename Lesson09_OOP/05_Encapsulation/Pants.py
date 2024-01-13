"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
from clothing import Clothing
class Pants:
    def __init__(self, colour, material, waist, leg):
        self.fabric = Clothing(colour, material)
        self.waist_size = waist
        self.leg_size = leg

    def get_material(self):
        return self.fabric.get_material()

    def get_colour(self):
        return self.fabric.get_colour()

    def get_colour_id(self):
        return self.fabric.get_colour_id()

    def get_waist_size(self):
        return self.waist_size

    def get_leg_size(self):
        return self.leg_size

    def set_material(self, material):
        self.fabric.set_material(material)

    def set_colour(self, colour):
        self.fabric.set_colour(colour)

    def set_waist_size(self, waist):
        self.waist_size = waist

    def set_leg_size(self, leg):
        self.leg_size = leg
if __name__ == "__main__":
    my_pants = Pants("black", "denim", 34, 32)
    print(f"Pants Colour: {my_pants.get_colour()}, Material: {my_pants.get_material()}, Waist: {my_pants.get_waist_size()}, Leg: {my_pants.get_leg_size()}")
