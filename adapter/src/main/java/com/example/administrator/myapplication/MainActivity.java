package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView listView;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);

        ArrayList<Model> mlist=new ArrayList<>();
       
        Model model;
        for (int i = 0; i < 50; i++) {
            model = new Model(R.drawable.ic_launcher, "标题" + i, "内容" + i);
            mlist.add(model);
            model = null;
        }


    }

     class Model {

         private TextView item_title;
         private TextView item_content;
         private int icon;

         public Model(int ic_launcher, String s, String s1) {
         }

         public int getIcon() {
             return icon;
         }

         public Model setIcon(int icon) {
             this.icon = icon;
             return this;
         }


         public TextView getItem_title() {
             return item_title;
         }

         public Model setItem_title(TextView item_title) {
             this.item_title = item_title;
             return this;
         }

         public TextView getItem_content() {
             return item_content;
         }

         public Model setItem_content(TextView item_content) {
             this.item_content = item_content;
             return this;
         }



    }
}