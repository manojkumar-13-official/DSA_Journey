package Recursion;

import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        ArrayList<ArrayList<Integer>> ans = findCombinationSum(arr,target);
        for(ArrayList<Integer> list:ans){
            System.out.println(list);
        }
    }

    private static ArrayList<ArrayList<Integer>> findCombinationSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findCombination(0,arr,target,ans,new ArrayList<Integer>());
        return ans;
    }

    private static void findCombination(int idx, int[] arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr) {
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(curr));
                System.out.println("Found the combination : "+curr);
            }
            return;
        }

        if(arr[idx]<=target){
            curr.add(arr[idx]);
            findCombination(idx,arr,target-arr[idx],ans,curr);
            System.out.println("Runs After the recursion : "+curr);
            curr.removeLast();
        }
        findCombination(idx+1,arr,target,ans,curr);
    }
}

// Working Procedure


//Runs After the recursion : [2, 2, 2]
//Found the combination : [2, 2, 3]
//Runs After the recursion : [2, 2, 3]
//Runs After the recursion : [2, 2]
//Runs After the recursion : [2, 3]
//Runs After the recursion : [2]
//Runs After the recursion : [3, 3]
//Runs After the recursion : [3]
//Runs After the recursion : [6]
//Found the combination : [7]
//Runs After the recursion : [7]
//
//        "Result : "
//        [2, 2, 3]
//        [7]

