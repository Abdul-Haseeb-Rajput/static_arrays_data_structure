public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int element = 7;
        int index = 1;
        StaticArrays<Integer> arrays = new StaticArrays<>(7);
        arrays.add(1);
        arrays.add(2);
        arrays.add(3);
        // arrays.add(4);
        arrays.print();
        arrays.insertAt(1, 7);
        arrays.print();

        System.out.println("Element At Index " + index + " is " + arrays.elementAt(index));
        System.out.println("Index Of " + element + " is " + arrays.indexOf(7));
        System.out.println("Contains " + element + " " + arrays.contains(element));
        System.out.println("Size Of Static Array is " + arrays.size()); // size means current length
        System.out.println("Capacity Of Static Array is " + arrays.capacity()); // capacity means a maximum elements
                                                                                // static array can hold

        // arrays.clear();
        // arrays.print();
    }

}
