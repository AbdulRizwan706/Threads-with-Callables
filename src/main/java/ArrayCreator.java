//A class Client with a main method.
//Create a class ArrayCreator which takes as input a number (n)
//ArrayCreator should create an ArrayList which should contain numbers from 1 to n
//ArrayCreator should implement appropriate Callable interface
//and return the arraylist discussed above to calling thread
//Client class should invoke ArrayCreator over a new thread
//and get the arraylist from ArrayCreator class and print it.
import java.util.*;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    private int n;
    public ArrayCreator(int n){
        this.n = n;
    }
    @Override
    public ArrayList<Integer> call() throws Exception{
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n; i++){
            arr.add(i);
        }
        return arr;
    }
}
