class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int f) {
        int n = flowerbed.length;
        
        for (int i = 0; i < n; i++) {
            if (f == 0) return true;  // If no more flowers need to be placed, return true
            
            if (flowerbed[i] == 0) {
                // Check if the current spot is empty and the adjacent spots are empty or boundaries
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == n - 1) || (flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;  // Place a flower here
                    f--;  // Decrease the number of flowers to be placed
                    i++;  // Skip the next spot as we cannot place a flower adjacent to this one
                }
            }
        }
        return f == 0;
    }
}
