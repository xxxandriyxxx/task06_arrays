package com.epam.deque;

public class Main {

    public static void main(String[] args) {
        MyDeque deque = new MyDeque();

        deque.addFirst("www");
        deque.addFirst(222);
        deque.addFirst("ccc");
        deque.addFirst("bbb");
        deque.addFirst(111);
        deque.addFirst("aaa");

        System.out.println(deque.toString());

        System.out.println("----------- getFirst");
        System.out.println(deque.getFirst());
        System.out.println("----------- getLast");
        System.out.println(deque.getLast());

        deque.addLast("last");
        System.out.println("----------- addLast, getLast");
        System.out.println(deque.getLast());
        System.out.println(deque.toString());

        System.out.println("----------- removeFirst, peekFirst");
        System.out.println(deque.removeFirst());
        System.out.println(deque.peekFirst());
        System.out.println(deque.toString());

        System.out.println("----------- offerFirst, offerLast");
        System.out.println(deque.offerFirst("first"));
        System.out.println(deque.offerLast("last"));
        System.out.println(deque.toString());

        MyDeque deque2 = new MyDeque();

        System.out.println("\n======= empty deque =====");
        System.out.println("----------- peekFirst, peekLast");
        System.out.println(deque2.peekFirst()); // return null
        System.out.println(deque2.peekLast()); // return null

        System.out.println("----------- pollFirst, pollLast");
        System.out.println(deque2.pollFirst()); // return null
        System.out.println(deque2.pollLast()); // return null

//        MyDeque deque1 = new MyDeque();
        System.out.println("----------- getLast, getFirst (throws exception)");
        System.out.println(deque2.getFirst()); // throws NoSuchElementException
        System.out.println(deque2.getLast()); // throws NoSuchElementException

    }

}
