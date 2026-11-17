package com.transsion.postdetail.layer;

import android.view.View;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.layer.listener.LayerFlag;
import com.transsion.postdetail.layer.local.LocalUiType;
import com.transsion.subtitle.VideoSubtitleControl;
import com.transsion.videofloat.bean.FloatActionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p951yo.InterfaceC28988a;
import p951yo.InterfaceC28989b;
import p951yo.InterfaceC28990c;
import p951yo.InterfaceC28991d;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16780a {

    /* JADX INFO: renamed from: a */
    private final String f56405a = "LayerManager";

    /* JADX INFO: renamed from: b */
    private final List f56406b = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56407a;

        static {
            int[] iArr = new int[LayerFlag.values().length];
            try {
                iArr[LayerFlag.SET_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayerFlag.SET_PARAMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayerFlag.SET_MANAGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayerFlag.INIT_PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayerFlag.RENDER_FIRST_FRAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LayerFlag.COMPLETION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LayerFlag.VIDEO_SIZE_CHANGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LayerFlag.LOADING_BEGIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LayerFlag.LOADING_END.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LayerFlag.VIDEO_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LayerFlag.VIDEO_PAUSE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LayerFlag.PROGRESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LayerFlag.PLAY_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LayerFlag.LOOPING_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LayerFlag.PLAYER_RESET.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LayerFlag.INIT_VIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LayerFlag.INIT_VIEW_TYPE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LayerFlag.INIT_DATA.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LayerFlag.ADD_SURFACE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LayerFlag.SCREEN_ORIENTATION_CHANGED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LayerFlag.LOCAL_UI_CHANGED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LayerFlag.LAYER_EVENT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LayerFlag.UPDATE_DATA.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LayerFlag.UPDATE_DOWNLOAD_DATA.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LayerFlag.UPDATE_TITLE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LayerFlag.BACK_PRESSED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[LayerFlag.FRAGMENT_RESUME.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[LayerFlag.FRAGMENT_PAUSE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[LayerFlag.FRAGMENT_STOP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[LayerFlag.RELEASE_PLAYER.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[LayerFlag.FRAGMENT_DESTROY.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[LayerFlag.BOTTOM_CONTROL.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[LayerFlag.SUBTITLE_CONTROL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[LayerFlag.DOWNLOAD_PROGRESS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[LayerFlag.DOWNLOAD_SPEED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[LayerFlag.DOWNLOAD_CALLBACK.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[LayerFlag.SHOW_TOAST.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[LayerFlag.REMOVE_TOAST.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[LayerFlag.NETWORK_CHANGE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[LayerFlag.PLAYER_TIMEOUT_TIPS.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[LayerFlag.REQUEST_FORYOU.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[LayerFlag.SERIES_INIT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[LayerFlag.SERIES_EVENT.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[LayerFlag.SERIES_PLAY.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[LayerFlag.SERIES_LOCAL2NET.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[LayerFlag.UPDATE_SPEED.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[LayerFlag.UPDATE_ROTATION.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[LayerFlag.SHOW_FLOAT_2_WINDOW.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[LayerFlag.INTO_PIP.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[LayerFlag.PLAYER_FOREGROUND.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            f56407a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.a$b */
    public static final class b implements InterfaceC28988a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ LayerFlag f56409b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object[] f56410c;

        b(LayerFlag layerFlag, Object[] objArr) {
            this.f56409b = layerFlag;
            this.f56410c = objArr;
        }

        @Override // p951yo.InterfaceC28988a
        /* JADX INFO: renamed from: a */
        public boolean mo73112a(Object data) {
            Intrinsics.m97802h(data, "data");
            return data instanceof BaseLayer;
        }

        @Override // p951yo.InterfaceC28988a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo73113b(BaseLayer listener) {
            Intrinsics.m97802h(listener, "listener");
            C16780a c16780a = C16780a.this;
            LayerFlag layerFlag = this.f56409b;
            Object[] objArr = this.f56410c;
            c16780a.m73105i(listener, layerFlag, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.a$c */
    public static final class c implements InterfaceC28988a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ LayerFlag f56412b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object[] f56413c;

        c(LayerFlag layerFlag, Object[] objArr) {
            this.f56412b = layerFlag;
            this.f56413c = objArr;
        }

        @Override // p951yo.InterfaceC28988a
        /* JADX INFO: renamed from: a */
        public boolean mo73112a(Object data) {
            Intrinsics.m97802h(data, "data");
            return data instanceof InterfaceC16633f;
        }

        @Override // p951yo.InterfaceC28988a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo73113b(InterfaceC16633f listener) {
            Intrinsics.m97802h(listener, "listener");
            C16780a c16780a = C16780a.this;
            LayerFlag layerFlag = this.f56412b;
            Object[] objArr = this.f56413c;
            c16780a.m73107k(listener, layerFlag, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.a$d */
    public static final class d implements InterfaceC28988a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ LayerFlag f56415b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object[] f56416c;

        d(LayerFlag layerFlag, Object[] objArr) {
            this.f56415b = layerFlag;
            this.f56416c = objArr;
        }

        @Override // p951yo.InterfaceC28988a
        /* JADX INFO: renamed from: a */
        public boolean mo73112a(Object data) {
            Intrinsics.m97802h(data, "data");
            return data instanceof InterfaceC28991d;
        }

        @Override // p951yo.InterfaceC28988a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo73113b(InterfaceC28991d listener) {
            Intrinsics.m97802h(listener, "listener");
            C16780a c16780a = C16780a.this;
            LayerFlag layerFlag = this.f56415b;
            Object[] objArr = this.f56416c;
            c16780a.m73106j(listener, layerFlag, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m73104f(InterfaceC28988a interfaceC28988a) {
        if (this.f56406b.isEmpty()) {
            return;
        }
        List list = this.f56406b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (interfaceC28988a.mo73112a((BaseLayer) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                interfaceC28988a.mo73113b((BaseLayer) it.next());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m73105i(BaseLayer baseLayer, LayerFlag layerFlag, Object... objArr) {
        int i11 = a.f56407a[layerFlag.ordinal()];
        if (i11 == 1) {
            if (objArr.length == 2) {
                Object obj = objArr[0];
                Intrinsics.m97800f(obj, "null cannot be cast to non-null type com.transsion.player.orplayer.ORPlayer");
                Object obj2 = objArr[1];
                Intrinsics.m97800f(obj2, "null cannot be cast to non-null type com.transsion.player.ui.ORPlayerView");
                baseLayer.mo73091M((InterfaceC16634g) obj, (ORPlayerView) obj2);
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3 && objArr.length == 1) {
                Object obj3 = objArr[0];
                Intrinsics.m97800f(obj3, "null cannot be cast to non-null type com.transsion.postdetail.layer.LayerManager");
                baseLayer.m73090L((C16780a) obj3);
                return;
            }
            return;
        }
        if (objArr.length == 2) {
            Object obj4 = objArr[0];
            Intrinsics.m97800f(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = objArr[1];
            Intrinsics.m97800f(obj5, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.PostSubjectItem");
            baseLayer.m73092N((String) obj4, (PostSubjectItem) obj5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m73106j(InterfaceC28991d interfaceC28991d, LayerFlag layerFlag, Object... objArr) {
        Object objU;
        Object objU2;
        Object objU3;
        switch (a.f56407a[layerFlag.ordinal()]) {
            case 16:
                if (objArr.length == 2) {
                    Object obj = objArr[0];
                    Intrinsics.m97800f(obj, "null cannot be cast to non-null type android.view.View");
                    Object obj2 = objArr[1];
                    Intrinsics.m97800f(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    interfaceC28991d.mo73405z((View) obj, ((Boolean) obj2).booleanValue());
                }
                break;
            case 17:
                if (objArr.length == 2) {
                    Object obj3 = objArr[0];
                    Intrinsics.m97800f(obj3, "null cannot be cast to non-null type android.view.View");
                    Object obj4 = objArr[1];
                    Intrinsics.m97800f(obj4, "null cannot be cast to non-null type com.transsion.postdetail.layer.local.LocalUiType");
                    interfaceC28991d.mo73248s((View) obj3, (LocalUiType) obj4);
                }
                break;
            case 18:
                if (objArr.length == 5) {
                    Object obj5 = objArr[0];
                    Intrinsics.m97800f(obj5, "null cannot be cast to non-null type kotlin.String");
                    Object obj6 = objArr[1];
                    Intrinsics.m97800f(obj6, "null cannot be cast to non-null type kotlin.String");
                    Object obj7 = objArr[2];
                    Intrinsics.m97800f(obj7, "null cannot be cast to non-null type kotlin.String");
                    Object obj8 = objArr[3];
                    Intrinsics.m97800f(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                    Object obj9 = objArr[4];
                    Intrinsics.m97800f(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                    interfaceC28991d.mo73393q((String) obj5, (String) obj6, (String) obj7, zBooleanValue, ((Boolean) obj9).booleanValue());
                }
                break;
            case 19:
                if (objArr.length == 2) {
                    Object obj10 = objArr[0];
                    Intrinsics.m97800f(obj10, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj10).intValue();
                    Object obj11 = objArr[1];
                    Intrinsics.m97800f(obj11, "null cannot be cast to non-null type kotlin.Int");
                    interfaceC28991d.mo73394r(iIntValue, ((Integer) obj11).intValue());
                }
                break;
            case 20:
                if (objArr.length == 1) {
                    Object obj12 = objArr[0];
                    Intrinsics.m97800f(obj12, "null cannot be cast to non-null type com.transsion.postdetail.layer.local.LocalUiType");
                    interfaceC28991d.mo73241n((LocalUiType) obj12);
                }
                break;
            case 21:
                if (objArr.length == 1) {
                    Object obj13 = objArr[0];
                    Intrinsics.m97800f(obj13, "null cannot be cast to non-null type com.transsion.postdetail.layer.local.LocalUiType");
                    interfaceC28991d.mo73224a((LocalUiType) obj13);
                }
                break;
            case 22:
                if (objArr.length == 1) {
                    Object obj14 = objArr[0];
                    Intrinsics.m97800f(obj14, "null cannot be cast to non-null type com.transsion.postdetail.layer.listener.LayerEvent");
                    interfaceC28991d.mo73384l((InterfaceC28989b) obj14);
                }
                break;
            case 23:
                if (objArr.length == 1) {
                    Object obj15 = objArr[0];
                    Intrinsics.m97800f(obj15, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.PostSubjectItem");
                    interfaceC28991d.mo73403x((PostSubjectItem) obj15);
                }
                break;
            case 24:
                if (objArr.length == 3) {
                    Object obj16 = objArr[0];
                    Intrinsics.m97800f(obj16, "null cannot be cast to non-null type com.transsion.baselib.db.download.DownloadBean");
                    Object obj17 = objArr[1];
                    Intrinsics.m97800f(obj17, "null cannot be cast to non-null type kotlin.String");
                    Object obj18 = objArr[2];
                    Intrinsics.m97800f(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                    interfaceC28991d.mo73237k((DownloadBean) obj16, (String) obj17, ((Boolean) obj18).booleanValue());
                }
                break;
            case 25:
                if (objArr.length == 1) {
                    Object obj19 = objArr[0];
                    Intrinsics.m97800f(obj19, "null cannot be cast to non-null type kotlin.String");
                    interfaceC28991d.updateTitle((String) obj19);
                }
                break;
            case 26:
                if (interfaceC28991d.isVisible()) {
                    interfaceC28991d.onBackPressed();
                }
                break;
            case 27:
                if (interfaceC28991d.isVisible()) {
                    interfaceC28991d.onViewResume();
                }
                break;
            case 28:
                if (interfaceC28991d.isVisible()) {
                    interfaceC28991d.onViewPause();
                }
                break;
            case NOTIFICATION_REDIRECT_VALUE:
                if (interfaceC28991d.isVisible()) {
                    interfaceC28991d.mo73389o();
                }
                break;
            case 30:
                if (interfaceC28991d.isVisible()) {
                    interfaceC28991d.mo73350A();
                }
                break;
            case TEMPLATE_HTML_SIZE_VALUE:
                interfaceC28991d.mo73226c();
                break;
            case 32:
                if (objArr.length == 2) {
                    Object obj20 = objArr[0];
                    Intrinsics.m97800f(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue2 = ((Boolean) obj20).booleanValue();
                    Object obj21 = objArr[1];
                    Intrinsics.m97800f(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                    interfaceC28991d.mo73370b(zBooleanValue2, ((Boolean) obj21).booleanValue());
                }
                break;
            case 33:
                if (objArr.length == 1) {
                    Object obj22 = objArr[0];
                    Intrinsics.m97800f(obj22, "null cannot be cast to non-null type com.transsion.subtitle.VideoSubtitleControl");
                    interfaceC28991d.mo73352B((VideoSubtitleControl) obj22);
                }
                break;
            case 34:
                if (objArr.length == 1) {
                    Object obj23 = objArr[0];
                    Intrinsics.m97800f(obj23, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, kotlin.Int>");
                    interfaceC28991d.mo73386m(TypeIntrinsics.m97853d(obj23));
                }
                break;
            case 35:
                if (objArr.length == 1) {
                    Object obj24 = objArr[0];
                    Intrinsics.m97800f(obj24, "null cannot be cast to non-null type kotlin.String");
                    interfaceC28991d.mo73404y((String) obj24);
                }
                break;
            case 36:
                if (objArr.length == 1) {
                    Object obj25 = objArr[0];
                    Intrinsics.m97800f(obj25, "null cannot be cast to non-null type com.transsion.baselib.db.download.DownloadBean");
                    interfaceC28991d.mo73200D((DownloadBean) obj25);
                }
                break;
            case 37:
                if (objArr.length == 1) {
                    Object obj26 = objArr[0];
                    Intrinsics.m97800f(obj26, "null cannot be cast to non-null type kotlin.String");
                    InterfaceC28991d.a.m111512l(interfaceC28991d, (String) obj26, 0L, 2, null);
                } else if (objArr.length == 2) {
                    Object obj27 = objArr[0];
                    Intrinsics.m97800f(obj27, "null cannot be cast to non-null type kotlin.String");
                    Object obj28 = objArr[1];
                    Intrinsics.m97800f(obj28, "null cannot be cast to non-null type kotlin.Long");
                    interfaceC28991d.mo73380i((String) obj27, ((Long) obj28).longValue());
                }
                break;
            case 38:
                interfaceC28991d.mo73397t();
                break;
            case 39:
                if (objArr.length == 1) {
                    Object obj29 = objArr[0];
                    Intrinsics.m97800f(obj29, "null cannot be cast to non-null type kotlin.Boolean");
                    interfaceC28991d.mo73251w(((Boolean) obj29).booleanValue());
                }
                break;
            case 40:
                interfaceC28991d.mo73378g();
                break;
            case 41:
                if (objArr.length == 2) {
                    Object obj30 = objArr[0];
                    Intrinsics.m97800f(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue3 = ((Boolean) obj30).booleanValue();
                    Object obj31 = objArr[1];
                    Intrinsics.m97800f(obj31, "null cannot be cast to non-null type kotlin.String");
                    interfaceC28991d.mo73227f(zBooleanValue3, (String) obj31);
                }
                break;
            case 42:
                if (objArr.length == 2) {
                    Object obj32 = objArr[0];
                    Intrinsics.m97800f(obj32, "null cannot be cast to non-null type kotlin.String");
                    Object obj33 = objArr[1];
                    Intrinsics.m97800f(obj33, "null cannot be cast to non-null type kotlin.String");
                    interfaceC28991d.mo73230h((String) obj32, (String) obj33);
                }
                break;
            case 43:
                if (objArr.length == 1) {
                    Object obj34 = objArr[0];
                    Intrinsics.m97800f(obj34, "null cannot be cast to non-null type com.transsion.postdetail.layer.listener.SeriesEvent");
                    interfaceC28991d.mo73354E((InterfaceC28990c) obj34);
                }
                break;
            case 44:
                if (interfaceC28991d.isVisible() && objArr.length == 2) {
                    Object obj35 = objArr[0];
                    Intrinsics.m97800f(obj35, "null cannot be cast to non-null type kotlin.String");
                    Object obj36 = objArr[1];
                    Intrinsics.m97800f(obj36, "null cannot be cast to non-null type kotlin.String");
                    interfaceC28991d.mo73250v((String) obj35, (String) obj36);
                    break;
                }
                break;
            case 45:
                interfaceC28991d.mo73374d();
                break;
            case 46:
                Object objU4 = ArraysKt.m97462U(objArr);
                if (objU4 != null && (objU4 instanceof Float)) {
                    interfaceC28991d.mo73391p(((Number) objU4).floatValue());
                    break;
                }
                break;
            case 47:
                Object objU5 = ArraysKt.m97462U(objArr);
                if (objU5 != null && (objU5 instanceof Integer)) {
                    interfaceC28991d.mo73353C(((Number) objU5).intValue());
                    break;
                }
                break;
            case AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE:
                if (interfaceC28991d.isVisible() && (objU = ArraysKt.m97462U(objArr)) != null && (objU instanceof FloatActionType)) {
                    interfaceC28991d.mo73376e((FloatActionType) objU);
                    break;
                }
                break;
            case AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE:
                if (interfaceC28991d.isVisible() && (objU2 = ArraysKt.m97462U(objArr)) != null && (objU2 instanceof Boolean)) {
                    interfaceC28991d.mo73399u(((Boolean) objU2).booleanValue());
                    break;
                }
                break;
            case 50:
                if (interfaceC28991d.isVisible() && (objU3 = ArraysKt.m97462U(objArr)) != null && (objU3 instanceof Boolean)) {
                    interfaceC28991d.mo73234j(((Boolean) objU3).booleanValue());
                    break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m73107k(InterfaceC16633f interfaceC16633f, LayerFlag layerFlag, Object... objArr) {
        switch (a.f56407a[layerFlag.ordinal()]) {
            case 4:
                interfaceC16633f.initPlayer();
                break;
            case 5:
                interfaceC16633f.onRenderFirstFrame();
                break;
            case 6:
                InterfaceC16633f.a.m72428f(interfaceC16633f, null, 1, null);
                break;
            case 7:
                if (objArr.length == 2) {
                    Object obj = objArr[0];
                    Intrinsics.m97800f(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = objArr[1];
                    Intrinsics.m97800f(obj2, "null cannot be cast to non-null type kotlin.Int");
                    interfaceC16633f.onVideoSizeChanged(iIntValue, ((Integer) obj2).intValue());
                }
                break;
            case 8:
                InterfaceC16633f.a.m72432j(interfaceC16633f, null, 1, null);
                break;
            case 9:
                InterfaceC16633f.a.m72434l(interfaceC16633f, null, 1, null);
                break;
            case 10:
                InterfaceC16633f.a.m72421J(interfaceC16633f, null, 1, null);
                break;
            case 11:
                InterfaceC16633f.a.m72418G(interfaceC16633f, null, 1, null);
                break;
            case 12:
                if (objArr.length == 1) {
                    Object obj3 = objArr[0];
                    Intrinsics.m97800f(obj3, "null cannot be cast to non-null type kotlin.Long");
                    InterfaceC16633f.a.m72448z(interfaceC16633f, ((Long) obj3).longValue(), null, 2, null);
                }
                break;
            case 13:
                if (objArr.length == 1) {
                    Object obj4 = objArr[0];
                    Intrinsics.m97800f(obj4, "null cannot be cast to non-null type com.transsion.player.orplayer.PlayError");
                    InterfaceC16633f.a.m72440r(interfaceC16633f, (PlayError) obj4, null, 2, null);
                }
                break;
            case 14:
                interfaceC16633f.onLoopingStart();
                break;
            case 15:
                interfaceC16633f.onPlayerReset();
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m73108d(BaseLayer layer) {
        Intrinsics.m97802h(layer, "layer");
        if (!this.f56406b.contains(layer)) {
            this.f56406b.add(layer);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f56405a, layer + " is already add", false, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m73109e(LayerFlag flag, Object... params) {
        Intrinsics.m97802h(flag, "flag");
        Intrinsics.m97802h(params, "params");
        m73104f(new b(flag, params));
    }

    /* JADX INFO: renamed from: g */
    public final void m73110g(LayerFlag flag, Object... params) {
        Intrinsics.m97802h(flag, "flag");
        Intrinsics.m97802h(params, "params");
        m73104f(new c(flag, params));
    }

    /* JADX INFO: renamed from: h */
    public final void m73111h(LayerFlag flag, Object... params) {
        Intrinsics.m97802h(flag, "flag");
        Intrinsics.m97802h(params, "params");
        m73104f(new d(flag, params));
    }
}
