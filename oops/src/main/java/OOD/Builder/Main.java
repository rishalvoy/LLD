package OOD.Builder;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {

        Student std1 = Student.builder()
                .name("Vishal")
                .email("vishalroy198@gmal.com")
                .batchName("Advance Java")
                .phoneNumber("9973548446")
                .Build();

        System.out.println(std1.toString());

    }


}
