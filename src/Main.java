import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,2);
            linkedList.add(random.nextInt(0,2));
            arrayList.add(random.nextInt(0,2));
        }
        System.out.println(array);
        System.out.println(linkedList);
        System.out.println(arrayList);

    }
    public static int[] sort (int[] array){
        Arrays.sort(array);
        return array;

    }
    public static LinkedList sort(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
        return linkedList;
    }
    public static ArrayList sort(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        return arrayList;

    }
}