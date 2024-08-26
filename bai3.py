class Vehicle:
    def __init__(self,make) -> None:
        self.make=make
    def description(self):
        return f'make:{self.make}'

class Car(Vehicle):
    def __init__(self, make, model) -> None:
        super().__init__(make)
        self.model=model
    def description(self):
        return super().description() + f'model:{self.model}'

class ElectricCar(Car):
    def __init__(self, make, model, battery_size) -> None:
        super().__init__(make, model)
        self.battery_size=battery_size
    def description(self):
        return super().description() + f'battery_size:{self.battery_size}'
n=ElectricCar('Vinfast','VF8',30)
print(n.description())
