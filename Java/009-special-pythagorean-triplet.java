/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
class PythagoreanTripletProduct {

    void getPythagoreanTripletProduct(int sum) {
        int a,b,c;
        for (a = 1; a < sum/3; a++) {
            for (b = a + 1; b < sum/2; b++) {
                // a + b + c = sum
                c = sum - b - a;
                // check if a^2 + b^2 = c^2
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.println("The Pythagorean triple is " + a + ", " + b + ", " + c + " and the sum is " + sum);
                    System.out.println("The product abc is: " + (a*b*c));
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        PythagoreanTripletProduct product = new PythagoreanTripletProduct();
        product.getPythagoreanTripletProduct(1000);
    }
}
