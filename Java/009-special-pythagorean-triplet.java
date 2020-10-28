/*
To find the product a*b*c such that a2 + b2 = c2 and a + b + c = 1000
*/
class Solution {
    public static void main(String[] args) {
        int a,b,c,s;
        s = 1000; 
        for (a = 1; a < s/3; a++) {
            for (b = a + 1; b < s/2; b++) {
                c = s - b - a;
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.println("The Pythagorean triple is " + a + ", " + b + ", " + c + " and the sum is " + s);
                    System.out.println("The product abc is: " + (a*b*c));
                    break;
                }
            }
        }
    }
}