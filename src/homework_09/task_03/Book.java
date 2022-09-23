package homework_09.task_03;

/*
Задание 3
Создать класс Book, сделать 3 поля и соответствующие методы. Необходимо реализовать замыкание анонимного класса и лямбда-выражения
 */

@FunctionalInterface
interface IBook {
    public void print();
}

public class Book {

    public static void main(String[] args) {

        int pages = 800;
        String text =" text text text text text";
        String name =" Автор ";
        IBook book = () -> System.out.println("| " + name + " | " + text + " | " + pages);
        book.print();
    }
}


