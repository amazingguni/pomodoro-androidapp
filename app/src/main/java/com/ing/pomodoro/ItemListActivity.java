package com.ing.pomodoro;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ing.pomodoro.authentication.AccountGeneral;
import com.ing.pomodoro.authentication.PomodoroAuthenticator;
import static com.ing.pomodoro.authentication.AccountGeneral.AUTHTOKEN_TYPE_FULL_ACCESS;

/**
 * An activity representing a list of Items. This activity has different presentations for handset
 * and tablet-size devices. On handsets, the activity presents a list of items, which when touched,
 * lead to a {@link ItemDetailActivity} representing item details. On tablets, the activity presents
 * the list of items and item details side-by-side using two vertical panes. <p> The activity makes
 * heavy use of fragments. The list of items is a {@link ItemListFragment} and the item details (if
 * present) is a {@link ItemDetailFragment}. <p> This activity also implements the required {@link
 * ItemListFragment.Callbacks} interface to listen for item selections.
 */
public class ItemListActivity extends AppCompatActivity
    implements ItemListFragment.Callbacks {
  private final String TAG = ItemListActivity.class.getSimpleName();

  private final int REQ_SIGNIN = 2;
  /**
   * AccountManager
   */
  private AccountManager mAccountManager;


  /**
   * Whether or not the activity is in two-pane mode, i.e. running on a tablet device.
   */
  private boolean mTwoPane;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_item_app_bar);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    toolbar.setTitle(getTitle());

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
//        Intent loginIntent = new Intent(getApplicationContext(), PomodoroAuthenticator.class);
//        startActivity(loginIntent);
      }
    });

    if (findViewById(R.id.item_detail_container) != null) {
      // The detail container view will be present only in the
      // large-screen layouts (res/values-large and
      // res/values-sw600dp). If this view is present, then the
      // activity should be in two-pane mode.
      mTwoPane = true;

      // In two-pane mode, list items should be given the
      // 'activated' state when touched.
      ((ItemListFragment) getSupportFragmentManager()
          .findFragmentById(R.id.item_list))
          .setActivateOnItemClick(true);
    }

    // TODO: If exposing deep links into your app, handle intents here.
    checkAccountStatus(AUTHTOKEN_TYPE_FULL_ACCESS);
  }


  /**
   * Check the existing account. and if it is not exist, send a intent for login activity.
   */
  private void checkAccountStatus(final String authTokenType){
    final Account availableAccounts[] = mAccountManager.getAccountsByType(AccountGeneral.ACCOUNT_TYPE);
    Log.d(TAG, String.format("availableAccount length : %s", availableAccounts.length));
    if (availableAccounts.length == 0) {
      Intent loginIntent = new Intent(getBaseContext(), ItemListActivity.class);
      Toast.makeText(this, "No accounts", Toast.LENGTH_SHORT).show();
      startActivityForResult(loginIntent, REQ_SIGNIN);
    } else{
      // TODO : getExistingAccountAuthToken
    }
  }

  private String getExistingAccountAuthToken(final Account account, final String authTokenType){
    final AccountManagerFuture<Bundle> future = mAccountManager.getAuthToken(account, authTokenType, null, this, null, null);
    return null;
  }

  /**
   * Callback method from {@link ItemListFragment.Callbacks} indicating that the item with the given
   * ID was selected.
   */
  @Override
  public void onItemSelected(final int id) {
    if (mTwoPane) {
      // In two-pane mode, show the detail view in this activity by
      // adding or replacing the detail fragment using a
      // fragment transaction.
      Bundle arguments = new Bundle();
      arguments.putInt(ItemDetailFragment.ARG_ITEM_ID, id);
      ItemDetailFragment fragment = new ItemDetailFragment();
      fragment.setArguments(arguments);
      getSupportFragmentManager().beginTransaction()
          .replace(R.id.item_detail_container, fragment)
          .commit();

    } else {
      // In single-pane mode, simply start the detail activity
      // for the selected item ID.
      Intent detailIntent = new Intent(this, ItemDetailActivity.class);
      detailIntent.putExtra(ItemDetailFragment.ARG_ITEM_ID, id);
      startActivity(detailIntent);
    }
  }
}
