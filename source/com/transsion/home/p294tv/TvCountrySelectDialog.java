package com.transsion.home.p294tv;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseViewBindingDialog;
import com.transsion.home.p294tv.adapter.C15455l;
import com.transsion.home.p294tv.bean.CountryItem;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p552kl.C24681i;
import p765s6.InterfaceC27566d;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R.\u0010B\u001a\u001c\u0012\u0004\u0012\u00020=\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, m97100d2 = {"Lcom/transsion/home/tv/TvCountrySelectDialog;", "Lcom/transsion/baseui/dialog/BaseViewBindingDialog;", "Lkl/i;", "<init>", "()V", "", "z0", "binding", "C0", "(Lkl/i;)V", "E0", "A0", "", "query", "", "Lcom/transsion/home/tv/bean/CountryItem;", "v0", "(Ljava/lang/String;)Ljava/util/List;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lkotlin/Function1;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/jvm/functions/Function1;", "getOnCountrySelected", "()Lkotlin/jvm/functions/Function1;", "x0", "(Lkotlin/jvm/functions/Function1;)V", "onCountrySelected", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getOnDialogDismiss", "()Lkotlin/jvm/functions/Function0;", "y0", "(Lkotlin/jvm/functions/Function0;)V", "onDialogDismiss", "Lcom/transsion/home/tv/adapter/l;", "f", "Lcom/transsion/home/tv/adapter/l;", "adapter", "g", "Ljava/util/List;", "allCountries", "", "h", "I", "dialogHeight", "i", "Ljava/lang/String;", "selectedCountryCode", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "n0", "()Lkotlin/jvm/functions/Function3;", "bindingInflater", "j", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TvCountrySelectDialog extends BaseViewBindingDialog<C24681i> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    public static final int f53394k = 8;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1 onCountrySelected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function0 onDialogDismiss;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C15455l adapter = new C15455l();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List allCountries = CollectionsKt.m97506l();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int dialogHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String selectedCountryCode;

    /* JADX INFO: renamed from: com.transsion.home.tv.TvCountrySelectDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final TvCountrySelectDialog m68569a(List countries, int i11, String str) {
            Intrinsics.m97802h(countries, "countries");
            TvCountrySelectDialog tvCountrySelectDialog = new TvCountrySelectDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arg_countries", new ArrayList<>(countries));
            bundle.putInt("arg_height", i11);
            bundle.putString("arg_selected_code", str);
            tvCountrySelectDialog.setArguments(bundle);
            return tvCountrySelectDialog;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.tv.TvCountrySelectDialog$b */
    public static final class C15441b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C24681i f53401a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TvCountrySelectDialog f53402b;

        C15441b(C24681i c24681i, TvCountrySelectDialog tvCountrySelectDialog) {
            this.f53401a = c24681i;
            this.f53402b = tvCountrySelectDialog;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            String string2 = StringsKt.m98155n1(string).toString();
            this.f53401a.f75450d.setVisibility(string2.length() == 0 ? 8 : 0);
            this.f53402b.adapter.mo36201n1(this.f53402b.m68564v0(string2));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m68552A0(C24681i binding) {
        final RecyclerView rvCountries = binding.f75453g;
        Intrinsics.m97801g(rvCountries, "rvCountries");
        final int paddingBottom = rvCountries.getPaddingBottom();
        ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.transsion.home.tv.e
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return TvCountrySelectDialog.m68553B0(rvCountries, paddingBottom, view, windowInsetsCompat);
            }
        });
        ViewCompat.requestApplyInsets(binding.getRoot());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final WindowInsetsCompat m68553B0(RecyclerView recyclerView, int i11, View view, WindowInsetsCompat insets) {
        Intrinsics.m97802h(view, "<unused var>");
        Intrinsics.m97802h(insets, "insets");
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i11 + insets.getInsets(WindowInsetsCompat.Type.navigationBars()).f88818d);
        return insets;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m68554C0(C24681i binding) {
        RecyclerView recyclerView = binding.f75453g;
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.adapter);
        recyclerView.setClipToPadding(true);
        this.adapter.m68598D1(this.selectedCountryCode);
        this.adapter.mo36201n1(this.allCountries);
        this.adapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.tv.d
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                TvCountrySelectDialog.m68555D0(this.f53442a, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m68555D0(TvCountrySelectDialog tvCountrySelectDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        CountryItem countryItem = (CountryItem) tvCountrySelectDialog.adapter.m36182f0(i11);
        if (countryItem == null) {
            return;
        }
        C26866a.f81698a.m104912c("TvCountrySelectDialog", "country selected: " + countryItem.getCountryName(), false);
        Function1 function1 = tvCountrySelectDialog.onCountrySelected;
        if (function1 != null) {
            function1.invoke(countryItem);
        }
        tvCountrySelectDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: E0 */
    private final void m68556E0(final C24681i binding) {
        binding.f75448b.addTextChangedListener(new C15441b(binding, this));
        binding.f75450d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TvCountrySelectDialog.m68557F0(binding, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m68557F0(C24681i c24681i, View view) {
        c24681i.f75448b.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final List m68564v0(String query) {
        String lowerCase;
        String lowerCase2;
        if (query.length() == 0) {
            return this.allCountries;
        }
        String lowerCase3 = query.toLowerCase(Locale.ROOT);
        Intrinsics.m97801g(lowerCase3, "toLowerCase(...)");
        List list = this.allCountries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CountryItem countryItem = (CountryItem) obj;
            String countryName = countryItem.getCountryName();
            if (countryName != null) {
                lowerCase = countryName.toLowerCase(Locale.ROOT);
                Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            String countryCode = countryItem.getCountryCode();
            if (countryCode != null) {
                lowerCase2 = countryCode.toLowerCase(Locale.ROOT);
                Intrinsics.m97801g(lowerCase2, "toLowerCase(...)");
            } else {
                lowerCase2 = null;
            }
            String str = lowerCase2 != null ? lowerCase2 : "";
            if (StringsKt.m98242W(lowerCase, lowerCase3, false, 2, null) || Intrinsics.m97797c(lowerCase, lowerCase3) || StringsKt.m98242W(str, lowerCase3, false, 2, null) || Intrinsics.m97797c(str, lowerCase3)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m68565w0(TvCountrySelectDialog tvCountrySelectDialog, View view) {
        tvCountrySelectDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: z0 */
    private final void m68566z0() {
        Dialog dialog;
        Window window;
        if (this.dialogHeight <= 0 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, this.dialogHeight);
        window.setGravity(80);
    }

    @Override // com.transsion.baseui.dialog.BaseViewBindingDialog
    /* JADX INFO: renamed from: n0 */
    public Function3 mo65514n0() {
        return TvCountrySelectDialog$bindingInflater$1.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        setStyle(0, R$style.BottomDialogTheme);
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            List parcelableArrayList = arguments.getParcelableArrayList("arg_countries");
            if (parcelableArrayList == null) {
                parcelableArrayList = CollectionsKt.m97506l();
            }
            this.allCountries = parcelableArrayList;
            this.dialogHeight = arguments.getInt("arg_height", 0);
            this.selectedCountryCode = arguments.getString("arg_selected_code");
        }
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        super.onDismiss(dialog);
        Function0 function0 = this.onDialogDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C24681i c24681i = (C24681i) getViewBinding();
        if (c24681i == null) {
            return;
        }
        m68566z0();
        m68554C0(c24681i);
        m68552A0(c24681i);
        m68556E0(c24681i);
        c24681i.f75451e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.tv.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TvCountrySelectDialog.m68565w0(this.f53439a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final void m68567x0(Function1 function1) {
        this.onCountrySelected = function1;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m68568y0(Function0 function0) {
        this.onDialogDismiss = function0;
    }
}
