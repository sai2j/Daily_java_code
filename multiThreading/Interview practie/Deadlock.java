public class main {

    static Object pen = new Object();
    static Object paper = new Object();

    public static void main(String[] args) {
        Thread student1 = new Thread(() -> {
            synchronized (pen) {
                System.out.println("Student 1 got Pen");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {

                }
                synchronized (paper) {
                    System.out.println("Student 1 got paper");
                }
            }
        });
        Thread student2 = new Thread(() -> {
            synchronized (paper) {
                System.out.println("Student 2 got Pen");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {

                }
                synchronized (pen) {
                    System.out.println("Student 2 got paper");
                }
            }
        });

        student1.start();
        student2.start();

    }
}