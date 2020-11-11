public class Example1 {
    public static void main(String[] args) {
        // custom implementation of arraylist
        MyArrayList<String> myList = new MyArrayList<>();

        myList.add("Pog"); // fast O(1)
        myList.add("I made this list!"); // fast O(1)
        myList.add("This is awesome"); // fast O(1)
        myList.add("slow mode"); // slow O(n)

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
