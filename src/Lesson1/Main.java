package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("N1");
       SwapPosArray<String> swapPosArray = new SwapPosArray<>("Hello", "Hi","Hey","Good morning");
       System.out.println(Arrays.toString(swapPosArray.swapTwoElements(0,1)));
       System.out.println("N2");
       Integer[] arr1 = {1,2,3,4,5};
        List<Integer> arrayList = convertToArrayList(arr1);
        System.out.println(arrayList.getClass() + " " + arrayList);

        System.out.println("N3");

           Box<Apple> appleBox = new Box<>();
           Box<Orange> orangeBox = new Box<>();
           Box<Apple> appleBox1 = new Box<>();
           Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
            appleBox1.add(new Apple());
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 4; i++) {
            orangeBox.add(new Orange());
        }
        appleBox.printInfo();
        orangeBox.printInfo();
        appleBox1.printInfo();
        orangeBox1.printInfo();
        System.out.println("Total weight of apple box is " + appleBox.getWeight());
        System.out.println("Total weight of orange box is " + orangeBox.getWeight());
        System.out.println("Total weight of apple1 box is " + appleBox1.getWeight());
        System.out.println("Total weight of orange1 box is " + orangeBox1.getWeight());

        System.out.println("Apple and apple1 are they equal : " + appleBox.compare(appleBox1));
        orangeBox1.moveTo(orangeBox);
        orangeBox.printInfo();
        orangeBox1.printInfo();





    }
    private static <T> List<T> convertToArrayList(T[] array){
        return Arrays.asList(array);
    }



}
