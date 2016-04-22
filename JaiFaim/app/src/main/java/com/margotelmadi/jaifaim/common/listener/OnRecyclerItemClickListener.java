package com.margotelmadi.jaifaim.common.listener;

import android.view.View;

/**
 * Created by dlevel on 23/01/2016.
 */
public interface OnRecyclerItemClickListener {
    void onClick(View view, int position, boolean isLongClick);
}