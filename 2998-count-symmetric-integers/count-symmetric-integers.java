class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {

            
            if (i < 100 && i % 11 == 0) {
                count++;
            }

            
            else if (i >= 1000 && i < 10000) {
                int left = (i / 1000) + (i / 100) % 10;
                int right = (i / 10) % 10 + (i % 10);

                if (left == right) {
                    count++;
                }
            }
        }
        return count;
    }
}