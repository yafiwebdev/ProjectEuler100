main() {
  int sum = sumOfAllMultiplesOfThreeOrFive(1000);
  print(sum);
}

/// Iterates through all the number up to the given max value (exclusively) and
/// verifies if the numbers are divisible by either five or three and if so it
/// adds it to the overall sum
int sumOfAllMultiplesOfThreeOrFive(int max) {
  int sum = 0;
  for (var number = 1; number < max; number++) {
    if (_isDivisibleByFive(number) || _isDivisibleByThree(number)) {
      sum += number;
    }
  }
  return sum;
}

/// Verifies if the given number is divisible by five
bool _isDivisibleByFive(final int number) {
  final lastDigit = (number % 10);
  return lastDigit == 0 || lastDigit == 5;
}

/// Verifies if the given number is divisible by three
bool _isDivisibleByThree(int number) {
  return number % 3 == 0;
}
