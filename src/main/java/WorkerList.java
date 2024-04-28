import java.util.ArrayList;
import java.util.List;

public class WorkerList {

    List<Human> list = new ArrayList<>();

    public void addWorker(Human human){

        list.add(human);
    }

    public void showWorker(){
        for (Human human : list) {
            System.out.println(human);
        }
    }


    public void findSalary(int id){
        for (Human human : list) {
            if(human.getId() == (id)){
                System.out.println(human.getSalary());
            }
        }
    }


    public List<Human> getList(){
        return list;
    }


}
