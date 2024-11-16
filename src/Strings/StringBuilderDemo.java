package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // String Are Immutable
        //Some time we might operation like editing,inserting,removing,appending...
        // deafult Size is 16
        StringBuilder sb = new StringBuilder("heelo");
        sb.ensureCapacity(10000);
        System.out.println(sb.capacity());
        sb.append("world");
        sb.append("world");
        sb.append("world");
        sb.append("world");
        sb.append("world");
        sb.append("world");

        System.out.println(sb.toString());
    }
}
