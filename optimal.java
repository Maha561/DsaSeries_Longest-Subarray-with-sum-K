

public class optimal {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 5, 3, 2};
        int k = 9;

       // two pointer

        int left =0;
        int right = 0;

        int startIndex = -1;
        int endIndex = -1;

        int length = 0;
        int MaxLength = 0;

        int sum =0;

        while(right<arr.length){

            sum = sum +arr[right];

            while(sum>k){

                sum = sum - arr[left];
                left++;

            }
            if(sum==k){

                length = right-left+1;

                if(length>MaxLength){

                    MaxLength = length;
                    startIndex = left;
                    endIndex = right;


                }


            }
           /*
           if(sum > k){
           right++;
           }

           /// dont write like this loop will because beconme infinite
            */

            right++;



        }




        System.out.println("Longest Length = " + MaxLength);

        if(startIndex!=-1){

            for(int i = startIndex;i<=endIndex;i++){

                System.out.print(arr[i] + " ");
            }
        }

        else{

            System.out.println("subarray not found ");
        }











    }
}

/*
TC : O(n)
sc: O(1)

this solution is applicable for the array containing postive ,  and zero elements 

this solution wont work foe negative elements
 */
