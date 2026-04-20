public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        StaticArrays<Integer> arrays = new StaticArrays<>(7);
        arrays.add(1);
        arrays.add(2);
        arrays.add(3);
        // arrays.add(4);
        arrays.print();
        arrays.insertAt(1, 7);
        arrays.print();

        System.out.println("Element in array " + arrays.elementAt(1));

        // arrays.clear();
        // arrays.print();
    }

}
