package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cloud.tmc.integration.event.EventConstants;
import com.therouter.TheRouter;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p352dn.InterfaceC22998b;
import p844vo.C28167o0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/AdCountDownView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", EventConstants.KEY_TIME, "", "refreshCountDown", "(I)V", "Lvo/o0;", "a", "Lvo/o0;", "getBind", "()Lvo/o0;", "setBind", "(Lvo/o0;)V", "bind", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class AdCountDownView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C28167o0 bind;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdCountDownView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdCountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdCountDownView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.bind = C28167o0.m109353a(LayoutInflater.from(getContext()).inflate(R$layout.view_ad_count_down_layout, this));
    }

    public final C28167o0 getBind() {
        return this.bind;
    }

    public final void refreshCountDown(int time) {
        ImageView imageView;
        TextView textView;
        View view;
        TextView textView2;
        TextView textView3;
        View view2;
        LinearLayout linearLayout;
        TextView textView4;
        TextView textView5;
        View view3;
        if (time < 0) {
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            if (interfaceC22998b != null ? interfaceC22998b.mo69843B() : false) {
                C28167o0 c28167o0 = this.bind;
                if (c28167o0 != null && (view3 = c28167o0.f86580f) != null) {
                    view3.setVisibility(8);
                }
                C28167o0 c28167o1 = this.bind;
                if (c28167o1 != null && (textView5 = c28167o1.f86579e) != null) {
                    textView5.setText(getContext().getString(R$string.post_count_down_get_ad_free));
                }
            } else {
                C28167o0 c28167o2 = this.bind;
                if (c28167o2 != null && (linearLayout = c28167o2.f86577c) != null) {
                    linearLayout.setVisibility(8);
                }
            }
            C28167o0 c28167o3 = this.bind;
            if (c28167o3 == null || (textView4 = c28167o3.f86578d) == null) {
                return;
            }
            textView4.setText("");
            return;
        }
        InterfaceC22998b interfaceC22998b2 = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b2 != null ? interfaceC22998b2.mo69843B() : false) {
            C28167o0 c28167o4 = this.bind;
            if (c28167o4 != null && (view2 = c28167o4.f86580f) != null) {
                view2.setVisibility(0);
            }
            C28167o0 c28167o5 = this.bind;
            if (c28167o5 != null && (textView3 = c28167o5.f86579e) != null) {
                textView3.setText(getContext().getString(R$string.post_count_down_get_ad_free));
            }
        } else {
            C28167o0 c28167o6 = this.bind;
            if (c28167o6 != null && (view = c28167o6.f86580f) != null) {
                view.setVisibility(8);
            }
            C28167o0 c28167o7 = this.bind;
            if (c28167o7 != null && (textView = c28167o7.f86579e) != null) {
                textView.setVisibility(8);
            }
            C28167o0 c28167o8 = this.bind;
            if (c28167o8 != null && (imageView = c28167o8.f86576b) != null) {
                imageView.setVisibility(8);
            }
        }
        C28167o0 c28167o9 = this.bind;
        if (c28167o9 == null || (textView2 = c28167o9.f86578d) == null) {
            return;
        }
        textView2.setText(time + "s");
    }

    public final void setBind(C28167o0 c28167o0) {
        this.bind = c28167o0;
    }
}
