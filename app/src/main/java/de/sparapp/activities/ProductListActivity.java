package de.sparapp.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import de.sparapp.R;
import de.sparapp.entities.Product;
import de.sparapp.providers.BasketProvider;
import de.sparapp.providers.ProductProvider;

public class ProductListActivity extends AppCompatActivity {
    private ArrayAdapter<Product> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);
        final Button basketBtn = (Button)findViewById(R.id.btnBasket);
        final EditText searchText = (EditText) findViewById(R.id.textSearch);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        final ListView productList = (ListView)findViewById(R.id.listProducts);

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ArrayAdapter<Product>(this, android.R.layout.simple_list_item_1);
        productList.setAdapter(adapter);

        basketBtn.setText(String.format("Warenkorb (%d)", BasketProvider.getTotal()));
        productList.setClickable(true);
        productList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product selected = adapter.getItem(i);
                BasketProvider.addProduct(selected);
                basketBtn.setText(String.format("Warenkorb (%d)", BasketProvider.getTotal()));
            }
        });

        searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                searchProduct(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        basketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent basketIntent = new Intent(view.getContext(), BasketActivity.class);
                view.getContext().startActivity(basketIntent);
            }
        });

        searchProduct("");
    }

    private void searchProduct(String productName) {
        List<Product> products = ProductProvider.getProducts();
        List<Product> filteredProducts = new ArrayList<>();

        for(Product product : products)
        {
            if(product.getTitle().toLowerCase().contains(productName.toLowerCase())) {
                filteredProducts.add(product);
            }
        }

        adapter.clear();
        adapter.addAll(filteredProducts);
    }
}
