package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {
    List<Cars> carsList;
    Button btn_book;
    Context context;

    public RecycleViewAdapter(List<Cars> carlist,Context context) {
        this.carsList=carlist;
        this.context=context;
    }

    @NonNull

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_car, parent, false);
//        return new MyViewHolder(view);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }


    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_carName.setText(carsList.get(position).getName());
        Glide.with(this.context).load(carsList.get(position).getImageURL()).into(holder.img_car);
        Cars car = carsList.get(position);
        holder.tv_carName.setText(car.getName());
        //holder.img_car.setImageURI(car.getImageURL());
        holder.img_car.setImageURI(Uri.parse(car.getImageURL()));
        holder.btn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookingCarActivity.class);
                intent.putExtra("carName", car.getName());
                intent.putExtra("carImage", car.getImageURL());
                intent.putExtra("Model", car.getModel());
                intent.putExtra("Milleage", car.getMilleage());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_car;
        TextView tv_carName;
        Button btn_book;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_car = itemView.findViewById(R.id.img_car);
            tv_carName = itemView.findViewById(R.id.tv_carName);
            btn_book = itemView.findViewById(R.id.btn_book);

            btn_book.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Redirect to the booking car activity
                    Intent intent = new Intent(context, BookingCarActivity.class);
                    // Pass any necessary data using intent.putExtra()
                    context.startActivity(intent);
                }
            });
        }
    }
}
