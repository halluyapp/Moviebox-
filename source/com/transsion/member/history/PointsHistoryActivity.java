package com.transsion.member.history;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.ViewModelLazy;
import bn.C4853b;
import com.gyf.immersionbar.ImmersionBar;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.member.R$id;
import com.transsion.member.R$string;
import com.transsion.member.bean.PointsHistoryData;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p669p1.AbstractC26781a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m97100d2 = {"Lcom/transsion/member/history/PointsHistoryActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lbn/b;", "<init>", "()V", "", "f0", "()Ljava/lang/String;", "", "isTranslucent", "()Z", "o0", "", "l0", "m0", "k0", "p0", "retryLoadData", "F0", "()Lbn/b;", "q0", "Lcom/transsion/member/history/PointsHistoryViewModel;", "i", "Lkotlin/Lazy;", "E0", "()Lcom/transsion/member/history/PointsHistoryViewModel;", "mViewModel", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PointsHistoryActivity extends BaseNewActivity<C4853b> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: com.transsion.member.history.PointsHistoryActivity$a */
    static final class C15841a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54329a;

        C15841a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54329a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54329a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54329a.invoke(obj);
        }
    }

    public PointsHistoryActivity() {
        final Function0 function0 = null;
        this.mViewModel = new ViewModelLazy(Reflection.m97823b(PointsHistoryViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.member.history.PointsHistoryActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.member.history.PointsHistoryActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<AbstractC26781a>() { // from class: com.transsion.member.history.PointsHistoryActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final AbstractC26781a invoke() {
                AbstractC26781a abstractC26781a;
                Function0 function1 = function0;
                return (function1 == null || (abstractC26781a = (AbstractC26781a) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : abstractC26781a;
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    private final PointsHistoryViewModel m70069E0() {
        return (PointsHistoryViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m70070G0(PointsHistoryActivity pointsHistoryActivity, View view) {
        pointsHistoryActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m70071H0(PointsHistoryActivity pointsHistoryActivity, PointsHistoryData pointsHistoryData) {
        String coinBalance;
        AppCompatTextView appCompatTextView = ((C4853b) pointsHistoryActivity.getMViewBinding()).f17173d;
        if (pointsHistoryData == null || (coinBalance = pointsHistoryData.getCoinBalance()) == null) {
            coinBalance = "0";
        }
        appCompatTextView.setText(coinBalance);
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public C4853b getViewBinding() {
        C4853b c4853bM23354c = C4853b.m23354c(getLayoutInflater());
        Intrinsics.m97801g(c4853bM23354c, "inflate(...)");
        return c4853bM23354c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        ((C4853b) getMViewBinding()).f17172c.f17251c.setText(getString(R$string.points_history_title));
        ((C4853b) getMViewBinding()).f17172c.f17250b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.history.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PointsHistoryActivity.m70070G0(this.f54340a, view);
            }
        });
        LinearLayoutCompat root = ((C4853b) getMViewBinding()).getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102052e(root);
        m65396s0();
        ImmersionBar.with(this).statusBarDarkFont(false).init();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
        m70069E0().m70084e().m14851j(this, new C15841a(new Function1() { // from class: com.transsion.member.history.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PointsHistoryActivity.m70071H0(this.f54341a, (PointsHistoryData) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: o0 */
    public boolean mo65393o0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: q0 */
    public void mo65395q0() {
        super.mo65395q0();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        abstractC3168wM14557p.m14813s(R$id.container, PointsHistoryFragment.INSTANCE.m70078a());
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
