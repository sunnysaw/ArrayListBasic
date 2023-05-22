import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> array = new ArrayList<>();
        array.add(120);
        array.add(160);
        array.add(170);
        array.add(190);
        array.add(130);
        array.add(180);
        array.add(140);

        array.add(0,152);
        System.out.println(array);

        // get operation
        int get = array.get(5);
        System.out.println(get);

        // delete
         array.remove(2);
        System.out.println(array);

        // set
        array.set(2,14);
        System.out.println(array);

        // contain element
        System.out.println(array.contains(1));

        // size
        System.out.println(array.size());

        // iteration
        /*
Given a number find the maximum digit in given number.
 */
        int max = 0;
        for (int i = 0; i < array.size(); i++){
            if (max < array.get(i)){
                max = array.get(i);
            }

        }
        System.out.println(max);

    }
}