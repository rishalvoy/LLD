package pillersOfOops;

public class StudentScaler extends User{

    public String batchName;
    public int psp;

    public StudentScaler(String name, String email, String batchName, int psp) {
        //Calling Parent Constructor
        super(name,email);
        this.batchName = batchName;
        this.psp = psp;
    }

    public void printClass()
    {
        System.out.println("This is Child Class");
    }


}
