package com.transsion.player.longvideo.member;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p1004lifecycle.AbstractC3226v;
import com.cloud.config.utils.XLogUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.memberapi.AdModule;
import com.transsion.memberapi.LotteryDisableModule;
import com.transsion.memberapi.LotteryModule;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.memberapi.MemberModule;
import com.transsion.memberapi.OrModule;
import com.transsion.memberapi.PayModule;
import com.transsion.memberapi.ThreeInOnePopup;
import com.transsion.memberapi.ThreeInOnePopupTitle;
import com.transsion.player.longvideo.R$id;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import p462hj.C23860f;
import p553ko.C24715a;
import p553ko.C24716b;
import p582lo.C25653b;
import p710qk.C27089h;
import p710qk.InterfaceC27088g;
import p909xi.C28606c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u0004J5\u0010&\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010$\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010%\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, m97100d2 = {"Lcom/transsion/player/longvideo/member/ResolutionUnlockFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llo/b;", "<init>", "()V", "", "getClassTag", "()Ljava/lang/String;", "", "dismiss", "i0", "k0", "Lcom/transsion/memberapi/MemberCheckResult;", "memberCheckResult", "l0", "(Lcom/transsion/memberapi/MemberCheckResult;)V", "p0", "q0", "t0", "r0", "n0", "Landroid/view/LayoutInflater;", "inflater", "h0", "(Landroid/view/LayoutInflater;)Llo/b;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "lazyLoadData", "onDestroy", "Lko/a;", "bean", "pageName", "genre", "m0", "(Lko/a;Ljava/lang/String;Ljava/lang/String;Lcom/transsion/memberapi/MemberCheckResult;)V", "a", "Lko/a;", "longVdPlayerBean", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/memberapi/MemberCheckResult;", "Lko/b;", "e", "Lko/b;", XLogUtil.TAG, "f", "LongVideo_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ResolutionUnlockFragment extends BaseFragment<C25653b> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C24715a longVdPlayerBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String genre;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private MemberCheckResult memberCheckResult;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C24716b config;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.ResolutionUnlockFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ResolutionUnlockFragment m71920a(C24716b config) {
            Intrinsics.m97802h(config, "config");
            ResolutionUnlockFragment resolutionUnlockFragment = new ResolutionUnlockFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_config_content", config.m97074d());
            resolutionUnlockFragment.setArguments(bundle);
            resolutionUnlockFragment.config = config;
            return resolutionUnlockFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.ResolutionUnlockFragment$b */
    public static final class C16484b implements InterfaceC27088g {
        C16484b() {
        }

        @Override // p710qk.InterfaceC27088g
        /* JADX INFO: renamed from: a */
        public void mo23270a(boolean z11) {
            InterfaceC27088g.a.m105448a(this, z11);
        }

        @Override // p710qk.InterfaceC27088g
        public void onFail() {
        }

        @Override // p710qk.InterfaceC27088g
        public void onSuccess() {
            ResolutionUnlockFragment.this.m71906i0();
        }
    }

    private final void dismiss() {
        getParentFragmentManager().m14495F1("resolution_unlock_dismiss", new Bundle());
        m71908k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getClassTag() {
        String simpleName = ResolutionUnlockFragment.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final void m71906i0() {
        Bundle bundle = new Bundle();
        C24716b c24716b = this.config;
        bundle.putString("config_content", c24716b != null ? c24716b.m97074d() : null);
        getParentFragmentManager().m14495F1("resolution_unlock_success", bundle);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m71907j0(ResolutionUnlockFragment resolutionUnlockFragment, View view) {
        resolutionUnlockFragment.dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    private final void m71908k0() {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (isAdded()) {
                getParentFragmentManager().m14557p().mo14678r(this).mo14671j();
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final void m71909l0(MemberCheckResult memberCheckResult) {
        ThreeInOnePopup threeInOnePopup;
        List<String> moduleOrder;
        String str;
        if (memberCheckResult == null || (threeInOnePopup = memberCheckResult.getThreeInOnePopup()) == null || (moduleOrder = threeInOnePopup.getModuleOrder()) == null) {
            return;
        }
        for (String str2 : moduleOrder) {
            switch (str2.hashCode()) {
                case -2108817340:
                    if (str2.equals(ThreeInOnePopup.THREE_IN_ONE_MODULE_TYPE_PAY)) {
                        m71916t0(memberCheckResult);
                    } else {
                        continue;
                    }
                    break;
                case -1373222562:
                    if (str2.equals(ThreeInOnePopup.THREE_IN_ONE_MODULE_TYPE_MEMBER)) {
                        m71914r0(memberCheckResult);
                    } else {
                        continue;
                    }
                    break;
                case -1334275730:
                    if (str2.equals(ThreeInOnePopup.THREE_IN_ONE_MODULE_TYPE_LOTTERY_DISABLE)) {
                        m71913q0(memberCheckResult);
                    } else {
                        continue;
                    }
                    break;
                case -1141281069:
                    str = ThreeInOnePopup.THREE_IN_ONE_MODULE_TYPE_UNSPECIFIED;
                    break;
                case -214437659:
                    if (str2.equals(ThreeInOnePopup.THREE_IN_ONE_MODULE_TYPE_LOTTERY)) {
                        m71912p0(memberCheckResult);
                    } else {
                        continue;
                    }
                    break;
                case 1733088487:
                    if (str2.equals(ThreeInOnePopup.THREE_IN_ONE_MODULE_TYPE_AD)) {
                        m71910n0(memberCheckResult);
                    } else {
                        continue;
                    }
                    break;
                case 1733088935:
                    str = ThreeInOnePopup.THREE_IN_ONE_MODULE_TYPE_OR;
                    break;
                default:
                    continue;
            }
            str2.equals(str);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final void m71910n0(final MemberCheckResult memberCheckResult) {
        ThreeInOnePopup threeInOnePopup;
        AdModule adModule;
        final ResolutionAdView resolutionAdView;
        if (memberCheckResult == null || (threeInOnePopup = memberCheckResult.getThreeInOnePopup()) == null || (adModule = threeInOnePopup.getAdModule()) == null || Intrinsics.m97797c(adModule.getEnable(), Boolean.FALSE)) {
            return;
        }
        C27089h.f82174a.m105449a(getClassTag() + " --> typeAd() --> genre = " + this.genre);
        C25653b mViewBinding = getMViewBinding();
        if (mViewBinding == null || (resolutionAdView = mViewBinding.f77821b) == null) {
            return;
        }
        resolutionAdView.setListener(new C16484b());
        resolutionAdView.setGenre(this.genre);
        resolutionAdView.setAdCallback(new Function1() { // from class: com.transsion.player.longvideo.member.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResolutionUnlockFragment.m71911o0(resolutionAdView, memberCheckResult, this, ((Boolean) obj).booleanValue());
            }
        });
        resolutionAdView.setAdModule(adModule);
        resolutionAdView.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Unit m71911o0(ResolutionAdView resolutionAdView, MemberCheckResult memberCheckResult, ResolutionUnlockFragment resolutionUnlockFragment, boolean z11) {
        OrModule orModule;
        C25653b mViewBinding;
        LinearLayout linearLayout;
        if (z11) {
            resolutionAdView.setVisibility(0);
            ThreeInOnePopup threeInOnePopup = memberCheckResult.getThreeInOnePopup();
            if (threeInOnePopup != null && (orModule = threeInOnePopup.getOrModule()) != null && !Intrinsics.m97797c(orModule.getEnable(), Boolean.FALSE) && (mViewBinding = resolutionUnlockFragment.getMViewBinding()) != null && (linearLayout = mViewBinding.f77827h) != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            C27089h.f82174a.m105449a(resolutionUnlockFragment.getClassTag() + " --> typeAd() --> 广告加载失败");
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p0 */
    private final void m71912p0(MemberCheckResult memberCheckResult) {
        ThreeInOnePopup threeInOnePopup;
        LotteryModule lotteryModule;
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        String text;
        String highlightText;
        if (memberCheckResult == null || (threeInOnePopup = memberCheckResult.getThreeInOnePopup()) == null || (lotteryModule = threeInOnePopup.getLotteryModule()) == null || Intrinsics.m97797c(lotteryModule.getEnable(), Boolean.FALSE)) {
            return;
        }
        C27089h.f82174a.m105449a(getClassTag() + " --> typeLottery() --> 开始渲染");
        C25653b mViewBinding = getMViewBinding();
        if (mViewBinding == null || (linearLayout = mViewBinding.f77828i) == null) {
            return;
        }
        linearLayout.setVisibility(0);
        C25653b mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (textView2 = mViewBinding2.f77834o) != null) {
            textView2.setVisibility(0);
            C28606c c28606c = C28606c.f87784a;
            ThreeInOnePopupTitle firstTitle = lotteryModule.getFirstTitle();
            String str = "";
            if (firstTitle == null || (text = firstTitle.getText()) == null) {
                text = "";
            }
            ThreeInOnePopupTitle firstTitle2 = lotteryModule.getFirstTitle();
            if (firstTitle2 != null && (highlightText = firstTitle2.getHighlightText()) != null) {
                str = highlightText;
            }
            textView2.setText(c28606c.m110331a(text, str, Color.parseColor("#59D440")));
        }
        C25653b mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (textView = mViewBinding3.f77835p) == null) {
            return;
        }
        textView.setVisibility(0);
        ThreeInOnePopupTitle secondTitle = lotteryModule.getSecondTitle();
        textView.setText(secondTitle != null ? secondTitle.getText() : null);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m71913q0(MemberCheckResult memberCheckResult) {
        ThreeInOnePopup threeInOnePopup;
        LotteryDisableModule lotteryDisableModule;
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        String text;
        String highlightText;
        AppCompatImageView appCompatImageView;
        if (memberCheckResult == null || (threeInOnePopup = memberCheckResult.getThreeInOnePopup()) == null || (lotteryDisableModule = threeInOnePopup.getLotteryDisableModule()) == null || Intrinsics.m97797c(lotteryDisableModule.getEnable(), Boolean.FALSE)) {
            return;
        }
        C27089h.f82174a.m105449a(getClassTag() + " --> typeLotteryDisable() --> 开始渲染");
        C25653b mViewBinding = getMViewBinding();
        if (mViewBinding == null || (linearLayout = mViewBinding.f77829j) == null) {
            return;
        }
        linearLayout.setVisibility(0);
        C25653b mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f77826g) != null) {
            appCompatImageView.setVisibility(0);
            C23860f.a aVar = C23860f.f72909a;
            Context context = appCompatImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            aVar.m94457m(context).m94468g(lotteryDisableModule.getBannerUrl()).m94465d(appCompatImageView);
        }
        C25653b mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (textView2 = mViewBinding3.f77836q) != null) {
            textView2.setVisibility(0);
            C28606c c28606c = C28606c.f87784a;
            ThreeInOnePopupTitle firstTitle = lotteryDisableModule.getFirstTitle();
            String str = "";
            if (firstTitle == null || (text = firstTitle.getText()) == null) {
                text = "";
            }
            ThreeInOnePopupTitle firstTitle2 = lotteryDisableModule.getFirstTitle();
            if (firstTitle2 != null && (highlightText = firstTitle2.getHighlightText()) != null) {
                str = highlightText;
            }
            textView2.setText(c28606c.m110331a(text, str, Color.parseColor("#59D440")));
        }
        C25653b mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (textView = mViewBinding4.f77837r) == null) {
            return;
        }
        textView.setVisibility(0);
        ThreeInOnePopupTitle secondTitle = lotteryDisableModule.getSecondTitle();
        textView.setText(secondTitle != null ? secondTitle.getText() : null);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m71914r0(MemberCheckResult memberCheckResult) {
        ThreeInOnePopup threeInOnePopup;
        MemberModule memberModule;
        ConstraintLayout constraintLayout;
        TextView textView;
        AppCompatImageView appCompatImageView;
        if (memberCheckResult == null || (threeInOnePopup = memberCheckResult.getThreeInOnePopup()) == null || (memberModule = threeInOnePopup.getMemberModule()) == null || Intrinsics.m97797c(memberModule.getEnable(), Boolean.FALSE)) {
            return;
        }
        C27089h.f82174a.m105449a(getClassTag() + " --> typeMember() --> 开始渲染");
        C25653b mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayout = mViewBinding.f77822c) == null) {
            return;
        }
        constraintLayout.setVisibility(0);
        C25653b mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f77825f) != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = appCompatImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            aVar.m94457m(context).m94468g(memberModule.getIconUrl()).m94465d(appCompatImageView);
        }
        C25653b mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (textView = mViewBinding3.f77833n) != null) {
            ThreeInOnePopupTitle text = memberModule.getText();
            textView.setText(text != null ? text.getText() : null);
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResolutionUnlockFragment.m71915s0(this.f55632a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m71915s0(ResolutionUnlockFragment resolutionUnlockFragment, View view) {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(resolutionUnlockFragment), null, null, new ResolutionUnlockFragment$typeMember$1$1$2$1(resolutionUnlockFragment, null), 3, null);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m71916t0(MemberCheckResult memberCheckResult) {
        ThreeInOnePopup threeInOnePopup;
        final PayModule payModule;
        ConstraintLayout constraintLayout;
        TextView textView;
        TextView textView2;
        if (memberCheckResult == null || (threeInOnePopup = memberCheckResult.getThreeInOnePopup()) == null || (payModule = threeInOnePopup.getPayModule()) == null || Intrinsics.m97797c(payModule.getEnable(), Boolean.FALSE)) {
            return;
        }
        C27089h.f82174a.m105449a(getClassTag() + " --> typePay() --> 开始渲染");
        C25653b mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayout = mViewBinding.f77823d) == null) {
            return;
        }
        constraintLayout.setVisibility(0);
        C25653b mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (textView2 = mViewBinding2.f77831l) != null) {
            textView2.setText(payModule.getMoney());
        }
        C25653b mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (textView = mViewBinding3.f77830k) != null) {
            ThreeInOnePopupTitle text = payModule.getText();
            textView.setText(text != null ? text.getText() : null);
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResolutionUnlockFragment.m71917u0(payModule, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m71917u0(PayModule payModule, ResolutionUnlockFragment resolutionUnlockFragment, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("sku_id", payModule.getSkuId());
        C24716b c24716b = resolutionUnlockFragment.config;
        bundle.putString("config_content", c24716b != null ? c24716b.m97074d() : null);
        resolutionUnlockFragment.getParentFragmentManager().m14495F1("resolution_pay", bundle);
        resolutionUnlockFragment.dismiss();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C25653b getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25653b c25653bM100979c = C25653b.m100979c(inflater);
        Intrinsics.m97801g(c25653bM100979c, "inflate(...)");
        return c25653bM100979c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        m71909l0(this.memberCheckResult);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m71919m0(C24715a bean, String pageName, String genre, MemberCheckResult memberCheckResult) {
        this.longVdPlayerBean = bean;
        this.pageName = pageName;
        this.genre = genre;
        this.memberCheckResult = memberCheckResult;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ResolutionAdView resolutionAdView;
        super.onDestroy();
        C25653b mViewBinding = getMViewBinding();
        if (mViewBinding == null || (resolutionAdView = mViewBinding.f77821b) == null) {
            return;
        }
        resolutionAdView.onDestroy();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R$id.ivClose);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ResolutionUnlockFragment.m71907j0(this.f55633a, view2);
                }
            });
        }
    }
}
