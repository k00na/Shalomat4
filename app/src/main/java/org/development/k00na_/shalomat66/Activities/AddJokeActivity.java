package org.development.k00na_.shalomat66.Activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.development.k00na_.shalomat66.R;

/**
 * Created by k00na_ on 31.10.2015.
 */
public class AddJokeActivity extends AppCompatActivity {

    private RecyclerView categoriesRecycler;
    private EditText mEditText;
    private TextView mIzbranaKategorija_TV;
    private String mSelectedCategory;
    private CategoriesRecyclerAdapter mCategoriesRecyclerAdapter;
    private Button mIzberiKategorijo_BTN;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_joke);

        categoriesRecycler = (RecyclerView)findViewById(R.id.dialogRecycler);
        mIzberiKategorijo_BTN = (Button)findViewById(R.id.addCategory_BTN);
        mIzbranaKategorija_TV = (TextView)findViewById(R.id.izbranaKategorija_TV);

        mIzberiKategorijo_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFilterPopUp(v);
            }
        });

        mCategoriesRecyclerAdapter = new CategoriesRecyclerAdapter(AddJokeActivity.this);
        LinearLayoutManager llm = new LinearLayoutManager(AddJokeActivity.this, LinearLayoutManager.VERTICAL, false);
        categoriesRecycler.setAdapter(mCategoriesRecyclerAdapter);
        categoriesRecycler.setLayoutManager(llm);







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
                        mIzbranaKategorija_TV.setText(mSelectedCategory);
                        return true;
                    case R.id.Crnogorci_categories_list:
                        mSelectedCategory = "Črnogorci";
                        mIzbranaKategorija_TV.setText(mSelectedCategory);
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


    class CategoriesRecyclerAdapter extends RecyclerView.Adapter<CategoryRow>{


        Context mContext;

        private String[] categoriesArray = {"Blondinke", "Opolzki", "Policaji", "Gostilniški", "Janezek",
                "Črni Humor", "Yugo Vici", "Črnogorci", "Mujo&Haso", "Hrvati", "Slovenci", "Srbi",
                "Yo Momma!", "Blondes", "Sex Related", "Wordplay Jokes",};

        public CategoriesRecyclerAdapter(Context c){

            mContext = c;
        }


        @Override
        public CategoryRow onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = getLayoutInflater().from(mContext).inflate(R.layout.category_row, parent, false);
            CategoryRow categoryRow = new CategoryRow(v);

            return categoryRow;
        }

        @Override
        public void onBindViewHolder(final CategoryRow holder, final int position) {


            holder.mLinearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(holder.mRadioButton.isChecked() == false){
                        holder.mRadioButton.setChecked(true);
                        mSelectedCategory = categoriesArray[position];
                    } else {
                        holder.mRadioButton.setChecked(false);
                        mSelectedCategory = " / ";
                    }

                }
            });




        }

        @Override
        public int getItemCount() {
            return categoriesArray.length;
        }
    }

    class CategoryRow extends RecyclerView.ViewHolder{

        private RadioButton mRadioButton;
        private TextView mCategoryName;
        private LinearLayout mLinearLayout;

        public CategoryRow(View itemView) {
            super(itemView);

            mRadioButton = (RadioButton)itemView.findViewById(R.id.category_RB);
            mCategoryName = (TextView)itemView.findViewById(R.id.categoryRowName_TV);
            mLinearLayout = (LinearLayout)itemView.findViewById(R.id.categoryRowLayout);


        }
    }
}
