"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
from teabag import Teabag
class TeaPot:
    def __init__(self, tea_type="samdayeon", tea_origin="Korea", tea_brand="unknown"):
        self.bag = Teabag(tea_type, tea_origin, tea_brand)
        self.water = False
        self.teabag_in = True

    def print_water_status(self):
        if self.water:
            print("Water has been added to the teapot.")
        else:
            print("Water has not been added to the teapot.")

    def print_teabag_status(self):
        if not self.teabag_in:
            print("The teabag has been removed.")
        else:
            print("The teabag is still in the teapot.")

    def print_teabag_details(self):
        if not self.teabag_in:
            print("The teabag has been removed and thrown away.")
        else:
            print(f"We are brewing {self.bag.get_tea_type()}, from {self.bag.get_tea_origin()}, by {self.bag.get_tea_brand()}.")

    def remove_teabag(self):
        self.teabag_in = False

    def add_water(self):
        self.water = True
