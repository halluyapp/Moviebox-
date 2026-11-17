package com.transsion.home.view.filter.popup;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AbstractC0783a0;
import androidx.compose.foundation.layout.AbstractC0785b0;
import androidx.compose.foundation.layout.AbstractC0791e0;
import androidx.compose.foundation.layout.AbstractC0798i;
import androidx.compose.foundation.layout.AbstractC0800j;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C0784b;
import androidx.compose.foundation.layout.C0789d0;
import androidx.compose.foundation.layout.C0803l;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.AbstractC0905t;
import androidx.compose.foundation.lazy.InterfaceC0826b;
import androidx.compose.foundation.lazy.InterfaceC0906u;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.C0996k;
import androidx.compose.material.DividerKt;
import androidx.compose.material.InterfaceC0995j;
import androidx.compose.material.SliderKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p019ui.ComposedModifierKt;
import androidx.compose.p019ui.InterfaceC1262b;
import androidx.compose.p019ui.InterfaceC1302f;
import androidx.compose.p019ui.graphics.C1546u1;
import androidx.compose.p019ui.graphics.painter.Painter;
import androidx.compose.p019ui.layout.InterfaceC1699t;
import androidx.compose.p019ui.node.ComposeUiNode;
import androidx.compose.p019ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p019ui.platform.CompositionLocalsKt;
import androidx.compose.p019ui.text.font.AbstractC2046h;
import androidx.compose.p019ui.text.font.C2054p;
import androidx.compose.p019ui.text.font.C2057s;
import androidx.compose.p019ui.text.style.AbstractC2159p;
import androidx.compose.p019ui.window.AndroidDialog_androidKt;
import androidx.compose.p019ui.window.C2188c;
import androidx.compose.runtime.AbstractC1113f3;
import androidx.compose.runtime.AbstractC1114g;
import androidx.compose.runtime.AbstractC1144k;
import androidx.compose.runtime.AbstractC1238u2;
import androidx.compose.runtime.AbstractC1241v1;
import androidx.compose.runtime.InterfaceC1109f;
import androidx.compose.runtime.InterfaceC1117g2;
import androidx.compose.runtime.InterfaceC1124i;
import androidx.compose.runtime.InterfaceC1126i1;
import androidx.compose.runtime.InterfaceC1176s;
import androidx.compose.runtime.internal.AbstractC1134b;
import androidx.compose.runtime.snapshots.C1221t;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.blankj.utilcode.util.AbstractC5786f0;
import com.google.accompanist.systemuicontroller.AbstractC9149b;
import com.google.accompanist.systemuicontroller.InterfaceC9150c;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import com.p282tn.lib.widget.R$color;
import com.transsion.home.R$string;
import com.transsion.home.bean.FilterVal;
import com.transsion.home.bean.Item;
import com.transsion.home.bean.RangeValue;
import com.transsion.home.view.filter.popup.AbstractC15536e;
import com.transsion.videodetail.R$drawable;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p474i0.AbstractC23939b;
import p474i0.AbstractC23942e;
import p474i0.AbstractC23945h;
import p629o0.AbstractC26153x;
import p629o0.C26138i;
import p629o0.InterfaceC26134e;
import p690q.AbstractC26970g;
import p963z0.C29093c;

/* JADX INFO: renamed from: com.transsion.home.view.filter.popup.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15536e {

    /* JADX INFO: renamed from: a */
    private static float f53609a;

    /* JADX INFO: renamed from: b */
    private static float f53610b;

    /* JADX INFO: renamed from: c */
    private static boolean f53611c;

    /* JADX INFO: renamed from: com.transsion.home.view.filter.popup.e$a */
    static final class a implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f53612a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f53613b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f53614c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f53615d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C1221t f53616e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Function1 f53617f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C1221t f53618g;

        /* JADX INFO: renamed from: com.transsion.home.view.filter.popup.e$a$a, reason: collision with other inner class name */
        static final class C29452a implements Function3 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Item f53619a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1221t f53620b;

            C29452a(Item item, C1221t c1221t) {
                this.f53619a = item;
                this.f53620b = c1221t;
            }

            /* JADX INFO: renamed from: a */
            public final void m68890a(InterfaceC0826b item, InterfaceC1124i interfaceC1124i, int i11) {
                Intrinsics.m97802h(item, "$this$item");
                if ((i11 & 17) == 16 && interfaceC1124i.mo4471h()) {
                    interfaceC1124i.mo4443G();
                    return;
                }
                if (AbstractC1144k.m5030H()) {
                    AbstractC1144k.m5039Q(807301957, i11, -1, "com.transsion.home.view.filter.popup.MultiFilterPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MultiFilterPopupWindow.kt:175)");
                }
                AbstractC15536e.m68865k(this.f53619a, this.f53620b, interfaceC1124i, 0);
                if (AbstractC1144k.m5030H()) {
                    AbstractC1144k.m5038P();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m68890a((InterfaceC0826b) obj, (InterfaceC1124i) obj2, ((Number) obj3).intValue());
                return Unit.f75682a;
            }
        }

        a(long j11, float f11, float f12, List list, C1221t c1221t, Function1 function1, C1221t c1221t2) {
            this.f53612a = j11;
            this.f53613b = f11;
            this.f53614c = f12;
            this.f53615d = list;
            this.f53616e = c1221t;
            this.f53617f = function1;
            this.f53618g = c1221t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m68885f(C1221t c1221t, C1221t c1221t2, Function1 function1) {
            function1.invoke(Boolean.valueOf(AbstractC15536e.m68853D(c1221t, c1221t2)));
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m68886g(List list, C1221t c1221t) {
            AbstractC15536e.m68854E(list, c1221t);
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Unit m68887h(Function1 function1) {
            function1.invoke(Boolean.FALSE);
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final Unit m68888i(List list, C1221t c1221t, InterfaceC0906u LazyColumn) {
            Intrinsics.m97802h(LazyColumn, "$this$LazyColumn");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Item item = (Item) it.next();
                AbstractC0905t.m3886a(LazyColumn, item.getFilterType(), null, AbstractC1134b.m4967b(807301957, true, new C29452a(item, c1221t)), 2, null);
            }
            return Unit.f75682a;
        }

        /* JADX INFO: renamed from: e */
        public final void m68889e(InterfaceC1124i interfaceC1124i, int i11) {
            if ((i11 & 3) == 2 && interfaceC1124i.mo4471h()) {
                interfaceC1124i.mo4443G();
                return;
            }
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(-1419240635, i11, -1, "com.transsion.home.view.filter.popup.MultiFilterPopup.<anonymous> (MultiFilterPopupWindow.kt:122)");
            }
            InterfaceC1302f.a aVar = InterfaceC1302f.f4127a;
            InterfaceC1302f interfaceC1302fM3409b = SizeKt.m3409b(BackgroundKt.m3004b(aVar, this.f53612a, null, 2, null), 0.0f, 1, null);
            float f11 = this.f53613b;
            float f12 = this.f53614c;
            final List list = this.f53615d;
            final C1221t c1221t = this.f53616e;
            final Function1 function1 = this.f53617f;
            final C1221t c1221t2 = this.f53618g;
            InterfaceC1262b.a aVar2 = InterfaceC1262b.f4036a;
            InterfaceC1699t interfaceC1699tM3353h = BoxKt.m3353h(aVar2.m5762m(), false);
            int iM4878a = AbstractC1114g.m4878a(interfaceC1124i, 0);
            InterfaceC1176s interfaceC1176sMo4481n = interfaceC1124i.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e = ComposedModifierKt.m5740e(interfaceC1124i, interfaceC1302fM3409b);
            ComposeUiNode.Companion companion = ComposeUiNode.f5204c1;
            Function0 function0M7740a = companion.m7740a();
            if (!(interfaceC1124i.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124i.mo4437C();
            if (interfaceC1124i.mo4466e()) {
                interfaceC1124i.mo4442F(function0M7740a);
            } else {
                interfaceC1124i.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a = AbstractC1113f3.m4876a(interfaceC1124i);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1699tM3353h, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1176sMo4481n, companion.m7744e());
            Function2 function2M7741b = companion.m7741b();
            if (interfaceC1124iM4876a.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a.mo4497y(), Integer.valueOf(iM4878a))) {
                interfaceC1124iM4876a.mo4484p(Integer.valueOf(iM4878a));
                interfaceC1124iM4876a.mo4474k(Integer.valueOf(iM4878a), function2M7741b);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1302fM5740e, companion.m7743d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f2646a;
            InterfaceC1302f interfaceC1302fM3395i = PaddingKt.m3395i(SizeKt.m3409b(aVar, 0.0f, 1, null), 0.0f, f11, 0.0f, f12, 5, null);
            C0784b c0784b = C0784b.f2739a;
            InterfaceC1699t interfaceC1699tM3503a = AbstractC0798i.m3503a(c0784b.m3479d(), aVar2.m5758i(), interfaceC1124i, 0);
            int iM4878a2 = AbstractC1114g.m4878a(interfaceC1124i, 0);
            InterfaceC1176s interfaceC1176sMo4481n2 = interfaceC1124i.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e2 = ComposedModifierKt.m5740e(interfaceC1124i, interfaceC1302fM3395i);
            Function0 function0M7740a2 = companion.m7740a();
            if (!(interfaceC1124i.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124i.mo4437C();
            if (interfaceC1124i.mo4466e()) {
                interfaceC1124i.mo4442F(function0M7740a2);
            } else {
                interfaceC1124i.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a2 = AbstractC1113f3.m4876a(interfaceC1124i);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1699tM3503a, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1176sMo4481n2, companion.m7744e());
            Function2 function2M7741b2 = companion.m7741b();
            if (interfaceC1124iM4876a2.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a2.mo4497y(), Integer.valueOf(iM4878a2))) {
                interfaceC1124iM4876a2.mo4484p(Integer.valueOf(iM4878a2));
                interfaceC1124iM4876a2.mo4474k(Integer.valueOf(iM4878a2), function2M7741b2);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1302fM5740e2, companion.m7743d());
            C0803l c0803l = C0803l.f2763a;
            float f13 = 12;
            float f14 = 16;
            InterfaceC1302f interfaceC1302fM3392f = PaddingKt.m3392f(aVar, C26138i.m102354g(f14), C26138i.m102354g(f13));
            InterfaceC1699t interfaceC1699tM3475b = AbstractC0783a0.m3475b(c0784b.m3478c(), aVar2.m5759j(), interfaceC1124i, 0);
            int iM4878a3 = AbstractC1114g.m4878a(interfaceC1124i, 0);
            InterfaceC1176s interfaceC1176sMo4481n3 = interfaceC1124i.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e3 = ComposedModifierKt.m5740e(interfaceC1124i, interfaceC1302fM3392f);
            Function0 function0M7740a3 = companion.m7740a();
            if (!(interfaceC1124i.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124i.mo4437C();
            if (interfaceC1124i.mo4466e()) {
                interfaceC1124i.mo4442F(function0M7740a3);
            } else {
                interfaceC1124i.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a3 = AbstractC1113f3.m4876a(interfaceC1124i);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a3, interfaceC1699tM3475b, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a3, interfaceC1176sMo4481n3, companion.m7744e());
            Function2 function2M7741b3 = companion.m7741b();
            if (interfaceC1124iM4876a3.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a3.mo4497y(), Integer.valueOf(iM4878a3))) {
                interfaceC1124iM4876a3.mo4484p(Integer.valueOf(iM4878a3));
                interfaceC1124iM4876a3.mo4474k(Integer.valueOf(iM4878a3), function2M7741b3);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a3, interfaceC1302fM5740e3, companion.m7743d());
            C0789d0 c0789d0 = C0789d0.f2752a;
            String strM94716a = AbstractC23945h.m94716a(R$string.filter_more_title, interfaceC1124i, 0);
            AbstractC2046h.a aVar3 = AbstractC2046h.f6219b;
            C2057s c2057sM9513b = aVar3.m9513b();
            C2054p.a aVar4 = C2054p.f6244b;
            C2054p c2054pM9557e = aVar4.m9557e();
            int iM10007b = AbstractC2159p.f6537a.m10007b();
            TextKt.m4312a(strM94716a, AbstractC0785b0.m3489a(c0789d0, SizeKt.m3419l(aVar, C26138i.m102354g(0)), 1.0f, false, 2, null), C1546u1.f4638b.m6915f(), AbstractC26153x.m102447c(18), null, c2054pM9557e, c2057sM9513b, 0L, null, null, 0L, iM10007b, false, 0, 0, null, null, interfaceC1124i, 200064, 48, 128912);
            AbstractC0791e0.m3499a(SizeKt.m3419l(aVar, C26138i.m102354g(f13)), interfaceC1124i, 6);
            Painter painterM94712c = AbstractC23942e.m94712c(R$drawable.music_iv_close, interfaceC1124i, 0);
            long jM94702a = AbstractC23939b.m94702a(R$color.white, interfaceC1124i, 0);
            float f15 = 21;
            InterfaceC1302f interfaceC1302fM3412e = SizeKt.m3412e(SizeKt.m3419l(aVar, C26138i.m102354g(f15)), C26138i.m102354g(f15));
            interfaceC1124i.mo4456P(5004770);
            boolean zMo4455O = interfaceC1124i.mo4455O(function1);
            Object objMo4497y = interfaceC1124i.mo4497y();
            if (zMo4455O || objMo4497y == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y = new Function0() { // from class: com.transsion.home.view.filter.popup.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC15536e.a.m68887h(function1);
                    }
                };
                interfaceC1124i.mo4484p(objMo4497y);
            }
            interfaceC1124i.mo4448K();
            IconKt.m4306a(painterM94712c, MRAIDPresenter.OPEN, ClickableKt.m3044d(interfaceC1302fM3412e, false, null, null, (Function0) objMo4497y, 7, null), jM94702a, interfaceC1124i, 48, 0);
            interfaceC1124i.mo4487r();
            float f16 = 1;
            DividerKt.m4124a(null, AbstractC23939b.m94702a(R$color.white_10, interfaceC1124i, 0), C26138i.m102354g(f16), 0.0f, interfaceC1124i, 384, 9);
            AbstractC0791e0.m3499a(SizeKt.m3412e(aVar, C26138i.m102354g(f13)), interfaceC1124i, 6);
            InterfaceC1302f interfaceC1302fM3411d = SizeKt.m3411d(PaddingKt.m3393g(AbstractC0800j.m3508a(c0803l, aVar, 1.0f, false, 2, null), C26138i.m102354g(f14), 0.0f, 2, null), 0.0f, 1, null);
            interfaceC1124i.mo4456P(-1633490746);
            boolean zMo4433A = interfaceC1124i.mo4433A(list) | interfaceC1124i.mo4455O(c1221t);
            Object objMo4497y2 = interfaceC1124i.mo4497y();
            if (zMo4433A || objMo4497y2 == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y2 = new Function1() { // from class: com.transsion.home.view.filter.popup.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC15536e.a.m68888i(list, c1221t, (InterfaceC0906u) obj);
                    }
                };
                interfaceC1124i.mo4484p(objMo4497y2);
            }
            interfaceC1124i.mo4448K();
            LazyDslKt.m3546a(interfaceC1302fM3411d, null, null, false, null, null, null, false, (Function1) objMo4497y2, interfaceC1124i, 0, 254);
            DividerKt.m4124a(null, AbstractC23939b.m94702a(R$color.white_10, interfaceC1124i, 0), C26138i.m102354g(f16), 0.0f, interfaceC1124i, 384, 9);
            AbstractC0791e0.m3499a(SizeKt.m3412e(aVar, C26138i.m102354g(f13)), interfaceC1124i, 6);
            InterfaceC1302f interfaceC1302fM3393g = PaddingKt.m3393g(aVar, C26138i.m102354g(f14), 0.0f, 2, null);
            InterfaceC1699t interfaceC1699tM3475b2 = AbstractC0783a0.m3475b(c0784b.m3478c(), aVar2.m5759j(), interfaceC1124i, 0);
            int iM4878a4 = AbstractC1114g.m4878a(interfaceC1124i, 0);
            InterfaceC1176s interfaceC1176sMo4481n4 = interfaceC1124i.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e4 = ComposedModifierKt.m5740e(interfaceC1124i, interfaceC1302fM3393g);
            Function0 function0M7740a4 = companion.m7740a();
            if (!(interfaceC1124i.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124i.mo4437C();
            if (interfaceC1124i.mo4466e()) {
                interfaceC1124i.mo4442F(function0M7740a4);
            } else {
                interfaceC1124i.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a4 = AbstractC1113f3.m4876a(interfaceC1124i);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a4, interfaceC1699tM3475b2, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a4, interfaceC1176sMo4481n4, companion.m7744e());
            Function2 function2M7741b4 = companion.m7741b();
            if (interfaceC1124iM4876a4.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a4.mo4497y(), Integer.valueOf(iM4878a4))) {
                interfaceC1124iM4876a4.mo4484p(Integer.valueOf(iM4878a4));
                interfaceC1124iM4876a4.mo4474k(Integer.valueOf(iM4878a4), function2M7741b4);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a4, interfaceC1302fM5740e4, companion.m7743d());
            InterfaceC1262b.b bVarM5755f = aVar2.m5755f();
            C0784b.e eVarM3477b = c0784b.m3477b();
            float f17 = 48;
            float f18 = 100;
            InterfaceC1302f interfaceC1302fM3019e = BorderKt.m3019e(SizeKt.m3412e(aVar, C26138i.m102354g(f17)), C26138i.m102354g(f16), AbstractC23939b.m94702a(R$color.white, interfaceC1124i, 0), AbstractC26970g.m105115c(C26138i.m102354g(f18)));
            interfaceC1124i.mo4456P(-1633490746);
            boolean zMo4433A2 = interfaceC1124i.mo4433A(list) | interfaceC1124i.mo4455O(c1221t);
            Object objMo4497y3 = interfaceC1124i.mo4497y();
            if (zMo4433A2 || objMo4497y3 == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y3 = new Function0() { // from class: com.transsion.home.view.filter.popup.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC15536e.a.m68886g(list, c1221t);
                    }
                };
                interfaceC1124i.mo4484p(objMo4497y3);
            }
            interfaceC1124i.mo4448K();
            InterfaceC1302f interfaceC1302fM3044d = ClickableKt.m3044d(interfaceC1302fM3019e, false, null, null, (Function0) objMo4497y3, 7, null);
            InterfaceC1699t interfaceC1699tM3503a2 = AbstractC0798i.m3503a(eVarM3477b, bVarM5755f, interfaceC1124i, 54);
            int iM4878a5 = AbstractC1114g.m4878a(interfaceC1124i, 0);
            InterfaceC1176s interfaceC1176sMo4481n5 = interfaceC1124i.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e5 = ComposedModifierKt.m5740e(interfaceC1124i, interfaceC1302fM3044d);
            Function0 function0M7740a5 = companion.m7740a();
            if (!(interfaceC1124i.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124i.mo4437C();
            if (interfaceC1124i.mo4466e()) {
                interfaceC1124i.mo4442F(function0M7740a5);
            } else {
                interfaceC1124i.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a5 = AbstractC1113f3.m4876a(interfaceC1124i);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a5, interfaceC1699tM3503a2, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a5, interfaceC1176sMo4481n5, companion.m7744e());
            Function2 function2M7741b5 = companion.m7741b();
            if (interfaceC1124iM4876a5.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a5.mo4497y(), Integer.valueOf(iM4878a5))) {
                interfaceC1124iM4876a5.mo4484p(Integer.valueOf(iM4878a5));
                interfaceC1124iM4876a5.mo4474k(Integer.valueOf(iM4878a5), function2M7741b5);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a5, interfaceC1302fM5740e5, companion.m7743d());
            String strM94716a2 = AbstractC23945h.m94716a(R$string.filter_reset, interfaceC1124i, 0);
            long jM102447c = AbstractC26153x.m102447c(18);
            C2057s c2057sM9513b2 = aVar3.m9513b();
            TextKt.m4312a(strM94716a2, PaddingKt.m3393g(aVar, C26138i.m102354g(24), 0.0f, 2, null), AbstractC23939b.m94702a(R$color.white, interfaceC1124i, 0), jM102447c, null, aVar4.m9557e(), c2057sM9513b2, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1124i, 199728, 0, 130960);
            interfaceC1124i.mo4487r();
            AbstractC0791e0.m3499a(SizeKt.m3419l(aVar, C26138i.m102354g(f13)), interfaceC1124i, 6);
            InterfaceC1262b.b bVarM5755f2 = aVar2.m5755f();
            C0784b.e eVarM3477b2 = c0784b.m3477b();
            InterfaceC1302f interfaceC1302fM3003a = BackgroundKt.m3003a(AbstractC0785b0.m3489a(c0789d0, SizeKt.m3412e(aVar, C26138i.m102354g(f17)), 1.0f, false, 2, null), AbstractC23939b.m94702a(R$color.white, interfaceC1124i, 0), AbstractC26970g.m105115c(C26138i.m102354g(f18)));
            interfaceC1124i.mo4456P(-1746271574);
            boolean zMo4455O2 = interfaceC1124i.mo4455O(c1221t2) | interfaceC1124i.mo4455O(c1221t) | interfaceC1124i.mo4455O(function1);
            Object objMo4497y4 = interfaceC1124i.mo4497y();
            if (zMo4455O2 || objMo4497y4 == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y4 = new Function0() { // from class: com.transsion.home.view.filter.popup.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC15536e.a.m68885f(c1221t2, c1221t, function1);
                    }
                };
                interfaceC1124i.mo4484p(objMo4497y4);
            }
            interfaceC1124i.mo4448K();
            InterfaceC1302f interfaceC1302fM3044d2 = ClickableKt.m3044d(interfaceC1302fM3003a, false, null, null, (Function0) objMo4497y4, 7, null);
            InterfaceC1699t interfaceC1699tM3503a3 = AbstractC0798i.m3503a(eVarM3477b2, bVarM5755f2, interfaceC1124i, 54);
            int iM4878a6 = AbstractC1114g.m4878a(interfaceC1124i, 0);
            InterfaceC1176s interfaceC1176sMo4481n6 = interfaceC1124i.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e6 = ComposedModifierKt.m5740e(interfaceC1124i, interfaceC1302fM3044d2);
            Function0 function0M7740a6 = companion.m7740a();
            if (!(interfaceC1124i.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124i.mo4437C();
            if (interfaceC1124i.mo4466e()) {
                interfaceC1124i.mo4442F(function0M7740a6);
            } else {
                interfaceC1124i.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a6 = AbstractC1113f3.m4876a(interfaceC1124i);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a6, interfaceC1699tM3503a3, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a6, interfaceC1176sMo4481n6, companion.m7744e());
            Function2 function2M7741b6 = companion.m7741b();
            if (interfaceC1124iM4876a6.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a6.mo4497y(), Integer.valueOf(iM4878a6))) {
                interfaceC1124iM4876a6.mo4484p(Integer.valueOf(iM4878a6));
                interfaceC1124iM4876a6.mo4474k(Integer.valueOf(iM4878a6), function2M7741b6);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a6, interfaceC1302fM5740e6, companion.m7743d());
            TextKt.m4312a(AbstractC23945h.m94716a(R$string.filter_confirm, interfaceC1124i, 0), null, AbstractC23939b.m94702a(R$color.black, interfaceC1124i, 0), AbstractC26153x.m102447c(18), null, aVar4.m9557e(), aVar3.m9513b(), 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1124i, 199680, 0, 130962);
            interfaceC1124i.mo4487r();
            interfaceC1124i.mo4487r();
            AbstractC0791e0.m3499a(SizeKt.m3412e(aVar, C26138i.m102354g(f13)), interfaceC1124i, 6);
            interfaceC1124i.mo4487r();
            interfaceC1124i.mo4487r();
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m68889e((InterfaceC1124i) obj, ((Number) obj2).intValue());
            return Unit.f75682a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final boolean m68853D(C1221t c1221t, C1221t c1221t2) {
        boolean z11 = false;
        for (Map.Entry entry : c1221t2.entrySet()) {
            if (!Intrinsics.m97797c(c1221t.get(entry.getKey()), entry.getValue())) {
                c1221t.put(entry.getKey(), entry.getValue());
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m68854E(List list, C1221t c1221t) {
        f53611c = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            if (item.getRangeVals() != null) {
                c1221t.put(item.getFilterType(), PopupFilterView.INSTANCE.m68848a(item.getRangeVals().getMinVal(), item.getRangeVals().getMaxVal()));
            } else if (!item.getFilterValsV2().isEmpty()) {
                c1221t.put(item.getFilterType(), item.getFilterValsV2().get(0).getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m68865k(final Item item, final C1221t c1221t, InterfaceC1124i interfaceC1124i, final int i11) {
        InterfaceC1124i interfaceC1124i2;
        int i12;
        InterfaceC1124i interfaceC1124iMo4469g = interfaceC1124i.mo4469g(1506355035);
        int i13 = (i11 & 6) == 0 ? (interfaceC1124iMo4469g.mo4433A(item) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i13 |= interfaceC1124iMo4469g.mo4455O(c1221t) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 19) == 18 && interfaceC1124iMo4469g.mo4471h()) {
            interfaceC1124iMo4469g.mo4443G();
            interfaceC1124i2 = interfaceC1124iMo4469g;
        } else {
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(1506355035, i14, -1, "com.transsion.home.view.filter.popup.FilterItemView (MultiFilterPopupWindow.kt:280)");
            }
            InterfaceC1302f.a aVar = InterfaceC1302f.f4127a;
            InterfaceC1699t interfaceC1699tM3503a = AbstractC0798i.m3503a(C0784b.f2739a.m3479d(), InterfaceC1262b.f4036a.m5758i(), interfaceC1124iMo4469g, 0);
            int iM4878a = AbstractC1114g.m4878a(interfaceC1124iMo4469g, 0);
            InterfaceC1176s interfaceC1176sMo4481n = interfaceC1124iMo4469g.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e = ComposedModifierKt.m5740e(interfaceC1124iMo4469g, aVar);
            ComposeUiNode.Companion companion = ComposeUiNode.f5204c1;
            Function0 function0M7740a = companion.m7740a();
            if (!(interfaceC1124iMo4469g.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124iMo4469g.mo4437C();
            if (interfaceC1124iMo4469g.mo4466e()) {
                interfaceC1124iMo4469g.mo4442F(function0M7740a);
            } else {
                interfaceC1124iMo4469g.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a = AbstractC1113f3.m4876a(interfaceC1124iMo4469g);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1699tM3503a, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1176sMo4481n, companion.m7744e());
            Function2 function2M7741b = companion.m7741b();
            if (interfaceC1124iM4876a.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a.mo4497y(), Integer.valueOf(iM4878a))) {
                interfaceC1124iM4876a.mo4484p(Integer.valueOf(iM4878a));
                interfaceC1124iM4876a.mo4474k(Integer.valueOf(iM4878a), function2M7741b);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1302fM5740e, companion.m7743d());
            C0803l c0803l = C0803l.f2763a;
            int i15 = 0;
            TextKt.m4312a(item.getTitle(), null, AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, 0), AbstractC26153x.m102447c(16), null, C2054p.f6244b.m9555c(), AbstractC2046h.f6219b.m9513b(), 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1124iMo4469g, 199680, 0, 130962);
            if (item.getRangeVals() == null) {
                interfaceC1124iMo4469g.mo4456P(727601012);
                List<List> listA0 = CollectionsKt.m97350a0(item.getFilterValsV2(), 2);
                int i16 = (((Configuration) interfaceC1124iMo4469g.mo4476l(AndroidCompositionLocals_androidKt.m8615f())).screenWidthDp - 44) / 2;
                for (List<FilterVal> list : listA0) {
                    InterfaceC1302f interfaceC1302fM3395i = PaddingKt.m3395i(SizeKt.m3411d(InterfaceC1302f.f4127a, 0.0f, 1, null), 0.0f, C26138i.m102354g(12), 0.0f, 0.0f, 13, null);
                    InterfaceC1699t interfaceC1699tM3475b = AbstractC0783a0.m3475b(C0784b.f2739a.m3478c(), InterfaceC1262b.f4036a.m5759j(), interfaceC1124iMo4469g, i15);
                    int iM4878a2 = AbstractC1114g.m4878a(interfaceC1124iMo4469g, i15);
                    InterfaceC1176s interfaceC1176sMo4481n2 = interfaceC1124iMo4469g.mo4481n();
                    InterfaceC1302f interfaceC1302fM5740e2 = ComposedModifierKt.m5740e(interfaceC1124iMo4469g, interfaceC1302fM3395i);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.f5204c1;
                    Function0 function0M7740a2 = companion2.m7740a();
                    if (!(interfaceC1124iMo4469g.mo4472i() instanceof InterfaceC1109f)) {
                        AbstractC1114g.m4879b();
                    }
                    interfaceC1124iMo4469g.mo4437C();
                    if (interfaceC1124iMo4469g.mo4466e()) {
                        interfaceC1124iMo4469g.mo4442F(function0M7740a2);
                    } else {
                        interfaceC1124iMo4469g.mo4482o();
                    }
                    InterfaceC1124i interfaceC1124iM4876a2 = AbstractC1113f3.m4876a(interfaceC1124iMo4469g);
                    AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1699tM3475b, companion2.m7742c());
                    AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1176sMo4481n2, companion2.m7744e());
                    Function2 function2M7741b2 = companion2.m7741b();
                    if (interfaceC1124iM4876a2.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a2.mo4497y(), Integer.valueOf(iM4878a2))) {
                        interfaceC1124iM4876a2.mo4484p(Integer.valueOf(iM4878a2));
                        interfaceC1124iM4876a2.mo4474k(Integer.valueOf(iM4878a2), function2M7741b2);
                    }
                    AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1302fM5740e2, companion2.m7743d());
                    C0789d0 c0789d0 = C0789d0.f2752a;
                    interfaceC1124iMo4469g.mo4456P(-1743407500);
                    for (FilterVal filterVal : list) {
                        InterfaceC1302f.a aVar2 = InterfaceC1302f.f4127a;
                        int i17 = i16;
                        int i18 = i14;
                        InterfaceC1124i interfaceC1124i3 = interfaceC1124iMo4469g;
                        m68867m(item, filterVal, c1221t, SizeKt.m3419l(aVar2, C26138i.m102354g(i16)), interfaceC1124iMo4469g, (i14 & 14) | ((i14 << 3) & 896));
                        interfaceC1124i3.mo4456P(-1743402035);
                        if (Intrinsics.m97797c(filterVal, CollectionsKt.m97371u0(list))) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            AbstractC0791e0.m3499a(AbstractC0785b0.m3489a(c0789d0, aVar2, 1.0f, false, 2, null), interfaceC1124i3, 0);
                        }
                        interfaceC1124i3.mo4448K();
                        i15 = i12;
                        interfaceC1124iMo4469g = interfaceC1124i3;
                        i16 = i17;
                        i14 = i18;
                    }
                    int i19 = i16;
                    InterfaceC1124i interfaceC1124i4 = interfaceC1124iMo4469g;
                    interfaceC1124i4.mo4448K();
                    interfaceC1124i4.mo4487r();
                    i16 = i19;
                }
                interfaceC1124i2 = interfaceC1124iMo4469g;
                interfaceC1124i2.mo4448K();
            } else {
                interfaceC1124i2 = interfaceC1124iMo4469g;
                interfaceC1124i2.mo4456P(728374648);
                m68875u(item, c1221t, interfaceC1124i2, i14 & 126);
                interfaceC1124i2.mo4448K();
            }
            AbstractC0791e0.m3499a(SizeKt.m3412e(InterfaceC1302f.f4127a, C26138i.m102354g(32)), interfaceC1124i2, 6);
            interfaceC1124i2.mo4487r();
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }
        InterfaceC1117g2 interfaceC1117g2Mo4473j = interfaceC1124i2.mo4473j();
        if (interfaceC1117g2Mo4473j != null) {
            interfaceC1117g2Mo4473j.mo4602a(new Function2() { // from class: yl.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC15536e.m68866l(item, c1221t, i11, (InterfaceC1124i) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Unit m68866l(Item item, C1221t c1221t, int i11, InterfaceC1124i interfaceC1124i, int i12) {
        m68865k(item, c1221t, interfaceC1124i, AbstractC1241v1.m5707a(i11 | 1));
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m68867m(final Item item, final FilterVal filterVal, final C1221t c1221t, final InterfaceC1302f interfaceC1302f, InterfaceC1124i interfaceC1124i, final int i11) {
        int i12;
        long jM94702a;
        long jM94702a2;
        InterfaceC1124i interfaceC1124i2;
        InterfaceC1124i interfaceC1124iMo4469g = interfaceC1124i.mo4469g(973616320);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1124iMo4469g.mo4433A(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1124iMo4469g.mo4455O(filterVal) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC1124iMo4469g.mo4455O(c1221t) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC1124iMo4469g.mo4455O(interfaceC1302f) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC1124iMo4469g.mo4471h()) {
            interfaceC1124iMo4469g.mo4443G();
            interfaceC1124i2 = interfaceC1124iMo4469g;
        } else {
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(973616320, i12, -1, "com.transsion.home.view.filter.popup.GridItem (MultiFilterPopupWindow.kt:323)");
            }
            if (Intrinsics.m97797c(c1221t.get(item.getFilterType()), filterVal.getId())) {
                interfaceC1124iMo4469g.mo4456P(1089913522);
                jM94702a = AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, 0);
                jM94702a2 = AbstractC23939b.m94702a(com.transsion.wrapperad.R$color.white_40, interfaceC1124iMo4469g, 0);
                interfaceC1124iMo4469g.mo4448K();
            } else {
                interfaceC1124iMo4469g.mo4456P(1090061733);
                jM94702a = AbstractC23939b.m94702a(R$color.text_03, interfaceC1124iMo4469g, 0);
                jM94702a2 = AbstractC23939b.m94702a(R$color.transparent, interfaceC1124iMo4469g, 0);
                interfaceC1124iMo4469g.mo4448K();
            }
            InterfaceC1262b interfaceC1262bM5753d = InterfaceC1262b.f4036a.m5753d();
            float f11 = 100;
            InterfaceC1302f interfaceC1302fM3003a = BackgroundKt.m3003a(BorderKt.m3019e(SizeKt.m3412e(interfaceC1302f, C26138i.m102354g(32)), C26138i.m102354g(1), jM94702a, AbstractC26970g.m105115c(C26138i.m102354g(f11))), jM94702a2, AbstractC26970g.m105115c(C26138i.m102354g(f11)));
            interfaceC1124iMo4469g.mo4456P(-1746271574);
            boolean zMo4433A = ((i12 & 896) == 256) | interfaceC1124iMo4469g.mo4433A(item) | ((i12 & 112) == 32);
            Object objMo4497y = interfaceC1124iMo4469g.mo4497y();
            if (zMo4433A || objMo4497y == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y = new Function0() { // from class: yl.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC15536e.m68868n(c1221t, item, filterVal);
                    }
                };
                interfaceC1124iMo4469g.mo4484p(objMo4497y);
            }
            interfaceC1124iMo4469g.mo4448K();
            InterfaceC1302f interfaceC1302fM3044d = ClickableKt.m3044d(interfaceC1302fM3003a, false, null, null, (Function0) objMo4497y, 7, null);
            InterfaceC1699t interfaceC1699tM3353h = BoxKt.m3353h(interfaceC1262bM5753d, false);
            int iM4878a = AbstractC1114g.m4878a(interfaceC1124iMo4469g, 0);
            InterfaceC1176s interfaceC1176sMo4481n = interfaceC1124iMo4469g.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e = ComposedModifierKt.m5740e(interfaceC1124iMo4469g, interfaceC1302fM3044d);
            ComposeUiNode.Companion companion = ComposeUiNode.f5204c1;
            Function0 function0M7740a = companion.m7740a();
            if (!(interfaceC1124iMo4469g.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124iMo4469g.mo4437C();
            if (interfaceC1124iMo4469g.mo4466e()) {
                interfaceC1124iMo4469g.mo4442F(function0M7740a);
            } else {
                interfaceC1124iMo4469g.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a = AbstractC1113f3.m4876a(interfaceC1124iMo4469g);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1699tM3353h, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1176sMo4481n, companion.m7744e());
            Function2 function2M7741b = companion.m7741b();
            if (interfaceC1124iM4876a.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a.mo4497y(), Integer.valueOf(iM4878a))) {
                interfaceC1124iM4876a.mo4484p(Integer.valueOf(iM4878a));
                interfaceC1124iM4876a.mo4474k(Integer.valueOf(iM4878a), function2M7741b);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1302fM5740e, companion.m7743d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f2646a;
            interfaceC1124i2 = interfaceC1124iMo4469g;
            TextKt.m4312a(filterVal.getName(), null, AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, 0), AbstractC26153x.m102447c(14), null, C2054p.f6244b.m9555c(), AbstractC2046h.f6219b.m9513b(), 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1124i2, 199680, 0, 130962);
            interfaceC1124i2.mo4487r();
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }
        InterfaceC1117g2 interfaceC1117g2Mo4473j = interfaceC1124i2.mo4473j();
        if (interfaceC1117g2Mo4473j != null) {
            interfaceC1117g2Mo4473j.mo4602a(new Function2() { // from class: yl.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC15536e.m68869o(item, filterVal, c1221t, interfaceC1302f, i11, (InterfaceC1124i) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Unit m68868n(C1221t c1221t, Item item, FilterVal filterVal) {
        c1221t.put(item.getFilterType(), filterVal.getId());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m68869o(Item item, FilterVal filterVal, C1221t c1221t, InterfaceC1302f interfaceC1302f, int i11, InterfaceC1124i interfaceC1124i, int i12) {
        m68867m(item, filterVal, c1221t, interfaceC1302f, interfaceC1124i, AbstractC1241v1.m5707a(i11 | 1));
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m68870p(final List filterItems, final C1221t selectItems, final Function1 dismiss, InterfaceC1124i interfaceC1124i, final int i11) {
        int i12;
        Pair pairM97108a;
        C29093c insets;
        C29093c insets2;
        Window window;
        View decorView;
        Intrinsics.m97802h(filterItems, "filterItems");
        Intrinsics.m97802h(selectItems, "selectItems");
        Intrinsics.m97802h(dismiss, "dismiss");
        InterfaceC1124i interfaceC1124iMo4469g = interfaceC1124i.mo4469g(1096788014);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1124iMo4469g.mo4433A(filterItems) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1124iMo4469g.mo4455O(selectItems) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC1124iMo4469g.mo4433A(dismiss) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC1124iMo4469g.mo4471h()) {
            interfaceC1124iMo4469g.mo4443G();
        } else {
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(1096788014, i12, -1, "com.transsion.home.view.filter.popup.MultiFilterPopup (MultiFilterPopupWindow.kt:66)");
            }
            final InterfaceC9150c interfaceC9150cM40027e = SystemUiControllerKt.m40027e(null, interfaceC1124iMo4469g, 0, 1);
            final long jM94702a = AbstractC23939b.m94702a(R$color.black_80, interfaceC1124iMo4469g, 0);
            Handler handler = new Handler(Looper.getMainLooper());
            interfaceC1124iMo4469g.mo4456P(-1633490746);
            boolean zMo4455O = interfaceC1124iMo4469g.mo4455O(interfaceC9150cM40027e) | interfaceC1124iMo4469g.mo4463d(jM94702a);
            Object objMo4497y = interfaceC1124iMo4469g.mo4497y();
            if (zMo4455O || objMo4497y == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y = new Runnable() { // from class: yl.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC15536e.m68871q(interfaceC9150cM40027e, jM94702a);
                    }
                };
                interfaceC1124iMo4469g.mo4484p(objMo4497y);
            }
            interfaceC1124iMo4469g.mo4448K();
            handler.postDelayed((Runnable) objMo4497y, 100L);
            interfaceC1124iMo4469g.mo4456P(-1633490746);
            boolean zMo4455O2 = interfaceC1124iMo4469g.mo4455O(interfaceC9150cM40027e) | ((i12 & 896) == 256);
            Object objMo4497y2 = interfaceC1124iMo4469g.mo4497y();
            if (zMo4455O2 || objMo4497y2 == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y2 = new Function1() { // from class: yl.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC15536e.m68872r(interfaceC9150cM40027e, dismiss, ((Boolean) obj).booleanValue());
                    }
                };
                interfaceC1124iMo4469g.mo4484p(objMo4497y2);
            }
            final Function1 function1 = (Function1) objMo4497y2;
            interfaceC1124iMo4469g.mo4448K();
            C1221t c1221t = new C1221t();
            c1221t.putAll(selectItems);
            Context context = (Context) interfaceC1124iMo4469g.mo4476l(AndroidCompositionLocals_androidKt.m8616g());
            InterfaceC26134e interfaceC26134e = (InterfaceC26134e) interfaceC1124iMo4469g.mo4476l(CompositionLocalsKt.m8647c());
            Activity activity = context instanceof Activity ? (Activity) context : null;
            WindowInsetsCompat rootWindowInsets = (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : ViewCompat.getRootWindowInsets(decorView);
            interfaceC1124iMo4469g.mo4456P(5004770);
            boolean zMo4455O3 = interfaceC1124iMo4469g.mo4455O(context);
            Object objMo4497y3 = interfaceC1124iMo4469g.mo4497y();
            if (zMo4455O3 || objMo4497y3 == InterfaceC1124i.f3683a.m4902a()) {
                if (Build.VERSION.SDK_INT >= 35) {
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int iMax = Math.max(identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0, (rootWindowInsets == null || (insets2 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.statusBars())) == null) ? 0 : insets2.f88816b);
                    int i13 = (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars())) == null) ? 0 : insets.f88818d;
                    pairM97108a = TuplesKt.m97108a(C26138i.m102352d(interfaceC26134e.mo3224x0(iMax)), C26138i.m102352d(interfaceC26134e.mo3224x0(i13 > 0 ? i13 + ((int) (16 * interfaceC26134e.getDensity())) : (int) (32 * interfaceC26134e.getDensity()))));
                } else {
                    float f11 = 0;
                    pairM97108a = TuplesKt.m97108a(C26138i.m102352d(C26138i.m102354g(f11)), C26138i.m102352d(C26138i.m102354g(f11)));
                }
                objMo4497y3 = pairM97108a;
                interfaceC1124iMo4469g.mo4484p(objMo4497y3);
            }
            Pair pair = (Pair) objMo4497y3;
            interfaceC1124iMo4469g.mo4448K();
            float fM102360l = ((C26138i) pair.component1()).m102360l();
            float fM102360l2 = ((C26138i) pair.component2()).m102360l();
            interfaceC1124iMo4469g.mo4456P(5004770);
            boolean zMo4455O4 = interfaceC1124iMo4469g.mo4455O(function1);
            Object objMo4497y4 = interfaceC1124iMo4469g.mo4497y();
            if (zMo4455O4 || objMo4497y4 == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y4 = new Function0() { // from class: yl.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC15536e.m68873s(function1);
                    }
                };
                interfaceC1124iMo4469g.mo4484p(objMo4497y4);
            }
            interfaceC1124iMo4469g.mo4448K();
            AndroidDialog_androidKt.m10091a((Function0) objMo4497y4, new C2188c(false, false, false, 3, (DefaultConstructorMarker) null), AbstractC1134b.m4969d(-1419240635, true, new a(jM94702a, fM102360l, fM102360l2, filterItems, c1221t, function1, selectItems), interfaceC1124iMo4469g, 54), interfaceC1124iMo4469g, 432, 0);
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }
        InterfaceC1117g2 interfaceC1117g2Mo4473j = interfaceC1124iMo4469g.mo4473j();
        if (interfaceC1117g2Mo4473j != null) {
            interfaceC1117g2Mo4473j.mo4602a(new Function2() { // from class: yl.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC15536e.m68874t(filterItems, selectItems, dismiss, i11, (InterfaceC1124i) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m68871q(InterfaceC9150c interfaceC9150c, long j11) {
        AbstractC9149b.m40035b(interfaceC9150c, j11, false, false, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m68872r(InterfaceC9150c interfaceC9150c, Function1 function1, boolean z11) {
        AbstractC9149b.m40035b(interfaceC9150c, C1546u1.f4638b.m6913d(), false, false, null, 14, null);
        function1.invoke(Boolean.valueOf(z11));
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m68873s(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m68874t(List list, C1221t c1221t, Function1 function1, int i11, InterfaceC1124i interfaceC1124i, int i12) {
        m68870p(list, c1221t, function1, interfaceC1124i, AbstractC1241v1.m5707a(i11 | 1));
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m68875u(final Item item, final C1221t c1221t, InterfaceC1124i interfaceC1124i, final int i11) {
        int i12;
        final InterfaceC1126i1 interfaceC1126i1;
        InterfaceC1124i interfaceC1124i2;
        String str;
        Float fT;
        String str2;
        Float fT2;
        InterfaceC1124i interfaceC1124iMo4469g = interfaceC1124i.mo4469g(-945657323);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1124iMo4469g.mo4433A(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1124iMo4469g.mo4455O(c1221t) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && interfaceC1124iMo4469g.mo4471h()) {
            interfaceC1124iMo4469g.mo4443G();
            interfaceC1124i2 = interfaceC1124iMo4469g;
        } else {
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(-945657323, i13, -1, "com.transsion.home.view.filter.popup.StepRangeSlider (MultiFilterPopupWindow.kt:375)");
            }
            RangeValue rangeVals = item.getRangeVals();
            Intrinsics.m97799e(rangeVals);
            float minVal = rangeVals.getMinVal();
            float maxVal = rangeVals.getMaxVal();
            String str3 = (String) c1221t.get(item.getFilterType());
            List listS0 = str3 != null ? StringsKt.m98117S0(str3, new String[]{","}, false, 0, 6, null) : null;
            if ((listS0 != null ? listS0.size() : 0) >= 2) {
                minVal = (listS0 == null || (str2 = (String) listS0.get(0)) == null || (fT2 = StringsKt.m98214t(str2)) == null) ? rangeVals.getMinVal() : fT2.floatValue();
                maxVal = (listS0 == null || (str = (String) listS0.get(1)) == null || (fT = StringsKt.m98214t(str)) == null) ? rangeVals.getMaxVal() : fT.floatValue();
            }
            interfaceC1124iMo4469g.mo4456P(1849434622);
            Object objMo4497y = interfaceC1124iMo4469g.mo4497y();
            InterfaceC1124i.a aVar = InterfaceC1124i.f3683a;
            if (objMo4497y == aVar.m4902a()) {
                objMo4497y = AbstractC1238u2.m5702c(RangesKt.m97932b(minVal, maxVal), null, 2, null);
                interfaceC1124iMo4469g.mo4484p(objMo4497y);
            }
            InterfaceC1126i1 interfaceC1126i2 = (InterfaceC1126i1) objMo4497y;
            interfaceC1124iMo4469g.mo4448K();
            if (f53611c) {
                m68877w(interfaceC1126i2, RangesKt.m97932b(minVal, maxVal));
                f53611c = false;
            }
            InterfaceC1302f.a aVar2 = InterfaceC1302f.f4127a;
            C0784b c0784b = C0784b.f2739a;
            C0784b.k kVarM3479d = c0784b.m3479d();
            InterfaceC1262b.a aVar3 = InterfaceC1262b.f4036a;
            InterfaceC1699t interfaceC1699tM3503a = AbstractC0798i.m3503a(kVarM3479d, aVar3.m5758i(), interfaceC1124iMo4469g, 0);
            int iM4878a = AbstractC1114g.m4878a(interfaceC1124iMo4469g, 0);
            InterfaceC1176s interfaceC1176sMo4481n = interfaceC1124iMo4469g.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e = ComposedModifierKt.m5740e(interfaceC1124iMo4469g, aVar2);
            ComposeUiNode.Companion companion = ComposeUiNode.f5204c1;
            Function0 function0M7740a = companion.m7740a();
            if (!(interfaceC1124iMo4469g.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124iMo4469g.mo4437C();
            if (interfaceC1124iMo4469g.mo4466e()) {
                interfaceC1124iMo4469g.mo4442F(function0M7740a);
            } else {
                interfaceC1124iMo4469g.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a = AbstractC1113f3.m4876a(interfaceC1124iMo4469g);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1699tM3503a, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1176sMo4481n, companion.m7744e());
            Function2 function2M7741b = companion.m7741b();
            if (interfaceC1124iM4876a.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a.mo4497y(), Integer.valueOf(iM4878a))) {
                interfaceC1124iM4876a.mo4484p(Integer.valueOf(iM4878a));
                interfaceC1124iM4876a.mo4474k(Integer.valueOf(iM4878a), function2M7741b);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1302fM5740e, companion.m7743d());
            C0803l c0803l = C0803l.f2763a;
            int iD = MathKt.m97883d(((Number) m68876v(interfaceC1126i2).mo97904j()).floatValue());
            int iD2 = MathKt.m97883d(((Number) m68876v(interfaceC1126i2).mo97903e()).floatValue());
            ClosedFloatingPointRange closedFloatingPointRangeM68876v = m68876v(interfaceC1126i2);
            ClosedFloatingPointRange closedFloatingPointRangeB = RangesKt.m97932b(rangeVals.getMinVal(), rangeVals.getMaxVal());
            int maxVal2 = ((int) rangeVals.getMaxVal()) - 1;
            InterfaceC0995j interfaceC0995jM4198a = C0996k.f3333a.m4198a(AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, 0), 0L, AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, 0), 0L, AbstractC23939b.m94702a(R$color.white_40, interfaceC1124iMo4469g, 0), 0L, AbstractC23939b.m94702a(R$color.transparent, interfaceC1124iMo4469g, 0), AbstractC23939b.m94702a(R$color.transparent, interfaceC1124iMo4469g, 0), 0L, 0L, interfaceC1124iMo4469g, 0, C0996k.f3334b, 810);
            interfaceC1124iMo4469g.mo4456P(5004770);
            Object objMo4497y2 = interfaceC1124iMo4469g.mo4497y();
            if (objMo4497y2 == aVar.m4902a()) {
                interfaceC1126i1 = interfaceC1126i2;
                objMo4497y2 = new Function1() { // from class: yl.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC15536e.m68878x(interfaceC1126i1, (ClosedFloatingPointRange) obj);
                    }
                };
                interfaceC1124iMo4469g.mo4484p(objMo4497y2);
            } else {
                interfaceC1126i1 = interfaceC1126i2;
            }
            Function1 function1 = (Function1) objMo4497y2;
            interfaceC1124iMo4469g.mo4448K();
            interfaceC1124iMo4469g.mo4456P(-1746271574);
            boolean zMo4433A = interfaceC1124iMo4469g.mo4433A(item) | ((i13 & 112) == 32);
            Object objMo4497y3 = interfaceC1124iMo4469g.mo4497y();
            if (zMo4433A || objMo4497y3 == aVar.m4902a()) {
                objMo4497y3 = new Function0() { // from class: yl.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC15536e.m68879y(c1221t, item, interfaceC1126i1);
                    }
                };
                interfaceC1124iMo4469g.mo4484p(objMo4497y3);
            }
            interfaceC1124iMo4469g.mo4448K();
            SliderKt.m4146b(closedFloatingPointRangeM68876v, function1, null, false, closedFloatingPointRangeB, maxVal2, (Function0) objMo4497y3, interfaceC0995jM4198a, interfaceC1124iMo4469g, 48, 12);
            InterfaceC1699t interfaceC1699tM3475b = AbstractC0783a0.m3475b(c0784b.m3478c(), aVar3.m5759j(), interfaceC1124iMo4469g, 0);
            int iM4878a2 = AbstractC1114g.m4878a(interfaceC1124iMo4469g, 0);
            InterfaceC1176s interfaceC1176sMo4481n2 = interfaceC1124iMo4469g.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e2 = ComposedModifierKt.m5740e(interfaceC1124iMo4469g, aVar2);
            Function0 function0M7740a2 = companion.m7740a();
            if (!(interfaceC1124iMo4469g.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124iMo4469g.mo4437C();
            if (interfaceC1124iMo4469g.mo4466e()) {
                interfaceC1124iMo4469g.mo4442F(function0M7740a2);
            } else {
                interfaceC1124iMo4469g.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a2 = AbstractC1113f3.m4876a(interfaceC1124iMo4469g);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1699tM3475b, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1176sMo4481n2, companion.m7744e());
            Function2 function2M7741b2 = companion.m7741b();
            if (interfaceC1124iM4876a2.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a2.mo4497y(), Integer.valueOf(iM4878a2))) {
                interfaceC1124iM4876a2.mo4484p(Integer.valueOf(iM4878a2));
                interfaceC1124iM4876a2.mo4474k(Integer.valueOf(iM4878a2), function2M7741b2);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1302fM5740e2, companion.m7743d());
            C0789d0 c0789d0 = C0789d0.f2752a;
            String strValueOf = String.valueOf(iD);
            long jM102447c = AbstractC26153x.m102447c(12);
            AbstractC2046h.a aVar4 = AbstractC2046h.f6219b;
            C2057s c2057sM9513b = aVar4.m9513b();
            C2054p.a aVar5 = C2054p.f6244b;
            TextKt.m4312a(strValueOf, PaddingKt.m3395i(aVar2, C26138i.m102354g(5), 0.0f, 0.0f, 0.0f, 14, null), AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, 0), jM102447c, null, aVar5.m9557e(), c2057sM9513b, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1124iMo4469g, 199728, 0, 130960);
            AbstractC0791e0.m3499a(AbstractC0785b0.m3489a(c0789d0, aVar2, 1.0f, false, 2, null), interfaceC1124iMo4469g, 0);
            interfaceC1124i2 = interfaceC1124iMo4469g;
            TextKt.m4312a(String.valueOf(iD2), null, AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, 0), AbstractC26153x.m102447c(12), null, aVar5.m9557e(), aVar4.m9513b(), 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1124i2, 199680, 0, 130962);
            interfaceC1124i2.mo4487r();
            interfaceC1124i2.mo4487r();
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }
        InterfaceC1117g2 interfaceC1117g2Mo4473j = interfaceC1124i2.mo4473j();
        if (interfaceC1117g2Mo4473j != null) {
            interfaceC1117g2Mo4473j.mo4602a(new Function2() { // from class: yl.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC15536e.m68880z(item, c1221t, i11, (InterfaceC1124i) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    private static final ClosedFloatingPointRange m68876v(InterfaceC1126i1 interfaceC1126i1) {
        return (ClosedFloatingPointRange) interfaceC1126i1.getValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m68877w(InterfaceC1126i1 interfaceC1126i1, ClosedFloatingPointRange closedFloatingPointRange) {
        interfaceC1126i1.setValue(closedFloatingPointRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Unit m68878x(InterfaceC1126i1 interfaceC1126i1, ClosedFloatingPointRange it) {
        Intrinsics.m97802h(it, "it");
        float fFloatValue = ((Number) it.mo97904j()).floatValue() == ((Number) m68876v(interfaceC1126i1).mo97904j()).floatValue() ? ((Number) it.mo97903e()).floatValue() : ((Number) it.mo97904j()).floatValue();
        if (((int) fFloatValue) != ((int) f53610b)) {
            AbstractC5786f0.m27402b(20L);
        }
        f53610b = fFloatValue;
        m68877w(interfaceC1126i1, it);
        if (((Number) it.mo97904j()).floatValue() == ((Number) it.mo97903e()).floatValue()) {
            f53609a = ((Number) it.mo97904j()).floatValue();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Unit m68879y(C1221t c1221t, Item item, InterfaceC1126i1 interfaceC1126i1) {
        if (((Number) m68876v(interfaceC1126i1).mo97904j()).floatValue() > ((Number) m68876v(interfaceC1126i1).mo97903e()).floatValue()) {
            float f11 = f53609a;
            m68877w(interfaceC1126i1, RangesKt.m97932b(f11, f11));
        }
        c1221t.put(item.getFilterType(), PopupFilterView.INSTANCE.m68848a(((Number) m68876v(interfaceC1126i1).mo97904j()).floatValue(), ((Number) m68876v(interfaceC1126i1).mo97903e()).floatValue()));
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Unit m68880z(Item item, C1221t c1221t, int i11, InterfaceC1124i interfaceC1124i, int i12) {
        m68875u(item, c1221t, interfaceC1124i, AbstractC1241v1.m5707a(i11 | 1));
        return Unit.f75682a;
    }
}
