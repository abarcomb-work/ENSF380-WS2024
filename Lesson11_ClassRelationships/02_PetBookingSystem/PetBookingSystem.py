"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
class Client:
    def __init__(self, name, phone, address):
        self.name = name
        self.phone = phone
        self.address = address
        self.rewards_number = None
        self.rewards_points = 0

    def enroll_rewards(self, rewards_number):
        if self.rewards_number is None:
            self.rewards_number = rewards_number
            return True
        return False

    def update_points(self, points):
        self.rewards_points += points

    def get_name(self):
        return self.name

    def get_rewards_number(self):
        return self.rewards_number

    def get_rewards_points(self):
        return self.rewards_points

class Pet:
    def __init__(self, name, type, breed, color, owner):
        self.name = name
        self.type = type
        self.breed = breed
        self.color = color
        self.owner = owner
        self.vet = None
        self.vaccine_status = False
        self.care_instructions = None

    def set_vet(self, vet):
        self.vet = vet

    def get_vet(self):
        return self.vet

    def update_vaccine_status(self, status):
        self.vaccine_status = status

    def get_vaccine_status(self):
        return self.vaccine_status

    def set_care(self, med_list, med_instructions, food_instructions):
        self.care_instructions = {
            "med_list": med_list,
            "med_instructions": med_instructions,
            "food_instructions": food_instructions
        }

    def get_care_summary(self):
        summary = f"Medication List: {self.care_instructions['med_list']}\n" \
                  f"Medication Instructions: {self.care_instructions['med_instructions']}\n" \
                  f"Food Instructions: {self.care_instructions['food_instructions']}"
        return summary

class EmergVet:
    def __init__(self, name, phone):
        self.name = name
        self.phone = phone

    def get_name(self):
        return self.name

class Employee:
    def __init__(self, name, id_number, manager_id=None):
        self.name = name
        self.id_number = id_number
        self.manager_id = manager_id

    def get_name(self):
        return self.name

    def get_id_number(self):
        return self.id_number

class Booking:
    def __init__(self, pet, employee, start_date, end_date):
        self.pet = pet
        self.employee = employee
        self.start_date = start_date
        self.end_date = end_date

class ReportCard:
    def __init__(self, booking):
        self.booking = booking

    def print_report(self):
        return f"Report Card for {self.booking.pet.name}: TODO"

def main():
    owner1 = Client("Ellie May", "403-230-9902", "65 Cedarwood Cir NW")
    print(owner1.get_name())
    print(owner1.get_rewards_number())
    print("First attempt at enrolling in rewards a success?")
    print(owner1.enroll_rewards("9809Z"))
    print("Second attempt at enrolling in rewards a success?")
    print(owner1.enroll_rewards("2314579"))
    print(owner1.get_rewards_number())
    print(owner1.get_rewards_points())
    owner1.update_points(100)
    print(owner1.get_rewards_points())

    print()

    my_pet = Pet("Shadow", "Dog", "Golden Retriever", "Golden yellow", owner1)
    vet = EmergVet("Dr. Louise Hesco", "587-650-9988")
    print(my_pet.name)
    my_pet.set_vet(vet)
    print(my_pet.get_vet().get_name())
    my_pet.update_vaccine_status(True)
    print(my_pet.get_vaccine_status())

    print()

    med_list = ["NexGard", "Interceptor"]
    med_instructions = "Give NexGard on Monday and Interceptor on Friday."
    food_instructions = "1 cup of provided food twice daily."
    my_pet.set_care(med_list, med_instructions, food_instructions)
    print(my_pet.get_care_summary())

    print()

    employee1 = Employee("Aaron Woods", "9882")
    vacation = Booking(my_pet, employee1, "01-26-2022", "02-05-2022")
    good_dog = ReportCard(vacation)
    print(good_dog.print_report())

    print("End of example output.")

if __name__ == "__main__":
    main()
