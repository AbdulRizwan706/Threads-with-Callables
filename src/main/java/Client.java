
import java.util.concurrent.*;
import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

//A class Client with a main method.
//Create a class ArrayCreator which takes as input a number (n)
//ArrayCreator should create an ArrayList which should contain numbers from 1 to n
//ArrayCreator should implement appropriate Callable interface
//and return the arraylist discussed above to calling thread
//Client class should invoke ArrayCreator over a new thread
//and get the arraylist from ArrayCreator class and print it.
public class Client {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ExecuterService es = Executors.newSingleThreadExecutor();
        ArrayCreator ac = new ArrayCreator(n);
        Future<ArrayList<Integer>> promiseList = es.submit(ac);
        ArrayList<Integer> arr = promiseList.get();
        System.out.println(arr);
        es.shutdown();
    }
}
