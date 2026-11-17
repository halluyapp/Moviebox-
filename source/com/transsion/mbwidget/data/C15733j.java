package com.transsion.mbwidget.data;

import com.transsion.mbwidget.R$mipmap;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.transsion.mbwidget.data.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C15733j {

    /* JADX INFO: renamed from: a */
    public static final C15733j f54111a = new C15733j();

    /* JADX INFO: renamed from: b */
    private static final Map f54112b = MapsKt.m97577l(TuplesKt.m97108a("img_default_1", Integer.valueOf(R$mipmap.img_widget_subject_default_1)), TuplesKt.m97108a("img_default_2", Integer.valueOf(R$mipmap.img_widget_subject_default_2)), TuplesKt.m97108a("img_default_3", Integer.valueOf(R$mipmap.img_widget_subject_default_3)), TuplesKt.m97108a("img_default_4", Integer.valueOf(R$mipmap.img_widget_subject_default_4)));

    /* JADX INFO: renamed from: c */
    private static final Lazy f54113c = LazyKt.m97097b(new Function0() { // from class: com.transsion.mbwidget.data.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C15733j.m69707e();
        }
    });

    /* JADX INFO: renamed from: d */
    private static final Lazy f54114d = LazyKt.m97097b(new Function0() { // from class: com.transsion.mbwidget.data.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C15733j.m69708f();
        }
    });

    /* JADX INFO: renamed from: e */
    private static final Lazy f54115e = LazyKt.m97097b(new Function0() { // from class: com.transsion.mbwidget.data.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C15733j.m69709g();
        }
    });

    /* JADX INFO: renamed from: f */
    private static final Lazy f54116f = LazyKt.m97097b(new Function0() { // from class: com.transsion.mbwidget.data.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C15733j.m69710h();
        }
    });

    private C15733j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Subject m69707e() {
        return new Subject("8906247916759695608", null, "Avatar", null, new Cover(null, null, null, "img_default_1", null, null, null, null, null, 503, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -22, 67108863, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Subject m69708f() {
        return new Subject("4191963760367656968", null, "Avengers: Endgame", null, new Cover(null, null, null, "img_default_2", null, null, null, null, null, 503, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -22, 67108863, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Subject m69709g() {
        return new Subject("5390197429792821032", null, "Titanic", null, new Cover(null, null, null, "img_default_3", null, null, null, null, null, 503, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -22, 67108863, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Subject m69710h() {
        return new Subject("9155478106520576008", null, "The Lion King", null, new Cover(null, null, null, "img_default_4", null, null, null, null, null, 503, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -22, 67108863, null);
    }

    /* JADX INFO: renamed from: i */
    private final Subject m69711i() {
        return (Subject) f54113c.getValue();
    }

    /* JADX INFO: renamed from: j */
    private final Subject m69712j() {
        return (Subject) f54114d.getValue();
    }

    /* JADX INFO: renamed from: k */
    private final Subject m69713k() {
        return (Subject) f54115e.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final Subject m69714l() {
        return (Subject) f54116f.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final List m69715m() {
        return CollectionsKt.m97511q(m69711i(), m69712j(), m69713k(), m69714l());
    }

    /* JADX INFO: renamed from: n */
    public final Integer m69716n(String str) {
        return (Integer) f54112b.get(str);
    }
}
