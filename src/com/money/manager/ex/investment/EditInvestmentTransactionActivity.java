package com.money.manager.ex.investment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.money.manager.ex.R;
import com.money.manager.ex.common.BaseFragmentActivity;

public class EditInvestmentTransactionActivity
        extends BaseFragmentActivity {

    public static final String EXTRA_ACCOUNT_ID = "EditInvestmentTransactionActivity:AccountId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_investment_transaction);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_investment_transaction, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}