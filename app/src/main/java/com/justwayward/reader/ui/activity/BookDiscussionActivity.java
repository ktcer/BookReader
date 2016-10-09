package com.justwayward.reader.ui.activity;

import android.content.Context;
import android.content.Intent;

import com.justwayward.reader.R;
import com.justwayward.reader.base.BaseCommuniteActivity;
import com.justwayward.reader.component.AppComponent;
import com.justwayward.reader.view.SelectionLayout;

import java.util.List;

import butterknife.Bind;

/**
 * 综合讨论区
 */
public class BookDiscussionActivity extends BaseCommuniteActivity {

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, BookDiscussionActivity.class));
    }

    @Bind(R.id.slOverall)
    SelectionLayout slOverall;

    @Override
    public int getLayoutId() {
        return R.layout.activity_community_book_discussion;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public void initToolBar() {
        mCommonToolbar.setTitle("综合讨论区");
        mCommonToolbar.setNavigationIcon(R.drawable.ab_back);
    }

    @Override
    public void initDatas() {
        super.initDatas();
    }

    @Override
    protected List<List<String>> getTabList() {
        return list1;
    }

    @Override
    public void configViews() {
    }
}
