package com.transsion.room.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.p1004lifecycle.AbstractC3225u0;
import com.transsion.moviedetailapi.AbsSubjectListViewModel;
import com.transsion.moviedetailapi.PostRankType;
import com.transsion.moviedetailapi.p1002enum.PostListSource;
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
import p524jq.InterfaceC24462a;

/* JADX INFO: loaded from: classes6.dex */
public final class RoomHotViewModel extends AbsSubjectListViewModel {

    /* JADX INFO: renamed from: k */
    private int f59555k;

    /* JADX INFO: renamed from: l */
    private final Lazy f59556l;

    /* JADX INFO: renamed from: m */
    private String f59557m;

    /* JADX INFO: renamed from: n */
    private String f59558n;

    /* JADX INFO: renamed from: o */
    private final Lazy f59559o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomHotViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59555k = 10;
        this.f59556l = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.room.viewmodel.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomHotViewModel.m77417d0();
            }
        });
        this.f59558n = "0";
        this.f59559o = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomHotViewModel.m77415b0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public final InterfaceC20647b m77412X() {
        return (InterfaceC20647b) this.f59559o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public final InterfaceC24462a m77413Z() {
        return (InterfaceC24462a) this.f59556l.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    private final void m77414a0(String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomHotViewModel$loadNewSubject$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final InterfaceC20647b m77415b0() {
        return (InterfaceC20647b) C22982c.f70163e.m91553a().m91552h(InterfaceC20647b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final Unit m77416c0(RoomHotViewModel roomHotViewModel, PublishEvent it) {
        Intrinsics.m97802h(it, "it");
        roomHotViewModel.m77414a0(it.getPostId());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final InterfaceC24462a m77417d0() {
        return (InterfaceC24462a) C22982c.f70163e.m91553a().m91552h(InterfaceC24462a.class);
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: A */
    public PostListSource mo69056A() {
        return PostListSource.ROOM;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: E */
    public void mo69057E(boolean z11) {
        m77419Y(this.f59557m, this.f59558n, m77418W(), m70960t().getValue(), z11);
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: F */
    public void mo69058F(Bundle bundle) {
        if (bundle != null) {
            this.f59557m = bundle.getString("subject_id");
            Serializable serializable = bundle.getSerializable("rank_type");
            Intrinsics.m97800f(serializable, "null cannot be cast to non-null type com.transsion.moviedetailapi.PostRankType");
            m70951M((PostRankType) serializable);
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomHotViewModel$onCreate$$inlined$observeEvent$1(false, new Function1() { // from class: com.transsion.room.viewmodel.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomHotViewModel.m77416c0(this.f59590a, (PublishEvent) obj);
            }
        }, null), 3, null);
    }

    /* JADX INFO: renamed from: W */
    public int m77418W() {
        return this.f59555k;
    }

    /* JADX INFO: renamed from: Y */
    public final void m77419Y(String str, String page, int i11, String sortType, boolean z11) {
        Intrinsics.m97802h(page, "page");
        Intrinsics.m97802h(sortType, "sortType");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomHotViewModel$getPostSubject$1(this, str, page, i11, sortType, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: e0 */
    public void m77420e0(int i11) {
        this.f59555k = i11;
    }

    @Override // com.transsion.moviedetailapi.AbsSubjectListViewModel
    /* JADX INFO: renamed from: w */
    public String mo69065w(int i11) {
        return i11 == PostRankType.POST_RANK_TYPE_NEW.ordinal() ? "roomdetail_new" : "roomdetail_hot";
    }
}
