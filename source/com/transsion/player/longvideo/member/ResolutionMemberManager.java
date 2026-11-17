package com.transsion.player.longvideo.member;

import android.app.Application;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.member.MemberResolutionDao;
import com.transsion.memberapi.MemberSource;
import com.transsion.p285ad.p288ps.activate.PSActivateManager;
import com.transsion.wrapperad.activate.p323ui.LongVodActivateDialog;
import cy.InterfaceC22789e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p025ay.C4718a;
import p553ko.C24715a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ResolutionMemberManager {

    /* JADX INFO: renamed from: a */
    public static final ResolutionMemberManager f55604a = new ResolutionMemberManager();

    /* JADX INFO: renamed from: b */
    private static final Lazy f55605b = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.longvideo.member.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ResolutionMemberManager.m71892h();
        }
    });

    private ResolutionMemberManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final String m71890d() {
        String simpleName = ResolutionMemberManager.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final MemberResolutionDao m71891e() {
        return (MemberResolutionDao) f55605b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final MemberResolutionDao m71892h() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64871r1();
    }

    /* JADX INFO: renamed from: f */
    public final Object m71893f(C24715a c24715a, Continuation continuation) {
        return c24715a == null ? Boxing.m97631a(false) : AbstractC25088i.m98910g(C25220y0.m99268b(), new ResolutionMemberManager$isUnlock$2(c24715a, null), continuation);
    }

    /* JADX INFO: renamed from: g */
    public final Object m71894g(C24715a c24715a, Continuation continuation) {
        return AbstractC25088i.m98910g(C25220y0.m99268b(), new ResolutionMemberManager$isVipResolutionTip$2(c24715a, null), continuation);
    }

    /* JADX INFO: renamed from: i */
    public final void m71895i(FragmentManager fragmentManager, MemberSource from, final C24715a c24715a, String str, final InterfaceC22789e interfaceC22789e) {
        Intrinsics.m97802h(fragmentManager, "fragmentManager");
        Intrinsics.m97802h(from, "from");
        if (C4718a.f16780a.m22805k(from)) {
            C26866a.a.m104899g(C26866a.f81698a, m71890d() + " --> showRewardDialog() --> 解锁高清视频播放权限开关关闭 --> from = " + from, false, 2, null);
            return;
        }
        if (PSActivateManager.f49686a.m63475d()) {
            LongVodActivateDialog longVodActivateDialog = new LongVodActivateDialog();
            longVodActivateDialog.m86798v0(new InterfaceC22789e() { // from class: com.transsion.player.longvideo.member.ResolutionMemberManager$showRewardDialog$1$1
                @Override // cy.InterfaceC22789e
                /* JADX INFO: renamed from: a */
                public void mo71869a(boolean z11) {
                    AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ResolutionMemberManager$showRewardDialog$1$1$onActivate$1(z11, c24715a, interfaceC22789e, null), 3, null);
                }
            });
            longVodActivateDialog.m86797r0(from, str);
            longVodActivateDialog.show(fragmentManager, "解锁高清视频播放权限");
            return;
        }
        C26866a.a.m104899g(C26866a.f81698a, m71890d() + " --> showRewardDialog() --> 没有激励广告，无法解锁高清视频播放权限 --> from = " + from, false, 2, null);
        if (interfaceC22789e != null) {
            interfaceC22789e.mo71869a(false);
        }
    }

    /* JADX INFO: renamed from: j */
    public final Object m71896j(C24715a c24715a, Continuation continuation) {
        Object objM98910g;
        return (c24715a != null && (objM98910g = AbstractC25088i.m98910g(C25220y0.m99268b(), new ResolutionMemberManager$unlock$2(c24715a, null), continuation)) == IntrinsicsKt.m97630f()) ? objM98910g : Unit.f75682a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m71897k(C24715a c24715a, Continuation continuation) {
        Object objM98910g;
        return (c24715a != null && (objM98910g = AbstractC25088i.m98910g(C25220y0.m99268b(), new ResolutionMemberManager$updateVipResolutionTip$2(c24715a, null), continuation)) == IntrinsicsKt.m97630f()) ? objM98910g : Unit.f75682a;
    }
}
