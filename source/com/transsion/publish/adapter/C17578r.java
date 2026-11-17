package com.transsion.publish.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import cf.C5088c;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.google.android.material.imageview.ShapeableImageView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$layout;
import com.transsion.publish.api.AudioEntity;
import com.transsion.publish.api.GroupBean;
import com.transsion.publish.api.LinkEntity;
import com.transsion.publish.p307ui.SelectLocationActivity;
import com.transsion.room.api.bean.LocationPlace;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import mn.C25890a;
import org.mvel2.ast.ASTNode;
import p016ak.C0117a;
import p016ak.InterfaceC0118b;
import p462hj.C23860f;
import p465hp.C23889b;
import p620nn.C26038e;
import p655op.C26377d;

/* JADX INFO: renamed from: com.transsion.publish.adapter.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C17578r extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private List f58088a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private C26377d f58089b;

    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.transsion.publish.api.LinkEntity] */
    /* JADX INFO: renamed from: C */
    private final void m75290C(RecyclerView.AbstractC4203b0 abstractC4203b0, int i11, C25890a c25890a) {
        Intrinsics.m97800f(abstractC4203b0, "null cannot be cast to non-null type com.transsion.publish.adapter.SelectLinksHolder");
        C17585y c17585y = (C17585y) abstractC4203b0;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Intrinsics.m97800f(c25890a, "null cannot be cast to non-null type com.transsion.publish.api.LinkEntity");
        ?? r11 = (LinkEntity) c25890a;
        objectRef.element = r11;
        String url = r11.getUrl();
        String strS = url != null ? StringsKt.m98238S(url, "https://www.", "", false, 4, null) : null;
        String strS2 = strS != null ? StringsKt.m98238S(strS, "http://www.", "", false, 4, null) : null;
        String strS3 = strS2 != null ? StringsKt.m98238S(strS2, "www.", "", false, 4, null) : null;
        String strS4 = strS3 != null ? StringsKt.m98238S(strS3, "https://", "", false, 4, null) : null;
        c17585y.m75344g().setText(strS4 != null ? StringsKt.m98238S(strS4, "http://", "", false, 4, null) : null);
        c17585y.m75343f().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17578r.m75291D(this.f58076a, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m75291D(C17578r c17578r, Ref.ObjectRef objectRef, View view) {
        c17578r.f58088a.remove(objectRef.element);
        c17578r.notifyDataSetChanged();
        List list = c17578r.f58088a;
        if (list == null || list.isEmpty()) {
            C23889b c23889b = new C23889b();
            c23889b.m94631o(4);
            c23889b.m94630n(2);
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C23889b.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c23889b, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.transsion.publish.adapter.z] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.transsion.room.api.bean.LocationPlace] */
    /* JADX INFO: renamed from: E */
    private final void m75292E(RecyclerView.AbstractC4203b0 abstractC4203b0, int i11, C25890a c25890a) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Intrinsics.m97800f(abstractC4203b0, "null cannot be cast to non-null type com.transsion.publish.adapter.SelectLocationHolder");
        objectRef.element = (C17586z) abstractC4203b0;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Intrinsics.m97800f(c25890a, "null cannot be cast to non-null type com.transsion.room.api.bean.LocationPlace");
        objectRef2.element = (LocationPlace) c25890a;
        ((C17586z) objectRef.element).m75346g().setText(((LocationPlace) objectRef2.element).getName() + " " + ((LocationPlace) objectRef2.element).getDistance());
        ((C17586z) objectRef.element).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17578r.m75293F(this.f58082a, objectRef, view);
            }
        });
        ((C17586z) objectRef.element).m75345f().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17578r.m75294G(objectRef2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static final void m75293F(C17578r c17578r, Ref.ObjectRef objectRef, View view) {
        Context context = ((C17586z) objectRef.element).itemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        c17578r.m75296L(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final void m75294G(Ref.ObjectRef objectRef, View view) {
        C23889b c23889b = new C23889b();
        c23889b.m94631o(8);
        c23889b.m94630n(2);
        c23889b.m94633q((LocationPlace) objectRef.element);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
    }

    /* JADX INFO: renamed from: K */
    private final void m75295K(Context context) {
        Navigator.m61845x(TheRouter.m61773c("/room/list").m61872z("is_select_room", true).m61852F("index", 1), context, null, 2, null);
    }

    /* JADX INFO: renamed from: L */
    private final void m75296L(Context context) {
        if (C5088c.f17563a.m23821f(context, "android.permission.ACCESS_FINE_LOCATION")) {
            Intent intent = new Intent(context, (Class<?>) SelectLocationActivity.class);
            intent.setFlags(ASTNode.DEOP);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m75297M(Context context) {
        InterfaceC0118b interfaceC0118b = (InterfaceC0118b) C0117a.f402a.m550a(InterfaceC0118b.class);
        if (interfaceC0118b != null) {
            interfaceC0118b.mo555e(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.transsion.publish.adapter.n0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.transsion.moviedetailapi.bean.Subject, mn.a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: N */
    private final void m75298N(RecyclerView.AbstractC4203b0 abstractC4203b0, int i11, C25890a c25890a) {
        String url;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Intrinsics.m97800f(abstractC4203b0, "null cannot be cast to non-null type com.transsion.publish.adapter.SelectWorkHolder");
        objectRef.element = (C17573n0) abstractC4203b0;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Intrinsics.m97800f(c25890a, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.Subject");
        ?? r11 = (Subject) c25890a;
        objectRef2.element = r11;
        ShapeableImageView shapeableImageViewM75283f = ((C17573n0) objectRef.element).m75283f();
        int iM27313a = AbstractC5776a0.m27313a(42.0f);
        C23860f.a aVar = C23860f.f72909a;
        Context context = shapeableImageViewM75283f.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(context);
        Cover cover = r11.getCover();
        if (cover == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        bVarM94457m.m94468g(url).m94470i(R$mipmap.home_ic_default_res).m94474m(iM27313a).m94464c(iM27313a).m94465d(shapeableImageViewM75283f);
        ((C17573n0) objectRef.element).m75286i().setText(r11.getTitle());
        try {
            Result.Companion companion = Result.INSTANCE;
            AppCompatTextView appCompatTextViewM75285h = ((C17573n0) objectRef.element).m75285h();
            C26038e c26038e = C26038e.f79537a;
            CharSequence charSequenceM102107e = c26038e.m102107e(r11);
            if (charSequenceM102107e.length() == 0) {
                charSequenceM102107e = c26038e.m102109g(Integer.valueOf(r11.getType()));
            }
            appCompatTextViewM75285h.setText(charSequenceM102107e);
            appCompatTextViewM75285h.setCompoundDrawablesWithIntrinsicBounds(AbstractC16247h.m71009a(r11.getSubjectType()), 0, 0, 0);
            Result.m112707constructorimpl(appCompatTextViewM75285h);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (((Subject) objectRef2.element).getCorrelation()) {
            ((C17573n0) objectRef.element).m75284g().setVisibility(4);
        } else {
            ((C17573n0) objectRef.element).m75284g().setVisibility(0);
            ((C17573n0) objectRef.element).m75284g().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17578r.m75299O(this.f58050a, objectRef2, view);
                }
            });
        }
        ((C17573n0) objectRef.element).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17578r.m75300P(this.f58054a, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final void m75299O(C17578r c17578r, Ref.ObjectRef objectRef, View view) {
        c17578r.f58088a.remove(objectRef.element);
        c17578r.notifyDataSetChanged();
        if (c17578r.f58088a.isEmpty()) {
            C23889b c23889b = new C23889b();
            c23889b.m94631o(3);
            c23889b.m94630n(2);
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C23889b.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c23889b, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static final void m75300P(C17578r c17578r, Ref.ObjectRef objectRef, View view) {
        Context context = ((C17573n0) objectRef.element).itemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        c17578r.m75297M(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.transsion.publish.adapter.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.transsion.publish.api.AudioEntity] */
    /* JADX INFO: renamed from: q */
    private final void m75311q(RecyclerView.AbstractC4203b0 abstractC4203b0, int i11, C25890a c25890a) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Intrinsics.m97800f(abstractC4203b0, "null cannot be cast to non-null type com.transsion.publish.adapter.SelectAudioHolder");
        objectRef.element = (C17548b) abstractC4203b0;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Intrinsics.m97800f(c25890a, "null cannot be cast to non-null type com.transsion.publish.api.AudioEntity");
        objectRef2.element = (AudioEntity) c25890a;
        ((C17548b) objectRef.element).m75194i().setText(((AudioEntity) objectRef2.element).getImageTitle());
        TextView textViewM75193h = ((C17548b) objectRef.element).m75193h();
        Long duration = ((AudioEntity) objectRef2.element).getDuration();
        textViewM75193h.setText(duration != null ? TimeUtilKt.m65664p(duration.longValue() / ((long) 1000)) : null);
        C26377d c26377d = this.f58089b;
        if (c26377d == null || !c26377d.m102983b()) {
            ((C17548b) objectRef.element).m75191f().setImageResource(R$drawable.ic_audio_play);
        } else {
            ((C17548b) objectRef.element).m75191f().setImageResource(R$drawable.ic_audio_pause);
        }
        ((C17548b) objectRef.element).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17578r.m75312r(this.f58038a, objectRef, objectRef2, view);
            }
        });
        ((C17548b) objectRef.element).m75192g().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17578r.m75314t(objectRef2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final void m75312r(C17578r c17578r, final Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, View view) {
        C26377d c26377d;
        try {
            if (c17578r.f58089b == null) {
                c17578r.f58089b = new C26377d();
            }
            C26377d c26377d2 = c17578r.f58089b;
            if (c26377d2 != null && c26377d2.m102983b()) {
                ((C17548b) objectRef.element).m75191f().setImageResource(R$drawable.ic_audio_pause);
                C26377d c26377d3 = c17578r.f58089b;
                if (c26377d3 != null) {
                    c26377d3.m102984c();
                    return;
                }
                return;
            }
            ((C17548b) objectRef.element).m75191f().setImageResource(R$drawable.ic_audio_play);
            String localPath = ((AudioEntity) objectRef2.element).getLocalPath();
            if (localPath != null && (c26377d = c17578r.f58089b) != null) {
                Context context = ((C17548b) objectRef.element).itemView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                c26377d.m102985d(context, localPath, false, new MediaPlayer.OnCompletionListener() { // from class: com.transsion.publish.adapter.q
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        C17578r.m75313s(objectRef, mediaPlayer);
                    }
                });
            }
            ((C17548b) objectRef.element).m75191f().setImageResource(R$drawable.ic_audio_pause);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static final void m75313s(Ref.ObjectRef objectRef, MediaPlayer mediaPlayer) {
        ((C17548b) objectRef.element).m75191f().setImageResource(R$drawable.ic_audio_play);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final void m75314t(Ref.ObjectRef objectRef, View view) {
        C23889b c23889b = new C23889b();
        c23889b.m94631o(2);
        c23889b.m94630n(2);
        c23889b.m94627k((AudioEntity) objectRef.element);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.transsion.publish.adapter.w] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.transsion.publish.api.GroupBean] */
    /* JADX INFO: renamed from: x */
    private final void m75315x(RecyclerView.AbstractC4203b0 abstractC4203b0, int i11, C25890a c25890a) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Intrinsics.m97800f(abstractC4203b0, "null cannot be cast to non-null type com.transsion.publish.adapter.SelectGroupHolder");
        objectRef.element = (C17583w) abstractC4203b0;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Intrinsics.m97800f(c25890a, "null cannot be cast to non-null type com.transsion.publish.api.GroupBean");
        objectRef2.element = (GroupBean) c25890a;
        ((C17583w) objectRef.element).m75341g().setText(((GroupBean) objectRef2.element).getName());
        ((C17583w) objectRef.element).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17578r.m75316y(this.f58064a, objectRef, view);
            }
        });
        ((C17583w) objectRef.element).m75340f().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17578r.m75317z(objectRef2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static final void m75316y(C17578r c17578r, Ref.ObjectRef objectRef, View view) {
        Context context = ((C17583w) objectRef.element).itemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        c17578r.m75295K(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static final void m75317z(Ref.ObjectRef objectRef, View view) {
        C23889b c23889b = new C23889b();
        c23889b.m94631o(6);
        c23889b.m94630n(2);
        c23889b.m94629m((GroupBean) objectRef.element);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m75318A() {
        List list = this.f58088a;
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m75319B() {
        List list = this.f58088a;
        if (list == null || list.isEmpty()) {
            return false;
        }
        List list2 = this.f58088a;
        if (list2 == null || list2.size() != 1 || ((C25890a) this.f58088a.get(0)).getType() == 3) {
            return this.f58088a.size() == 1 && ((C25890a) this.f58088a.get(0)).getType() == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final void m75320H() {
        Iterator it = this.f58088a.iterator();
        while (it.hasNext()) {
            if (((C25890a) it.next()).getType() == 2) {
                C26377d c26377d = this.f58089b;
                if (c26377d != null) {
                    c26377d.m102984c();
                }
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m75321I(C25890a entity) {
        Intrinsics.m97802h(entity, "entity");
        this.f58088a.remove(entity);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public final void m75322J(C25890a c25890a) {
        int i11;
        if (c25890a == null) {
            return;
        }
        int type = c25890a.getType();
        int i12 = 0;
        if (type == 2) {
            i11 = -1;
            for (Object obj : this.f58088a) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                if (((C25890a) obj) instanceof AudioEntity) {
                    i11 = i12;
                }
                i12 = i13;
            }
            C26377d c26377d = this.f58089b;
            if (c26377d != null) {
                c26377d.m102986f();
            }
            this.f58089b = null;
        } else if (type == 3) {
            i11 = -1;
            for (Object obj2 : this.f58088a) {
                int i14 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                if (((C25890a) obj2) instanceof Subject) {
                    i11 = i12;
                }
                i12 = i14;
            }
        } else if (type == 4) {
            i11 = -1;
            for (Object obj3 : this.f58088a) {
                int i15 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                if (((C25890a) obj3) instanceof LinkEntity) {
                    i11 = i12;
                }
                i12 = i15;
            }
        } else if (type == 6) {
            i11 = -1;
            for (Object obj4 : this.f58088a) {
                int i16 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                if (((C25890a) obj4) instanceof GroupBean) {
                    i11 = i12;
                }
                i12 = i16;
            }
        } else if (type != 8) {
            i11 = -1;
        } else {
            i11 = -1;
            for (Object obj5 : this.f58088a) {
                int i17 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                if (((C25890a) obj5) instanceof LocationPlace) {
                    i11 = i12;
                }
                i12 = i17;
            }
        }
        if (i11 == -1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c25890a);
            addData(arrayList);
        } else {
            this.f58088a.set(i11, c25890a);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f58088a);
            setData(arrayList2);
        }
    }

    public final void addData(List data) {
        Intrinsics.m97802h(data, "data");
        int size = this.f58088a.size();
        this.f58088a.addAll(data);
        notifyItemRangeInserted(size, data.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f58088a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        int type = ((C25890a) this.f58088a.get(i11)).getType();
        int i12 = 2;
        if (type != 2) {
            i12 = 3;
            if (type != 3) {
                i12 = 4;
                if (type != 4) {
                    i12 = 6;
                    if (type != 6) {
                        i12 = 8;
                        if (type != 8) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC4203b0 holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        C25890a c25890a = (C25890a) this.f58088a.get(i11);
        int type = c25890a.getType();
        if (type == 2) {
            m75311q(holder, i11, c25890a);
            return;
        }
        if (type == 3) {
            m75298N(holder, i11, c25890a);
            return;
        }
        if (type == 4) {
            m75290C(holder, i11, c25890a);
        } else if (type == 6) {
            m75315x(holder, i11, c25890a);
        } else {
            if (type != 8) {
                return;
            }
            m75292E(holder, i11, c25890a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC4203b0 onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        if (i11 == 2) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_music, parent, false);
            Intrinsics.m97799e(viewInflate);
            return new C17548b(viewInflate);
        }
        if (i11 == 3) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_work, parent, false);
            Intrinsics.m97799e(viewInflate2);
            return new C17573n0(viewInflate2);
        }
        if (i11 == 4) {
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_link, parent, false);
            Intrinsics.m97799e(viewInflate3);
            return new C17585y(viewInflate3);
        }
        if (i11 == 6) {
            View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_group, parent, false);
            Intrinsics.m97799e(viewInflate4);
            return new C17583w(viewInflate4);
        }
        if (i11 != 8) {
            return new C17550c(null);
        }
        View viewInflate5 = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_location, parent, false);
        Intrinsics.m97799e(viewInflate5);
        return new C17586z(viewInflate5);
    }

    public final void setData(List data) {
        Intrinsics.m97802h(data, "data");
        this.f58088a.clear();
        this.f58088a.addAll(data);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: u */
    public final void m75323u() {
        C26377d c26377d = this.f58089b;
        if (c26377d != null) {
            c26377d.m102986f();
        }
    }

    /* JADX INFO: renamed from: v */
    public final List m75324v() {
        return this.f58088a;
    }

    /* JADX INFO: renamed from: w */
    public final String m75325w() {
        String strValueOf = "";
        for (C25890a c25890a : this.f58088a) {
            if (c25890a.getType() == 3) {
                Intrinsics.m97800f(c25890a, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.Subject");
                strValueOf = String.valueOf(((Subject) c25890a).getSubjectId());
            }
        }
        return strValueOf;
    }
}
