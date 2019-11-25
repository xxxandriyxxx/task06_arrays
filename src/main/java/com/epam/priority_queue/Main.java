package com.epam.priority_queue;

public class Main {

    public static void main(String[] args) {

        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.add("bbb");
        queue.add("aaa");
        queue.add("wwww");
        System.out.println("======================= string queue");
        System.out.println(queue.toString());

        MyPriorityQueue<Car> cars = new MyPriorityQueue<>();
        cars.add(new Car("Toyota"));
        Car kia = new Car("KIA");
        cars.add(kia);
        cars.add(new Car("Mazda"));
        cars.add(new SportCar("BMW"));
        cars.add(new SportCar("Subaru"));
        cars.add(new SportCar("Ferrari"));
        System.out.println("======================= cars queue");
        System.out.println(cars.toString());

        System.out.println("---------- contains car Nissan");
        System.out.println(cars.contains(new Car("Nissan")));

        System.out.println("---------- element()");
        System.out.println(cars.element());

        System.out.println("---------- peek()");
        System.out.println(cars.peek());

        System.out.println("---------- size()");
        System.out.println(cars.size());

        print(cars, "poll");
        System.out.println(cars.poll());
        System.out.println(cars.toString());

        cars.remove(kia);
        print(cars, "remove KIA");

        cars.clear();
        print(cars, "clear()");

        System.out.println("---------- size()");
        System.out.println(cars.size());

    }

    private static void print(MyPriorityQueue queue, String message) {
        System.out.println("---------- " + message);
        System.out.println(queue.toString());
    }
}
