package MergeSortInThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private  ExecutorService es;

    Sorter(List<Integer> arr, ExecutorService es){
        this.arrayToSort = arr;
        this.es = es;
    }

    public List<Integer> call() throws ExecutionException, InterruptedException {
        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
        int size = arrayToSort.size();
        int mid = size/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i = 0;i < mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i = mid;i < size;i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter s = new Sorter(leftArray, es);
        Sorter s1 = new Sorter(rightArray, es);

        //Create Threads
        Future<List<Integer>> leftSortedArrayFutur = es.submit(s);
        Future<List<Integer>> rightSortedArrayFutur = es.submit(s1);

        //wait for the response
        List<Integer> SortedLeftArray = leftSortedArrayFutur.get();
        List<Integer> SortedRightArray = rightSortedArrayFutur.get();

        //merge
        int i = 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while(i < SortedLeftArray.size() && j < SortedRightArray.size()){
            if(SortedLeftArray.get(i) <= SortedRightArray.get(j)){
                sortedArray.add(SortedLeftArray.get(i));
                i+=1;
            }else{
                sortedArray.add(SortedRightArray.get(j));
                j+=1;
            }
        }

        while(i<SortedLeftArray.size()){
            sortedArray.add(SortedLeftArray.get(i));
            i+=1;
        }

        while(i<SortedRightArray.size()){
            sortedArray.add(SortedRightArray.get(i));
            i+=1;
        }
        return sortedArray;
    }

}
