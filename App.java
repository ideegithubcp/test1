// filepath: /path/to/your/project/App.java
public class App {
    public static void main(String[] args) {
        int c = 0;
        while (c < 10000000) {
            System.out.println("Hello, World!");
            c++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
