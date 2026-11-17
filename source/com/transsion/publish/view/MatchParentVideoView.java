package com.transsion.publish.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes6.dex */
public class MatchParentVideoView extends VideoView {

    /* JADX INFO: renamed from: a */
    private int f58309a;

    /* JADX INFO: renamed from: b */
    private int f58310b;

    /* JADX INFO: renamed from: c */
    private int f58311c;

    /* JADX INFO: renamed from: d */
    private int f58312d;

    /* JADX INFO: renamed from: e */
    private int f58313e;

    public MatchParentVideoView(Context context) {
        this(context, null);
    }

    public MatchParentVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MatchParentVideoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f58309a = 0;
        this.f58310b = 0;
        this.f58311c = 0;
        this.f58312d = 0;
        this.f58313e = 0;
    }

    public int getVideoHeight() {
        return this.f58310b;
    }

    public int getVideoWidth() {
        return this.f58309a;
    }

    @Override // android.widget.VideoView
    public void setVideoPath(String str) {
        super.setVideoPath(str);
    }
}
