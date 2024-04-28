public abstract class Human implements Comparable<Human>{

    protected int id;
    protected String name;
    protected String typeWorker;
    protected double salary;


    public Human(int id, String name, String typeWorker, double salary){
        this.id = id;
        this.name = name;
        this.typeWorker = typeWorker;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return "id: " + id + ", имя: " + name + ", тип занятости: " + typeWorker;
    }


    @Override
    public int compareTo(Human o) {
//        int compareName = this.name.compareTo(o.name);
//        if(compareName != 0){
//            return compareName;
//        }
        if(this.getSalary() > o.getSalary()){
            return 1;
        } else if (this.getSalary() < o.getSalary()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
