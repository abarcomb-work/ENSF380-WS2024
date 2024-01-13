"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
from teapot import TeaPot

def main():
    print("\nBrewing a new pot of tea...")
    teapot = TeaPot()
    teapot.print_water_status()
    teapot.add_water()
    teapot.print_water_status()
    teapot.print_teabag_status()
    teapot.print_teabag_details()
    teapot.remove_teabag()
    teapot.print_teabag_status()
    teapot.print_teabag_details()

    print("\nBrewing a new pot of tea...")
    teapot = TeaPot("lapsang souchong")
    teapot.print_water_status()
    teapot.add_water()
    teapot.print_water_status()
    teapot.print_teabag_status()
    teapot.print_teabag_details()
    teapot.remove_teabag()
    teapot.print_teabag_status()
    teapot.print_teabag_details()

    print("\nBrewing a new pot of tea...")
    teapot = TeaPot("Nilgiri silver-tip", "India")
    teapot.print_water_status()
    teapot.add_water()
    teapot.print_water_status()
    teapot.print_teabag_status()
    teapot.print_teabag_details()
    teapot.remove_teabag()
    teapot.print_teabag_status()
    teapot.print_teabag_details()

    print("\nBrewing a new pot of tea...")
    teapot = TeaPot("hand-rolled black", "Georgia", "Teamania")
    teapot.print_water_status()
    teapot.add_water()
    teapot.print_water_status()
    teapot.print_teabag_status()
    teapot.print_teabag_details()
    teapot.remove_teabag()
    teapot.print_teabag_status()
    teapot.print_teabag_details()

if __name__ == "__main__":
    main()
