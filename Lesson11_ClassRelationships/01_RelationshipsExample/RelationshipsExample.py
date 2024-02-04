"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
class Roof:
    def __init__(self, material, installation_year):
        self.material = material
        self.installation_year = installation_year
        print(f"Roof built with {material} in {installation_year}.")

class Deck:
    def __init__(self, material, area, installation_year):
        self.material = material
        self.area = area
        self.installation_year = installation_year
        print("New deck built!")

class Door:
    def __init__(self, material="wood", colour="white"):
        self.material = material
        self.colour = colour
        print(f"Door created: Material - {material}, Colour - {colour}")

class Kitchen:
    def __init__(self, area, num_seats, num_appliances):
        self.area = area
        self.num_seats = num_seats
        self.num_appliances = num_appliances

class Bathroom:
    def __init__(self, area, sink_type, tub=None):
        self.area = area
        self.sink_type = sink_type
        self.tub = tub

    def add_tub(self, new_tub):
        self.tub = new_tub
        print("Bathroom tub added.")

    def set_sink(self, sink_type):
        self.sink_type = sink_type
        print("Bathroom sink set.")

class Bathtub:
    def __init__(self, type, colour):
        self.type = type
        self.colour = colour
        print(f"Bathtub added: Type - {type}, Colour - {colour}")

class Tenant:
    def __init__(self, name, occupation, phone_number, house_contact=None):
        self.name = name
        self.occupation = occupation
        self.phone_number = phone_number
        self.house_contact = house_contact

class RentalAgreement:
    def __init__(self, start_date, end_date, monthly_cost, renters, residence):
        self.start_date = start_date
        self.end_date = end_date
        self.monthly_cost = monthly_cost
        self.renters = renters
        self.residence = residence

    def rental_summary(self):
        print(f"Rental Agreement Summary: Start Date - {self.start_date}, End Date - {self.end_date}, Monthly Cost - {self.monthly_cost}")
        for renter in self.renters:
            print(f"Renter: {renter.name}, Occupation: {renter.occupation}, Phone: {renter.phone_number}")

class RentalAgreementHardcopy:
    def print_agreement(self, agreement):
        print("Printing rental agreement hardcopy.")
        
class RentalAgreementHardcopy:
    def print_agreement(self, agreement):
        print("Printing rental agreement hardcopy.")
        print(f"Rental Agreement: {agreement.start_date} to {agreement.end_date}")
        print(f"Monthly Cost: {agreement.monthly_cost}")
        print(f"Residence: {agreement.residence.address}")
        for renter in agreement.renters:
            print(f"Renter: {renter.name}, Occupation: {renter.occupation}, Contact: {renter.phone_number}")
       


class House:
    def __init__(self, owner, address, roof_material, roof_installed, kitchen_area, kitchen_seats, num_appliances, bathroom_area, sink_type, front_door=None, back_door=None):
        self.owner = owner
        self.address = address
        self.roof = Roof(roof_material, roof_installed)
        self.kitchen = Kitchen(kitchen_area, kitchen_seats, num_appliances)
        self.bathroom = Bathroom(bathroom_area, sink_type)
        self.front_door = front_door if front_door else Door()
        self.back_door = back_door if back_door else Door()
        self.deck = None
        print(f"House built at {address} by {owner}.")

    def update_roof(self, roof_material, roof_installed):
        self.roof = Roof(roof_material, roof_installed)
        print("Roof updated.")

    def renovate_bathroom(self, sink_type, new_tub):
        self.bathroom.add_tub(new_tub)
        self.bathroom.set_sink(sink_type)
        print("Bathroom renovated.")

    def build_deck(self, material, area, installation_year):
        self.deck = Deck(material, area, installation_year)
        print("Deck built.")

    def replace_door(self, which_door, new_door):
        if which_door.lower() == "front":
            self.front_door = new_door
        elif which_door.lower() == "back":
            self.back_door = new_door
        print(f"{which_door.capitalize()} door replaced.")

def main():
    new_house = House("Pat Neil", "123 Main St. NW", "cedar", "2010", 10.0, 6, 3, 4.5, "inset")
    new_door = Door("metal", "green")
    new_tub = Bathtub("clawfoot", "blue")
    new_house.build_deck("wood", 37.5, "2021")
    new_house.renovate_bathroom("farmhouse", new_tub)
    new_house.update_roof("asphalt", "2021")
    new_house.replace_door("front", new_door)
    renter1 = Tenant("Jordan Upton", "engineer", "587-289-1111")
    renter2 = Tenant("Jamie Upton", "teacher", "403-787-2222", renter1)
    contract = RentalAgreement("January 2021", "June 2021", 2500.00, [renter1, renter2], new_house)
    contract.rental_summary()
    legal_copy = RentalAgreementHardcopy()
    legal_copy.print_agreement(contract)

if __name__ == "__main__":
    main()


