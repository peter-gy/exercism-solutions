from string import ascii_lowercase

def is_pangram(sentence):
    return all(character in sentence.lower() for character in ascii_lowercase)