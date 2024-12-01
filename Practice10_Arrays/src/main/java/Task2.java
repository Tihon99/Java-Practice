import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 1, 9};
        int[] arr2 = {5, 2, 8, 1, 9};
        int[] arr3 = {1, 2, 5, 8, 9};
        
        System.out.println("toString():");
        System.out.println("arr1: " + Arrays.toString(arr1));
        
        System.out.println("\nbinarySearch():");
        Arrays.sort(arr1);
        System.out.println("Отсортированный arr1: " + Arrays.toString(arr1));
        System.out.println("Индекс элемента 8: " + Arrays.binarySearch(arr1, 8));
        System.out.println("Индекс элемента 3: " + Arrays.binarySearch(arr1, 3));
        
        System.out.println("\nequals():");
        System.out.println("arr1 равен arr2? " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 равен arr3? " + Arrays.equals(arr1, arr3));
        
        System.out.println("\ncompare():");
        System.out.println("Сравнение arr1 и arr2: " + Arrays.compare(arr1, arr2));
        System.out.println("Сравнение arr1 и arr3: " + Arrays.compare(arr1, arr3));
        
        int[] arr4 = {5, 2, 8, 1, 9};
        System.out.println("\nsort():");
        System.out.println("До сортировки: " + Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println("После сортировки: " + Arrays.toString(arr4));
    }
}
