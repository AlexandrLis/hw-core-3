public class Worker extends Human{


    public Worker(int id, String name, String typeWorker, double salary){

        super(id, name, typeWorker, salary);
    }

    @Override
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", зарплата: " + salary;
    }
}
