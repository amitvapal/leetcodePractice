public class highestAltitude {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        highestAltitude solution = new highestAltitude();
        
        // Example 1
        System.out.println(solution.largestAltitude(new int[]{-5, 1, 5, 0, -7})); // Expected: 1
        
        // Example 2
        System.out.println(solution.largestAltitude(new int[]{4, -3, 2, -1, -2})); // Expected: 4
        
        // Example 3
        System.out.println(solution.largestAltitude(new int[]{2, 2, -3, -1, 2, 1, -5})); // Expected: 4
    }
}
