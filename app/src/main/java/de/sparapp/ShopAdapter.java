package de.sparapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

import de.sparapp.entities.ShopResult;

public class ShopAdapter extends BaseAdapter {
    Context context;
    ShopResult[] data;
    private static LayoutInflater inflater = null;

    public ShopAdapter(Context context, ShopResult[] data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vi = view;
        if (vi == null)
            vi = inflater.inflate(R.layout.row, null);
        TextView priceText = (TextView) vi.findViewById(R.id.rowPrice);
        TextView nameText = (TextView) vi.findViewById(R.id.rowName);
        TextView distanceText = (TextView) vi.findViewById(R.id.rowDistance);
        TextView differenceText = (TextView) vi.findViewById(R.id.rowDifference);

        nameText.setText(data[i].getShop().getName());
        priceText.setText(NumberFormat.getCurrencyInstance(new Locale("de", "DE")).format(data[i].getTotalPrice()));
        distanceText.setText(String.format("%.1f km", data[i].getShop().getDistance()));
        differenceText.setText("(-" + NumberFormat.getCurrencyInstance(new Locale("de", "DE")).format(data[i].getDifference()) + ")");
        return vi;
    }
}
