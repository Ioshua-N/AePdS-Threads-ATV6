public class Main
{
    public static void main(String[] args)
    {
        MyThread thread1 = new MyThread("Contagem 1", 0, 10);
        MyThread thread2 = new MyThread("Contagem 2", 10, 50);
        MyThread thread3 = new MyThread("Contagem 3", 50, 100);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}