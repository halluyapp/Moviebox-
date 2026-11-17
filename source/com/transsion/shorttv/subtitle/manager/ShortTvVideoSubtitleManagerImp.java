package com.transsion.shorttv.subtitle.manager;

import at.InterfaceC4708a;
import com.transsion.shorttv.utils.C19165h;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.bean.SubtitleAppType;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p717qr.C27124c;
import p743rh.C27287m;
import p848vs.InterfaceC28213d;
import p955ys.C29006a;
import p955ys.C29007b;
import pg.C26866a;
import ws.InterfaceC28435a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvVideoSubtitleManagerImp implements InterfaceC18884b {

    /* JADX INFO: renamed from: g */
    public static final C18880a f60912g = new C18880a(null);

    /* JADX INFO: renamed from: b */
    private Set f60913b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c */
    private final String f60914c = ShortTvVideoSubtitleManagerImp.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private final InterfaceC25149n0 f60915d = AbstractC25153o0.m99079a(C25220y0.m99269c());

    /* JADX INFO: renamed from: e */
    private final Lazy f60916e = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.subtitle.manager.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvVideoSubtitleManagerImp.m79491r();
        }
    });

    /* JADX INFO: renamed from: f */
    private final ShortTvVideoSubtitleManagerImp$resDownloadListener$1 f60917f = new ShortTvVideoSubtitleManagerImp$resDownloadListener$1(this);

    /* JADX INFO: renamed from: com.transsion.shorttv.subtitle.manager.ShortTvVideoSubtitleManagerImp$a */
    public static final class C18880a {
        private C18880a() {
        }

        public /* synthetic */ C18880a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m79486m(C29006a c29006a, final Function1 function1) {
        String strM111556d = c29006a.m111556d();
        if (strM111556d == null || strM111556d.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, "short_tv_subtitle", this.f60914c + " checkDownloadSubtitle fail， has no shorTvId", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (StringsKt.m98218x(c29006a.m111556d()) == null) {
            C26866a.a.m104910z(C26866a.f81698a, "short_tv_subtitle", this.f60914c + " checkDownloadSubtitle ,shorTvId is abnormal", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C26866a.f81698a.m104921x("short_tv_subtitle", this.f60914c + " checkDownloadSubtitle ,无网络不做检测", true);
            return;
        }
        C26866a.f81698a.m104912c("short_tv_subtitle", this.f60914c + " checkDownloadSubtitle, name = " + c29006a.m111560h() + " subjectId:" + c29006a.m111557e() + " subtitleResId:" + c29006a.m111559g(), true);
        SubtitleDownloadManager.f63041a.m82265e(c29006a.m111557e(), c29006a.m111559g(), null, c29006a.m111556d(), c29006a.m111558f(), 3, 0, c29006a.m111553a(), c29006a.m111555c(), c29006a.m111554b(), new Function1() { // from class: com.transsion.shorttv.subtitle.manager.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvVideoSubtitleManagerImp.m79488o(this.f60922a, function1, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ void m79487n(ShortTvVideoSubtitleManagerImp shortTvVideoSubtitleManagerImp, C29006a c29006a, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        shortTvVideoSubtitleManagerImp.m79486m(c29006a, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m79488o(ShortTvVideoSubtitleManagerImp shortTvVideoSubtitleManagerImp, Function1 function1, boolean z11) {
        AbstractC25136k.m99058d(shortTvVideoSubtitleManagerImp.f60915d, null, null, new ShortTvVideoSubtitleManagerImp$checkDownloadSubtitle$1$1(function1, z11, shortTvVideoSubtitleManagerImp, null), 3, null);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC28213d m79489p() {
        return (InterfaceC28213d) this.f60916e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m79490q() {
        return C19165h.f61575a.m80242e().getString("k_language_short_name", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC28213d m79491r() {
        InterfaceC28435a interfaceC28435aM105541c = C27124c.f82233a.m105541c();
        if (interfaceC28435aM105541c != null) {
            return interfaceC28435aM105541c.mo73690b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.transsion.shorttv.subtitle.manager.InterfaceC18884b
    /* JADX INFO: renamed from: a */
    public Object mo79492a(String str, Continuation continuation) throws Throwable {
        ShortTvVideoSubtitleManagerImp$getSubtitleList$1 shortTvVideoSubtitleManagerImp$getSubtitleList$1;
        List list;
        if (continuation instanceof ShortTvVideoSubtitleManagerImp$getSubtitleList$1) {
            shortTvVideoSubtitleManagerImp$getSubtitleList$1 = (ShortTvVideoSubtitleManagerImp$getSubtitleList$1) continuation;
            int i11 = shortTvVideoSubtitleManagerImp$getSubtitleList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                shortTvVideoSubtitleManagerImp$getSubtitleList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                shortTvVideoSubtitleManagerImp$getSubtitleList$1 = new ShortTvVideoSubtitleManagerImp$getSubtitleList$1(this, continuation);
            }
        } else {
            shortTvVideoSubtitleManagerImp$getSubtitleList$1 = new ShortTvVideoSubtitleManagerImp$getSubtitleList$1(this, continuation);
        }
        Object obj = shortTvVideoSubtitleManagerImp$getSubtitleList$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = shortTvVideoSubtitleManagerImp$getSubtitleList$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(obj);
            ArrayList arrayList = new ArrayList();
            SubtitleDownloadManager subtitleDownloadManager = SubtitleDownloadManager.f63041a;
            shortTvVideoSubtitleManagerImp$getSubtitleList$1.L$0 = arrayList;
            shortTvVideoSubtitleManagerImp$getSubtitleList$1.label = 1;
            Object objM82269j = subtitleDownloadManager.m82269j(str, shortTvVideoSubtitleManagerImp$getSubtitleList$1);
            if (objM82269j == objF) {
                return objF;
            }
            obj = objM82269j;
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) shortTvVideoSubtitleManagerImp$getSubtitleList$1.L$0;
            ResultKt.m97107b(obj);
        }
        List list2 = (List) obj;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(new C29007b((SubtitleDownloadTable) it.next()));
            }
        }
        return list;
    }

    @Override // com.transsion.shorttv.subtitle.manager.InterfaceC18884b
    /* JADX INFO: renamed from: b */
    public void mo79493b(InterfaceC19743a listener) {
        Intrinsics.m97802h(listener, "listener");
        SubtitleDownloadManager.f63041a.m82262b(listener);
    }

    @Override // com.transsion.shorttv.subtitle.manager.InterfaceC18884b
    /* JADX INFO: renamed from: c */
    public void mo79494c(InterfaceC19743a listener) {
        Intrinsics.m97802h(listener, "listener");
        SubtitleDownloadManager.f63041a.m82278s(listener);
    }

    @Override // com.transsion.shorttv.subtitle.manager.InterfaceC18884b
    /* JADX INFO: renamed from: d */
    public void mo79495d(C29006a bean, Function1 function1) {
        Intrinsics.m97802h(bean, "bean");
        m79486m(bean, function1);
    }

    @Override // com.transsion.shorttv.subtitle.manager.InterfaceC18884b
    /* JADX INFO: renamed from: e */
    public void mo79496e(InterfaceC4708a listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f60913b.add(listener);
    }

    @Override // com.transsion.shorttv.subtitle.manager.InterfaceC18884b
    /* JADX INFO: renamed from: f */
    public void mo79497f(C29007b bean) {
        Intrinsics.m97802h(bean, "bean");
        SubtitleDownloadManager.f63041a.m82264d(bean.m111561a());
    }

    @Override // com.transsion.shorttv.subtitle.manager.InterfaceC18884b
    /* JADX INFO: renamed from: g */
    public void mo79498g(InterfaceC4708a listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f60913b.remove(listener);
    }

    @Override // com.transsion.shorttv.subtitle.manager.InterfaceC18884b
    public void init() {
        SubtitleAppType subtitleAppType = SubtitleAppType.NOVEL;
        if (!Intrinsics.m97797c("mb", subtitleAppType.getValue())) {
            subtitleAppType = SubtitleAppType.MB;
        }
        SubtitleDownloadManager subtitleDownloadManager = SubtitleDownloadManager.f63041a;
        subtitleDownloadManager.m82270k(subtitleAppType);
        subtitleDownloadManager.m82271l(new Function0() { // from class: com.transsion.shorttv.subtitle.manager.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvVideoSubtitleManagerImp.m79490q();
            }
        });
        InterfaceC28213d interfaceC28213dM79489p = m79489p();
        if (interfaceC28213dM79489p != null) {
            interfaceC28213dM79489p.mo73643i(this.f60917f);
        }
    }
}
