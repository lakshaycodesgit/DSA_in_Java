package com.company;

public class wealthleetcodeques {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},
                            {3,2,3}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int large = 0;
        for(int j=0;j< accounts.length;j++){
            int sum =0;
            for(int i = 0;i < accounts[0].length;i++){

                sum += accounts[j][i];


            }
            if(sum>large){
                large=sum;

            }
        }

        return large;

    }
}
