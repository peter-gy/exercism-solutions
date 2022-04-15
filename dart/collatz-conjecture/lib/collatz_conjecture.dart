class CollatzConjecture {
  int steps(int target) {
    if (target <= 0) {
      throw ArgumentError.value(
        target,
        'target',
        'Only positive numbers are allowed',
      );
    }

    int steps = 0;
    while (target != 1) {
      if (target.isEven) {
        target ~/= 2;
      } else {
        target = 3 * target + 1;
      }
      steps++;
    }
    return steps;
  }
}
