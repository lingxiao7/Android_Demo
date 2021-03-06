package com.example.lx.fragment_demo;

import android.content.Intent;
import android.support.v4.app.Fragment;

public class ContentActivity extends SingleFragmentActivity
{
	private ContentFragment mContentFragment;
	@Override
	protected Fragment createFragment()
	{
		String title = getIntent().getStringExtra(ContentFragment.ARGUMENT);

		mContentFragment = ContentFragment.newInstance(title);
		return mContentFragment;
	}
}
