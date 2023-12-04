package OOD.Singleton;

public class DBCSynchronised {

    private  static DBCSynchronised instance = null;

    private DBCSynchronised()
    {
        System.out.println("DBC Synchhronised  Created");
    }

//    public static synchronized DBCSynchronised getInstance() {
//
//        if(instance==null)
//        {
//            instance = new DBCSynchronised();
//        }
//
//        return instance;
//    }

    //DOuble Check Locking
    public static DBCSynchronised getInstance()
    {
        if(instance==null)
        {
            synchronized (DBCSynchronised.class)
            {
                if(instance==null)
                {
                    instance = new DBCSynchronised();
                }
            }

        }

        return instance;
    }


}
