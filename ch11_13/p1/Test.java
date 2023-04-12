package homework.ch11_13.p1;

public class Test extends TaskServiceImpl{
    public static void main(String[] args) {
        TaskServiceImpl array = new TaskServiceImpl();
        Task1 a = new Task1();
        Task2 b = new Task2();
        Task3 c = new Task3();
        array.addTask(b);
        array.addTask(a);
        array.addTask(c);
        array.exeuteTasks();
    }
}
