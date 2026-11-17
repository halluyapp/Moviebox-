package com.transsion.moviedetail.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.moviedetailapi.AbsSubjectListViewModel;
import com.transsion.moviedetailapi.PostRankType;
import com.transsion.moviedetailapi.p1002enum.PostListSource;
import com.transsion.moviedetailapi.p1002enum.ProfileSubSource;
import com.transsion.usercenter.profile.InterfaceC20647b;
import com.transsnet.flow.event.sync.event.PublishEvent;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p523jn.InterfaceC24449a;

/* JADX INFO: loaded from: classes6.dex */
public final class HotViewModel extends AbsSubjectListViewModel {

    /* JADX INFO: renamed from: k */
    private final Lazy f54961k;

    /* JADX INFO: renamed from: l */
    private String f54962l;

    /* JADX INFO: renamed from: m */
    private String f54963m;

    /* JADX INFO: renamed from: n */
    private String f54964n;

    /* JADX INFO: renamed from: o */
    private int f54965o;

    /* JADX INFO: renamed from: p */
    private final C3187b0 f54966p;

    /* JADX INFO: renamed from: q */
    private final Lazy f54967q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f54961k = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.moviedetail.viewmodel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotViewModel.m70863j0();
            }
        });
        this.f54964n = "0";
        this.f54966p = new C3187b0();
        this.f54967q = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotViewModel.m70861h0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final InterfaceC20647b m70856Y() {
        return (InterfaceC20647b) this.f54967q.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    private final void m70857a0(String str, String str2, int i11, String str3, boolean z11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new HotViewModel$getPostSubject$1(this, str, str2, i11, str3, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m70858c0(HotViewModel hotViewModel, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "1";
        }
        if ((i12 & 2) != 0) {
            i11 = 3;
        }
        hotViewModel.m70867b0(str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC24449a m70859e0() {
        return (InterfaceC24449a) this.f54961k.getValue();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m70860g0(String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new HotViewModel$loadNewSubject$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final InterfaceC20647b m70861h0() {
        return (InterfaceC20647b) C22982c.f70163e.m91553a().m91552h(InterfaceC20647b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final Unit m70862i0(HotViewModel hotViewModel, PublishEvent it) {
        Intrinsics.m97802h(it, "it");
        hotViewModel.m70860g0(it.getPostId());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final InterfaceC24449a m70863j0() {
        return (InterfaceC24449a) C22982c.f70163e.m91553a().m91552h(InterfaceC24449a.class);
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: A */
    public PostListSource mo69056A() {
        return PostListSource.SUBJECT;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: B */
    public ProfileSubSource mo70864B() {
        return ProfileSubSource.COMMENTS;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: E */
    public void mo69057E(boolean z11) {
        m70857a0(this.f54962l, this.f54964n, m70865X(), m70960t().getValue(), z11);
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: F */
    public void mo69058F(Bundle bundle) {
        if (bundle != null) {
            this.f54962l = bundle.getString("subject_id");
            this.f54963m = bundle.getString("ops");
            Serializable serializable = bundle.getSerializable("rank_type");
            Intrinsics.m97800f(serializable, "null cannot be cast to non-null type com.transsion.moviedetailapi.PostRankType");
            m70951M((PostRankType) serializable);
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new HotViewModel$onCreate$$inlined$observeEvent$1(false, new Function1() { // from class: com.transsion.moviedetail.viewmodel.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HotViewModel.m70862i0(this.f54991a, (PublishEvent) obj);
            }
        }, null), 3, null);
    }

    /* JADX INFO: renamed from: X */
    public int m70865X() {
        return this.f54965o;
    }

    /* JADX INFO: renamed from: Z */
    public final String m70866Z() {
        return this.f54963m;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m70867b0(String page, int i11) {
        Intrinsics.m97802h(page, "page");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new HotViewModel$getRecommendRooms$1(this, page, i11, null), 3, null);
    }

    /* JADX INFO: renamed from: d0 */
    public final C3187b0 m70868d0() {
        return this.f54966p;
    }

    /* JADX INFO: renamed from: f0 */
    public final String m70869f0() {
        return this.f54962l;
    }

    /* JADX INFO: renamed from: k0 */
    public void m70870k0(int i11) {
        this.f54965o = i11;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: w */
    public String mo69065w(int i11) {
        return i11 == PostRankType.POST_RANK_TYPE_NEW.ordinal() ? "subjectdetail_new" : "subjectdetail_hot";
    }
}
