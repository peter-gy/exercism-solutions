def color_code(color):
    return colors().index(color)


def colors():
    return ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"]


def value(colors):
    return 10*color_code(colors[0]) + color_code(colors[1])
