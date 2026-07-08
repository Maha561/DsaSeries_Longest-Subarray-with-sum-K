

public class Brute {
    public static void main(String[] args) {


        int[] arr = {2, 1, 3, 2, 4, 1};
        int k = 6;

        int length = 0;

        int MaxLength = 0;

        int startIndex = -1;

        int endIndex = -1;

        for(int i =0;i<arr.length;i++){

            for(int j = i;j<arr.length;j++){

                int sum =0;

                for(int s =i;s<=j;s++){

                    sum = sum+arr[s];
                }

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
TC : O(n^3)
sc: O(1)

this solution is applicable for the array containing postive , negative and zero elements and if it does not contain the sumarray of k 
 */
