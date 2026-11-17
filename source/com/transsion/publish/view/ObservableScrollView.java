package com.transsion.publish.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes6.dex */
public class ObservableScrollView extends ScrollView {
    public static final int SCROLL_DOWN = 16;
    public static final int SCROLL_UP = 1;

    /* JADX INFO: renamed from: a */
    private InterfaceC17702a f58314a;

    /* JADX INFO: renamed from: com.transsion.publish.view.ObservableScrollView$a */
    public interface InterfaceC17702a {
        /* JADX INFO: renamed from: a */
        void mo75616a(int i11);
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        InterfaceC17702a interfaceC17702a;
        super.onScrollChanged(i11, i12, i13, i14);
        if (i14 > i12 && i14 - i12 > 40) {
            InterfaceC17702a interfaceC17702a2 = this.f58314a;
            if (interfaceC17702a2 != null) {
                interfaceC17702a2.mo75616a(16);
                return;
            }
            return;
        }
        if (i14 >= i12 || i12 - i14 <= 40 || (interfaceC17702a = this.f58314a) == null) {
            return;
        }
        interfaceC17702a.mo75616a(1);
    }

    public void setScrollListener(InterfaceC17702a interfaceC17702a) {
        this.f58314a = interfaceC17702a;
    }
}
