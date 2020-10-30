class Solution {
    static void main(String[] args) {
        def sum = 0
        for(int i = 0;i<1000;i++) {
            if((i % 3 == 0 || i % 5 == 0)) sum+= i
        }
        println sum
    }
}
