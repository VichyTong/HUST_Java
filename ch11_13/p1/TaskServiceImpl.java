package homework.ch11_13.p1;

import java.util.ArrayList;

public class TaskServiceImpl implements TaskService{

    ArrayList<Task> taskArrayList = new ArrayList<Task>();
    /**
     * 执行任务接口列表中的每个任务
     */
    public void exeuteTasks(){
        for (Task task : taskArrayList) {
            task.execute();
        }
    }


    /**
     * 添加任务
     * @param t 新添加的任务
     */
    public void addTask(Task t){
        taskArrayList.add(t);
    }
}
