public class Contains {

    public boolean arrayContains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true; // Found the target value
            }
        }
        return false; // Target not found in the array
    }
}
