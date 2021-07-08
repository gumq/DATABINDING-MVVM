package com.votandao.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.votandao.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserRecyclerAdapter userRecyclerAdapter = new UserRecyclerAdapter(getFilmList());
        activityMainBinding.recyclerView.setAdapter(userRecyclerAdapter);
        activityMainBinding.recyclerView.addItemDecoration(new DividerItemDecoration
                (this, DividerItemDecoration.VERTICAL));

    }

    private List<Film> getFilmList() {
        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("Bố Già", "Trấn Thành", true, "https://photo-cms-plo.zadn.vn/w800/Uploaded/2021/wopsvun/2020_12_03/image001_urah.jpg", 4));
        filmList.add(new Film("Đôi Mắt Âm Dương", "Nhất Trung", true, "https://ss-images.saostar.vn/wp700/2020/01/18/6847649/teaser-poster.png", 5));
        filmList.add(new Film("Ai Chết Giơ Tay", "Huỳnh Lập", true, "https://sandien24h.vn/uploads/images/ai-chet-trailer%20(2).jpg", 3));
        filmList.add(new Film("Mắt Biết", "Victor Vũ", true, "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2020/10/phim-viet-chieu-rap-2020-6-696x994.jpg?fit=700%2C20000&quality=95&ssl=1", 5));
        filmList.add(new Film("30 Chưa Phải Là Tết", "Quang Huy", true, "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2020/10/phim-viet-chieu-rap-2020-13-696x994.jpg?fit=700%2C20000&quality=95&ssl=1", 1));
        filmList.add(new Film("Sky Tour Movie", "Sơn Tùng MTP", true, "https://www.gocdienanh.com/wp-content/uploads/2020/06/sky-tour-movie-7.jpg", 2));
//        filmList.add(new Film("The State of Grade", 70, true, "https://picsum.photos/id/238/200"));
//        filmList.add(new Film("Harry Potter", 70, false, "https://picsum.photos/id/239/200"));
//        filmList.add(new Film("Jessica Simpson", 70, true, "https://picsum.photos/id/240/200"));
//        filmList.add(new Film("Paul Addams", 70, false, "https://picsum.photos/id/241/200"));
        return filmList;
    }
//    public class clickHandler{
//        private Context context;
//
//        public clickHandler(Context context) {
//            this.context = context;
//        }
//        public void simpleButtonClick(View view){
//            Toast.makeText(context, "simple button click", Toast.LENGTH_SHORT).show();
//        }
//    }
}