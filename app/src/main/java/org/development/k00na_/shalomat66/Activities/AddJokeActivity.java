package org.development.k00na_.shalomat66.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.development.k00na_.shalomat66.R;

import mehdi.sakout.fancybuttons.FancyButton;

/**
 * Created by k00na_ on 31.10.2015.
 */
public class AddJokeActivity extends AppCompatActivity {

    private RecyclerView categoriesRecycler;
    private EditText mEditText;
    private TextView mIzbranaKategorija2_TV, mIzbranaKategorija1_TV;
    private String mSelectedCategory;

    private FancyButton mIzberiKategorijo_BTN;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_joke);

        categoriesRecycler = (RecyclerView)findViewById(R.id.dialogRecycler);
        mIzberiKategorijo_BTN = (FancyButton)findViewById(R.id.addCategory_BTN);
        mIzbranaKategorija1_TV = (TextView)findViewById(R.id.izbranaKategorija1_TV);
        mIzbranaKategorija2_TV = (TextView)findViewById(R.id.izbranaKategorija_TV);


        mIzberiKategorijo_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFilterPopUp(v);
            }
        });









    }

    // TO:DO!!! Poveži Parse.categoryTitle in imena kategorij v aplikaciji

    // naredi tako, da ne boš rabu pretvornika iz izbranega šita v kategorijo
    // pač pa da bo že sam izbran string enak tistemu pod categoryTitle na Parse-u...

    private void showFilterPopUp(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        // Inflate the menu from xml
        popup.getMenuInflater().inflate(R.menu.categories_list, popup.getMenu());
        // Setup menu item selection
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.blondinke_categories_list:
                        mSelectedCategory = "Blondinke";
                        setupCategoryNameText();
                        return true;
                    case R.id.Crnogorci_categories_list:
                        mSelectedCategory = "Črnogorci";
                        setupCategoryNameText();
                        return true;
                    default:
                        return false;
                }
            }
        });
        // Handle dismissal with: popup.setOnDismissListener(...);
        // Show the menu
        popup.show();
    }


    private void setupCategoryNameText(){

        mIzbranaKategorija1_TV.setVisibility(View.VISIBLE);
        mIzbranaKategorija2_TV.setVisibility(View.VISIBLE);
        mIzbranaKategorija2_TV.setText(mSelectedCategory);

    }


}
