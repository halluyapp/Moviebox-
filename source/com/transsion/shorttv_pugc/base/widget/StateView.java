package com.transsion.shorttv_pugc.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.view.BLTextView;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.R$styleable;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import ht.AbstractC23896b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rs.C27360q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 02\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\bJ7\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010\"\u001a\u00020\r2\b\b\u0001\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u000fR$\u0010*\u001a\u0004\u0018\u00010#8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010/\u001a\u00020\t8\u0014@\u0014X\u0095\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u000f¨\u00061"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/base/widget/StateView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "screenType", "", "setDefaultImageMargin", "(I)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "dataType", "", "isShowTitleLayout", "", CampaignEx.JSON_KEY_TITLE, CampaignEx.JSON_KEY_DESC, "showData", "(IIZLjava/lang/String;Ljava/lang/String;)V", "txt", "upDateEmptyDescText", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "onClick", "retry", "(Lkotlin/jvm/functions/Function0;)V", "setReTryTxt", "newResId", "updateNoContentResId", "Lrs/q;", "a", "Lrs/q;", "getMViewBinding", "()Lrs/q;", "setMViewBinding", "(Lrs/q;)V", "mViewBinding", "I", "getNoContentResId", "()I", "setNoContentResId", "noContentResId", "Companion", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public class StateView extends FrameLayout {
    public static final int LOCATION_LABEL_FLOATING_LAYER = 3;
    public static final int LOCATION_LABEL_FULL_SCREEN = 1;
    public static final int LOCATION_LABEL_HALF_SCREEN = 2;
    public static final int LOCATION_LABEL_HALF_SCREEN_NONE = 5;
    public static final int LOCATION_LABEL_HALF_SCREEN_NONE_SMALL = 6;
    public static final int LOCATION_LABEL__FULL_SCREEN_WITH_STATUS_BAR = 4;
    public static final int STATE_TYPE_ERROR_DATA = 3;
    public static final int STATE_TYPE_NO_DATA = 2;
    public static final int STATE_TYPE_NO_DATA_WITH_RETRY = 4;
    public static final int STATE_TYPE_NO_NETWORK = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C27360q mViewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int noContentResId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.mViewBinding = C27360q.m106494a((LinearLayoutCompat) LayoutInflater.from(getContext()).inflate(R$layout.short_tv_default_state_view_layout, this).findViewById(R$id.stateRoot));
        this.noContentResId = R$mipmap.short_tv_ic_no_content;
        m80605b(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m80604c(Function0 function0, View view) {
        function0.invoke();
    }

    private final void setDefaultImageMargin(int screenType) {
        C27360q c27360q = this.mViewBinding;
        if (c27360q != null) {
            ViewGroup.LayoutParams layoutParams = c27360q.f83295b.getLayoutParams();
            LinearLayoutCompat.C0419a c0419a = layoutParams instanceof LinearLayoutCompat.C0419a ? (LinearLayoutCompat.C0419a) layoutParams : null;
            switch (screenType) {
                case 1:
                    if (c0419a != null) {
                        ((LinearLayout.LayoutParams) c0419a).topMargin = AbstractC5776a0.m27313a(128.0f);
                    }
                    break;
                case 2:
                    if (c0419a != null) {
                        ((LinearLayout.LayoutParams) c0419a).topMargin = AbstractC5776a0.m27313a(72.0f);
                    }
                    break;
                case 3:
                    if (c0419a != null) {
                        ((LinearLayout.LayoutParams) c0419a).topMargin = AbstractC5776a0.m27313a(48.0f);
                    }
                    break;
                case 4:
                    if (c0419a != null) {
                        ((LinearLayout.LayoutParams) c0419a).topMargin = AbstractC5776a0.m27313a(172.0f) + AbstractC5781d.m27351c();
                    }
                    break;
                case 5:
                    if (c0419a != null) {
                        ((LinearLayout.LayoutParams) c0419a).topMargin = 0;
                    }
                    break;
                case 6:
                    if (c0419a != null) {
                        ((LinearLayout.LayoutParams) c0419a).topMargin = 0;
                    }
                    if (c0419a != null) {
                        ((LinearLayout.LayoutParams) c0419a).width = AbstractC5776a0.m27313a(200.0f);
                    }
                    break;
            }
        }
    }

    public static /* synthetic */ void showData$default(StateView stateView, int i11, int i12, boolean z11, String str, String str2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showData");
        }
        if ((i13 & 16) != 0) {
            str2 = "";
        }
        stateView.showData(i11, i12, z11, str, str2);
    }

    /* JADX INFO: renamed from: b */
    protected void m80605b(Context context, AttributeSet attrs) {
        Intrinsics.m97802h(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.StateView);
        Intrinsics.m97801g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setDefaultImageMargin(typedArrayObtainStyledAttributes.getInt(R$styleable.StateView_screen_type, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    protected final C27360q getMViewBinding() {
        return this.mViewBinding;
    }

    protected int getNoContentResId() {
        return this.noContentResId;
    }

    public final void retry(final Function0<Unit> onClick) {
        BLTextView bLTextView;
        Intrinsics.m97802h(onClick, "onClick");
        C27360q c27360q = this.mViewBinding;
        if (c27360q == null || (bLTextView = c27360q.f83298e) == null) {
            return;
        }
        bLTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.base.widget.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StateView.m80604c(onClick, view);
            }
        });
    }

    protected final void setMViewBinding(C27360q c27360q) {
        this.mViewBinding = c27360q;
    }

    protected void setNoContentResId(int i11) {
        this.noContentResId = i11;
    }

    public final void setReTryTxt(String txt) {
        BLTextView bLTextView;
        Intrinsics.m97802h(txt, "txt");
        C27360q c27360q = this.mViewBinding;
        if (c27360q == null || (bLTextView = c27360q.f83298e) == null) {
            return;
        }
        bLTextView.setText(txt);
    }

    public final void showData(int dataType, int screenType, boolean isShowTitleLayout, String title, String desc) {
        BLTextView bLTextView;
        BLTextView bLTextView2;
        BLTextView bLTextView3;
        BLTextView bLTextView4;
        Intrinsics.m97802h(title, "title");
        Intrinsics.m97802h(desc, "desc");
        C27360q c27360q = this.mViewBinding;
        if (c27360q != null) {
            setDefaultImageMargin(screenType);
            AppCompatImageView appCompatImageView = c27360q.f83295b;
            if (dataType == 1) {
                appCompatImageView.setImageResource(R$mipmap.short_tv_ic_no_network);
                TextView textView = c27360q.f83297d;
                if (TextUtils.isEmpty(desc)) {
                    desc = appCompatImageView.getResources().getString(R$string.short_tv_no_network_toast);
                }
                textView.setText(desc);
                C27360q c27360q2 = this.mViewBinding;
                if (c27360q2 == null || (bLTextView = c27360q2.f83298e) == null) {
                    return;
                }
                AbstractC23896b.m94642d(bLTextView);
                return;
            }
            if (dataType == 2) {
                appCompatImageView.setImageResource(getNoContentResId());
                TextView textView2 = c27360q.f83297d;
                if (TextUtils.isEmpty(desc)) {
                    desc = appCompatImageView.getResources().getString(R$string.short_tv_no_content);
                }
                textView2.setText(desc);
                C27360q c27360q3 = this.mViewBinding;
                if (c27360q3 == null || (bLTextView2 = c27360q3.f83298e) == null) {
                    return;
                }
                AbstractC23896b.m94640b(bLTextView2);
                return;
            }
            if (dataType == 3) {
                appCompatImageView.setImageResource(R$mipmap.short_tv_ic_no_error);
                TextView textView3 = c27360q.f83297d;
                if (TextUtils.isEmpty(desc)) {
                    desc = appCompatImageView.getResources().getString(R$string.short_tv_no_network_toast);
                }
                textView3.setText(desc);
                C27360q c27360q4 = this.mViewBinding;
                if (c27360q4 == null || (bLTextView3 = c27360q4.f83298e) == null) {
                    return;
                }
                AbstractC23896b.m94642d(bLTextView3);
                return;
            }
            if (dataType != 4) {
                return;
            }
            appCompatImageView.setImageResource(getNoContentResId());
            TextView textView4 = c27360q.f83297d;
            if (TextUtils.isEmpty(desc)) {
                desc = appCompatImageView.getResources().getString(R$string.short_tv_no_content);
            }
            textView4.setText(desc);
            C27360q c27360q5 = this.mViewBinding;
            if (c27360q5 == null || (bLTextView4 = c27360q5.f83298e) == null) {
                return;
            }
            AbstractC23896b.m94642d(bLTextView4);
        }
    }

    public final void upDateEmptyDescText(String txt) {
        TextView textView;
        Intrinsics.m97802h(txt, "txt");
        C27360q c27360q = this.mViewBinding;
        if (c27360q == null || (textView = c27360q.f83297d) == null) {
            return;
        }
        textView.setText(txt);
    }

    public final void updateNoContentResId(int newResId) {
        setNoContentResId(newResId);
    }
}
