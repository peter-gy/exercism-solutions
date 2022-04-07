def classify(number):
    if number <= 0:
        raise ValueError("invalid value")
    sum_of_factors = sum([i for i in range(1, number) if number % i == 0])
    return (
        "perfect"
        if sum_of_factors == number
        else "abundant"
        if sum_of_factors > number
        else "deficient"
    )
