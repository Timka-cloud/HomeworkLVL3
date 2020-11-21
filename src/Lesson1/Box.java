package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit>  {
    private List<T> list;



    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T fruits){
        list.add(fruits);
    }
    public void printInfo(){
        if(list.isEmpty()) System.out.println("There's box is empty");
        else{
            System.out.println("There's " + list.get(0).toString() + " in amount " + list.size());
        }
        
    }
    public float getWeight(){
        float weight = 0.0f;


            for (int i = 0; i < list.size(); i++) {
                weight += list.get(i).getWeight();
            }


        return weight;
    }
    public boolean compare(Box<?> another){
        if(this.getWeight() - another.getWeight() == 0) return true;
        else return false;


    }
    public void moveTo(Box<T> box){

        for (T fruit : list) {
            box.add(fruit);

        }

        list.clear();


    }

}
