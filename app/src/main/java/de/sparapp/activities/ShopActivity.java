package de.sparapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import de.sparapp.R;
import de.sparapp.ShopAdapter;
import de.sparapp.entities.Product;
import de.sparapp.entities.ProductInBasket;
import de.sparapp.entities.ProductInShop;
import de.sparapp.entities.Shop;
import de.sparapp.entities.ShopResult;
import de.sparapp.providers.BasketProvider;
import de.sparapp.providers.ProductInShopProvider;
import de.sparapp.providers.ShopProvider;

public class ShopActivity extends AppCompatActivity {
    private ListView listView;
    private ShopAdapter shopAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.shoplist);

        shopAdapter = new ShopAdapter(this, calculate(getIntent().getDoubleExtra("distance", 15.0)));
        listView.setAdapter(shopAdapter);
    }

    private ShopResult[] calculate(double distance) {
        ArrayList<ShopResult> list = new ArrayList<>();

        shopLoop:
        for(Shop shop : ShopProvider.getShops()) {
            ShopResult result = new ShopResult();
            result.setShop(shop);

            double totalPrice = 0;

            if(shop.getDistance() > distance) {
                continue;
            }

            for(ProductInBasket basketProduct : BasketProvider.getProducts()) {
                for(int i = 0; i < basketProduct.getAmount(); i++) {
                    ProductInShop shopProduct = ProductInShopProvider.getProduct(shop, basketProduct.getProduct());

                    if(shopProduct != null) {
                        totalPrice += shopProduct.getPrice();
                    } else {
                        continue shopLoop;
                    }
                }
            }
            totalPrice += shop.getDistance() * 0.3;
            result.setTotalPrice(totalPrice);

            list.add(result);
        }

        Collections.sort(list, new Comparator<ShopResult>() {
            @Override
            public int compare(ShopResult shopResult, ShopResult t1) {
                if (shopResult.getTotalPrice() < t1.getTotalPrice()) return -1;
                if (shopResult.getTotalPrice() > t1.getTotalPrice()) return 1;
                return 0;
            }
        });

        double highestPrice = list.get(list.size() - 1).getTotalPrice();

        for(ShopResult result : list) {
            result.setDifference(highestPrice - result.getTotalPrice());
        }

        return list.toArray(new ShopResult[list.size()]);
    }
}
