def find_anagrams(word, candidates):
    return [candidate for candidate in candidates if is_anagram(word, candidate)]


def is_anagram(word, candidate):
    lower_word = word.lower()
    lower_candidate = candidate.lower()
    if len(lower_word) != len(lower_candidate) or lower_word == lower_candidate:
        return False
    return create_character_count_dict(lower_word) == create_character_count_dict(lower_candidate)


def create_character_count_dict(string):
    return {ch: string.count(ch) for ch in string}
