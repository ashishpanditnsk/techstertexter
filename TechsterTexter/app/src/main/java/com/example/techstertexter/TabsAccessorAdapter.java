package com.example.techstertexter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 1:
                GroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;

            case 2:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

            case 3:
                CallsFragment callsFragment = new CallsFragment();
                return callsFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        if (position == 0) {
            return "Chats";
        }
        if (position == 1) {
            return "Groups";
        }
        if (position == 2) {
            return "Requests";
        }
        if (position == 3) {
            return "Calls";
        }
        else{
            return null;
        }
    }
}
