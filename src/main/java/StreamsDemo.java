import java.util.*;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> l2=new ArrayList();
        List<Integer> l1= Arrays.asList(1,20,14,55,76);
        l1.stream().filter(n->n<50).forEach(n->System.out.println(n));

        l1.stream().filter(n->n<50).forEach(n->l2.add(n));

        System.out.println(l2);

    }



}
