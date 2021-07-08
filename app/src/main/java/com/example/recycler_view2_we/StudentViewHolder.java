package com.example.recycler_view2_we;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvStudentImage;
    private TextView mTVStudentName;
    private TextView mTVStudentAge;
    private TextView mTVStudentDob;
    private TextView mTVStudentAddress;
    private ItemClickListener itemClickListener;
    private RelativeLayout relativeLayout;

    public StudentViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvStudentImage = itemView.findViewById(R.id.ivStudentImage);
        mTVStudentName = itemView.findViewById(R.id.tvStudentName);
        mTVStudentAge = itemView.findViewById(R.id.tvStudentAge);
        mTVStudentDob = itemView.findViewById(R.id.tvStudentDob);
        mTVStudentAddress = itemView.findViewById(R.id.tvStudentAddress);
        relativeLayout = itemView.findViewById(R.id.rvCard);
    }

    public void setData(StudentModel studentModel) {
        mIvStudentImage.setImageResource(studentModel.getImageId());
        mTVStudentName.setText(studentModel.getName());
        mTVStudentAge.setText(studentModel.getAge() + "");
        mTVStudentDob.setText(studentModel.getdob());
        mTVStudentAddress.setText(studentModel.getAddress());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(studentModel,getAdapterPosition());
            }
        });
    }
}
