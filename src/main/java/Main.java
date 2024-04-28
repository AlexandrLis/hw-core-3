import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        WorkerList workerList = new WorkerList();

        start(workerList);





    }

    public static void start(WorkerList workerList){
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие: ");
        System.out.println("1 - добавить работника");
        System.out.println("2 - показать список работников");
        System.out.println("3 - показать зарплату работника");
        System.out.println("4 - отсортировать список работников по зарплате");
        System.out.println("5 - выход");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Укажите id работника");
                int id = scanner.nextInt();
                System.out.println("Укажите имя работника");
                String name = scan.nextLine();
                System.out.println("Укажите тип работника(worker/freelancer)");
                String type = scan.nextLine();
                System.out.println("Укажите зарплату работника");
                int salary = scanner.nextInt();
                add(id, name, type, salary, workerList);
                start(workerList);
            break;
            case 2:
                showList(workerList);
                start(workerList);
            break;
            case 3:
                showSalary(workerList);
                start(workerList);
            break;
            case 4:
                sortSalary(workerList);
                start(workerList);
                break;
            case 5:
                System.out.println("До свидания");
            break;
            default:
                System.out.println("Выберите пункт от 1 до 4");
                start(workerList);
        }
    }

    public static void add(int id, String name, String type, double salary, WorkerList workerList){

        if(type.equalsIgnoreCase("worker")){
            workerList.addWorker(new Worker(id, name, type, salary));
        }
        else if (type.equalsIgnoreCase("freelancer")) {
            workerList.addWorker(new Freelancer(id, name, type, salary));
        }
        else{
            System.out.println("Введите корректный тип работника - worker или freelancer");
            start(workerList);
        }


    }

    public static void showList(WorkerList workerList){
        workerList.showWorker();
    }

    public static void showSalary(WorkerList workerList){
        System.out.println("Введите id сотрудника");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.print("Зарплата сотрудника: ");
        workerList.findSalary(id);
    }



    public static void sortSalary(WorkerList workerList){
        Collections.sort(workerList.getList());
        for (Human human : workerList.getList()) {
            System.out.println(human);
        }
    }
}








/*
        list.addWorker(new Worker(001,"Petr", "worker", 35_000));
        list.addWorker(new Worker(002, "Viktor", "worker", 42_000));
        list.addWorker(new Freelancer(003, "Sergey", "freelancer", 350));

        list.showWorker();
        System.out.println();

        list.findSalary(1);
 */