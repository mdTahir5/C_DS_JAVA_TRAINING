import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static MongoDatabase todoDB;
    static JLabel taskNamelb, taskDatelb, taskTimelb;
    static JTextField taskNametf, taskDatetf, taskTimetf;
    static JButton addTaskbt, deleteTaskbt, updateTaskbt, viewTaskbt;

    public static void main(String[] args) {
        var client = MongoClients.create("mongodb://localhost:27017/");
        todoDB = client.getDatabase("ToDoApp");
        //
        createToDoUI();
    }

    private static void createToDoUI() {
        JFrame frame = new JFrame("To do App");

        taskNamelb = new JLabel("Enter the Task Name  : ");
        taskDatelb = new JLabel("Enter the Task Date  : ");
        taskTimelb = new JLabel("Enter the Task Time  : ");
        taskNametf = new JTextField();
        taskDatetf = new JTextField();
        taskTimetf = new JTextField();
        taskNamelb.setBounds(50,50,150,40);
        taskDatelb.setBounds(50,80,150,40);
        taskTimelb.setBounds(50,110,150,40);
        frame.add(taskNamelb);
        frame.add(taskDatelb);
        frame.add(taskTimelb);
        taskNametf.setBounds(200,50,100,30);
        taskDatetf.setBounds(200,80,100,30);
        taskTimetf.setBounds(200,110,100,30);
        frame.add(taskNametf);
        frame.add(taskDatetf);
        frame.add(taskTimetf);
        addTaskbt = new JButton("Add Task");
        addTaskbt.setBounds(80,160,80,30);
        addTaskbt.setForeground(Color.BLUE);
        frame.add(addTaskbt);
        deleteTaskbt = new JButton("Delete Task");
        deleteTaskbt.setBounds(190,160,80,30);
        deleteTaskbt.setForeground(Color.RED);
        frame.add(deleteTaskbt);
        updateTaskbt = new JButton("Update Task");
        updateTaskbt.setBounds(80,210,80,30);
        frame.add(updateTaskbt);
        viewTaskbt = new JButton("View Task");
        viewTaskbt.setBounds(190,210,80,30);
        frame.add(viewTaskbt);

        frame.setSize(350,300);
        frame.setBackground(Color.GRAY);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        addTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InertTaskIntoDB();
            }
        });
        updateTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTaskIntoDB();
            }
        });
        deleteTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteTaskIntoDB();
            }
        });
    }

//    private static void ViewTaskDB() {
//        var todoCollection = todoDB.getCollection("ToDoList");
//        String viewId = JOptionPane.showInputDialog(null, "Enter User Id to View Task");
//        BasicDBObject whereQuery = new BasicDBObject();
//        whereQuery.put("TasksId",Integer.parseInt(viewId));
//    }

    private static void DeleteTaskIntoDB() {
        var todoCollection = todoDB.getCollection("ToDoList");
        String deleteId = JOptionPane.showInputDialog(null, "Enter Task Id to Delete Task");
        todoCollection.deleteOne(new Document("TaskId",Integer.parseInt(deleteId)));
    }

    private static void UpdateTaskIntoDB() {
        var todoCollection = todoDB.getCollection("ToDoList");
        String taskId = JOptionPane.showInputDialog(null,"Enter Task Id to Update Task Status");
        todoCollection.updateOne(new Document("TaskId", Integer.parseInt(taskId)), new Document("$set",
                new Document("TaskStatus",true)));

    }
    private static void InertTaskIntoDB() {
        var todoCollection = todoDB.getCollection("ToDoList");
        var document =new Document();
        Random random = new Random();
        int id = random.nextInt(999);
        document.append("TaskId" , id);
        document.append("TaskName",taskNametf.getText());
        document.append("TaskDate",taskDatetf.getText());
        document.append("TaskTime",taskTimetf.getText());
        document.append("TaskStatus",false);
        todoCollection.insertOne(document);
        JOptionPane .showMessageDialog(null,"Task Added Successfully");
        taskNametf.setText("");
        taskDatetf.setText("");
        taskTimetf.setText("");
    }
}