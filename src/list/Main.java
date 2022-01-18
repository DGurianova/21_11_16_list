package list;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        CustomList list = new AdvancedArrayList();

        list.add(10);
        list.add(15);
        list.add(3);//{10, 15, 3}

        list.println();

        list.insert(2, 7);//{10, 15, 7, 3}
        list.println();

        list.removeById(0);//{15, 7, 3}
        list.println();

        try {
            list.removeById(2);//{15, 7}
        } catch (CustomOutOfBoundsException e) {
            System.out.println("The index is out of bounds");
        }
        list.println();

        CustomList arrayList = new CustomArrayList();
        arrayList.add(6);
        arrayList.println();//6
        System.out.println(arrayList.size());//1
        arrayList.add(10);
        arrayList.println();//6 10
        System.out.println(arrayList.size());//2
        try {
            arrayList.set(2, 79);
        } catch (CustomOutOfBoundsException ex) {
            System.out.println("The index is out of bounds");
        }
        arrayList.println();//6 10 79
        try {
            System.out.println(arrayList.get(2)); //79
        } catch (CustomOutOfBoundsException ex) {
            System.out.println("The index is out of bounds");
        }
        System.out.println(arrayList.size());// 3 works
        System.out.println(arrayList.contains(79));//true
        System.out.println(arrayList.contains(9));//false
        try {
            arrayList.removeById(2);
        } catch (CustomOutOfBoundsException ex) {
            System.out.println("The index is out of bounds");
        }
        arrayList.println();//6 10
        System.out.println(arrayList.size());//2  works
        arrayList.set(0, 5);
        arrayList.println();//5 10
        System.out.println(arrayList.size());//2  works
        arrayList.insert(2, 5);
        arrayList.println(); //5 10 5
        System.out.println(arrayList.size());//3 works
        arrayList.insert(1, 50);
        arrayList.println(); //5 50 10 5
        System.out.println(arrayList.size());//4 works
        arrayList.removeById(1);//5 10 5
        arrayList.println();
        arrayList.insert(3, 88);
        arrayList.println(); //5 10 5 88
        arrayList.insert(0, 78);
        arrayList.println(); //78 5 10 5 88
        try {
            arrayList.insert(-1, 78);
        } catch (CustomOutOfBoundsException ex) {
            System.out.println("The index is out of bounds");
        }

        CustomLinkedList<Integer> linkedList = new CustomLinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(9);
        linkedList.add(4);
        linkedList.add(8);
        System.out.println(linkedList.contains(9));
        System.out.println(linkedList.removeByValue(9));
        System.out.println(linkedList.removeById(1));
        linkedList.insert(1, 18);
        linkedList.println();

//        Iterator<Integer> iterator = list.iterator(); // развернутая запись
//        while (iterator.hasNext()) {
//            int number = iterator.next();
//            System.out.println(number);
//        }

        for (int number : list) {
            System.out.println(number);

        }
    }
}

