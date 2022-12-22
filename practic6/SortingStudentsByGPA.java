/*package mirea.practic6;
import java.util.Arrays;
import java.util.Collections;

public class SortingStudentsByGPA implements Comparator{
    Student[] StudentsList;

    public void fillStudentsList(int length){
        StudentsList = new Student[length];

        for(int i = 0; i < length; i ++){
            StudentsList[i] = new Student(0,(double) (Math.random()*1000));
        }
    }

    public void quickSort(int low, int high){
        if (StudentsList.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        Student basePoint = StudentsList[(int)(low + (high - low) / 2)];

        int i = low, j = high;

        while (i <= j) {

            while (StudentsList[i].compareTo(basePoint) < 0) {
                i++;
            }

            while (StudentsList[j].compareTo(basePoint) > 0) {
                j--;
            }

            if (i <= j) {
                Student temp = StudentsList[i];
                StudentsList[i] = StudentsList[j];
                StudentsList[j] = temp;
                i++;
                j--;
            }

        }

        if (low < j) {
            quickSort(low, j);
        }

        if (high > i) {
            quickSort(i, high);
        }
    }
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high = x.length - 1;
        quickSort(low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}*/
