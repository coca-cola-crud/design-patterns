package dyj.study.chainofresponsibility.example;

import jdk.nashorn.internal.ir.RuntimeNode;

public abstract class Manager {
    protected String name;
    protected Manager manager;

    public Manager(String name) {
        this.name = name;
    }

    public void setManager(Manager manager){
        this.manager = manager;
    }

    public abstract void requestApplications(Request request);
}
