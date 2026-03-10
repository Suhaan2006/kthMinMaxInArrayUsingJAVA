class KthMinMax {
    
    public static void main(String[] args) {

        //creating the array
        int[] arr = { 7, 10, 4, 3, 20, 15 };

        //creating the Kth value
        int k = 3;

        /*
        Using an in-built sorting function
        It is an in-built tool to sort
        the array in ascending order
        (from smallest to largest) */
        Arrays.sort(arr);

        /*
        To find the Kth smallest element,
        we look at the [k - 1] element
        because counting in Java
        starts from 0,
        so the kth element is actually
        present at [k - 1]
        instead of k. */
        int kthSmallest = arr[k - 1];

        /*
        Since the array has been arranged in ascending order,
        to find the Kth largest element,
        we count K steps back from the end.
        (Kth largest element = Total length of ascending order arranged array - K)
        */
       int kthLargest = arr[arr.length - k];


       System.out.println("The" + k + "th minimum element is: " + kthSmallest);

       System.out.println("The" + k + "th maximum element is: " + kthLargest);

    }
}