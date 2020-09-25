package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //해당 리소스 ID에 해당하는 파일을 파싱하여 뷰를 생성하고 뷰의 속성, 상하관계를 맞추어 배치(inflate)

        ListView listView = findViewById(R.id.listview);

        ArrayList<Item> data = new ArrayList<>();
        //item bill = new item(R.drawable.bill, "bill");
        data.add(new Item(R.drawable.bill, "bill"));
        data.add(new Item(R.drawable.lilly, "lilly"));
        data.add(new Item(R.drawable.scarlet, "scarlet"));
        data.add(new Item(R.drawable.oyster, "oyster"));
        data.add(new Item(R.drawable.bindweed, "bindweed"));

        Adapter adapter = new Adapter(this, R.layout.list_item, data);//this = ?
        listView.setAdapter(adapter);//xml파일에서 배치한 listView를 참조하기 위해 아답터를 설정

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        //AdapterView.OnItemClickListener을 implement받는 방법도 있음
        //구현 이벤트 수가 적은 경우, 리스너를 재사용하지 않을 경우 많이 사용
        //AdapterView 하위에 listView가 존재한다
        //ex) btn1.setOnClickListener(new View.OnClickListenr(){})와 같은 형식

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Item item = data.get(position);


                TextView ttt = (TextView)view.findViewById(R.id.textview);
                //ttt.setText("test");

                String text = ttt.getText().toString();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();

            }
        });

    }

}