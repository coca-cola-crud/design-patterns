package dyj.study.abstractfactory;

public class SqlserverDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.println("在Sqlserver中给Department表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Sqlserver中根据ID得到Department表一条记录");
        return null;
    }
}
