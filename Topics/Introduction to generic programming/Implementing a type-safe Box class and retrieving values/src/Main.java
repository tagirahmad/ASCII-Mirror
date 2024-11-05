import java.util.*;

public class Main {
    static class Box<T> {
        // your code here
        final private T v;

        public Box(T v) { this.v = v; }

        public T get() { return v; }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            // your code here
            Box<Integer> box = new Box<>(num);
            System.out.println(box.get());
        } else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            // your code here
            Box<Float> box = new Box<>(num);
            System.out.println(box.get());
        } else {
            String str = sc.next();
            // your code here
            Box<String> box = new Box<>(str);
            System.out.println(box.get());
        }
    }
}