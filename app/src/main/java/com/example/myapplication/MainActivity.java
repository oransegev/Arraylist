package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etStudentName;
    EditText etGrade;
    Button addStudentBtn;
    EditText etStudentQuery;
    Button checkStudentBtn;
    Button logSortedGradesBtn;
    ArrayList<Student> studentsList = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etStudentName  =findViewById(R.id.etStudentName);
        etGrade  =findViewById(R.id.etGrade);
        addStudentBtn  =findViewById(R.id.addStudentBtn);
        etStudentQuery  =findViewById(R.id.etStudentQuery);
        checkStudentBtn  =findViewById(R.id.checkStudentBtn);
        logSortedGradesBtn  =findViewById(R.id.logSortedGradesBtn);

       addStudentBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Student tempStudent = new Student();
               tempStudent.name = etStudentName.getText().toString();
               tempStudent.score = Integer.parseInt(etGrade.getText().toString());
               studentsList.add(tempStudent);
               for(Student score : studentsList) {
                   Log.d("MainActivity", "Sorted student grade: " + score);
               }
           }
       });
        etStudentQuery.setOnClickListener(new View.OnClickListener(){

         }
    }
}