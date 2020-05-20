package com.example.androidavatar.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.androidavatar.R;
import java.util.List;

public class MasterListAdapter extends RecyclerView.Adapter<MasterListAdapter.MyViewHolder> {

    Context context;
    List<Integer> imageIds;

    public MasterListAdapter(Context context, List<Integer> imageIds){
        this.context = context;
        this.imageIds = imageIds;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int id = imageIds.get(position);
        holder.setData(id);
    }

    @Override
    public int getItemCount() {
        return imageIds.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        public MyViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.item);
        }

        public void setData(int id){
            imageView.setImageResource(id);
        }
    }

}
