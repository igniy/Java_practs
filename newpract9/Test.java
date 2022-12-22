package mirea.newpract9;
import java.util.Arrays;
public class Test {

    public static void main(String[] args){

        InsertionSort testClass = new InsertionSort();
        testClass.fillStudentsList(10);
        System.out.println("First task");
        System.out.println(Arrays.toString(testClass.StudentsList));
        testClass.insertionSortStudentsList();
        System.out.println(Arrays.toString(testClass.StudentsList));

        QuickSort testClassQuickSort = new QuickSort();
        testClassQuickSort.fillStudentsList(10);
        System.out.println("Second task");
        System.out.println(Arrays.toString(testClassQuickSort.StudentsList));
        testClassQuickSort.quickSort(0,9);
        System.out.println(Arrays.toString(testClassQuickSort.StudentsList));
        System.out.println("Third task");
        MergeSort testClassMergeSort = new MergeSort();
        testClassMergeSort.execute(10,10);
    }
}
