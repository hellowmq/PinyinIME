package com.android.inputmethod.pinyin;

/**
 * @author ifans.wen
 * @date 2019/9/9
 * @description
 */

/**
 * Default definition for a certain key. It is defined in soft keyboard
 * template. A soft keyboard can refer to a default key in its xml file. Nothing
 * of the key can be overwritten, including the size.
 */
class KeyRecord {
    int keyId;
    SoftKey softKey;
}