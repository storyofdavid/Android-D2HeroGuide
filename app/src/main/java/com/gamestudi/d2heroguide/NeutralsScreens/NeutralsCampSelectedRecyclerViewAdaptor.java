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


public class NeutralsCampSelectedRecyclerViewAdaptor extends RecyclerView.Adapter<NeutralsCampSelectedRecyclerViewAdaptor.ViewHolder> {

    private List<Item> list;
    private Context context;


    public NeutralsCampSelectedRecyclerViewAdaptor(List<Item> list, Context context) {
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
    public void onBindViewHolder(final NeutralsCampSelectedRecyclerViewAdaptor.ViewHolder holder, final int position) {
        Item myList = list.get(position);

        holder.imageView.setImageResource(myList.getImage());
        holder.textViewHead.setText(myList.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView text = (TextView) v.findViewById(R.id.textViewHead);
                Context context = v.getContext();

                final Intent intent = new Intent(context, NeutralsSelected.class);

                switch(text.getText().toString()) {

                    //Switch case statements for small camps
                    case "Ghost Camp":
                        intent.putExtra("neutralSelected", "Ghost Camp");
                        context.startActivity(intent);
                        break;

                    case "Harpy Camp":
                        intent.putExtra("neutralSelected", "Harpy Camp");
                        context.startActivity(intent);
                        break;

                    case "Hill Troll And Kobold Camp":
                        intent.putExtra("neutralSelected", "Hill Troll And Kobold Camp");
                        context.startActivity(intent);
                        break;

                    case "Hill Troll Camp":
                        intent.putExtra("neutralSelected", "Hill Troll Camp");
                        context.startActivity(intent);
                        break;

                    case "Kobold Camp":
                        intent.putExtra("neutralSelected", "Kobold Camp");
                        context.startActivity(intent);
                        break;

                    case "Vhoul Assassin Camp":
                        intent.putExtra("neutralSelected", "Vhoul Assassin Camp");
                        context.startActivity(intent);
                        break;


                    //Switch case statements for medium camps
                    case "Centaur Camp":
                        intent.putExtra("neutralSelected", "Centaur Camp");
                        context.startActivity(intent);
                        break;

                    case "Golem Camp":
                        intent.putExtra("neutralSelected", "Golem Camp");
                        context.startActivity(intent);
                        break;

                    case "Ogre Camp":
                        intent.putExtra("neutralSelected", "Ogre Camp");
                        context.startActivity(intent);
                        break;

                    case "Satyr Camp":
                        intent.putExtra("neutralSelected", "Satyr Camp");
                        context.startActivity(intent);
                        break;

                    case "Wolf Camp":
                        intent.putExtra("neutralSelected", "Wolf Camp");
                        context.startActivity(intent);
                        break;



                    //Switch case statements for large camps
                    case "Hellbear Camp":
                        intent.putExtra("neutralSelected", "Hellbear Camp");
                        context.startActivity(intent);
                        break;

                    case "Large Centaur Camp":
                        intent.putExtra("neutralSelected", "Large Centaur Camp");
                        context.startActivity(intent);
                        break;

                    case "Large Satyr Camp":
                        intent.putExtra("neutralSelected", "Large Satyr Camp");
                        context.startActivity(intent);
                        break;

                    case "Troll Camp":
                        intent.putExtra("neutralSelected", "Troll Camp");
                        context.startActivity(intent);
                        break;

                    case "Wildwing Camp":
                        intent.putExtra("neutralSelected", "Wildwing Camp");
                        context.startActivity(intent);
                        break;



                    //Switch case statements for ancient camps
                    case "Dragon Camp":
                        intent.putExtra("neutralSelected", "Dragon Camp");
                        context.startActivity(intent);
                        break;

                    case "Large Golem Camp":
                        intent.putExtra("neutralSelected", "Large Golem Camp");
                        context.startActivity(intent);
                        break;

                    case "Thunderhide Camp":
                        intent.putExtra("neutralSelected", "Thunderhide Camp");
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
