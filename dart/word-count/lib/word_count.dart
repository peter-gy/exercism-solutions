class WordCount {
  Map<String, int> countWords(String sentence) {
    var exp = new RegExp(r"(\w+('\w+)?)");
    return exp
        .allMatches(sentence)
        .map((m) => m.group(0)!.toLowerCase())
        .fold(new Map<String, int>(), (Map<String, int> counts, String word) {
      if (counts.containsKey(word)) {
        counts[word] = counts[word]! + 1;
      } else {
        counts[word] = 1;
      }
      return counts;
    });
  }
}
