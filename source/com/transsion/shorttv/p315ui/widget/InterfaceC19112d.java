package com.transsion.shorttv.p315ui.widget;

import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.shorttv.p315ui.fragment.ShortTvDetailListFragment;
import p659os.C26719e;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.d */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC19112d extends InterfaceC16633f {

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.d$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m80217a(InterfaceC19112d interfaceC19112d, C26719e c26719e, ShortTvDetailListFragment shortTvDetailListFragment, Integer num, boolean z11, String str, String str2, boolean z12, boolean z13, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
            }
            interfaceC19112d.setData(c26719e, shortTvDetailListFragment, num, z11, str, str2, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? false : z13);
        }
    }

    long getProgress();

    void onAudioTrackChange();

    void onGetDubsInfo();

    void onPageRelease(int i11);

    void onPageSelected(InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, C26719e c26719e);

    void setData(C26719e c26719e, ShortTvDetailListFragment shortTvDetailListFragment, Integer num, boolean z11, String str, String str2, boolean z12, boolean z13);
}
