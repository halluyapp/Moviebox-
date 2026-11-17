package com.transsion.player.longvideo.member;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.memberapi.MemberSceneType;
import com.transsion.memberapi.MemberSource;
import com.transsion.memberapi.OpType;
import com.transsion.player.longvideo.R$id;
import com.transsion.player.longvideo.R$layout;
import com.transsion.player.longvideo.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import cy.InterfaceC22789e;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p352dn.InterfaceC22997a;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC22999c;
import p462hj.C23860f;
import p550kj.C24662i;
import p553ko.C24715a;
import p710qk.C27089h;
import p710qk.InterfaceC27087f;
import p710qk.InterfaceC27088g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001d"}, m97100d2 = {"Lcom/transsion/player/longvideo/member/LongVodMemberNoFreeResolutionView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getClassTag", "()Ljava/lang/String;", "", "c", "()V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lko/a;", "bean", "pageName", "showCover", "(Lko/a;Ljava/lang/String;)V", "Ldn/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Ldn/c;)V", "a", "Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lko/a;", "Ldn/c;", "LongVideo_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LongVodMemberNoFreeResolutionView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C24715a bean;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InterfaceC22999c listener;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.LongVodMemberNoFreeResolutionView$a */
    public static final class C16477a implements InterfaceC22997a {

        /* JADX INFO: renamed from: com.transsion.player.longvideo.member.LongVodMemberNoFreeResolutionView$a$a */
        public static final class a implements InterfaceC22999c {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ LongVodMemberNoFreeResolutionView f55579a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AppCompatActivity f55580b;

            /* JADX INFO: renamed from: com.transsion.player.longvideo.member.LongVodMemberNoFreeResolutionView$a$a$a, reason: collision with other inner class name */
            public static final class C29454a implements InterfaceC22789e {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ LongVodMemberNoFreeResolutionView f55581a;

                C29454a(LongVodMemberNoFreeResolutionView longVodMemberNoFreeResolutionView) {
                    this.f55581a = longVodMemberNoFreeResolutionView;
                }

                @Override // cy.InterfaceC22789e
                /* JADX INFO: renamed from: a */
                public void mo71869a(boolean z11) {
                    if (z11) {
                        this.f55581a.m71866d();
                    }
                }
            }

            a(LongVodMemberNoFreeResolutionView longVodMemberNoFreeResolutionView, AppCompatActivity appCompatActivity) {
                this.f55579a = longVodMemberNoFreeResolutionView;
                this.f55580b = appCompatActivity;
            }

            @Override // p352dn.InterfaceC22999c
            /* JADX INFO: renamed from: a */
            public void mo66056a() {
                C16496k.f55626a.m71921a(this.f55579a.getClassTag() + " --> llUnlockBtn{} --> ka开通会员失败 --> 商业化逻辑");
                ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
                FragmentManager supportFragmentManager = this.f55580b.getSupportFragmentManager();
                Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
                resolutionMemberManager.m71895i(supportFragmentManager, MemberSource.SOURCE_STREAM_RESOLUTION_START_PLAY_ERROR, this.f55579a.bean, this.f55579a.pageName, new C29454a(this.f55579a));
            }

            @Override // p352dn.InterfaceC22999c
            public void onSuccess() {
                this.f55579a.m71866d();
                C16496k.f55626a.m71921a(this.f55579a.getClassTag() + " --> llUnlockBtn{} --> ka开通会员成功");
            }
        }

        /* JADX INFO: renamed from: com.transsion.player.longvideo.member.LongVodMemberNoFreeResolutionView$a$b */
        public static final class b implements InterfaceC27088g {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ LongVodMemberNoFreeResolutionView f55582a;

            b(LongVodMemberNoFreeResolutionView longVodMemberNoFreeResolutionView) {
                this.f55582a = longVodMemberNoFreeResolutionView;
            }

            @Override // p710qk.InterfaceC27088g
            /* JADX INFO: renamed from: a */
            public void mo23270a(boolean z11) {
                InterfaceC27088g.a.m105448a(this, z11);
            }

            @Override // p710qk.InterfaceC27088g
            public void onFail() {
                C16496k.f55626a.m71921a(this.f55582a.getClassTag() + " --> llUnlockBtn{} --> 三合一弹窗 失败");
            }

            @Override // p710qk.InterfaceC27088g
            public void onSuccess() {
                this.f55582a.m71866d();
                C16496k.f55626a.m71921a(this.f55582a.getClassTag() + " --> showTreasureDialog() --> 三合一弹窗 成功");
            }
        }

        C16477a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Unit m71868h(LongVodMemberNoFreeResolutionView longVodMemberNoFreeResolutionView, Object obj) {
            C27089h.f82174a.m105449a(longVodMemberNoFreeResolutionView.getClassTag() + " --> checkMemberRights() --> sceneType = MemberSceneType.SCENE_PREDL --> success");
            return Unit.f75682a;
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: a */
        public void mo66165a(MemberCheckResult memberCheckResult) {
            Context context = LongVodMemberNoFreeResolutionView.this.getContext();
            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity != null) {
                LongVodMemberNoFreeResolutionView longVodMemberNoFreeResolutionView = LongVodMemberNoFreeResolutionView.this;
                InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
                if (interfaceC22998b != null) {
                    InterfaceC22998b.a.m91587c(interfaceC22998b, appCompatActivity, MemberSource.SOURCE_STREAM_RESOLUTION_START_PLAY_ERROR, new a(longVodMemberNoFreeResolutionView, appCompatActivity), false, null, 24, null);
                }
            }
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: b */
        public void mo66166b(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91581d(this, memberCheckResult);
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: c */
        public void mo66167c(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91584g(this, memberCheckResult);
            InterfaceC27087f interfaceC27087f = (InterfaceC27087f) TheRouter.m61774d(InterfaceC27087f.class, new Object[0]);
            if (interfaceC27087f != null) {
                interfaceC27087f.mo66160e("", memberCheckResult, new b(LongVodMemberNoFreeResolutionView.this));
            }
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: d */
        public void mo66168d(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91582e(this, memberCheckResult);
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: e */
        public void mo66169e() {
            LongVodMemberNoFreeResolutionView.this.m71866d();
            C27089h.f82174a.m105449a(LongVodMemberNoFreeResolutionView.this.getClassTag() + " --> checkMemberRights() --> passed() --> 会员权益通过验证 --> 继续下载任务");
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            if (interfaceC22998b != null) {
                OpType opType = OpType.OP_DOWNLOAD;
                final LongVodMemberNoFreeResolutionView longVodMemberNoFreeResolutionView = LongVodMemberNoFreeResolutionView.this;
                interfaceC22998b.mo69864r(opType, new Function1() { // from class: com.transsion.player.longvideo.member.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongVodMemberNoFreeResolutionView.C16477a.m71868h(longVodMemberNoFreeResolutionView, obj);
                    }
                });
            }
        }

        @Override // p352dn.InterfaceC22997a
        /* JADX INFO: renamed from: f */
        public void mo66170f(MemberCheckResult memberCheckResult) {
            InterfaceC22997a.a.m91578a(this, memberCheckResult);
            C27089h.f82174a.m105450b(LongVodMemberNoFreeResolutionView.this.getClassTag() + " --> triggerDownload() --> showCheckMemberRights() --> notImplement() --> 当前类型没有实现");
        }

        @Override // p352dn.InterfaceC22997a
        public void onFail(String errorMsg) {
            Intrinsics.m97802h(errorMsg, "errorMsg");
            InterfaceC22997a.a.m91579b(this, errorMsg);
            C27089h.f82174a.m105450b(LongVodMemberNoFreeResolutionView.this.getClassTag() + " --> checkMemberRights() --> showCheckMemberRightsDialog() --> " + errorMsg);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LongVodMemberNoFreeResolutionView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LongVodMemberNoFreeResolutionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.long_vod_member_no_free_resolution_view, (ViewGroup) this, false);
        addView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tvUnlockTip);
        if (textView != null) {
            String string = context.getString(R$string.long_vod_unlock_720p_up_quality_with_premium, C16503r.f55634a.m71934j());
            Intrinsics.m97801g(string, "getString(...)");
            textView.setText(string);
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R$id.llUnlockBtn);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LongVodMemberNoFreeResolutionView.m71864b(this.f55616a, view);
                }
            });
        }
    }

    public /* synthetic */ LongVodMemberNoFreeResolutionView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m71864b(LongVodMemberNoFreeResolutionView longVodMemberNoFreeResolutionView, View view) {
        C27089h.f82174a.m105449a(longVodMemberNoFreeResolutionView.getClassTag() + " --> llUnlockBtn{} --> 开通会员按钮点击");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "clarity_unlock");
        C24715a c24715a = longVodMemberNoFreeResolutionView.bean;
        linkedHashMap.put("subject_id", c24715a != null ? c24715a.m97059o() : null);
        C24662i c24662i = C24662i.f75350a;
        String str = longVodMemberNoFreeResolutionView.pageName;
        if (str == null) {
            str = "vip_resolution";
        }
        c24662i.m96881p(str, linkedHashMap);
        longVodMemberNoFreeResolutionView.m71865c();
    }

    /* JADX INFO: renamed from: c */
    private final void m71865c() {
        C27089h.f82174a.m105449a(getClassTag() + " --> showDialog() --> 接口校验 --> sceneType = " + MemberSceneType.SCENE_PREDL);
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69871y(MemberSceneType.SCENE_START_RESOLUTION, 0, new C16477a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m71866d() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new LongVodMemberNoFreeResolutionView$unlock$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getClassTag() {
        String simpleName = LongVodMemberNoFreeResolutionView.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final void setListener(InterfaceC22999c listener) {
        this.listener = listener;
    }

    public final void showCover(C24715a bean, String pageName) {
        setVisibility(0);
        this.bean = bean;
        this.pageName = pageName;
        ImageView imageView = (ImageView) findViewById(R$id.ivCover);
        if (imageView != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            aVar.m94457m(context).m94468g(bean != null ? bean.m97047c() : null).m94472k(true).m94462a(6).m94465d(imageView);
        }
    }
}
