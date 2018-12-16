package ru.otus.custom_view.custom_view

import android.content.Context
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet

class SquareImageView : AppCompatImageView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) :
            super(context, attributeSet)

    constructor(context: Context,
                attributeSet: AttributeSet,
                defStyle: Int): super(context, attributeSet, defStyle)


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = MeasureSpec.getSize(widthMeasureSpec)
        val height = MeasureSpec.getSize(heightMeasureSpec)
        val size = Math.min(width, height)
        setMeasuredDimension(size, size)

    }

}