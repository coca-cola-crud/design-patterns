package dyj.study.decorate;

public class Decorator extends Person{
    private Person person;



    public Decorator(String name) {
        super(name);
    }

    public Decorator() {
    }


    // 装扮
    public void Decorate(Person person){
        this.person = person;
    }


    // 很重要：装饰器的show方法，调用的是被装饰者的show方法
    @Override
    public void show(){
        if(person != null){
            person.show();
        }
    }


}

