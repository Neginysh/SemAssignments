package com.example.lenovocom.thirdsemapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class NavDrawerActivity extends AppCompatActivity {
    ListView listView;
    ListView drawerListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer);
        bindViews();

        List<HotelModel> hotelModels = new ArrayList<HotelModel>();
        String [] fields ={
                "Login",
                "Edit Account",
                "History",
                "Filter",
                "Help"
        };

        HotelModel Elephant = new HotelModel();
        Elephant.setName("Elephant");
        Elephant.setStar(5);
        Elephant.setDistanceToCenter(200);
        Elephant.setImgResource(R.drawable.first);
        //    Elephant.setImgURL("https://s-ec.bstatic.com/images/hotel/max1280x900/435/43526178.jpg");

        HotelModel HandA = new HotelModel();
        HandA.setName("H and A");
        HandA.setStar(4);
        HandA.setDistanceToCenter(900);
        HandA.setImgResource(R.drawable.second);
        //   HandA.setImgURL("https://t-ec.bstatic.com/images/hotel/max1280x900/443/44360451.jpg");

        HotelModel Georgia = new HotelModel();
        Georgia.setName("Georgia");
        Georgia.setStar(5);
        Georgia.setDistanceToCenter(550);
        Georgia.setImgResource(R.drawable.third);
        Georgia.setImgURL("https://t-ec.bstatic.com/images/hotel/max1280x900/913/91355805.jpg");

        HotelModel Merketal = new HotelModel();
        Merketal.setName("Merketal");
        Merketal.setStar(3);
        Merketal.setDistanceToCenter(1200);
        Merketal.setImgResource(R.drawable.third);
        //  Merketal.setImgURL("https://s-ec.bstatic.com/images/hotel/max1280x900/800/8006524.jpg");

        hotelModels.add(Elephant);
        hotelModels.add(HandA);
        hotelModels.add(Georgia);
        hotelModels.add(Merketal);


        HotelModelAdapter adapter = new HotelModelAdapter(this, hotelModels);
        listView.setAdapter(adapter);
        DrawerAdapter drawerAdapter = new DrawerAdapter(this, fields);
        drawerListView.setAdapter(drawerAdapter);
    }


    void bindViews() {
        listView = (ListView) findViewById(R.id.view_list);
        drawerListView = (ListView) findViewById(R.id.view_list_drawer);
    }
}
