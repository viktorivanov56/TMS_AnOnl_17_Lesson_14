package ThreadExecutionOrder;

public class ThreadExecutionOrder {
    public static void main(String[] args) {
        // Создаем объекты Runnable для каждого потока
        Runnable task1 = () -> {
            System.out.println("Thread T1 is running");
        };

        Runnable task2 = () -> {
            System.out.println("Thread T2 is running");
        };

        Runnable task3 = () -> {
            System.out.println("Thread T3 is running");
        };

        // Создаем потоки
        Thread T1 = new Thread(task1);
        Thread T2 = new Thread(task2);
        Thread T3 = new Thread(task3);

        // Запускаем все три потока одновременно
        T1.start();
        T2.start();
        T3.start();
    }
}