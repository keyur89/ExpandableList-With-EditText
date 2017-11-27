package com.journaldev.expandablelistview;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> expandableListTitle;
    private HashMap<String, ArrayList<HashMap<String, String>>> expandableListDetail;

    public CustomExpandableListAdapter(Context context, List<String> expandableListTitle,
                                       HashMap<String, ArrayList<HashMap<String, String>>> expandableListDetail) {
        this.context = context;
        this.expandableListTitle = expandableListTitle;
        this.expandableListDetail = expandableListDetail;
    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition) {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition)).get(expandedListPosition);
    }

    @Override
    public long getChildId(int listPosition, int expandedListPosition) {
        return expandedListPosition;
    }

    @Override
    public View getChildView(final int listPosition, final int expandedListPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final HashMap<String, String> expandedListText = (HashMap<String, String>) getChild(listPosition, expandedListPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item, null);
            ViewHolderChild holder = new ViewHolderChild(convertView);
            convertView.setTag(holder);
        }
        final ViewHolderChild holder = (ViewHolderChild) convertView.getTag();
        holder.txtChildLabel.setText(expandedListText.get("param"));
        holder.edtChildValues.setText(expandedListText.get("value"));

        holder.edtChildValues.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                /*if (!hasFocus) {
                    // In java variable contains reference of Object so when you change childText object,
                    // it will be reflected in same HashMap you are getting data from.
                    expandedListText[0] = holder.edtChildValues.getText().toString();
                }*/
                /*if (!hasFocus) {
                    final int position = v.getId();
                    final EditText Caption = (EditText) v;
                    expandedListText[0] = Caption.getText().toString();
                }*/


            }
        });

        holder.edtChildValues.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                /*HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("param", expandedListText.get("param"));
                hashMap.put("value", editable.toString());
                expandableListDetail*/
            }
        });

        return convertView;
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition)).size();
    }

    @Override
    public Object getGroup(int listPosition) {
        return this.expandableListTitle.get(listPosition);
    }

    @Override
    public int getGroupCount() {
        return this.expandableListTitle.size();
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public View getGroupView(int listPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String listTitle = (String) getGroup(listPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_group, null);
            ViewHolderGroup holder = new ViewHolderGroup(convertView);
            convertView.setTag(holder);
        }
        // Get the stored ViewHolder that also contains our views
        ViewHolderGroup holder = (ViewHolderGroup) convertView.getTag();
        holder.listTitle.setTypeface(null, Typeface.BOLD);
        holder.listTitle.setText(listTitle);
        holder.txtGroupNumber.setText("" + (listPosition + 1));
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return true;
    }

    class ViewHolderGroup {
        TextView txtGroupNumber;
        TextView listTitle;

        public ViewHolderGroup(View convertView) {
            txtGroupNumber = (TextView) convertView.findViewById(R.id.txtGroupNumber);
            listTitle = (TextView) convertView.findViewById(R.id.listTitle);
        }
    }

    class ViewHolderChild {
        TextView txtChildLabel;
        EditText edtChildValues;

        public ViewHolderChild(View convertView) {
            txtChildLabel = (TextView) convertView.findViewById(R.id.txtChildLabel);
            edtChildValues = (EditText) convertView.findViewById(R.id.edtChildValues);
        }
    }
}