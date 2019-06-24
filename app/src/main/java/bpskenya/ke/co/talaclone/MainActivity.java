package bpskenya.ke.co.talaclone;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyRecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.mainMenuToolbar);
        toolbar.setNavigationIcon(R.drawable.ic_tala);
        toolbar.setTitle("TALA");
        setSupportActionBar(toolbar);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
        adapter=new MyRecyclerAdapter(MainActivity.this);
        recyclerView.setAdapter(adapter);


    }

}
