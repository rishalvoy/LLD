package Java8.labdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class printbleImp{

    public static void main(String[] args) {

        List<Integer>arr = new ArrayList<>();

        arr.add(10);

        arr.add(15);

        arr.add(20);

        arr.add(12);

        arr.forEach(
                (elem)-> {
                    if(elem>10)
                    {
                        System.out.println(elem+"Vishal");
                    }

                }
        );

        printable pb = (name)->{
            System.out.println("This is lambda Drawable"+name);
        };


        pb.draw("Vishal");

    }
}
