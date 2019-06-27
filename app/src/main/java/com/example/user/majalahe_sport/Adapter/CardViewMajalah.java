package com.example.user.majalahe_sport.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.user.majalahe_sport.R;
import com.example.user.majalahe_sport.entity.Majalah;
import com.example.user.majalahe_sport.majalah1;

import java.util.List;
//didalam array list class

public class CardViewMajalah extends RecyclerView.Adapter<CardViewMajalah.CardViewViewHolder> {
    private List<Majalah> listmajalah;
    private Context context;

    public CardViewMajalah(List<Majalah> listmajalah, Context context) {
        this.listmajalah = listmajalah;
        this.context = context;
    }

//    public ArrayList<Majalah> getListmajalah() {
//        return listmajalah;
//    }
//
//    public void setListmajalah(){
//
//    }

//


    @Override
    public CardViewViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder( CardViewViewHolder holder , int position) {
        Majalah majalah = listmajalah.get(position);

        Glide.with(context)
                .load(majalah.getPhoto())
                .into(holder.mImage);

        holder.mTextJudul.setText(majalah.getName());
        holder.mTextDesk.setText(majalah.getRemarks());

    }

    @Override
    public int getItemCount() {
        return listmajalah.size();
    }


    public class CardViewViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImage;
        private TextView mTextJudul;
        private TextView mTextDesk;
        private Button button;
        private Button button1;

        public CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            mImage = (ImageView) itemView.findViewById(R.id.majalah);
            mTextJudul = (TextView) itemView.findViewById(R.id.judul);
            mTextDesk = (TextView) itemView.findViewById(R.id.deskripsi);
            button = (Button) itemView.findViewById(R.id.btn_detail);
            button1 = (Button) itemView.findViewById(R.id.btn_share);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Majalah data = listmajalah.get(getLayoutPosition());

                    // untuk mengirim data ke majalah1
                    Intent intent = new Intent(context, majalah1.class );
                    intent.putExtra("judul", data.getName());
                    intent.putExtra("remarks", data.getRemarks());
                    intent.putExtra("detail", data.getDetail_kode());
                    intent.putExtra("gambar", data.getPhoto());

                    context.startActivity(intent);
                }
            });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Majalah data1 = listmajalah.get(getLayoutPosition());

                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, data1.getUrl());
                    sendIntent.setType("text/plain");
                    sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    context.startActivity(sendIntent);


                }
            });

        }

    }
}
