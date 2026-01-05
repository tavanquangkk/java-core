package  org.example;

import java.util.Arrays;

public class Main  {

    public static void main(String[] args) {
//        // mang mot chieu
//        int[] arrA;
//        String[] arrB = new String[3];
//        arrA = new int[]{1,2,3,4,5};
//        arrB = new String[]{"A","B","C","D"};
//        System.out.println("------- ARRAY A -------");
//        for(int i : arrA){
//            System.out.println(i);
//        }
//
//        System.out.println("------- ARRAY B -------");
//        for(String i : arrB){
//            System.out.println(i);
//        }


//        // mang hai chieu
//        int [][] arrD = new int[3][3]; // x,y
//        arrD[0][0]=1;
//        arrD[0][1]=2;
//        arrD[0][2]=3;
//        arrD[1][0]=4;
//        arrD[1][1]=5;
//        arrD[1][2]=6;
//        arrD[2][0]=7;
//        arrD[2][1]=8;
//        arrD[2][2]=9;
//
//        for (int i =0;i< 3; i ++){
//            for (int j=0; j<3;j++){
//                System.out.println(arrD[i][j]);
//
//            }
//        }
        // mang rang cua
//        int[][] jaggerArray = new int[3][];
//        jaggerArray[0] = new int[3];
//        jaggerArray[1] = new int[5];
//        jaggerArray[2] = new int[2];
//
//        int count = 0;
//        for(int i = 0; i<jaggerArray.length;i ++){
//            for(int j=0;j<jaggerArray[i].length;j++){
//               jaggerArray[i][j] = count ++;
//            }
//        }
//
//        for(int i = 0; i<jaggerArray.length;i ++){
//            for(int j=0;j<jaggerArray[i].length;j++){
//                System.out.print(jaggerArray[i][j]+" ");
//            }
//            System.out.println();
//        }

        //  clone array
//        int [] originalArr = {1,2,3,4,5};
//        int[] manualCopy = originalArr;
//
//        // clone mang
//        int [] clonedArr = originalArr.clone();
//        System.out.println("Original array:");
//        for(int i : originalArr){
//            System.out.print(i + " ");
//        }
//        System.out.println("Cloned array:");
//        for(int i : clonedArr){
//            System.out.print(i + " ");
//        }
//
//        // modified arr item
//        originalArr[0] = 100;
//        System.out.println("Original array:");
//        for(int i : originalArr){
//            System.out.print(i + " ");
//        }
//        System.out.println("Cloned array:");
//        for(int i : clonedArr){
//            System.out.print(i + " ");
//        }
//
//        System.out.println("Cloned manual array:");
//        for(int i : manualCopy){
//            System.out.print(i + " ");
//        }

        // clone mang da chieu

        int[][] originalArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // deep copy
        int[][] clonedArray = new int[originalArray.length][];
        for(int i = 0; i < originalArray.length; i++){
            clonedArray[i] = originalArray[i].clone();
        }
        // clone mang
//        int [][] clonedArray = originalArray.clone();

        System.out.println("mang goc 1");
        for(int[] row : originalArray){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        originalArray[0][0] = 199;

        System.out.println("mang goc 2");
        for(int[] row : originalArray){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("mang clone");
        for(int[] row : clonedArray){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }


    }
}