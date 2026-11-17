package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baselib.helper.C14453d;
import com.transsion.player.p1003enum.ScaleMode;
import com.transsion.postdetail.R$mipmap;
import com.transsion.postdetail.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p550kj.C24662i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/ImmScaleView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsion/player/enum/ScaleMode;", "scaleMode", "", "c", "(Lcom/transsion/player/enum/ScaleMode;)V", "", "pageName", "subjectId", "setPageParams", "(Ljava/lang/String;Ljava/lang/String;)V", "ops", "setOps", "(Ljava/lang/String;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "e", "f", "Lcom/transsion/postdetail/ui/view/ImmScaleView$a;", "g", "Lcom/transsion/postdetail/ui/view/ImmScaleView$a;", "getOnModelChangeListener", "()Lcom/transsion/postdetail/ui/view/ImmScaleView$a;", "setOnModelChangeListener", "(Lcom/transsion/postdetail/ui/view/ImmScaleView$a;)V", "onModelChangeListener", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ImmScaleView extends AppCompatImageView {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private InterfaceC17306a onModelChangeListener;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmScaleView$a */
    public interface InterfaceC17306a {
        /* JADX INFO: renamed from: a */
        void mo72331a(ScaleMode scaleMode, String str);
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.ImmScaleView$b */
    public /* synthetic */ class C17307b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57521a;

        static {
            int[] iArr = new int[ScaleMode.values().length];
            try {
                iArr[ScaleMode.SCALE_TO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleMode.SCALE_ASPECT_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleMode.SCALE_ASPECT_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f57521a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmScaleView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        m74601c(C14453d.f50863a.m65161c());
        AbstractC26006c.m102050c(this, 0L, new Function1() { // from class: com.transsion.postdetail.ui.view.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImmScaleView.m74600b(this.f57723a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmScaleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        m74601c(C14453d.f50863a.m65161c());
        AbstractC26006c.m102050c(this, 0L, new Function1() { // from class: com.transsion.postdetail.ui.view.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImmScaleView.m74600b(this.f57723a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmScaleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        m74601c(C14453d.f50863a.m65161c());
        AbstractC26006c.m102050c(this, 0L, new Function1() { // from class: com.transsion.postdetail.ui.view.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImmScaleView.m74600b(this.f57723a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Unit m74600b(ImmScaleView immScaleView, View it) {
        ScaleMode scaleMode;
        String string;
        Intrinsics.m97802h(it, "it");
        int i11 = C17307b.f57521a[C14453d.f50863a.m65161c().ordinal()];
        if (i11 == 1) {
            scaleMode = ScaleMode.SCALE_ASPECT_FILL;
            string = immScaleView.getContext().getString(R$string.video_crop);
            Intrinsics.m97801g(string, "getString(...)");
        } else if (i11 != 2) {
            scaleMode = ScaleMode.SCALE_ASPECT_FIT;
            string = immScaleView.getContext().getString(R$string.video_fit_screen);
            Intrinsics.m97801g(string, "getString(...)");
        } else {
            scaleMode = ScaleMode.SCALE_TO_FILL;
            string = immScaleView.getContext().getString(R$string.video_stretch);
            Intrinsics.m97801g(string, "getString(...)");
        }
        immScaleView.m74601c(scaleMode);
        InterfaceC17306a interfaceC17306a = immScaleView.onModelChangeListener;
        if (interfaceC17306a != null) {
            interfaceC17306a.mo72331a(scaleMode, string);
        }
        String str = immScaleView.pageName;
        if (str != null) {
            C24662i.f75350a.m96881p(str, MapsKt.m97578m(new Pair("module_name", "scale_mode"), new Pair("subject_id", immScaleView.subjectId), new Pair("ops", immScaleView.ops), new Pair(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(scaleMode.getValue()))));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: c */
    private final void m74601c(ScaleMode scaleMode) {
        C14453d.f50863a.m65163f(scaleMode);
        int i11 = C17307b.f57521a[scaleMode.ordinal()];
        if (i11 == 2) {
            setImageResource(R$mipmap.ic_video_fit_screen);
        } else if (i11 != 3) {
            setImageResource(R$mipmap.ic_video_stretch);
        } else {
            setImageResource(R$mipmap.ic_video_crop);
        }
    }

    public final InterfaceC17306a getOnModelChangeListener() {
        return this.onModelChangeListener;
    }

    public final void setOnModelChangeListener(InterfaceC17306a interfaceC17306a) {
        this.onModelChangeListener = interfaceC17306a;
    }

    public final void setOps(String ops) {
        this.ops = ops;
    }

    public final void setPageParams(String pageName, String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        this.pageName = pageName;
        this.subjectId = subjectId;
    }
}
