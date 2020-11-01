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
    if (number % 5 == 0 || number % 3 == 0) {
      sum += number;
    }
  }
  return sum;
}
