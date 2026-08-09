package RHP_CLASS;

import java.util.*;
public class MaxStraight {

//    /*{From Left to Right in Array}*/
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        Map<Integer,Integer> map = new LinkedHashMap<>();
//        int result = 1;
//        for(int i=0;i<n;i++){
//            if(map.containsKey(arr[i]-1)){
//                map.put(arr[i],map.get(arr[i]-1)+1);
//                result = Math.max(result,map.get(arr[i]));
//            }else{
//                map.put(arr[i],1);
//            }
//        }
//        System.out.println(result);
//    }

    /*{From Right to Left in Array}*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int result = 1;
        for(int i=n-1;i>=0;i--){
            if(map.containsKey(arr[i]+1)){
                map.put(arr[i],map.get(arr[i]+1)+1);
                result = Math.max(result,map.get(arr[i]));
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(result);
    }

}
