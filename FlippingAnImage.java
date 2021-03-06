package com.jasleen.PracticeQuestions;
//https://leetcode.com/problems/flipping-an-image/
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        int[][] res=Solution(image);
        for(int i[]:res){
            for(int j:i)
                System.out.print(j+" ");
        }
    }
    public static int[][] Solution(int[][] image){

        for(int i=0;i<image.length;i++) {
            int start=0;
            int end=image[i].length-1;
            while (start <= end) {
                if (image[i][start] == image[i][end]) {
                    image[i][start] = 1 - image[i][start];
                    image[i][end] = image[i][start];
                }
                start++;
                end--;
            }
        }
        return image;
    }
}
