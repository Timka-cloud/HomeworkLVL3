package Lesson1;

public class SwapPosArray<T> {
    private T[] anyArray;

    public SwapPosArray(T... anyArray) {
        this.anyArray = anyArray;
    }


    public T[] swapTwoElements(int index1, int index2){
        T temporary = anyArray[index1];
        anyArray[index1] = anyArray[index2];
        anyArray[index2] = temporary;
        return anyArray;
    }
}
