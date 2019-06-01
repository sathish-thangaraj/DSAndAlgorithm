package medium;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {

    public static void main(String[] args){
        int[][] input = new int[5][4];
        input[0][0] = 0 ;
        input[0][1] = 0 ;
        input[0][2] = 0 ;
        input[0][3] = 5 ;

        input[1][0] = 4 ;
        input[1][1] = 3 ;
        input[1][2] = 1 ;
        input[1][3] = 4 ;

        input[2][0] = 0 ;
        input[2][1] = 1 ;
        input[2][2] = 1 ;
        input[2][3] = 4 ;

        input[3][0] = 1 ;
        input[3][1] = 2 ;
        input[3][2] = 1 ;
        input[3][3] = 3 ;

        input[4][0] = 0 ;
        input[4][1] = 0 ;
        input[4][2] = 1 ;
        input[4][3] = 1 ;

        printArrays(input);
        List<Integer> zeroPositions = findZeroes(input);
        markZeroes(input,zeroPositions);
        printArrays(input);

    }

    public static void printArrays(int[][] input){
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                System.out.print(input[i][j]);
            }
            System.out.println();
        }
    }

    public static List findZeroes(int[][] input){
        List<Integer> output = new ArrayList<>();
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(input[i][j] == 0){
                    output.add(i);
                    output.add(j);
                    System.out.println("here it comes"+i+"j value"+j);
                }
            }
        }
        return output;
    }

    public static void markZeroes(int[][] input,List<Integer> positions){

        for(int i=0;i<positions.size();i=i+2){
            int row = positions.get(i);
            int column = positions.get(i+1);
            System.out.println("row" + row + "column"+column);
            // make rows zero
            while(column>=0) {
                input[row][column] = 0;
                column--;
            }

            column = positions.get(i+1);
            while ((column<input[row].length)){
                input[row][column] = 0 ;
                column++;
            }

            //make columns as zero
            column = positions.get(i+1);
            while(row>=0) {
                input[row][column] = 0;
                row--;
            }
            row = positions.get(i);
            while ((row<input.length)){
                input[row][column] = 0 ;
                row++;
            }
        }
    }

}
