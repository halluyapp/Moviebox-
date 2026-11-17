package com.transsion.rewardscenter.task.p308ad;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.rewardscenter.R$id;
import com.transsion.rewardscenter.R$layout;
import com.transsion.rewardscenterapi.MemberTaskItem;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C17905m extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final MemberTaskAdHelper f58792e;

    /* JADX INFO: renamed from: f */
    private boolean f58793f;

    /* JADX INFO: renamed from: g */
    private int f58794g;

    /* JADX INFO: renamed from: h */
    private int f58795h;

    /* JADX INFO: renamed from: i */
    private int f58796i;

    /* JADX INFO: renamed from: j */
    private final int f58797j = AdTaskType.REGULAR_AD.getValue();

    /* JADX INFO: renamed from: k */
    private final int f58798k = R$layout.member_task_regular_item_layout;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.m$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58799a;

        static {
            int[] iArr = new int[AdTaskState.values().length];
            try {
                iArr[AdTaskState.DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdTaskState.INSTALLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdTaskState.PLAYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdTaskState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdTaskState.NORMAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdTaskState.PLAYING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f58799a = iArr;
        }
    }

    public C17905m(MemberTaskAdHelper memberTaskAdHelper) {
        this.f58792e = memberTaskAdHelper;
    }

    /* JADX INFO: renamed from: C */
    private final void m76304C(AbstractC17914v.a aVar) {
        NativeWrapperAdView nativeWrapperAdViewM76361h = aVar.m76361h();
        if (nativeWrapperAdViewM76361h != null) {
            NativeWrapperAdView.simulatingClick$default(nativeWrapperAdViewM76361h, aVar.m76356c(), null, aVar.m76363j(), 2, null);
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m76305D(AbstractC17914v.a aVar) {
        HashMap map = new HashMap();
        map.put("module_name", "member_ad_task_regular");
        map.put("ad_state", aVar.m76358e().name());
        map.put("pull_new", String.valueOf(aVar.m76364k()));
        C24662i.f75350a.m96881p("MemberAdTask", map);
    }

    /* JADX INFO: renamed from: E */
    private final void m76306E() {
        HashMap map = new HashMap();
        map.put("module_name", "member_ad_task_regular");
        C24662i.f75350a.m96872D("MemberAdTask", map);
    }

    /* JADX INFO: renamed from: F */
    private final void m76307F(BaseViewHolder baseViewHolder, AbstractC17914v.a aVar) {
        FrameLayout frameLayout = (FrameLayout) baseViewHolder.getView(R$id.ad_container);
        MemberTaskAdHelper memberTaskAdHelper = this.f58792e;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.m76252Q(aVar);
        }
        NativeWrapperAdView nativeWrapperAdViewM76361h = aVar.m76361h();
        if (nativeWrapperAdViewM76361h != null) {
            ViewParent parent = nativeWrapperAdViewM76361h.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(nativeWrapperAdViewM76361h);
            }
            frameLayout.removeAllViews();
            frameLayout.addView(nativeWrapperAdViewM76361h);
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m76308G(AbstractC17914v.a aVar) {
        C17913u.f58813a.m76353v(aVar.m76362i(), aVar.m76358e());
    }

    /* JADX INFO: renamed from: H */
    private final void m76309H(BaseViewHolder baseViewHolder, AbstractC17914v.a aVar, boolean z11) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.btn_action);
        int i11 = a.f58799a[aVar.m76358e().ordinal()];
        if (i11 == 1) {
            textView.setText("Downloading...");
            textView.setTextColor(this.f58795h);
            return;
        }
        if (i11 == 2 || i11 == 3) {
            textView.setText("Claim");
            textView.setTextColor(this.f58794g);
        } else if (i11 != 4) {
            textView.setText(z11 ? "Install" : "Open");
            textView.setTextColor(this.f58794g);
        } else {
            textView.setText("Completed");
            textView.setTextColor(this.f58796i);
        }
    }

    /* JADX INFO: renamed from: I */
    static /* synthetic */ void m76310I(C17905m c17905m, BaseViewHolder baseViewHolder, AbstractC17914v.a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c17905m.m76309H(baseViewHolder, aVar, z11);
    }

    /* JADX INFO: renamed from: J */
    private final void m76311J(final BaseViewHolder baseViewHolder, final AbstractC17914v.a aVar, final boolean z11) {
        AbstractC26006c.m102050c((TextView) baseViewHolder.getView(R$id.btn_action), 0L, new Function1() { // from class: com.transsion.rewardscenter.task.ad.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17905m.m76312K(this.f58782a, aVar, z11, baseViewHolder, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final Unit m76312K(final C17905m c17905m, final AbstractC17914v.a aVar, boolean z11, final BaseViewHolder baseViewHolder, View it) {
        Intrinsics.m97802h(it, "it");
        c17905m.m76305D(aVar);
        int i11 = a.f58799a[aVar.m76358e().ordinal()];
        if (i11 == 2) {
            MemberTaskAdHelper memberTaskAdHelper = c17905m.f58792e;
            if (memberTaskAdHelper != null) {
                memberTaskAdHelper.m76222z(aVar, new Function0() { // from class: com.transsion.rewardscenter.task.ad.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C17905m.m76313L(aVar, c17905m, baseViewHolder);
                    }
                });
            }
        } else if (i11 == 3) {
            MemberTaskAdHelper memberTaskAdHelper2 = c17905m.f58792e;
            if (memberTaskAdHelper2 != null) {
                memberTaskAdHelper2.m76222z(aVar, new Function0() { // from class: com.transsion.rewardscenter.task.ad.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C17905m.m76314M(aVar, c17905m, baseViewHolder);
                    }
                });
            }
        } else if (i11 == 5) {
            if (z11) {
                aVar.m76366m(AdTaskState.DOWNLOADING);
                aVar.m76368o(System.currentTimeMillis());
            } else {
                aVar.m76366m(AdTaskState.PLAYING);
            }
            m76310I(c17905m, baseViewHolder, aVar, false, 4, null);
            c17905m.m76308G(aVar);
            c17905m.m76304C(aVar);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Unit m76313L(AbstractC17914v.a aVar, C17905m c17905m, BaseViewHolder baseViewHolder) {
        aVar.m76366m(AdTaskState.COMPLETED);
        m76310I(c17905m, baseViewHolder, aVar, false, 4, null);
        c17905m.m76308G(aVar);
        c17905m.f58792e.m76221y(aVar.m76362i(), Integer.valueOf(c17905m.f58792e.m76213q(aVar.m76356c().getSceneId())));
        C17913u.f58813a.m76348q(aVar);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Unit m76314M(AbstractC17914v.a aVar, C17905m c17905m, BaseViewHolder baseViewHolder) {
        aVar.m76366m(AdTaskState.COMPLETED);
        m76310I(c17905m, baseViewHolder, aVar, false, 4, null);
        c17905m.m76308G(aVar);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: N */
    private final void m76315N(BaseViewHolder baseViewHolder, boolean z11) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.member_point);
        if (z11) {
            MemberTaskItem memberTaskItemM76340h = C17913u.f58813a.m76340h();
            textView.setText("+" + (memberTaskItemM76340h != null ? memberTaskItemM76340h.getRewardAmount() : null) + " points");
            return;
        }
        MemberTaskItem memberTaskItemM76339g = C17913u.f58813a.m76339g();
        textView.setText("+" + (memberTaskItemM76339g != null ? memberTaskItemM76339g.getRewardAmount() : null) + " points");
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, AbstractC17914v item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (item instanceof AbstractC17914v.a) {
            AbstractC17914v.a aVar = (AbstractC17914v.a) item;
            m76307F(helper, aVar);
            boolean zM76364k = aVar.m76364k();
            m76315N(helper, zM76364k);
            if (!zM76364k && aVar.m76358e() == AdTaskState.COMPLETED) {
                aVar.m76366m(AdTaskState.NORMAL);
            }
            m76309H(helper, aVar, zM76364k);
            m76311J(helper, aVar, zM76364k);
            if (this.f58793f) {
                return;
            }
            this.f58793f = true;
            m76306E();
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f58797j;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f58798k;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(mo22759m(), parent, false);
        this.f58794g = AbstractC2397b.getColor(parent.getContext(), R$color.white);
        this.f58795h = AbstractC2397b.getColor(parent.getContext(), R$color.white_50);
        this.f58796i = AbstractC2397b.getColor(parent.getContext(), R$color.white_40);
        Intrinsics.m97799e(viewInflate);
        return new BaseViewHolder(viewInflate);
    }
}
