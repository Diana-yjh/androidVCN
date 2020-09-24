package com.example.helloworld;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//해당 리소스 ID에 해당하는 파일을 파싱하여 뷰를 생성하고 뷰의 속성, 상하관계를 맞추어 배치(inflate)

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
    }
}