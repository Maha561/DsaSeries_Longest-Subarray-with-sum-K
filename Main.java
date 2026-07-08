

public class Main {
    public static void main(String[] args) {


        int[] arr = {2, 1, 3, 2, 4, 1};

        int k = 6;

        int length =0 ;

        int MaxLength = 0;

        int startIndex = -1 ;

        int endIndex = -1;


        for(int i =0; i<arr.length;i++){

            int sum =0;

            for(int j = i;j<arr.length;j++){

                sum = sum +arr[j];

                if(sum==k){

                    length = j-i+1;

                    if(length>MaxLength){

                        MaxLength = length;
                        startIndex = i;
                         endIndex = j;


                    }
                }
            }
        }

        if(startIndex!=-1){

            System.out.println("Longest Length = " + MaxLength);

            for(int i = startIndex;i<=endIndex;i++){

                System.out.print(arr[i] + " ");
            }
        }
        else{

            System.out.println("No subarray found with sum = " + k);
        }






    }
}

/*
TC : O(n^2)
sc: O(1)

this solution is applicable for the array containing postive , negative and zero elements and if it does not contain the sumarray of k
 */

