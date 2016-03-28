package numberletter.yilong.com.numberletter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.*;
import android.graphics.Bitmap.Config;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * @author MLS leichenrd
 */
@SuppressLint("NewApi")
public class BezierCurveImageView extends ImageView {

    private final Context mContext;
    private float rectLength = 200f;// 矩形边长（正方形）
    private float ratio = 1f;
    private int locationPoint = 1; // 贝塞尔曲线定位点
    private float halfLength;
    private float circleX;
    private float circleY;
    private float padding = 10; // 内边距 防止贴边被覆盖
    private float offset = padding / 2;

    public BezierCurveImageView(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public BezierCurveImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    public BezierCurveImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initView();
    }

    private void initView() {

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        float hScale = 1f;
        float vScale = 1f;

        if (widthMode != MeasureSpec.UNSPECIFIED && widthSize < rectLength) {
            hScale = widthSize / rectLength;
        }
        if (heightMode != MeasureSpec.UNSPECIFIED && heightSize < rectLength) {
            vScale = widthSize / rectLength;
        }
        float scale = Math.min(hScale, vScale);
        setMeasuredDimension(
                resolveSize((int) (rectLength * scale), widthMeasureSpec),
                resolveSize((int) (rectLength * scale), heightMeasureSpec));

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

    public Bitmap toRoundBitmap(Bitmap bitmap) {

        Bitmap scaledSrcBmp;
        rectLength = this.getWidth() - padding;
        int diameter = this.getWidth();

        // 为了防止宽高不相等，造成圆形图片变形，因此截取长方形中处于中间位置最大的正方形图片
        int bmpWidth = bitmap.getWidth();
        int bmpHeight = bitmap.getHeight();
        int squareWidth = 0, squareHeight = 0;
        int x = 0, y = 0;
        Bitmap squareBitmap;
        if (bmpHeight > bmpWidth) {// 高大于宽
            squareWidth = squareHeight = bmpWidth;
            x = 0;
            y = (bmpHeight - bmpWidth) / 2;
            // 截取正方形图片
            squareBitmap = Bitmap.createBitmap(bitmap, x, y, squareWidth,
                    squareHeight);
        } else if (bmpHeight < bmpWidth) {// 宽大于高
            squareWidth = squareHeight = bmpHeight;
            x = (bmpWidth - bmpHeight) / 2;
            y = 0;
            squareBitmap = Bitmap.createBitmap(bitmap, x, y, squareWidth,
                    squareHeight);
        } else {
            squareBitmap = bitmap;
        }

        if (squareBitmap.getWidth() != diameter
                || squareBitmap.getHeight() != diameter) {
            scaledSrcBmp = Bitmap.createScaledBitmap(squareBitmap, diameter,
                    diameter, true);

        } else {
            scaledSrcBmp = squareBitmap;
        }
        Bitmap output = Bitmap.createBitmap(scaledSrcBmp.getWidth(),
                scaledSrcBmp.getHeight(), Config.ARGB_8888);

        Canvas canvas = new Canvas(output);

        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, scaledSrcBmp.getWidth(),
                scaledSrcBmp.getHeight());

        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);// 设置填满
        // canvas.drawARGB(0, 0, 0, 0);

        halfLength = rectLength / 2;
        circleX = halfLength;
        circleY = halfLength;

		/* 贝塞尔： 控制点 a 和 b */
        float a = (circleX - halfLength - locationPoint + offset) * ratio; // 例如：295
        float b = (circleX + halfLength + locationPoint + offset) * ratio;// 例如：1305

        Path mPath = new Path();
        mPath.moveTo(offset + (circleX - halfLength) * ratio, offset + circleY
                * ratio);// 设置Path的起点
        mPath.quadTo(a, a, offset + circleX * ratio, offset
                + (circleY - halfLength) * ratio); // 设置贝塞尔曲线的控制点坐标和终点坐标

        mPath.quadTo(b, a, offset + (circleX + halfLength) * ratio, offset
                + circleY * ratio);

        mPath.quadTo(b, b, offset + circleX * ratio, offset
                + (circleY + halfLength) * ratio);

        mPath.quadTo(a, b, offset + (circleX - halfLength) * ratio, offset
                + circleY * ratio);
        canvas.drawPath(mPath, paint);

        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(scaledSrcBmp, rect, rect, paint);
        // bitmap回收(recycle导致在布局文件XML看不到效果)
        bitmap.recycle();
        squareBitmap.recycle();
        scaledSrcBmp.recycle();
        // bitmap = null;
        // squareBitmap = null;
        // scaledSrcBmp = null;
        return output;

    }
}
