package com.example.quickfix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quickfix.adapter.CategoryAdapter;
import com.example.quickfix.adapter.DiscountedProductAdapter;
import com.example.quickfix.adapter.RecentlyViewedAdapter;
import com.example.quickfix.model.Category;
import com.example.quickfix.model.DiscountedProducts;
import com.example.quickfix.model.RecentlyViewed;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.List;

import static com.example.quickfix.R.drawable.*;

public class HomeActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView, categoryRecyclerView, recentlyViewedRecycler;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    RecentlyViewedAdapter recentlyViewedAdapter;
    List<RecentlyViewed> recentlyViewedList;

    TextView allCategory;
    ImageView profile;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        discountRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        allCategory = findViewById(R.id.allCategoryImage);
        recentlyViewedRecycler = findViewById(R.id.recently_item);
        profile = findViewById(R.id.setting);
        



        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, AllCategory.class);
                startActivity(i);

            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to navigate to the Profile/Settings Activity
                Intent x = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(x);
            }
        });

        SearchView searchView = findViewById(R.id.search_bar);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false; // if you want to handle the search query when submitted
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterCategories(newText);
                filterRecentlyViewed(newText);
                return true;
            }
        });

        // adding data to model
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, discountmecha));
        discountedProductsList.add(new DiscountedProducts(2, discountcarpente));
        discountedProductsList.add(new DiscountedProducts(3, discountelectric));
        discountedProductsList.add(new DiscountedProducts(4, discountmecha));
        discountedProductsList.add(new DiscountedProducts(5, discountcarpente));
        discountedProductsList.add(new DiscountedProducts(6, discountelectric));

        // adding data to model
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1,"CCTV Repair", cctv));
        categoryList.add(new Category(2, "House Keeper",house));
        categoryList.add(new Category(3,"Plumber",plumber));
        categoryList.add(new Category(4, "Mechanician",mechanic));
        categoryList.add(new Category(5, "Carpenter",carpenter));
        categoryList.add(new Category(6, "Electrician",electrician));


        // adding data to model
        recentlyViewedList = new ArrayList<>();
        recentlyViewedList.add(new RecentlyViewed("John", "As a trusted plumber, I provide reliable solutions for all your plumbing needs. ", "Rs.1500.00", "Hours", "1","★★★★☆ 4.5",plumber, a1));
        recentlyViewedList.add(new RecentlyViewed("Thanos", "As a seasoned plumber, I specialize in delivering comprehensive plumbing solutions tailored to your needs. ", "Rs.1400.00", "Hours", "1", "★★★★☆ 4.5",plumber,a2));
        recentlyViewedList.add(new RecentlyViewed("Stew","As a skilled technician, I bring expertise and innovation to every project I undertake. ", "Rs.1500.00", "Hours", "1", "★★★★☆ 4.5", electrician, a3));
        recentlyViewedList.add(new RecentlyViewed("Amel", "As a versatile technician, I bring a wealth of expertise to the table, ensuring seamless functionality across various technical realms. ", "Rs.1400.00", "Hours", "1","★★★★☆ 4.5", electrician, a4));
        recentlyViewedList.add(new RecentlyViewed("Karthik", "As a skilled mechanic, I'm here to keep your vehicles running smoothly and safely. ", "Rs.1500.00", "Hours", "1","★★★★☆ 4.5", mechanic, a5));
        recentlyViewedList.add(new RecentlyViewed("Bruce", "As a dedicated mechanic, I bring expertise and passion to every automotive challenge", "Rs.1400.00", "Hours", "1", "★★★★☆ 4.5", mechanic, a6));
        recentlyViewedList.add(new RecentlyViewed("Kent", "As a skilled carpenter, I specialise in turning your ideas into beautifully crafted realities", "Rs.1500.00", "Hours", "1", "", carpenter, a7));
        recentlyViewedList.add(new RecentlyViewed("Ryu", "As a carpenter, I excel in crafting bespoke woodwork solutions tailored to your needs. ", "Rs.1400.00", "Hours", "1", "★★★★☆ 4.5", carpenter, a8));
        recentlyViewedList.add(new RecentlyViewed("Oliver", "I am a skilled CCTV repair technician with a comprehensive understanding of surveillance systems and a passion for ensuring optimal security solutions", "Rs.1500.00", "Hours", "1","★★★★☆ 4.5", cctv, a9));
        recentlyViewedList.add(new RecentlyViewed("James", "I am a seasoned CCTV repair specialist dedicated to ensuring the continuous operation and effectiveness of surveillance systems.", "Rs.1400.00", "Hours", "1", "★★★★☆ 4.5", cctv, a10));
        recentlyViewedList.add(new RecentlyViewed("Harry", "As a dedicated housekeeper, I pride myself on maintaining impeccable cleanliness and organization in all areas of the home. ", "Rs.1500.00", "Hours", "1", "★★★★☆ 4.5", house, a11));
        recentlyViewedList.add(new RecentlyViewed("Weensly", "As an experienced housekeeper, I bring a wealth of expertise in maintaining pristine cleanliness and orderliness to every home I serve. ", "Rs.1400.00", "Hours", "1", "★★★★☆ 4.5", house, a12));

        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
        setRecentlyViewedRecycler(recentlyViewedList);

    }

    private void filterCategories(String text) {
        List<Category> filteredList = new ArrayList<>();
        for (Category item : categoryList) {
            if (item.getCategoryName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        // Update the adapter with the filtered list
        categoryAdapter.updateData(filteredList);
    }

    private void filterRecentlyViewed(String text) {
        List<RecentlyViewed> filteredList = new ArrayList<>();
        for (RecentlyViewed item : recentlyViewedList) {
            // Assuming you want to search by name, adjust if necessary
            if (item.getName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        // Update the adapter with the filtered list
        recentlyViewedAdapter.updateData(filteredList);
    }


    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }


    private void setCategoryRecycler(List<Category> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }

    private void setRecentlyViewedRecycler(List<RecentlyViewed> recentlyViewedDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recentlyViewedRecycler.setLayoutManager(layoutManager);
        recentlyViewedAdapter = new RecentlyViewedAdapter(this,recentlyViewedDataList);
        recentlyViewedRecycler.setAdapter(recentlyViewedAdapter);
    }


    //Now again we need to create a adapter and model class for recently viewed items.
    // lets do it fast.
}