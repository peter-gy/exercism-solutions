from math import log10

def is_armstrong_number(number):
    if (number < 0): raise Exception('Only natural number arguments are allowed.')
    if number == 0: return True
    num_digits = int(log10(number)) + 1
    return number == sum([(number // 10**k % 10)**num_digits for k in range(num_digits)])
