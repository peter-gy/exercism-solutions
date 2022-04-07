def slices(series, length):
    if length <= 0 or length > len(series):
        raise ValueError("Invalid length")
    return [series[i:i+length] for i in range(len(series)) if i+length <= len(series)]
