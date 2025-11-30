package Array.ArrayList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        // Declaration
        ArrayList<Integer> arr= new ArrayList<>();

        //Adding elements
        arr.add(25);
        arr.add(250);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        // Printing or getting an element
        System.out.println(arr.get(2)); // System.out.println(arr[2]);

        // Updating an element
        arr.set(3,50); // arr[3]=50;
        System.out.println(arr.get(3));

        // Printing complete arraylist named arr
        System.out.println(arr);

        //for loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        // for-each loop
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
}
