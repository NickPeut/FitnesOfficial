package com.example.fitnes;

import android.os.Bundle;
import android.util.Log;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import java.util.ArrayList;
import java.util.List;

import APIParse.Exercise;
import APIParse.IMainView;
import APIParse.MainPresenter;


public class MainActivity extends MvpAppCompatActivity implements IMainView {

    @InjectPresenter
    public MainPresenter presenter;
    ArrayList<Exercise> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  for(int i = 1; i < 26; i++)
        presenter.info(1);
      // Log.d("Size ex", String.valueOf(exercises.size()));
        //info(bar)

    }

    /*bar() {
        Intent intent = new Intent(getApplicationContext(), TrainingChoosing.class);
        startActivity(intent);
    }*/

    @Override
    public void getExercise(ArrayList<Exercise> result) {

        Log.d("My tag", String.valueOf(result.size()));
        for(Exercise i: result){
            i.print();
        }
    }

    @Override
    public void error() {
        Log.d("my tag", "Error");
    }
    public void print() {

    }
}
