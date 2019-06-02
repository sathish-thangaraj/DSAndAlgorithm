package medium;

public class IncreasingTripletSequence {

    public static void main(String[] args){
        int[] input = new int[] {5,4,6,3,6};
        System.out.println(findIncreasingTriplets(input));
    }

    public static boolean findIncreasingTriplets(int[] input){

        long minOne = Long.MAX_VALUE;
        long minTwo = Long.MAX_VALUE;
        long minThree = Long.MAX_VALUE;

        for(int i=0;i<input.length;i++){

            if(i==0){
                minOne = (long) input[i];
            }

            else if(i==1){
                if((long) input[i] > minOne) {
                    minTwo = Math.min(minTwo, (long) input[i]);
                }
                minOne = Math.min(minOne,(long) input[i]);
            }

            else{
                if((long) input[i] > minTwo){
                    minThree = Math.min(minThree,(long) input[i]);
                }
                if((long) input[i] > minOne) {
                    minTwo = Math.min(minTwo, (long) input[i]);
                }
                    minOne = Math.min(minOne,(long) input[i]);
            }
        }

        return minThree != Long.MAX_VALUE;
    }
}
