package medium;

import java.util.PriorityQueue;

public class SortColorsPriorityMap {

    public static void main(String[] args){

        sortColors();
    }

    public static void sortColors(){
        int[] input = new int[] {2,0,2,1,1,0};
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0;i<input.length;i++){
        queue.add(input[i]);
        }
        int i  = 0 ;
        while(!queue.isEmpty()){
            input[i] = queue.poll();
            i++;
        }
    }
}
