package com.example.shrutinallari.shruti;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private MyAdapter mAdapter;
    private List<Person> personList;
    private RecyclerView mRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycle=(RecyclerView)findViewById(R.id.my_recycler_view);
        mRecycle.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager=new LinearLayoutManager(this);
        mRecycle.setLayoutManager(mLayoutManager);
        intialiseData();
        intializeAdapter();
    }

    private void intialiseData(){
        personList=new ArrayList<>();
        personList.add(new Person("Emma", "23", R.drawable.common_full_open_on_phone));
        personList.add(new Person("Laver", "23", R.drawable.common_full_open_on_phone));
        personList.add(new Person("Lillie", "23", R.drawable.common_full_open_on_phone));
    }
    private void intializeAdapter(){
        MyAdapter madapter=new MyAdapter(personList);
        mRecycle.setAdapter(madapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
