package com.example.ejerciciorecuperacionretrofitpractica.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejerciciorecuperacionretrofitpractica.Constantes.Constante;
import com.example.ejerciciorecuperacionretrofitpractica.R;
import com.example.ejerciciorecuperacionretrofitpractica.modelos.DataItem;
import com.example.ejerciciorecuperacionretrofitpractica.modelos.DataItem;

import java.util.List;

public class CoinAdapter extends RecyclerView.Adapter<CoinAdapter.DataItemVH> {
    //para trabajar este adapter necvesita una lista de DataItems llamada objects
    //

    private List<DataItem> objects;
    private int resource;
    private Context context;

    public CoinAdapter(List<DataItem> objects, int resource, Context context) {
        this.objects = objects;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public DataItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //del tiron
        return new DataItemVH(LayoutInflater.from(context).inflate(resource, null));
    }

    @Override
    public void onBindViewHolder(@NonNull DataItemVH holder, int position) {
        DataItem mone = objects.get(position);
        holder.lblsimbolo.setText(mone.getName());

    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public class DataItemVH extends RecyclerView.ViewHolder {
        TextView lblsimbolo;
        TextView lblnomb;
        TextView lblprecio;
        TextView lblexplor;
        public DataItemVH(@NonNull View itemView) {
            super(itemView);
            lblsimbolo = itemView.findViewById(R.id.lblSimbCoinCard);
            lblnomb = itemView.findViewById(R.id.lblnombreCoinCar);
            lblprecio = itemView.findViewById(R.id.lblprecioCoinCard);
            lblexplor = itemView.findViewById(R.id.lblexplorer);
        }
    }
}
