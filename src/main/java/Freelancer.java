public class Freelancer extends Human{



    public Freelancer(int id, String name, String typeWorker, double salary){
        super(id, name, typeWorker, salary);
    }

    @Override
    public double getSalary(){
        return salary*20.8*8;
    }

    @Override
    public String toString() {
        return super.toString() + ", зарплата: " + salary*20.8*8;
    }
}
