//                          7 3 1 6 7 1 7 6 5 3 1 3 3 0 6 2 4 9 1 9 2 . . . . .
// number series 0 to 4     |- - - -|
// number series 1 to 5       |- - - -|
// consider product of numbers 0 to 4 = X
// so product of numbers 1 to 5 = X * [5th num] / [0th num]
// this approach is used here; used special handling to avoid zero value
// this is the most efficient way to fix this issue

// we are processing numbers one by one
// so instead of using substring method we can get the char value directly and reduce 48 to get the int value from char

class LongestProduct {

    static final String S = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

    public static void main(String[] args) {
        // long start = System.currentTimeMillis();
        final int NUM_COUNT = 13;
        long largestProduct = 0;

        // STEP - 1
        // compute first product to start comparison
        long product = S.charAt(0) - 48;
        // loop starts with [1st num] because product is already initiated with [0th num].
        for (int i = 1; i < NUM_COUNT; i++) {
            product *= S.charAt(i) - 48;
        }
        // if first product is larger than largestProduct, it will be assigned as the largestProduct
        if (product > largestProduct) {
            largestProduct = product;
        }

        // STEP - 2
        // continue finding products by dividing and multiplying till the end of number series
        int newInt;
        int skipUntil = NUM_COUNT;
        for (int i = NUM_COUNT; i < S.length(); i++) {
            newInt = S.charAt(i) - 48;
            // region handle zero value numbers
            // if there is a zero within the considered number set no need to compute the product
            if (newInt == 0) {
                skipUntil = i + NUM_COUNT;
            }
            if (i < skipUntil) {
                // we have to build the product from numbers which are after number zero
                product *= newInt;
                if (product == 0) {
                    product = newInt;
                }
                continue;
            }
            // endregion

            // used Math.max to avoid dividing by zero
            product = product * newInt / Math.max((S.charAt(i - NUM_COUNT) - 48), 1);
            if (product > largestProduct) {
                largestProduct = product;
            }
        }
        // System.out.println(System.currentTimeMillis() - start);
        System.out.println(largestProduct);
    }

}
