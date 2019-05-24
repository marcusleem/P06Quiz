package sg.edu.rp.soi.p06_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOperation;
    int mode = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOperation = findViewById(R.id.tvOperation);


        registerForContextMenu(tvOperation);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);

        if(v.getId() == R.id.plus){
        mode = 1;
        }else{
        mode = 2;
        }

        Log.d("TEST", "" + v.getId() + " " + mode);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if()
    }


    }


