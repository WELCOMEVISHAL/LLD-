package MergeSortInThreads;

import Interface.Inter;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = Arrays.asList(8,1,2,9,6,3,7,5);
        ExecutorService es = Executors.newFixedThreadPool(10);
        Sorter arrSorter = new Sorter(arr, es);
        Future<List<Integer>> sortedData = es.submit(arrSorter);
        List<Integer> sortedArr = sortedData.get();

        for(Integer i: sortedArr){
            System.out.println(i);
        }
    }
}
