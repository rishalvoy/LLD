package OOD.Singleton;

public class DBC {

    private  static DBC instance = null;

    private DBC()
    {
        System.out.println("DBC Created");
    }

    public static DBC getInstance() {

        if(instance==null)
        {
            instance = new DBC();
        }

        return instance;
    }

}
