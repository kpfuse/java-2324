package part01_isA;

import java.util.Scanner;

public class MainTest_isA01 {
    public static void main(String[] args) {
        // 1 - worker ---- is a ----  person
        Scanner scanner = new Scanner(System.in);

        Person p1 = new Person();
        p1.setName(scanner.nextLine());
        p1.setAge(scanner.nextInt());

        System.out.println( p1.toString() );
        p1.printInfo();

        Person p2 = new Person("Tom", 18);
        System.out.println(p2);
        p2.printInfo();
//        //---------------------------------------

        Worker w1 = new Worker("Kate", 3, 100000);
        System.out.println(w1);
        w1.printInfo();
        //---------------------------------------
        // worker ---- is a ----  person
        Person person = new Worker("Dina", 23, 900000);
        System.out.println(person);
        person.printInfo();
        //--------------------------------------

//        Worker worker =  new Person("Jim", 5); // нельзя
//        System.out.println(worker);
//        worker.printInfo();
        //----------------------------------
        // 2 - upcast vs downcast
//         person = w1; // upcast - автоматически
//         w1 = (Worker)person;  // просто так нельзя, нужен downcast  (Worker)person ; Работает не всегда!!! А когда? Зачем?

        // вызвать методы подкласса
        System.out.println(((Worker)person).getTax());

        //------------------------------------
// как это работает с параметрами методов
        printMany(p1, 4);
        printMany(w1, 3);
//------------------------------------
        // как это работает с возвращаемыми значениями
        System.out.println("Вывод старших по возрасту");
        Person oldest1 = getOldest(p1, p2);
        oldest1.printInfo();
        Person oldest2 = getOldest(p1, person);
        oldest2.printInfo();

        Person oldest3 = getOldest(p1, w1);
        oldest3.printInfo();

    //    System.out.println(((Worker)oldest3).getNetSalary() );
        //------------------------------------
// узнать, сколько заработал самый старший  oldest3
       // if (oldest3.getClass() == Worker.class)
        if (oldest3 instanceof Worker) { // (oldest3.getClass() == Worker.class)
            double s = ((Worker) oldest3).getNetSalary();
            System.out.println("oldest3 заработал " + s + " рублей");
        } else {
            System.out.println("oldest3 не работал ");
        }
        //------------------------------------
        Worker[] workers = new Worker[]{
                w1,
                new Worker("A", 25, 10000),
                new Worker("B", 21, 30000),
        };

        for (var w : workers) {
            w.printInfo();
        }

        Person[] people = new Person[]{
                p1, p2,
                new Person("Vasya", 5),
                w1,
                new Worker("C", 30, 20000)
        };

        for (var p : people) {
            p.printInfo();
        }

        printPeople(people);
//----------------------------------------

        double sum = 0;
        for (Person p : people) {
            if (p instanceof Worker)
                sum += ((Worker) p).getNetSalary();
        }
        System.out.println(sum);
        //-----------------------------------
    }

    public static void printMany(Person p, int n) {
        for (int i = 0; i < n; i++) {
            p.printInfo();
        }
    }


    public static void printPeople(Person[] people) {
        for (Person p : people) {
            p.printInfo();
        }
    }


    public static Person getOldest(Person p1, Person p2) {
        if (p1.getAge() > p2.getAge())
            return p1;
        else
            return p2;
    }

}
