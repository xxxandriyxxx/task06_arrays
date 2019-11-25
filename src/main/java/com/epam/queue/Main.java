package com.epam.queue;

public class Main {

    public static void main(String[] args) {

        MyQueue<? extends Car> queue = new MyQueue<>();
        SportCar mercedes = new SportCar("Mercedes");
        queue.add(new Car("Toyota"));
        queue.add(new Car("KIA"));
        queue.add(new Car("Mazda"));
        queue.add(new SportCar("BMW"));
        queue.add(mercedes);
        queue.add(new SportCar("Subaru"));
        queue.add(new SportCar("Ferrari"));
        print(queue, "add()");

        queue.remove();
        print(queue, "remove()");

        queue.remove(mercedes);
        print(queue, "remove(mercedes)");

        queue.offer(new Car("Nissan"));
        print(queue,"offer()");

        System.out.println("---------- peek()");
        System.out.println(queue.peek());


    }

    private static void print(MyQueue queue, String message) {
        System.out.println("---------- " + message);
        for (Object item : queue) {
            System.out.println(item);
        }
    }
}
