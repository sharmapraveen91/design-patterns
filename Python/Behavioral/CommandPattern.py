class Command:
    def execute(self):
        pass

class Light:
    def turn_on(self):
        print("Light is ON")
    
    def turn_off(self):
        print("Light is OFF")

class LightOnCommand(Command):
    def __init__(self, light):
        self.light = light

    def execute(self):
        self.light.turn_on()

class LightOffCommand(Command):
    def __init__(self, light):
        self.light = light

    def execute(self):
        self.light.turn_off()

class RemoteControl:
    def set_command(self, command):
        self.command = command
    
    def press_button(self):
        self.command.execute()

# Usage
light = Light()
light_on = LightOnCommand(light)
light_off = LightOffCommand(light)

remote = RemoteControl()

remote.set_command(light_on)
remote.press_button()  # Output: Light is ON

remote.set_command(light_off)
remote.press_button()  # Output: Light is OFF
