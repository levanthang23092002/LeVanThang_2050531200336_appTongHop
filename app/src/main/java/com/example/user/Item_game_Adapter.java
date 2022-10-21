package com.example.user;

    import android.content.Context;
    import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Item_game_Adapter extends RecyclerView.Adapter<Item_game_Adapter.gameViewHolder> {
    private Context context;
    private OnGameListener onGameListener;

    private List<item_game> listgame;


    public Item_game_Adapter(Context context, OnGameListener onMovieListener, List<item_game> listgame) {
        this.context = context;
        this.onGameListener = onMovieListener;
        this.listgame = listgame;
    }

    @NonNull
    @Override
    public gameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent,false);
        return new gameViewHolder(view, onGameListener);

    }

    @Override
    public void onBindViewHolder(@NonNull gameViewHolder holder, int position) {

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

        item_game listgame= this.listgame.get(position);
        if(listgame== null){
            return;
        }
        holder.image.setImageResource(listgame.getImage());
        holder.name.setText(listgame.getName());
        holder.year.setText(listgame.getYear());
        holder.type.setText(listgame.getType());
        holder.amount.setText(listgame.getAmount());
        holder.amount_rate.setText(listgame.getAmount_rate());
        holder.ratio.setText(listgame.getRatio());
        holder.image_rate.setImageResource(listgame.getImage_rate());
    }

    @Override
    public int getItemCount() {
        if(listgame != null){
            return  listgame.size();
        }
        return 0;
    }


    public class  gameViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView image,image_rate;
        private TextView name,year,type,amount,amount_rate,ratio;
        private OnGameListener onGameListener;


        public gameViewHolder(@NonNull View itemView,OnGameListener onGameListener) {
            super(itemView);

            this.onGameListener =onGameListener;

            image =itemView.findViewById(R.id.image);
            image_rate =itemView.findViewById(R.id.image_rate);
            year=itemView.findViewById(R.id.year);
            name=itemView.findViewById(R.id.name);
            type=itemView.findViewById(R.id.type);
            amount=itemView.findViewById(R.id.amount);
            amount_rate=itemView.findViewById(R.id.amount_rate);
            ratio=itemView.findViewById(R.id.ratio);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

            onGameListener.onGameClick(getAdapterPosition());
        }
    }
    public interface OnGameListener {
        void onGameClick(int position);
    }
}
