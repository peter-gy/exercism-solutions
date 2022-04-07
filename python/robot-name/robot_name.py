import random
from string import ascii_uppercase
from datetime import datetime

def generate_random_name():
    random.seed(datetime.now())
    letters = [ascii_uppercase[random.randint(0, len(ascii_uppercase) - 1)] for _ in range(2)]
    numbers = [str(random.randint(0, 9)) for _ in range(3)]
    return ''.join(letters + numbers)

class Robot:

    def __init__(self):
        self.name = generate_random_name()

    def reset(self):
        self.name = generate_random_name()