public class Main {
    public static void main(String[] args) {
        System.out.println("            --------Testing Array List--------");
        testArrayList();
        System.out.println("            --------Testing Linked List--------");
        testLinkedList();
    }

    private static void testArrayList() {
        MyArrayList<Integer> arrayList = new MyArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Array size: " + arrayList.getSize());

        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        System.out.println("Array size: " + arrayList.getSize());
        System.out.println("Fourth element of array: " + arrayList.get(3));
        System.out.println("Seventh element of array: " + arrayList.get(6));

        arrayList.remove(6);
        arrayList.remove(4);
    }

    private static void testLinkedList() {
        MyLinkedList<String> myList = new MyLinkedList<>();

        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        System.out.print("List: ");
        for (String element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();

        String second = myList.get(1);
        System.out.println("Second element of list: " + second);

        String removed = myList.remove(0);
        System.out.println("Removed element: " + removed);

        System.out.print("List: ");
        for (String element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();

        int size = myList.size();
        System.out.println("The size of the list is: " + size);
    }
}




//MyArrayList:
//
//        Create a new class called MyArrayList that implements the List interface.
//        Define a private instance variable of type Object[] to hold the elements of the list.
//        Define an int variable called size to keep track of the number of elements in the list.
//        Implement the add(E element) method by first checking if the size of the array is large enough to accommodate the new element. If it is not, create a new array with double the size of the original array, copy over the elements from the original array, and then add the new element. Otherwise, simply add the new element to the end of the array and increment the size variable.
//        Implement the get(int index) method by returning the element at the specified index.
//        Implement the remove(int index) method by removing the element at the specified index, shifting all subsequent elements to the left by one position, and decrementing the size variable.
//        Implement the size() method by returning the size variable.
//        Implement any other methods specified by the List interface.
//        Test all methods of MyArrayList
//MyLinkedList:
//
//        Create a new class called MyLinkedList that implements the List interface.
//        Define a private inner class called Node that contains an element of type E and references to the next and previous nodes in the list.
//        Define a private instance variable called head that references the first node in the list.
//        Define a private instance variable called tail that references the last node in the list.
//        Define an int variable called size to keep track of the number of elements in the list.
//        Implement the add(E element) method by creating a new Node with the specified element, setting its next reference to null (since it will be the new tail), and its previous reference to the current tail. If the list is empty, set both the head and tail references to the new node. Otherwise, set the next reference of the current tail to the new node and update the tail reference to the new node. Finally, increment the size variable.
//        Implement the get(int index) method by traversing the list from the head (or tail, depending on which is closer to the specified index) and returning the element at the specified index.
//        Implement the remove(int index) method by first traversing the list to the node at the specified index. Then, update the next and previous references of the surrounding nodes to remove the node from the list, and decrement the size variable.
//        Implement the size() method by returning the size variable.
//        Implement any other methods specified by the List interface.
//        Test all methods of MyLinkedList