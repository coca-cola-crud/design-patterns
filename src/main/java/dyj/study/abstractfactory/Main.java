package dyj.study.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataAccess.dbType = "Sqlserver";
        IUser user = DataAccess.createUser();
        user.insert(new User());
        user.getUser(1);

        DataAccess.dbType = "Access";
        user = DataAccess.createUser();
        user.insert(new User());
        user.getUser(1);



    }
}
