package com.transsion.usercenter.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.util.C14562h;
import com.transsion.usercenter.R$drawable;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.profile.bean.CoverUrl;
import com.transsion.usercenter.widget.MyRoomView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p585lw.C25699b1;
import sh.C27621h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\u00020\u0001:\u00028;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\r2\b\b\u0001\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J~\u0010/\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\r0*¢\u0006\u0004\b/\u00100Ji\u00103\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u0001012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u0001012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u0001012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u0001012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r02¢\u0006\u0004\b3\u00104JM\u00105\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r02¢\u0006\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m97100d2 = {"Lcom/transsion/usercenter/widget/MyRoomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", RewardPlus.AMOUNT, "", "n", "(Ljava/lang/Integer;)V", "", "ivUrl1", "ivUrl2", "ivUrl3", "ivUrl4", "placeHolder", TtmlNode.TAG_P, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/widget/ImageView;", "imageView", "m", "(Landroid/widget/ImageView;Ljava/lang/String;I)V", NativeComponentConstants.KEY_COMPONENT_TYPE, "l", "(I)I", "Lcom/transsion/usercenter/widget/MyRoomView$b;", CampaignEx.JSON_KEY_AD_R, "(Lcom/transsion/usercenter/widget/MyRoomView$b;Lcom/transsion/usercenter/widget/MyRoomView$b;Lcom/transsion/usercenter/widget/MyRoomView$b;)V", "resetUserUi", "()V", "titleId", "setTitle", "(I)V", "layoutType", "", "isSelf", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "clickType", "itemClick", "showMyRoomData", "(IZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/transsion/usercenter/profile/bean/CoverUrl;", "Lkotlin/Function0;", "showCollectionData", "(IZLjava/lang/Integer;Lcom/transsion/usercenter/profile/bean/CoverUrl;Lcom/transsion/usercenter/profile/bean/CoverUrl;Lcom/transsion/usercenter/profile/bean/CoverUrl;Lcom/transsion/usercenter/profile/bean/CoverUrl;Lkotlin/jvm/functions/Function0;)V", "showDownloadsData", "(ILjava/lang/Integer;Lcom/transsion/usercenter/widget/MyRoomView$b;Lcom/transsion/usercenter/widget/MyRoomView$b;Lcom/transsion/usercenter/widget/MyRoomView$b;Lkotlin/jvm/functions/Function0;)V", "Llw/b1;", "a", "Llw/b1;", "mViewBinding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "mLayoutType", "Companion", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MyRoomView extends ConstraintLayout {
    public static final int LAYOUT_TYPE_DOWNLOADS = 2;
    public static final int LAYOUT_TYPE_MY_ROOM = 1;
    public static final int LAYOUT_TYPE_WATCHER_LATER = 3;
    public static final int ON_CLICK_TYPE_BTN = 5;
    public static final int ON_CLICK_TYPE_ITEM = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C25699b1 mViewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mLayoutType;

    /* JADX INFO: renamed from: com.transsion.usercenter.widget.MyRoomView$b */
    public static final class C20871b {

        /* JADX INFO: renamed from: a */
        private String f65560a;

        /* JADX INFO: renamed from: b */
        private int f65561b;

        public C20871b(String str, int i11) {
            this.f65560a = str;
            this.f65561b = i11;
        }

        /* JADX INFO: renamed from: a */
        public final int m85848a() {
            return this.f65561b;
        }

        /* JADX INFO: renamed from: b */
        public final String m85849b() {
            return this.f65560a;
        }

        /* JADX INFO: renamed from: c */
        public final void m85850c(String str) {
            this.f65560a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20871b)) {
                return false;
            }
            C20871b c20871b = (C20871b) obj;
            return Intrinsics.m97797c(this.f65560a, c20871b.f65560a) && this.f65561b == c20871b.f65561b;
        }

        public int hashCode() {
            String str = this.f65560a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f65561b;
        }

        public String toString() {
            return "MyViewDownloads(url=" + this.f65560a + ", type=" + this.f65561b + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyRoomView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyRoomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyRoomView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.mLayoutType = 1;
        View.inflate(context, R$layout.view_my_room_layout, this);
        this.mViewBinding = C25699b1.m101100a(this);
    }

    /* JADX INFO: renamed from: l */
    private final int m85838l(int type) {
        if (type != 1) {
            return type != 2 ? R$drawable.profile_shape_dotted_line_img : R$mipmap.ic_default_video;
        }
        return R$mipmap.default_audio_ic_9_16;
    }

    /* JADX INFO: renamed from: m */
    private final void m85839m(ImageView imageView, String ivUrl3, int placeHolder) {
        if (imageView != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = imageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            if (ivUrl3 == null) {
                ivUrl3 = "";
            }
            C23860f.b bVarM94470i = bVarM94457m.m94468g(ivUrl3).m94470i(placeHolder);
            C27621h c27621h = C27621h.f84745a;
            Context context2 = imageView.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            C23860f.b bVarM94474m = bVarM94470i.m94474m(c27621h.m107451a(context2, 26.0f));
            Context context3 = imageView.getContext();
            Intrinsics.m97801g(context3, "getContext(...)");
            bVarM94474m.m94464c(c27621h.m107451a(context3, 26.0f)).m94465d(imageView);
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m85840n(Integer amount) {
        AppCompatTextView appCompatTextView;
        C25699b1 c25699b1 = this.mViewBinding;
        if (c25699b1 == null || (appCompatTextView = c25699b1.f78113i) == null) {
            return;
        }
        appCompatTextView.setText(C14562h.f51111a.m65678a(String.valueOf(amount)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m85841o(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: p */
    private final void m85842p(String ivUrl1, String ivUrl2, String ivUrl3, String ivUrl4, int placeHolder) {
        C25699b1 c25699b1 = this.mViewBinding;
        m85839m(c25699b1 != null ? c25699b1.f78109e : null, ivUrl1, placeHolder);
        C25699b1 c25699b2 = this.mViewBinding;
        m85839m(c25699b2 != null ? c25699b2.f78110f : null, ivUrl2, placeHolder);
        C25699b1 c25699b3 = this.mViewBinding;
        m85839m(c25699b3 != null ? c25699b3.f78111g : null, ivUrl3, placeHolder);
        C25699b1 c25699b4 = this.mViewBinding;
        m85839m(c25699b4 != null ? c25699b4.f78112h : null, ivUrl4, placeHolder);
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ void m85843q(MyRoomView myRoomView, String str, String str2, String str3, String str4, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            str2 = "";
        }
        if ((i12 & 4) != 0) {
            str3 = "";
        }
        if ((i12 & 8) != 0) {
            str4 = "";
        }
        if ((i12 & 16) != 0) {
            i11 = R$drawable.profile_shape_dotted_line_img;
        }
        myRoomView.m85842p(str, str2, str3, str4, i11);
    }

    /* JADX INFO: renamed from: r */
    private final void m85844r(C20871b ivUrl1, C20871b ivUrl2, C20871b ivUrl3) {
        ShapeableImageView shapeableImageView;
        String strM85849b;
        ShapeableImageView shapeableImageView2;
        String strM85849b2;
        ShapeableImageView shapeableImageView3;
        String strM85849b3;
        C25699b1 c25699b1 = this.mViewBinding;
        String str = "ivUrl1?.url";
        if (c25699b1 != null && (shapeableImageView3 = c25699b1.f78109e) != null) {
            if (TextUtils.isEmpty(ivUrl1 != null ? ivUrl1.m85849b() : null) && ivUrl1 != null) {
                ivUrl1.m85850c("ivUrl1.url");
            }
            C23860f.a aVar = C23860f.f72909a;
            Context context = shapeableImageView3.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            if (ivUrl1 == null || (strM85849b3 = ivUrl1.m85849b()) == null) {
                strM85849b3 = "ivUrl1?.url";
            }
            C23860f.b bVarM94470i = bVarM94457m.m94468g(strM85849b3).m94470i(m85838l(ivUrl1 != null ? ivUrl1.m85848a() : 3));
            C27621h c27621h = C27621h.f84745a;
            Context context2 = shapeableImageView3.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            C23860f.b bVarM94474m = bVarM94470i.m94474m(c27621h.m107451a(context2, 26.0f));
            Context context3 = shapeableImageView3.getContext();
            Intrinsics.m97801g(context3, "getContext(...)");
            bVarM94474m.m94464c(c27621h.m107451a(context3, 26.0f)).m94465d(shapeableImageView3);
        }
        C25699b1 c25699b2 = this.mViewBinding;
        if (c25699b2 != null && (shapeableImageView2 = c25699b2.f78110f) != null) {
            if (TextUtils.isEmpty(ivUrl2 != null ? ivUrl2.m85849b() : null) && ivUrl2 != null) {
                ivUrl2.m85850c("ivUrl2.url");
            }
            C23860f.a aVar2 = C23860f.f72909a;
            Context context4 = shapeableImageView2.getContext();
            Intrinsics.m97801g(context4, "getContext(...)");
            C23860f.b bVarM94457m2 = aVar2.m94457m(context4);
            if (ivUrl2 == null || (strM85849b2 = ivUrl2.m85849b()) == null) {
                strM85849b2 = "ivUrl1?.url";
            }
            C23860f.b bVarM94470i2 = bVarM94457m2.m94468g(strM85849b2).m94470i(m85838l(ivUrl2 != null ? ivUrl2.m85848a() : 3));
            C27621h c27621h2 = C27621h.f84745a;
            Context context5 = shapeableImageView2.getContext();
            Intrinsics.m97801g(context5, "getContext(...)");
            C23860f.b bVarM94474m2 = bVarM94470i2.m94474m(c27621h2.m107451a(context5, 26.0f));
            Context context6 = shapeableImageView2.getContext();
            Intrinsics.m97801g(context6, "getContext(...)");
            bVarM94474m2.m94464c(c27621h2.m107451a(context6, 26.0f)).m94465d(shapeableImageView2);
        }
        C25699b1 c25699b3 = this.mViewBinding;
        if (c25699b3 == null || (shapeableImageView = c25699b3.f78111g) == null) {
            return;
        }
        if (TextUtils.isEmpty(ivUrl3 != null ? ivUrl3.m85849b() : null) && ivUrl3 != null) {
            ivUrl3.m85850c("ivUrl3.url");
        }
        C23860f.a aVar3 = C23860f.f72909a;
        Context context7 = shapeableImageView.getContext();
        Intrinsics.m97801g(context7, "getContext(...)");
        C23860f.b bVarM94457m3 = aVar3.m94457m(context7);
        if (ivUrl3 != null && (strM85849b = ivUrl3.m85849b()) != null) {
            str = strM85849b;
        }
        C23860f.b bVarM94470i3 = bVarM94457m3.m94468g(str).m94470i(m85838l(ivUrl3 != null ? ivUrl3.m85848a() : 3));
        C27621h c27621h3 = C27621h.f84745a;
        Context context8 = shapeableImageView.getContext();
        Intrinsics.m97801g(context8, "getContext(...)");
        C23860f.b bVarM94474m3 = bVarM94470i3.m94474m(c27621h3.m107451a(context8, 26.0f));
        Context context9 = shapeableImageView.getContext();
        Intrinsics.m97801g(context9, "getContext(...)");
        bVarM94474m3.m94464c(c27621h3.m107451a(context9, 26.0f)).m94465d(shapeableImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m85845s(Function0 function0, View view) {
        function0.invoke();
    }

    public static /* synthetic */ void showDownloadsData$default(MyRoomView myRoomView, int i11, Integer num, C20871b c20871b, C20871b c20871b2, C20871b c20871b3, Function0 function0, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            num = 0;
        }
        myRoomView.showDownloadsData(i11, num, c20871b, c20871b2, c20871b3, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m85846t(Function1 function1, View view) {
        function1.invoke(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m85847u(Function1 function1, View view) {
        function1.invoke(5);
    }

    public final void resetUserUi() {
        TnTextView tnTextView;
        TnTextView tnTextView2;
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        ShapeableImageView shapeableImageView3;
        ShapeableImageView shapeableImageView4;
        TnTextView tnTextView3;
        ShapeableImageView shapeableImageView5;
        C25699b1 c25699b1 = this.mViewBinding;
        if (c25699b1 != null && (shapeableImageView5 = c25699b1.f78112h) != null) {
            AbstractC26006c.m102058k(shapeableImageView5);
        }
        C25699b1 c25699b2 = this.mViewBinding;
        ViewGroup.LayoutParams layoutParams = null;
        ViewParent parent = (c25699b2 == null || (tnTextView3 = c25699b2.f78114j) == null) ? null : tnTextView3.getParent();
        ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = AbstractC23384a.m92908b(162);
            constraintLayout.setLayoutParams(layoutParams2);
        }
        C25699b1 c25699b3 = this.mViewBinding;
        ViewGroup.LayoutParams layoutParams3 = (c25699b3 == null || (shapeableImageView4 = c25699b3.f78112h) == null) ? null : shapeableImageView4.getLayoutParams();
        Intrinsics.m97800f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams3;
        c2308b.setMarginEnd(AbstractC23384a.m92908b(32));
        C25699b1 c25699b4 = this.mViewBinding;
        if (c25699b4 != null && (shapeableImageView3 = c25699b4.f78112h) != null) {
            shapeableImageView3.setLayoutParams(c2308b);
        }
        C25699b1 c25699b5 = this.mViewBinding;
        ViewGroup.LayoutParams layoutParams4 = (c25699b5 == null || (appCompatTextView2 = c25699b5.f78113i) == null) ? null : appCompatTextView2.getLayoutParams();
        Intrinsics.m97800f(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams4;
        c2308b2.f7990t = -1;
        c2308b2.f7970j = -1;
        int i11 = R$id.ivPlaceholder4;
        c2308b2.f7988s = i11;
        c2308b2.f7968i = i11;
        c2308b2.f7974l = i11;
        c2308b2.f7994v = 0;
        ((ViewGroup.MarginLayoutParams) c2308b2).topMargin = 0;
        C25699b1 c25699b6 = this.mViewBinding;
        if (c25699b6 != null && (appCompatTextView = c25699b6.f78113i) != null) {
            appCompatTextView.setLayoutParams(c2308b2);
        }
        C25699b1 c25699b7 = this.mViewBinding;
        ViewGroup.LayoutParams layoutParams5 = (c25699b7 == null || (shapeableImageView2 = c25699b7.f78109e) == null) ? null : shapeableImageView2.getLayoutParams();
        Intrinsics.m97800f(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams5;
        c2308b3.f7970j = R$id.tvTitle;
        ((ViewGroup.MarginLayoutParams) c2308b3).topMargin = AbstractC23384a.m92908b(12);
        C25699b1 c25699b8 = this.mViewBinding;
        if (c25699b8 != null && (shapeableImageView = c25699b8.f78109e) != null) {
            shapeableImageView.setLayoutParams(c2308b3);
        }
        C25699b1 c25699b9 = this.mViewBinding;
        if (c25699b9 != null && (tnTextView2 = c25699b9.f78106b) != null) {
            layoutParams = tnTextView2.getLayoutParams();
        }
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b4 = (ConstraintLayout.C2308b) layoutParams;
        c2308b4.f7970j = R$id.tvTitle;
        C25699b1 c25699b10 = this.mViewBinding;
        if (c25699b10 == null || (tnTextView = c25699b10.f78106b) == null) {
            return;
        }
        tnTextView.setLayoutParams(c2308b4);
    }

    public final void setTitle(int titleId) {
        TnTextView tnTextView;
        C25699b1 c25699b1 = this.mViewBinding;
        if (c25699b1 == null || (tnTextView = c25699b1.f78114j) == null) {
            return;
        }
        tnTextView.setTextById(titleId);
    }

    public final void showCollectionData(int layoutType, boolean isSelf, Integer amount, CoverUrl ivUrl1, CoverUrl ivUrl2, CoverUrl ivUrl3, CoverUrl ivUrl4, final Function0<Unit> itemClick) {
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(itemClick, "itemClick");
        this.mLayoutType = layoutType;
        m85840n(amount);
        C25699b1 c25699b1 = this.mViewBinding;
        m85839m(c25699b1 != null ? c25699b1.f78109e : null, ivUrl1 != null ? ivUrl1.getCoverUrl() : null, (ivUrl1 == null || ivUrl1.getType() != 1) ? R$drawable.profile_shape_dotted_line_img : com.transsion.usercenter.R$mipmap.profile_staff_avatar_empty);
        C25699b1 c25699b2 = this.mViewBinding;
        m85839m(c25699b2 != null ? c25699b2.f78110f : null, ivUrl2 != null ? ivUrl2.getCoverUrl() : null, (ivUrl2 == null || ivUrl2.getType() != 1) ? R$drawable.profile_shape_dotted_line_img : com.transsion.usercenter.R$mipmap.profile_staff_avatar_empty);
        C25699b1 c25699b3 = this.mViewBinding;
        m85839m(c25699b3 != null ? c25699b3.f78111g : null, ivUrl3 != null ? ivUrl3.getCoverUrl() : null, (ivUrl3 == null || ivUrl3.getType() != 1) ? R$drawable.profile_shape_dotted_line_img : com.transsion.usercenter.R$mipmap.profile_staff_avatar_empty);
        C25699b1 c25699b4 = this.mViewBinding;
        m85839m(c25699b4 != null ? c25699b4.f78112h : null, ivUrl4 != null ? ivUrl4.getCoverUrl() : null, (ivUrl4 == null || ivUrl4.getType() != 1) ? R$drawable.profile_shape_dotted_line_img : com.transsion.usercenter.R$mipmap.profile_staff_avatar_empty);
        C25699b1 c25699b5 = this.mViewBinding;
        if (c25699b5 == null || (constraintLayout = c25699b5.f78107c) == null) {
            return;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: dx.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyRoomView.m85841o(itemClick, view);
            }
        });
    }

    public final void showDownloadsData(int layoutType, Integer amount, C20871b ivUrl1, C20871b ivUrl2, C20871b ivUrl3, final Function0<Unit> itemClick) {
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(itemClick, "itemClick");
        this.mLayoutType = layoutType;
        m85840n(amount);
        m85844r(ivUrl1, ivUrl2, ivUrl3);
        C25699b1 c25699b1 = this.mViewBinding;
        if (c25699b1 == null || (constraintLayout = c25699b1.f78107c) == null) {
            return;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: dx.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyRoomView.m85845s(itemClick, view);
            }
        });
    }

    public final void showMyRoomData(int layoutType, boolean isSelf, Integer amount, String ivUrl1, String ivUrl2, String ivUrl3, String ivUrl4, final Function1<? super Integer, Unit> itemClick) {
        Group group;
        TnTextView tnTextView;
        TnTextView tnTextView2;
        ConstraintLayout constraintLayout;
        Group group2;
        TnTextView tnTextView3;
        Group group3;
        TnTextView tnTextView4;
        TnTextView tnTextView5;
        Intrinsics.m97802h(itemClick, "itemClick");
        this.mLayoutType = layoutType;
        C25699b1 c25699b1 = this.mViewBinding;
        if (c25699b1 != null && (tnTextView5 = c25699b1.f78106b) != null) {
            tnTextView5.setTextById(R$string.profile_add_room);
        }
        m85840n(amount);
        if (amount == null || amount.intValue() != 0) {
            m85843q(this, ivUrl1, ivUrl2, ivUrl3, ivUrl4, 0, 16, null);
            C25699b1 c25699b2 = this.mViewBinding;
            if (c25699b2 != null && (tnTextView = c25699b2.f78106b) != null) {
                tnTextView.setVisibility(8);
            }
            C25699b1 c25699b3 = this.mViewBinding;
            if (c25699b3 != null && (group = c25699b3.f78108d) != null) {
                group.setVisibility(0);
            }
        } else if (isSelf) {
            C25699b1 c25699b4 = this.mViewBinding;
            if (c25699b4 != null && (tnTextView4 = c25699b4.f78106b) != null) {
                tnTextView4.setVisibility(0);
            }
            C25699b1 c25699b5 = this.mViewBinding;
            if (c25699b5 != null && (group3 = c25699b5.f78108d) != null) {
                group3.setVisibility(8);
            }
        } else {
            C25699b1 c25699b6 = this.mViewBinding;
            if (c25699b6 != null && (tnTextView3 = c25699b6.f78106b) != null) {
                tnTextView3.setVisibility(8);
            }
            C25699b1 c25699b7 = this.mViewBinding;
            if (c25699b7 != null && (group2 = c25699b7.f78108d) != null) {
                group2.setVisibility(0);
            }
        }
        C25699b1 c25699b8 = this.mViewBinding;
        if (c25699b8 != null && (constraintLayout = c25699b8.f78107c) != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: dx.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyRoomView.m85846t(itemClick, view);
                }
            });
        }
        C25699b1 c25699b9 = this.mViewBinding;
        if (c25699b9 == null || (tnTextView2 = c25699b9.f78106b) == null) {
            return;
        }
        tnTextView2.setOnClickListener(new View.OnClickListener() { // from class: dx.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyRoomView.m85847u(itemClick, view);
            }
        });
    }
}
