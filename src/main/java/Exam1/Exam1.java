package Exam1;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam1 {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList();
//        Map<Integer,int[]> map = new HashMap<Integer, int[]>();
//        for(int i=0;i<50;i++){
//            int value = (int)(Math.random()*100);
//            list.add(value);
//            System.out.printf("%d ",value);
//        }
//
//        for (int temp:list){
//            int index = temp/10;
//            if(map.containsKey(index)){
//                // 存在则直接加入,数组0号位是标志位
//                int[] arr = map.get(index);
//                int pos = arr[0];
//                arr[0]+=1;
//                arr[pos]=temp;
//            }else {
//                // 不存在则新建数组
//                int[] arr = new int[10];
//                arr[0]=1;
//                arr[1]=temp;
//                map.put(index,arr);
//            }
//        }
//        System.out.println("-----");
//        for (int index :map.keySet()){
//            int[] temp = map.get(index);
//            int arr[]=ArraySort.sort(temp);
//            map.put(index,arr);
//
//            System.out.print(index+"=>[");
//            for (int i =0;i<arr.length;i++){
//                System.out.print(arr[i]+",");
//            }
//            System.out.println("]");
//        }
//
//        System.out.println("sort down");

    }

//    static class ArraySort{
//
//        public static int[] sort(int[] temp){
//            int size = temp[0]-1;//减掉一位
//            int []arr = new int[size];
//            for (int i=0;i<size;i++){
//                arr[i]=temp[i+1];
//            }
//
//            // 冒泡排序
//            for ( int i =0;i<size;i++){
//                for (int j=0;j<size-i-1;j++){
//                    if(arr[j]>arr[j+1]){
//                        int value = arr[j+1];
//                        arr[j+1]=arr[j];
//                        arr[j]=value;
//                    }
//                }
//            }
//
//            return arr;
//        }
//
//    }
}
