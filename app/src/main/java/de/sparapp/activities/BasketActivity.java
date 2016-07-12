package de.sparapp.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import de.sparapp.R;
import de.sparapp.entities.ProductInBasket;
import de.sparapp.providers.BasketProvider;

public class BasketActivity extends AppCompatActivity {
    private ArrayAdapter<ProductInBasket> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basket);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView basketList = (ListView)findViewById(R.id.listBasket);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        basketList.setAdapter(adapter);

        Button calculateBtn = (Button)findViewById(R.id.btnCalculate);
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = openDialog();
                dialog.show();
            }
        });

        adapter.clear();
        adapter.addAll(BasketProvider.getProducts());
    }

    private Dialog openDialog() {
        final EditText input = new EditText(this);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Bitte geben Sie die Distanz ein (km):")
                .setPositiveButton("Berechne", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent shopIntent = new Intent(BasketActivity.this, ShopActivity.class);
                        shopIntent.putExtra("distance", new Double(input.getText().toString()));
                        BasketActivity.this.startActivity(shopIntent);
                    }
                })
                .setNegativeButton("Abbrechen", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        input.setText("15");
        builder.setView(input);

        return builder.create();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
