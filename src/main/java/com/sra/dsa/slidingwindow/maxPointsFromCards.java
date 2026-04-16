package com.sra.dsa.slidingwindow;

public class maxPointsFromCards {
    public static void main(String[] args) {

    }

    private static int maxPointsFromCards(int[] cardPoints,int k){
        int length = cardPoints.length;
        int lSum = 0, rSum = 0;
        for(int i=0;i<k;i++){
            lSum += cardPoints[i];
        }
        int maxSum = lSum;
        int rightIndex = length - 1;
        if(k == length) return maxSum;
        while (k >=0){
            lSum -= cardPoints[k];
            rSum += cardPoints[rightIndex];
            maxSum = Math.max(maxSum, lSum + rSum);
            k--;
            rightIndex--;
        }
        return maxSum;
    }
}
