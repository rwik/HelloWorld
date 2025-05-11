package org.example;

public class HourGlassSum {
    public int sum(int[][] arr){
        int sum = Integer.MIN_VALUE ;

        if (arr == null || arr.length != 6 || arr[0].length != 6 ){
            throw new IllegalArgumentException("Input musrt be 6x6");
        }

        for (int i=0; i<=3; i++){
            for(int j=0;j<=3;j++){
                int cs = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] +
                         arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                // Update maxSum if the current sum is greater
                if (cs > sum)
                    sum = cs;

            }
        }




        return sum;


    }
    public static void main (String[] args){
        int[][] m =  {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        HourGlassSum hg  =  new HourGlassSum();
        System.out.println("Hour glass max sum = "+hg.sum(m));

    }
}
