package hoffman.jessica.hudlu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by jessica.hoffman on 11/16/15.
 */
public class MyRecyclerView {


}

public class MyActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}

public class MyActivity extends RecyclerView<MyAdapter.MyViewHolder>(Context) {
private String[] mDataset;

// Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder
public static class ViewHolder extends RecyclerView.MyViewHolder {
    // each data item is just a string in this case

    //is each letter gonna end up being equal to a string?
    public TextView mTextView;
    public ViewHolder(TextView v) {
        super(v);
        mTextView = v;

        @android:id/text1 = "something..";
    }

    public TextView mTextView;
    public ViewHolder(TextView e) {
        super(e);
        mTextView = e;
    }

    public TextView mTextView;
    public ViewHolder(TextView t) {
        super(t);
        mTextView = t;
    }

}

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ...
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder myviewholder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    //function constr(Context context) {}


//..not really sure how to get the cardview in
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:tools="http://schemas.android.com/tools"
            xmlns:card_view="http://schemas.android.com/apk/res-auto"
            >
    <!-- A CardView that contains a TextView -->
    <android.support.v7.widget.CardView
            xmlns:card_view="http://schemas.android.com/apk/res-auto"
            android:id="@+id/card_view"
            android:layout_gravity="center"
            android:layout_width="200dp"
            android:layout_height="200dp"
            card_view:cardCornerRadius="4dp">

    <TextView
        android:id="@+id/info_text"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
    </android.support.v7.widget.CardView>
    </LinearLayout>


}

