package com.mohit.vip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class viewadapter extends RecyclerView.Adapter<viewadapter.formViewHolder> {

    ArrayList<in> d;
    Context context;

    public viewadapter(ArrayList<in> d, Context context) {
        this.d = d;
        this.context = context;
    }

    class formViewHolder extends  RecyclerView.ViewHolder{

        TextView name,age,gender,email,mob,college,year,area,techs,working,link,fb,git,resume,why,share,any,ref;
        public formViewHolder( View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.nametv);
            age = (TextView)itemView.findViewById(R.id.agetv);
            gender = (TextView)itemView.findViewById(R.id.gendertv);
            email = (TextView)itemView.findViewById(R.id.emailtv);
            mob = (TextView)itemView.findViewById(R.id.mobiletv);
            college = (TextView)itemView.findViewById(R.id.collegetv);
            year = (TextView)itemView.findViewById(R.id.yeartv);
            area = (TextView)itemView.findViewById(R.id.areatv);
            techs = (TextView)itemView.findViewById(R.id.techstv);
            working = (TextView)itemView.findViewById(R.id.workingtv);
            link = (TextView)itemView.findViewById(R.id.linktv);
            fb = (TextView)itemView.findViewById(R.id.fbtv);
            git = (TextView)itemView.findViewById(R.id.gittv);
            resume = (TextView)itemView.findViewById(R.id.resumetv);
            why = (TextView)itemView.findViewById(R.id.whytv);
            share = (TextView)itemView.findViewById(R.id.sharetv);
            any = (TextView)itemView.findViewById(R.id.anytv);
            ref = (TextView)itemView.findViewById(R.id.reftv);

        }
    }

    @NonNull
    @Override
    public formViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data,parent,false);
        return new formViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull formViewHolder holder, int position) {
        in gf = d.get(position);
        holder.name.setText("Name :- "+gf.name);
        holder.age.setText("Age :- "+gf.age+"");
        holder.gender.setText("Gender :- "+gf.gender);
        holder.email.setText("Email Id :- "+gf.email);
        holder.mob.setText("Mobile No. :- "+gf.mob);
        holder.college.setText("College :- "+gf.college);
        holder.year.setText("Year :- "+gf.year);
        holder.area.setText("Area Of Expertise :- "+gf.area);
        holder.techs.setText("Technologies :- "+gf.techs);
        holder.working.setText("Working on :- "+gf.working);
        holder.link.setText("Linkedln :- "+gf.link);
        holder.fb.setText("Facebook :- "+gf.fb);
        holder.git.setText("Git :- "+gf.git);
        holder.resume.setText("Resume :- "+gf.resume);
        holder.why.setText("Why want to join :- "+gf.why);
        holder.share.setText("Past Experience :- "+gf.share);
        holder.any.setText("Anything about you :- "+gf.any);
        holder.ref.setText("Reference :- "+gf.ref);
    }


    @Override
    public int getItemCount() {
        return d.size();
    }
}

