package OOD.Singleton;

public class main {

    public static void main(String[] args) {

        DBCSynchronised dbc = DBCSynchronised.getInstance();

        DBCSynchronised dbc1 = DBCSynchronised.getInstance();
    }
}
