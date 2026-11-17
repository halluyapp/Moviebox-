package com.transsion.player.longvideo.helper;

import ck.C5110g;
import ck.C5118o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.player.longvideo.member.C16496k;
import com.transsion.player.longvideo.member.C16503r;
import com.transsion.player.longvideo.member.ResolutionMemberManager;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p553ko.C24715a;
import p553ko.C24716b;
import p553ko.C24717c;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class LongVodResolutionHelper {

    /* JADX INFO: renamed from: b */
    public static final C16432a f55479b = new C16432a(null);

    /* JADX INFO: renamed from: a */
    private String f55480a = "";

    /* JADX INFO: renamed from: com.transsion.player.longvideo.helper.LongVodResolutionHelper$a */
    public static final class C16432a {
        private C16432a() {
        }

        public /* synthetic */ C16432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m71716c(C24717c c24717c, String str) {
        Integer numV = StringsKt.m98216v(str);
        int iIntValue = numV != null ? numV.intValue() : 0;
        Integer numV2 = StringsKt.m98216v(c24717c.m97081e());
        int iIntValue2 = numV2 != null ? numV2.intValue() : 0;
        return iIntValue2 > 0 && iIntValue > 0 && iIntValue2 > iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [T, ko.c] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, ko.c] */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, ko.c] */
    /* JADX WARN: Type inference failed for: r8v13, types: [T, ko.c] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, ko.c] */
    /* JADX INFO: renamed from: d */
    public final Object m71717d(C24715a c24715a, Continuation continuation) throws Throwable {
        LongVodResolutionHelper$getMp4DefaultPlayBean$1 longVodResolutionHelper$getMp4DefaultPlayBean$1;
        Object next;
        List list;
        Ref.ObjectRef objectRef;
        C24717c c24717c;
        Object next2;
        if (continuation instanceof LongVodResolutionHelper$getMp4DefaultPlayBean$1) {
            longVodResolutionHelper$getMp4DefaultPlayBean$1 = (LongVodResolutionHelper$getMp4DefaultPlayBean$1) continuation;
            int i11 = longVodResolutionHelper$getMp4DefaultPlayBean$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                longVodResolutionHelper$getMp4DefaultPlayBean$1.label = i11 - Integer.MIN_VALUE;
            } else {
                longVodResolutionHelper$getMp4DefaultPlayBean$1 = new LongVodResolutionHelper$getMp4DefaultPlayBean$1(this, continuation);
            }
        } else {
            longVodResolutionHelper$getMp4DefaultPlayBean$1 = new LongVodResolutionHelper$getMp4DefaultPlayBean$1(this, continuation);
        }
        Object obj = longVodResolutionHelper$getMp4DefaultPlayBean$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = longVodResolutionHelper$getMp4DefaultPlayBean$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(obj);
            List listM97054j = c24715a.m97054j();
            if (listM97054j.isEmpty()) {
                return null;
            }
            String string = this.f55480a;
            if (string.length() == 0) {
                string = C14496b.f50966a.m65344b().getString("key_stream_resolution", "");
                if (string == null) {
                    string = "";
                }
                this.f55480a = string;
            }
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "getMp4DefaultPlayBean, savedResolution： " + this.f55480a, false, 4, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            List<??> list2 = listM97054j;
            for (?? r11 : list2) {
                if (!r11.m97086j()) {
                    objectRef2.element = r11;
                }
            }
            T t11 = objectRef2.element;
            if (t11 != 0) {
                return t11;
            }
            if (string.length() == 0) {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!Intrinsics.m97797c(((C24717c) next2).m97081e(), "480"));
                objectRef2.element = (C24717c) next2;
            } else {
                for (?? r12 : list2) {
                    if (Intrinsics.m97797c(r12.m97081e(), string)) {
                        objectRef2.element = r12;
                    }
                }
                if (objectRef2.element == 0) {
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!m71716c((C24717c) next, string));
                    objectRef2.element = (C24717c) next;
                }
            }
            if (objectRef2.element == 0) {
                objectRef2.element = CollectionsKt.m97371u0(listM97054j);
            }
            if (this.f55480a.length() == 0 && (c24717c = (C24717c) objectRef2.element) != null) {
                m71721g(c24717c.m97081e());
            }
            C26866a.a aVar = C26866a.f81698a;
            C24717c c24717c2 = (C24717c) objectRef2.element;
            C26866a.a.m104898f(aVar, LongVodPlayerView.TAG, "getMp4DefaultPlayBean, bean.resolutions： " + (c24717c2 != null ? c24717c2.m97081e() : null), false, 4, null);
            ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
            longVodResolutionHelper$getMp4DefaultPlayBean$1.L$0 = listM97054j;
            longVodResolutionHelper$getMp4DefaultPlayBean$1.L$1 = objectRef2;
            longVodResolutionHelper$getMp4DefaultPlayBean$1.label = 1;
            Object objM71893f = resolutionMemberManager.m71893f(c24715a, longVodResolutionHelper$getMp4DefaultPlayBean$1);
            if (objM71893f == objF) {
                return objF;
            }
            list = listM97054j;
            obj = objM71893f;
            objectRef = objectRef2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) longVodResolutionHelper$getMp4DefaultPlayBean$1.L$1;
            list = (List) longVodResolutionHelper$getMp4DefaultPlayBean$1.L$0;
            ResultKt.m97107b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C16503r c16503r = C16503r.f55634a;
            if (c16503r.m71938q(((C24717c) objectRef.element).m97081e()) && !C5118o.f17608a.m23948i() && !C5110g.f17601a.m23911b()) {
                C26866a.a aVar2 = C26866a.f81698a;
                C26866a.a.m104898f(aVar2, "vipResolution", "getMp4DefaultPlayBean() --> 当前没有解锁，需要降级到720P以下，当前bean.resolutions = " + ((C24717c) objectRef.element).m97081e(), false, 4, null);
                T t12 = objectRef.element;
                ((C24717c) t12).m97089m(((C24717c) t12).m97081e());
                ?? M71925g = C16503r.m71925g(c16503r, list, 0, 2, null);
                objectRef.element = M71925g;
                C26866a.a.m104898f(aVar2, "vipResolution", "getMp4DefaultPlayBean() --> 降级后的bean.resolutions = " + (M71925g != 0 ? M71925g.m97081e() : null), false, 4, null);
            }
        }
        return objectRef.element;
    }

    /* JADX INFO: renamed from: b */
    public final Object m71718b(C24715a c24715a, Continuation continuation) {
        if (c24715a.m97054j().isEmpty()) {
            return null;
        }
        C24717c c24717c = (C24717c) CollectionsKt.m97359i0(c24715a.m97054j());
        C16496k.f55626a.m71921a("LongVodResolutionHelper --> getDefaultPlayStream() --> 是MP4格式 = " + c24715a.m97067w());
        return c24715a.m97067w() ? m71717d(c24715a, continuation) : c24717c;
    }

    /* JADX INFO: renamed from: e */
    public final C24717c m71719e(C24715a bean, C24716b config) {
        Intrinsics.m97802h(bean, "bean");
        Intrinsics.m97802h(config, "config");
        for (C24717c c24717c : bean.m97054j()) {
            if (StringsKt.m98132c0(config.m97074d(), c24717c.m97081e(), false, 2, null)) {
                return c24717c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final List m71720f(C24717c playStream, List mp4Streams) {
        Intrinsics.m97802h(playStream, "playStream");
        Intrinsics.m97802h(mp4Streams, "mp4Streams");
        ArrayList arrayList = new ArrayList();
        Iterator it = mp4Streams.iterator();
        while (it.hasNext()) {
            C24717c c24717c = (C24717c) it.next();
            arrayList.add(new C24716b(Intrinsics.m97797c(c24717c.m97081e(), playStream.m97081e()), c24717c.m97081e() + "P", null, 4, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m71721g(String resolution) {
        Intrinsics.m97802h(resolution, "resolution");
        C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "save, resolution： " + resolution, false, 4, null);
        this.f55480a = resolution;
        C14496b.f50966a.m65344b().putString("key_stream_resolution", resolution);
    }
}
