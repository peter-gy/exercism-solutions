const letterValueMap = {
  "AEIOULNRST": 1,
  "DG": 2,
  "BCMP": 3,
  "FHVWY": 4,
  "K": 5,
  "JX": 8,
  "QZ": 10
};

int score(String word) {
  return word
      .toUpperCase()
      .split('')
      .map<int>(_letterValue)
      .fold<int>(0, _sumInts);
}

int _sumInts(int a, int b) => a + b;

int _letterValue(String letter) => letterValueMap.entries
    .firstWhere((entry) => entry.key.contains(letter))
    .value;
