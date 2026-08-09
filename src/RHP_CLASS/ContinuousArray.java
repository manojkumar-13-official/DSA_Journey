// Leetcode 525 continuous Array

import java.util.*;
class ContinuousArray{
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     int result = solve(arr);
    //     System.out.println(result);
    // }
    // public static int solve(int[] arr){

    //     int mLen = 0;
    //     int curr = 0;
    //     Map<Integer,Integer> map = new LinkedHashMap<>();
    //     map.put(0,-1);
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0){
    //             curr+=1;
    //         }
    //         else if(arr[i]==1){
    //             curr-=1;
    //         }
    //         if(map.containsKey(curr)){
    //             int val = i-map.get(curr);
    //             mLen = Math.max(mLen,val);
    //         }else{
    //             map.put(curr,i);
    //         }
    //     }
    //     return mLen;
    // }

    /*{With String}*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int result = solve(s.toCharArray());
        System.out.println(result);
    }
    public static int solve(char[] arr){

        int mLen = 0;
        int curr = 0;
        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                curr+=1;
            }
            else if(arr[i]=='b'){
                curr-=1;
            }
            if(map.containsKey(curr)){
                int val = i-map.get(curr);
                mLen = Math.max(mLen,val);
            }else{
                map.put(curr,i);
            }
        }
        return mLen;
    }

}