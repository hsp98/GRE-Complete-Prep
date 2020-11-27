package mega.GRE.examination

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;

import androidx.appcompat.widget.AppCompatTextView


class TextViewPlus : AppCompatTextView {
    constructor(context: Context?) : super(context) {}
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setCustomFont(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        setCustomFont(context, attrs)
    }

    private fun setCustomFont(ctx: Context, attrs: AttributeSet) {
        val a: TypedArray = ctx.obtainStyledAttributes(attrs, R.styleable.TextViewPlus)
        val customFont: String = a.getString(R.styleable.TextViewPlus_customFont)
        setCustomFont(ctx, customFont)
        a.recycle()
    }

    fun setCustomFont(ctx: Context, asset: String?): Boolean {
        var tf: Typeface? = null
        tf = try {
            Typeface.createFromAsset(ctx.assets, asset)
        } catch (e: Exception) {
            Log.e(TAG, "Could not get typeface: " + e.message)
            return false
        }
        setTypeface(tf)
        return true
    }

    companion object {
        private const val TAG = "TextView"
    }
}