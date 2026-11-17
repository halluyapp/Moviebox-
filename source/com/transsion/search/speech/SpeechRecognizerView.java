package com.transsion.search.speech;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import cf.C5088c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.util.AbstractC14558d;
import com.transsion.search.R$drawable;
import com.transsion.search.R$mipmap;
import com.transsion.search.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gf.C23533f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p347df.InterfaceC22977b;
import p347df.InterfaceC22978c;
import p409ff.C23356a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0016\u001a\u00020\u000e2)\b\u0002\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017R7\u0010\u001a\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m97100d2 = {"Lcom/transsion/search/speech/SpeechRecognizerView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getClassTag", "()Ljava/lang/String;", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "callback", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/jvm/functions/Function1;", "mCallback", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SpeechRecognizerView extends AppCompatImageView implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1 mCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SpeechRecognizerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpeechRecognizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        setOnClickListener(this);
        setBackgroundResource(R$drawable.sr_icon_microphone);
    }

    public /* synthetic */ SpeechRecognizerView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m78029d(final SpeechRecognizerView speechRecognizerView) {
        C18528q.f60000a.m78054b();
        Context context = speechRecognizerView.getContext();
        final AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            C5088c.f17563a.m23820e(appCompatActivity).m23814b("android.permission.RECORD_AUDIO").mo93266b().mo93265a(new InterfaceC22977b() { // from class: com.transsion.search.speech.n
                @Override // p347df.InterfaceC22977b
                /* JADX INFO: renamed from: a */
                public final void mo77090a(C23533f c23533f, List list, boolean z11, boolean z12) {
                    SpeechRecognizerView.m78030e(this.f59996a, c23533f, list, z11, z12);
                }
            }).mo93268d(new InterfaceC22978c() { // from class: com.transsion.search.speech.o
                @Override // p347df.InterfaceC22978c
                /* JADX INFO: renamed from: a */
                public final void mo77092a(boolean z11, List list, List list2) {
                    SpeechRecognizerView.m78031f(this.f59997a, appCompatActivity, z11, list, list2);
                }
            });
        } else {
            C18517f.f59987a.m78050a(speechRecognizerView.getClassTag() + " --> context as? AppCompatActivity == null");
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m78030e(SpeechRecognizerView speechRecognizerView, C23533f scope, List deniedList, boolean z11, boolean z12) {
        Intrinsics.m97802h(scope, "scope");
        Intrinsics.m97802h(deniedList, "deniedList");
        if (z11) {
            if (z12) {
                scope.m93262c(deniedList, new C23356a(null, speechRecognizerView.getResources().getString(R$string.search_sr_permission_tip), speechRecognizerView.getResources().getString(R$string.search_sr_permission_setting), Integer.valueOf(R$mipmap.sr_icon_active), Integer.valueOf(R$color.white_20), 1, null));
            } else {
                scope.m93261b(deniedList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m78031f(SpeechRecognizerView speechRecognizerView, AppCompatActivity appCompatActivity, boolean z11, List grantedList, List deniedList) {
        Intrinsics.m97802h(grantedList, "grantedList");
        Intrinsics.m97802h(deniedList, "deniedList");
        C18517f.f59987a.m78050a(speechRecognizerView.getClassTag() + " --> allGranted = " + z11);
        if (z11) {
            SpeechRecognizerDialog speechRecognizerDialogM78025I0 = new SpeechRecognizerDialog().m78025I0(speechRecognizerView.mCallback);
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
            speechRecognizerDialogM78025I0.show(supportFragmentManager, "SpeechRecognizerDialog");
        }
    }

    private final String getClassTag() {
        String simpleName = SpeechRecognizerView.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCallback$default(SpeechRecognizerView speechRecognizerView, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        speechRecognizerView.setCallback(function1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        AbstractC14558d.m65672a(1000L, new Function0() { // from class: com.transsion.search.speech.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpeechRecognizerView.m78029d(this.f59995a);
            }
        });
    }

    public final void setCallback(Function1<? super String, Unit> callback) {
        this.mCallback = callback;
    }
}
