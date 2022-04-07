def extract_digits(isbn):
    digits = [int(ch) for ch in isbn if ch.isnumeric()]
    if isbn[-1] == "X":
        digits.append(10)
    return digits


def get_isbn_sum(digits):
    return sum([digits[i] * (10 - i) for i in range(len(digits))])


def is_valid(isbn):
    if not isbn:
        return False
    digits = extract_digits(isbn)
    return len(digits) == 10 and get_isbn_sum(digits) % 11 == 0
