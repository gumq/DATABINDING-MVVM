package com.votandao.databinding;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.votandao.databinding.databinding.ActivityMainBinding;
import com.votandao.databinding.databinding.ProductRowBinding;

import java.util.List;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserRecyclerAdapter.UserViewHolder> {

    private static final String TAG = "UserRecyclerAdapter";
    List<Film> filmList;
    WebView webView;
    public UserRecyclerAdapter(List<Film> filmList) {
        this.filmList = filmList;
    }
    Context context;
    @NonNull
    //tao ra doi tuong ViewHolder, trong no chua view hien thi du lieu
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ProductRowBinding productRowBinding = ProductRowBinding.inflate(layoutInflater, parent, false);
        return new UserViewHolder(productRowBinding);
    }
    //chuyen du lieu vao phan tu ViewHoldler
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        final Film film = filmList.get(position);
        holder.productRowBinding.setFilm(film);
        holder.productRowBinding.executePendingBindings();
        holder.productRowBinding.activeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Log.d(TAG, "onClick: " + filmList.get(getAdapterPosition()));

                Intent intent = new Intent(view.getContext(), trailer.class);
                intent.putExtra("title",filmList.get(position).getNameFilm ());
                view.getContext().startActivity(intent);
//                    Toast.makeText(view.getContext(),
//                            filmList.get(getAdapterPosition())
//                                    + "", Toast.LENGTH_SHORT)
//                            .show();

            }
        });
    }
//cho biet so phan tu cua du lieu
    @Override
    public int getItemCount() {
        return filmList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        ProductRowBinding productRowBinding;
        trailer trailer;
        public UserViewHolder(@NonNull ProductRowBinding productRowBinding) {
            super(productRowBinding.getRoot());
            this.productRowBinding = productRowBinding;


        }
    }
}
