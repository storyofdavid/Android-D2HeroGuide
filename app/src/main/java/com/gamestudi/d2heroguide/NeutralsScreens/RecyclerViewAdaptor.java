package com.gamestudi.d2heroguide.NeutralsScreens;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.gamestudi.d2heroguide.R;

import java.util.List;


public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.ViewHolder> {

    private List<Item> list;
    private Context context;


    public RecyclerViewAdaptor(List<Item> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_style, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdaptor.ViewHolder holder, final int position) {
        Item myList = list.get(position);

        holder.imageView.setImageResource(myList.getImage());
        holder.textViewHead.setText(myList.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView text = (TextView) v.findViewById(R.id.textViewHead);
                Context context = v.getContext();
                Intent intent = new Intent();

                switch(text.getText().toString()) {

                    //Switch case statements for type of neutral creep selected
                    case "Small Camps":
                        intent = new Intent(context, NeutralsSmallCampActivity.class);
                        context.startActivity(intent);
                        break;

                    case "Medium Camps":
                        intent = new Intent(context, NeutralsMediumCampActivity.class);
                        context.startActivity(intent);
                        break;

                    case "Large Camps":
                        intent = new Intent(context, NeutralsLargeCampActivity.class);
                        context.startActivity(intent);
                        break;

                    case "Ancient Camps":
                        intent = new Intent(context, NeutralsAncientCampActivity.class);
                        context.startActivity(intent);
                        break;

                    case "Roshan":
                        intent = new Intent(context, NeutralsSelected.class);
                        intent.putExtra("neutralSelected", "Roshan");
                        context.startActivity(intent);
                        break;
                    default:
                        //No default action
                }
            }
        });



        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
               //Do something
                return true;
            }
        });
    }


    @Override
    public int getItemCount() {

        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewHead;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);


            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
        }
    }
}
