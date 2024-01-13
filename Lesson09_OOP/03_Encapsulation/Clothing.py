"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
class Clothing:
    def __init__(self, colour, material):
        self.colour = colour
        self.material = material

    # Getters and setters
    def get_colour(self):
        return self.colour

    def set_colour(self, colour):
        self.colour = colour

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

# Main block
if __name__ == "__main__":
    garment = Clothing("black", "cotton")
    garment.set_colour("yellow")
    garment.set_material("bamboo")
    print(f"Colour: {garment.get_colour()}, Material: {garment.get_material()}")
