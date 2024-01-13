"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
class Clothing:
    COLOURS = ["black", "white", "yellow"]

    def __init__(self, colour, material):
        if isinstance(colour, int):
            self.set_colour(colour)
        elif isinstance(colour, str):
            self.set_colour(colour)
        self.material = material

    def get_colour(self):
        return self.COLOURS[self.colour]

    def get_colour_id(self):
        return self.colour

    def get_material(self):
        return self.material

    def set_colour(self, colour):
        if isinstance(colour, int):
            self.colour = colour if colour < len(self.COLOURS) else 0
        elif isinstance(colour, str):
            try:
                self.colour = self.COLOURS.index(colour)
            except ValueError:
                self.colour = 0

    def set_material(self, material):
        self.material = material
