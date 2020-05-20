package com.example.androidavatar.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidavatar.R;

import java.util.List;

public class BodyPartFragment extends Fragment {

    private List<Integer> images;
    private int index;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.body_part_fragment,container,false);
        ImageView imageView = view.findViewById(R.id.image);
        if(this.images!=null)
            imageView.setImageResource(this.images.get(this.index));
        return view;
    }

    public void setImages(List<Integer> images){
        this.images = images;
    }

    public void setIndex(int index){
        this.index = index;
    }

}
