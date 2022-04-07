def reverse(text):
    return '' if text == '' else reverse(text[1:]) + text[0]
