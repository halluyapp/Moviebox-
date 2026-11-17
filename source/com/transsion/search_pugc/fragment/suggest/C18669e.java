package com.transsion.search_pugc.fragment.suggest;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.transsion.search_pugc.bean.SearchSuggestItem;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p525jr.C24463a;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.suggest.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\t¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/suggest/e;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/search_pugc/bean/SearchSuggestItem;", "<init>", "()V", "", "keyWord", "", "R1", "(Ljava/lang/String;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "G", "Ljava/lang/String;", "Q1", "()Ljava/lang/String;", "S1", "mKeyWord", "H", "a", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18669e extends BaseProviderMultiAdapter<SearchSuggestItem> {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String mKeyWord;

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.suggest.e$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final CharSequence m78486a(String mKeyWord, String str) {
            String str2;
            Intrinsics.m97802h(mKeyWord, "mKeyWord");
            try {
                Result.Companion companion = Result.INSTANCE;
                Locale locale = Locale.ROOT;
                String upperCase = mKeyWord.toUpperCase(locale);
                Intrinsics.m97801g(upperCase, "toUpperCase(...)");
                if (str != null) {
                    String upperCase2 = str.toUpperCase(locale);
                    Intrinsics.m97801g(upperCase2, "toUpperCase(...)");
                    str2 = upperCase2 == null ? "" : upperCase2;
                }
                if (StringsKt.m98155n1(upperCase).toString().length() == 0 || !StringsKt.m98132c0(str2, upperCase, false, 2, null)) {
                    return str;
                }
                int iO0 = StringsKt.m98156o0(str2, upperCase, 0, false, 6, null);
                int length = upperCase.length() + iO0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) str);
                if (length != 0 && iO0 != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#10A84D")), iO0, length, 33);
                }
                return spannableStringBuilder;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
                return "";
            }
        }
    }

    public C18669e() {
        super(null, 1, null);
        mo36107F1(new C24463a());
        this.mKeyWord = "";
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends SearchSuggestItem> data, int position) {
        Intrinsics.m97802h(data, "data");
        return 0;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final String getMKeyWord() {
        return this.mKeyWord;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m78484R1(String keyWord) {
        Intrinsics.m97802h(keyWord, "keyWord");
        this.mKeyWord = keyWord;
    }

    /* JADX INFO: renamed from: S1 */
    public final void m78485S1(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.mKeyWord = str;
    }
}
