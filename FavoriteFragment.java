package com.example.tablayout;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {



    public FavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false);
    }


    class xxx extends AppCompatActivity{
        ListView listView;
        String mTitle[]={"Bánh bò ","Bánh pía","Bánh bò ","Bánh pía","Bánh bò ","Bánh pía","Bánh bò ","Bánh pía"};
        String mDescription[]= {"Facebook Description","bánh Description","kẹo Description","hello Description","hi Description","twich Description","Facebook Description","Facebook Description"};
        int images[ ] ={R.drawable.thucan1,R.drawable.thucan2,R.drawable.thucan3,R.drawable.thucan4,R.drawable.thucan5,R.drawable.thucan6,R.drawable.thucan7,R.drawable.thucan8};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_favorite);

            listView = findViewById(R.id.listView);

            MyAdapter adapter= new MyAdapter(this,mTitle,mDescription,images);
            listView.setAdapter(adapter);
            //set item click    on list view
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(position==0){
                        Toast.makeText(FavoriteFragment.this, "aaaaaa", Toast.LENGTH_SHORT).show();
                    }
                    if(position==0){
                        Toast.makeText(FavoriteFragment.this, "bbbbbb", Toast.LENGTH_SHORT).show();
                    }
                    if(position==0){
                        Toast.makeText(FavoriteFragment.this, "cccccc", Toast.LENGTH_SHORT).show();
                    }
                    if(position==0){
                        Toast.makeText(FavoriteFragment.this, "dddddd", Toast.LENGTH_SHORT).show();
                    }
                    if(position==0){
                        Toast.makeText(FavoriteFragment.this, "eeeeee", Toast.LENGTH_SHORT).show();
                    }
                    if(position==0){
                        Toast.makeText(FavoriteFragment.this, "ffffff", Toast.LENGTH_SHORT).show();
                    }
                    if(position==0){
                        Toast.makeText(FavoriteFragment.this, "gggggg", Toast.LENGTH_SHORT).show();
                    }
                    if(position==0){
                        Toast.makeText(MainActivity.this, "hhhhhh", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
        class MyAdapter extends ArrayAdapter<String> {
            Context context;
            String rTitle[];
            String rDescription[];
            int rImgs[];

            MyAdapter(Context c, String title[],String description[],int imgs[]){
                super(c,R.layout.row,R.id.textView1,title);
                this.context=c;
                this.rTitle =   title;
                this.rDescription=description;
                this.rImgs= imgs;

            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row=layoutInflater.inflate(R.layout.row,parent,false);
                ImageView images= row.findViewById(R.id.image);
                TextView myTitle = row.findViewById(R.id.textView1);
                TextView myDescription= row.findViewById(R.id.textView2);

                images.setImageResource(rImgs[position]);
                myTitle.setText(rTitle[position]);
                myDescription.setText(rDescription[position]);

                return row;
            }
        }
    }
}