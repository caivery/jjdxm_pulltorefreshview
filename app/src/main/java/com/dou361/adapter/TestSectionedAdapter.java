package com.dou361.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dou361.bean.Lesson;
import com.dou361.bean.LessonSub;
import com.dou361.demotest001.R;

import java.util.List;

public class TestSectionedAdapter extends com.dou361.adapter.BaseSectionedAdapter {

    private List<Lesson> list;

    public TestSectionedAdapter(List<Lesson> list) {
        this.list = list;
    }

    @Override
    public Object getItem(int section, int position) {
        return null;
    }

    @Override
    public long getItemId(int section, int position) {
        return 0;
    }

    @Override
    public int getSectionCount() {
        return list.size();
    }

    @Override
    public int getCountForSection(int section) {
        return list.get(section).getList().size();
    }

    @Override
    public View getChildItemView(int section, int position, View convertView,
                                 ViewGroup parent) {
        LinearLayout layout = null;
        if (convertView == null) {
            LayoutInflater inflator = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = (LinearLayout) inflator.inflate(R.layout.list_item, null);
        } else {
            layout = (LinearLayout) convertView;
        }
        LessonSub lessonSub = list.get(section).getList().get(position);
        TextView tv_title = (TextView) layout.findViewById(R.id.tv_title);
        TextView tv_content = (TextView) layout.findViewById(R.id.tv_content);
        tv_title.setText(lessonSub.getContent());
        tv_content.setText((section + 1) + "-" + (position + 1));
        return layout;
    }

    @Override
    public View getSectionView(int section, View convertView,
                               ViewGroup parent) {
        LinearLayout layout = null;
        if (convertView == null) {
            LayoutInflater inflator = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = (LinearLayout) inflator
                    .inflate(R.layout.header_item, null);
        } else {
            layout = (LinearLayout) convertView;
        }
        ((TextView) layout.findViewById(R.id.tv_title)).setText(list.get(
                section).getTitle());
        return layout;
    }
}
