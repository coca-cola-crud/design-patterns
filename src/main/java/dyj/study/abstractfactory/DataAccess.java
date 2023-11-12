package dyj.study.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public class DataAccess {
    private static final String db = "dyj.study.abstractfactory.";
    public static String dbType;
//    private static String dbType = "SqlServer";


    public static IUser createUser() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 利用反射机制，根据类名创建对象
        // 优点：如果需要更换数据库，只需要修改配置文件，而不需要修改代码
        // 缺点：如果类名写错了，编译器不会报错，运行时才会报错
        Class<?> clazz = Class.forName(db+dbType+ "User");  // 全类名，包名要完全写出
        return (IUser) clazz.getDeclaredConstructor().newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName(db+dbType+ "Department");
        return (IDepartment) clazz.getDeclaredConstructor().newInstance();
    }
}
