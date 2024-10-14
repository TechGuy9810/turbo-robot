public class MooresVotingAlgorithm {

    // Function to find the candidate for the majority element
    public static int findCandidate(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        // Step 1: Find the candidate
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        return candidate;
    }

    // Function to check if the candidate is actually the majority element
    public static boolean isMajority(int[] arr, int candidate) {
        int count = 0;

        // Count occurrences of the candidate in the array
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return count > arr.length / 2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        // Step 1: Find the candidate
        int candidate = findCandidate(arr);

        // Step 2: Verify if the candidate is actually the majority element
        if (isMajority(arr, candidate)) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element found");
        }
    }
}
