package bpskenya.ke.co.talaclone;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>{

    public Context context;
    public MyRecyclerAdapter(Context context) {
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_layout,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);


        viewHolder.readMoreRelativeLayout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        context.startActivity(new Intent(context,ReadMoreActivity.class));
                    }
                }
        );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView readMoreTextView;
        public RelativeLayout readMoreRelativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            readMoreTextView=itemView.findViewById(R.id.readMore);
            readMoreRelativeLayout=itemView.findViewById(R.id.readMoreRelativeLayout);

       }
    }

}
