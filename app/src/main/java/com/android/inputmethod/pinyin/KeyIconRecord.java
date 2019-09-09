package com.android.inputmethod.pinyin;

/**
 * @author ifans.wen
 * @date 2019/9/9
 * @description
 */

import android.graphics.drawable.Drawable;

/**
 * Key icon definition. It is defined in soft keyboard template. A soft keyboard
 * can refer to such an icon in its xml file directly to improve performance.
 */
class KeyIconRecord {
    int keyCode;
    Drawable icon;
    Drawable iconPopup;
}

