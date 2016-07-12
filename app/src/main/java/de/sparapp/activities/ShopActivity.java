package de.sparapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
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

        listView = (ListView) findViewById(R.id.shoplist);

        ShopResult result = new ShopResult();
        result.setDifference(5.5);
        result.setDistance(2.5);
        result.setShop(ShopProvider.getShops().get(0));
        shopAdapter = new ShopAdapter(this, new ShopResult[] { result });
        listView.setAdapter(shopAdapter);
    }

    private ShopResult[] calculate() {
        ArrayList<ShopResult> list = new ArrayList<>();

        for(Shop shop : ShopProvider.getShops()) {
            ShopResult result = new ShopResult();
            result.setShop(shop);

            double totalPrice = 0;

            for(ProductInBasket basketProduct : BasketProvider.getProducts()) {
                for(int i = 0; i < basketProduct.getAmount(); i++) {
                    ProductInShop shopProduct = ProductInShopProvider.getProduct(shop, basketProduct.getProduct());

                    if(shopProduct != null) {
                        totalPrice += shopProduct.getPrice();
                    } else {
                        break;
                    }
                }
            }
            result.setTotalPrice(totalPrice);

            list.add(result);
        }



        return (ShopResult[])list.toArray();
    }
}
