package com.transsion.usercenter.laboratory;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.tencent.mmkv.MMKV;
import com.transsion.p285ad.p286db.mcc.LocalMcc;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import p411fh.C23366a;
import p585lw.C25708g;
import p765s6.InterfaceC27566d;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u0010\u001a\u00020\u00042\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/MccActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "initView", "X", "", "iso", "c0", "(Ljava/lang/String;)V", "b0", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "", RequestParameters.POSITION, "d0", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;I)V", "Lcom/transsion/usercenter/laboratory/g1;", "newEntity", "e0", "(Lcom/transsion/usercenter/laboratory/g1;)V", "Lcom/transsion/ad/db/mcc/LocalMcc;", "localMcc", "f0", "(Lcom/transsion/ad/db/mcc/LocalMcc;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/transsion/usercenter/laboratory/f1;", "a", "Lcom/transsion/usercenter/laboratory/f1;", "nationalInformationAdapter", "Llw/g;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Llw/g;", "binding", "c", "I", "checkedPosition", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MccActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C20517f1 nationalInformationAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C25708g binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int checkedPosition = -1;

    /* JADX INFO: renamed from: com.transsion.usercenter.laboratory.MccActivity$a */
    public static final class C20498a extends RecyclerView.AbstractC4213l {
        C20498a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (parent.getAdapter() != null && childAdapterPosition == 0) {
                outRect.top = AbstractC5776a0.m27313a(8.0f);
            }
            outRect.bottom = AbstractC5776a0.m27313a(16.0f);
        }
    }

    /* JADX INFO: renamed from: X */
    private final void m84914X() {
        AppCompatEditText appCompatEditText;
        Button button;
        C25708g c25708g = this.binding;
        if (c25708g != null && (button = c25708g.f78169c) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MccActivity.m84915Y(this.f64903a, view);
                }
            });
        }
        C25708g c25708g2 = this.binding;
        if (c25708g2 == null || (appCompatEditText = c25708g2.f78170d) == null) {
            return;
        }
        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.transsion.usercenter.laboratory.e1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                return MccActivity.m84916Z(this.f64908a, textView, i11, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m84915Y(MccActivity mccActivity, View view) {
        C28951b.f88586a.m111455e("重置自定义数据");
        mccActivity.checkedPosition = -1;
        mccActivity.m84921e0(null);
        C20517f1 c20517f1 = mccActivity.nationalInformationAdapter;
        if (c20517f1 != null) {
            c20517f1.mo36201n1(null);
        }
        mccActivity.m84918b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final boolean m84916Z(MccActivity mccActivity, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 3) {
            return true;
        }
        mccActivity.m84919c0(String.valueOf(textView != null ? textView.getText() : null));
        Object systemService = mccActivity.getSystemService("input_method");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(textView != null ? textView.getWindowToken() : null, 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final void m84917a0(MccActivity mccActivity, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        mccActivity.m84920d0(adapter, i11);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m84918b0() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new MccActivity$loadData$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: c0 */
    private final void m84919c0(String iso) {
        List<Object> data;
        C25708g c25708g;
        RecyclerView recyclerView;
        RecyclerView.AbstractC4214m layoutManager;
        C20517f1 c20517f1 = this.nationalInformationAdapter;
        if (c20517f1 == null || (data = c20517f1.getData()) == null) {
            return;
        }
        Iterator<Object> it = data.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.m97797c(((C20520g1) it.next()).m84929a().getIso(), iso)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            C20517f1 c20517f2 = this.nationalInformationAdapter;
            if (i11 >= (c20517f2 != null ? c20517f2.getItemCount() : 0) || (c25708g = this.binding) == null || (recyclerView = c25708g.f78172f) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            layoutManager.scrollToPosition(i11);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m84920d0(BaseQuickAdapter adapter, int position) {
        List<Object> data;
        List<Object> data2;
        Object obj = (adapter == null || (data2 = adapter.getData()) == null) ? null : data2.get(position);
        C20520g1 c20520g1 = obj instanceof C20520g1 ? (C20520g1) obj : null;
        if (c20520g1 != null) {
            c20520g1.m84931c(true);
        }
        C20517f1 c20517f1 = this.nationalInformationAdapter;
        if (c20517f1 != null) {
            c20517f1.notifyItemChanged(position);
        }
        m84922f0(c20520g1 != null ? c20520g1.m84929a() : null);
        m84921e0(c20520g1);
        if (this.checkedPosition >= 0) {
            Object obj2 = (adapter == null || (data = adapter.getData()) == null) ? null : data.get(this.checkedPosition);
            C20520g1 c20520g2 = obj2 instanceof C20520g1 ? (C20520g1) obj2 : null;
            if (c20520g2 != null) {
                c20520g2.m84931c(false);
            }
            C20517f1 c20517f2 = this.nationalInformationAdapter;
            if (c20517f2 != null) {
                c20517f2.notifyItemChanged(this.checkedPosition);
            }
        }
        this.checkedPosition = position;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m84921e0(C20520g1 newEntity) {
        LocalMcc localMccM84929a;
        String countryCode;
        String country;
        LocalMcc localMccM84929a2;
        String iso;
        LocalMcc localMccM84929a3;
        String mcc;
        LocalMcc localMccM84929a4;
        C23366a.a aVar = C23366a.f71263a;
        MMKV mmkvM92790c = aVar.m92790c();
        String str = "";
        if (mmkvM92790c != null) {
            if (newEntity == null || (localMccM84929a4 = newEntity.m84929a()) == null || (mcc = localMccM84929a4.getMcc()) == null) {
                mcc = "";
            }
            mmkvM92790c.putString("sp_code", mcc);
        }
        MMKV mmkvM92790c2 = aVar.m92790c();
        if (mmkvM92790c2 != null) {
            if (newEntity == null || (localMccM84929a3 = newEntity.m84929a()) == null || (iso = localMccM84929a3.getIso()) == null) {
                iso = "";
            }
            mmkvM92790c2.putString("custom_local_iso", iso);
        }
        MMKV mmkvM92790c3 = aVar.m92790c();
        if (mmkvM92790c3 != null) {
            if (newEntity == null || (localMccM84929a2 = newEntity.m84929a()) == null || (country = localMccM84929a2.getCountry()) == null) {
                country = "";
            }
            mmkvM92790c3.putString("custom_local_country", country);
        }
        MMKV mmkvM92790c4 = aVar.m92790c();
        if (mmkvM92790c4 != null) {
            if (newEntity != null && (localMccM84929a = newEntity.m84929a()) != null && (countryCode = localMccM84929a.getCountryCode()) != null) {
                str = countryCode;
            }
            mmkvM92790c4.putString("custom_country_code", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final void m84922f0(LocalMcc localMcc) {
        Button button;
        String str = "Country : + " + (localMcc != null ? localMcc.getCountry() : null) + " -- Mcc : " + (localMcc != null ? localMcc.getMcc() : null) + " -- Iso : " + (localMcc != null ? localMcc.getIso() : null) + " -- CountryCode : " + (localMcc != null ? localMcc.getCountryCode() : null);
        C25708g c25708g = this.binding;
        if (c25708g == null || (button = c25708g.f78168b) == null) {
            return;
        }
        button.setText(str);
    }

    private final void initView() {
        RecyclerView recyclerView;
        C25708g c25708g = this.binding;
        if (c25708g == null || (recyclerView = c25708g.f78172f) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C20517f1 c20517f1 = new C20517f1();
        c20517f1.m36227w1(new InterfaceC27566d() { // from class: com.transsion.usercenter.laboratory.c1
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                MccActivity.m84917a0(this.f64900a, baseQuickAdapter, view, i11);
            }
        });
        this.nationalInformationAdapter = c20517f1;
        recyclerView.setAdapter(c20517f1);
        recyclerView.addItemDecoration(new C20498a());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C25708g c25708gM101131c = C25708g.m101131c(getLayoutInflater());
        this.binding = c25708gM101131c;
        setContentView(c25708gM101131c != null ? c25708gM101131c.getRoot() : null);
        initView();
        m84914X();
        m84918b0();
    }
}
