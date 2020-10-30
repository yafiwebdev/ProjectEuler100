#include <iostream>

int calc_collatz(int initial);

int main() {
    int longest_sequence = 0;
    int longest_init = 0;
    for (int collatz_init = 2; collatz_init <= 1000000; collatz_init++) {
        int sequence_length = calc_collatz(collatz_init);
        if (sequence_length > longest_sequence) {
            longest_sequence = sequence_length;
            longest_init = collatz_init;
        }
    }
    std::cout << "longest sequence=" << longest_sequence
              << " for n=" << longest_init << std::endl;
    // longest sequence=525 for n=837799
    return 0;
}

int calc_collatz(int initial) {
    long collatz{initial};
    int it_counter{1};

    while (collatz > 1) {
        if ((collatz % 2) == 0) {
            collatz = collatz / 2;
        } else {
            collatz = (3 * collatz) + 1;
        }
        it_counter++;
    }
    return it_counter;
}
