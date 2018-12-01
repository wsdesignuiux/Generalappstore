package e.wolfsoft1.generalappstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.RecycleAdapter_General;
import model.GeneralModelClass;

public class MainActivity extends AppCompatActivity {

    private ArrayList<GeneralModelClass> generalModelClasses;

    private RecyclerView recyclerView;
    private RecycleAdapter_General mAdapter;

    private Integer image[] = {R.drawable.ic_update,R.drawable.ic_download,R.drawable.ic_delete,R.drawable.ic_help,R.drawable.ic_setting};
    private String title[] = {"Application Update","Download Managment","Uninstall app","Help and Feedbak","Settings"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        generalModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            GeneralModelClass beanClassForRecyclerView_contacts = new GeneralModelClass(image[i],title[i]);

            generalModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapter_General(MainActivity.this,generalModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }
}
