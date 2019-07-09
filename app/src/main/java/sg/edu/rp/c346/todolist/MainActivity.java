package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView ListToDo;
    ArrayList ListofToDoItems;
    ArrayAdapter ToDoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListToDo=findViewById(R.id.listTODO);

        ListofToDoItems=new ArrayList<Date>();

        ListofToDoItems.add(new Date("MSA","1/7/2019"));
        ListofToDoItems.add(new Date("Go for haircut","22/9/2019"));

        ToDoAdapter=new CustomAdapter(this,R.layout.row,ListofToDoItems);

        ListToDo.setAdapter(ToDoAdapter);




    }
}

