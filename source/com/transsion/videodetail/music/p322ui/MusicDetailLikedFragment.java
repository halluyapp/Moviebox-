package com.transsion.videodetail.music.p322ui;

import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.videodetail.music.adapter.C20977a;
import com.transsion.videodetail.music.bean.MusicLikedUITypeEnum;
import com.transsion.videodetail.music.widget.MusicLikedListEmptyView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx.C25917a;
import p586lx.C25752e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001e\u001a\u00020\b2\u000e\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\"\u0010!J\u0019\u0010#\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b#\u0010!J\u0019\u0010$\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0003J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*JM\u0010/\u001a\u00020\b2>\b\u0002\u0010.\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010+¢\u0006\u0004\b/\u00100JQ\u00103\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000628\u00102\u001a4\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\b\u0018\u00010+¢\u0006\u0004\b3\u00104RH\u00107\u001a4\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\b\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109RL\u0010<\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00106R\u0018\u0010?\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, m97100d2 = {"Lcom/transsion/videodetail/music/ui/MusicDetailLikedFragment;", "Lcom/transsion/videodetail/music/ui/BaseMusicLikedFragment;", "<init>", "()V", "Lfo/e;", "mediaSource", "", "from", "", "M0", "(Lfo/e;Ljava/lang/String;)V", "Lcom/transsion/videodetail/music/bean/MusicLikedUITypeEnum;", "x0", "()Lcom/transsion/videodetail/music/bean/MusicLikedUITypeEnum;", "initViewData", "loadDefaultData", "getPageName", "()Ljava/lang/String;", "subjectId", "path", "", "fromItemClick", "G0", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", RequestParameters.POSITION, "F0", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V", "onVideoPause", "(Lfo/e;)V", "onVideoStart", "onCompletion", "H0", "E0", "showEmpty", "Lcom/transsion/player/orplayer/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "P0", "(Lcom/transsion/player/orplayer/f;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "onItemCLick", "N0", "(Lkotlin/jvm/functions/Function2;)V", "total", "onPlayInfoCallback", "O0", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/jvm/functions/Function2;", "mOnPlayInfoCallback", "e", "Lcom/transsion/player/orplayer/f;", "mPlayerListener", "f", "mOnItemCLick", "g", "Ljava/lang/String;", "mSubjectId", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MusicDetailLikedFragment extends BaseMusicLikedFragment {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function2 mOnPlayInfoCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private InterfaceC16633f mPlayerListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Function2 mOnItemCLick;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x002c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0084, please report this as an issue */
    /* JADX INFO: renamed from: M0 */
    private final void m86403M0(C23403e mediaSource, String from) {
        List<Object> data;
        List<Object> data2;
        Unit unit;
        C20977a mMusicAdapter = getMMusicAdapter();
        Unit unit2 = null;
        if (mMusicAdapter == null || (data2 = mMusicAdapter.getData()) == null) {
            C25917a.f79141a.m101737c(getClassTag() + " --> onDataSet() --> 这个时候列表还没有数据展示 --> from = " + from);
        } else {
            Function2 function2 = this.mOnPlayInfoCallback;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(m86262p0() + 1), Integer.valueOf(data2.size()));
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            if (unit == null) {
                C25917a.f79141a.m101737c(getClassTag() + " --> onDataSet() --> 这个时候列表还没有数据展示 --> from = " + from);
            }
        }
        if (TextUtils.isEmpty(this.mSubjectId) || TextUtils.equals(from, "onMusicChange()")) {
            return;
        }
        C20977a mMusicAdapter2 = getMMusicAdapter();
        if (mMusicAdapter2 == null || (data = mMusicAdapter2.getData()) == null) {
            C25917a.f79141a.m101737c(getClassTag() + " --> onDataSet() --> 这个时候列表还没有数据展示");
        } else {
            int iM86263q0 = m86263q0(this.mSubjectId);
            Function2 function3 = this.mOnPlayInfoCallback;
            if (function3 != null) {
                function3.invoke(Integer.valueOf(iM86263q0 + 1), Integer.valueOf(data.size()));
                unit2 = Unit.f75682a;
            }
            if (unit2 == null) {
                C25917a.f79141a.m101737c(getClassTag() + " --> onDataSet() --> 这个时候列表还没有数据展示");
            }
        }
        this.mSubjectId = "";
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: E0 */
    public void mo86256E0() {
        m86403M0(getMCurrentMediaSource(), "onDataSet()");
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: F0 */
    public void mo86257F0(BaseQuickAdapter adapter, View view, int position) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        C25917a.f79141a.m101736b(getClassTag() + " --> onItemChildClick() --> position = " + position + " --> 内部处理排序");
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: G0 */
    public void mo86258G0(String subjectId, String path, boolean fromItemClick) {
        MediaItem mediaItemM92933i;
        C23403e mCurrentMediaSource = getMCurrentMediaSource();
        if (TextUtils.equals((mCurrentMediaSource == null || (mediaItemM92933i = mCurrentMediaSource.m92933i()) == null) ? null : mediaItemM92933i.getSubjectId(), subjectId)) {
            C25917a.f79141a.m101736b(getClassTag() + " --> onItemChildClick() --> subjectId = " + subjectId + " --> path = " + path + " --> 当前正在播放");
            return;
        }
        m86260K0(getPageName(), fromItemClick);
        C25917a.f79141a.m101736b(getClassTag() + " --> onItemChildClick() --> subjectId = " + subjectId + " --> path = " + path + " --> 当前页面刷新");
        Function2 function2 = this.mOnItemCLick;
        if (function2 != null) {
            function2.invoke(subjectId, path);
        }
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: H0 */
    public void mo86259H0(C23403e mediaSource) {
        m86403M0(mediaSource, "onMusicChange()");
    }

    /* JADX INFO: renamed from: N0 */
    public final void m86404N0(Function2 onItemCLick) {
        this.mOnItemCLick = onItemCLick;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m86405O0(String subjectId, Function2 onPlayInfoCallback) {
        this.mSubjectId = subjectId;
        this.mOnPlayInfoCallback = onPlayInfoCallback;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m86406P0(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.mPlayerListener = listener;
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    public String getPageName() {
        return "music_detail_liked_fragment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        MusicLikedListEmptyView musicLikedListEmptyView;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        super.initViewData();
        C25752e c25752e = (C25752e) getMViewBinding();
        if (c25752e != null && (appCompatTextView2 = c25752e.f78513g) != null) {
            appCompatTextView2.setVisibility(8);
        }
        C25752e c25752e2 = (C25752e) getMViewBinding();
        if (c25752e2 != null && (appCompatTextView = c25752e2.f78512f) != null) {
            appCompatTextView.setVisibility(8);
        }
        C25752e c25752e3 = (C25752e) getMViewBinding();
        if (c25752e3 == null || (musicLikedListEmptyView = c25752e3.f78508b) == null) {
            return;
        }
        musicLikedListEmptyView.setMusicLikedUIType(MusicLikedUITypeEnum.MUSIC_DETAIL);
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        super.loadDefaultData();
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        super.onCompletion(mediaSource);
        InterfaceC16633f interfaceC16633f = this.mPlayerListener;
        if (interfaceC16633f != null) {
            interfaceC16633f.onCompletion(mediaSource);
        }
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e mediaSource) {
        super.onVideoPause(mediaSource);
        InterfaceC16633f interfaceC16633f = this.mPlayerListener;
        if (interfaceC16633f != null) {
            interfaceC16633f.onVideoPause(mediaSource);
        }
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        super.onVideoStart(mediaSource);
        InterfaceC16633f interfaceC16633f = this.mPlayerListener;
        if (interfaceC16633f != null) {
            interfaceC16633f.onVideoStart(mediaSource);
        }
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    public void showEmpty() {
        super.showEmpty();
        Function2 function2 = this.mOnPlayInfoCallback;
        if (function2 != null) {
            function2.invoke(0, 0);
        }
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: x0 */
    public MusicLikedUITypeEnum mo86270x0() {
        return MusicLikedUITypeEnum.MUSIC_DETAIL;
    }
}
