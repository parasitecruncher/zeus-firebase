package info.company.zeus;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import info.company.zeus.Models.Host;

/**
 * Created by prashanth on 3/25/17.
 */

class PartyAdapter extends RecyclerView.Adapter<PartyAdapter.MyViewHolder> {
    private ArrayList<Host> hosts;

    PartyAdapter(ArrayList<Host> hosts){
        this.hosts=hosts;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView partyname;

        MyViewHolder(View view) {
            super(view);
            partyname = (TextView) view.findViewById(R.id.text_row);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.partylist_row, parent, false);

        return new MyViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Host host = hosts.get(position);
        holder.partyname.setText(host.getEmail());
    }

    @Override
    public int getItemCount() {
        return hosts.size();
    }


}
