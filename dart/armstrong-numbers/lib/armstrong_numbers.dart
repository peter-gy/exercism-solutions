import 'dart:math';

double log10(int n) => log(n) / log(10);

class ArmstrongNumbers {
  bool isArmstrongNumber(int number) {
    if (number < 0) {
      throw ArgumentError('Only natural number arguments are allowed.');
    }
    if (number == 0) {
      return true;
    }
    final num_digits = log10(number).floor() + 1;
    final digits = Iterable<int>.generate(num_digits)
        .map((k) => number ~/ pow(10, k) % 10)
        .toList();
    final sum =
        digits.fold<int>(0, (acc, curr) => acc + pow(curr, num_digits).floor());
    return sum == number;
  }
}
