package com.transsion.usercenter.setting;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.activity.BaseActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p585lw.C25733s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m97100d2 = {"Lcom/transsion/usercenter/setting/WebViewActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/s0;", "<init>", "()V", "", "initView", "initData", "g0", "f0", "c0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "onDestroy", "d0", "()Llw/s0;", "Landroid/webkit/WebView;", "a", "Landroid/webkit/WebView;", "mWebView", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "mUrl", "c", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class WebViewActivity extends BaseActivity<C25733s0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private WebView mWebView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mUrl;

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.WebViewActivity$b */
    public static final class C20786b extends WebChromeClient {
        C20786b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int i11) {
            Intrinsics.m97802h(view, "view");
            super.onProgressChanged(view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView view, String title) {
            AppCompatTextView appCompatTextView;
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(title, "title");
            super.onReceivedTitle(view, title);
            C25733s0 c25733s0 = (C25733s0) WebViewActivity.this.getMViewBinding();
            if (c25733s0 == null || (appCompatTextView = c25733s0.f78381d) == null) {
                return;
            }
            appCompatTextView.setText(title);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    private final void m85668c0() {
        if (this.mWebView == null) {
            Intrinsics.m97819y("mWebView");
        }
        LinearLayout linearLayout = ((C25733s0) getMViewBinding()).f78380c;
        WebView webView = this.mWebView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.m97819y("mWebView");
            webView = null;
        }
        linearLayout.removeView(webView);
        WebView webView3 = this.mWebView;
        if (webView3 == null) {
            Intrinsics.m97819y("mWebView");
            webView3 = null;
        }
        ViewParent parent = webView3.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            WebView webView4 = this.mWebView;
            if (webView4 == null) {
                Intrinsics.m97819y("mWebView");
                webView4 = null;
            }
            viewGroup.removeView(webView4);
        }
        WebView webView5 = this.mWebView;
        if (webView5 == null) {
            Intrinsics.m97819y("mWebView");
            webView5 = null;
        }
        webView5.stopLoading();
        WebView webView6 = this.mWebView;
        if (webView6 == null) {
            Intrinsics.m97819y("mWebView");
            webView6 = null;
        }
        webView6.getSettings().setJavaScriptEnabled(false);
        WebView webView7 = this.mWebView;
        if (webView7 == null) {
            Intrinsics.m97819y("mWebView");
            webView7 = null;
        }
        webView7.clearHistory();
        WebView webView8 = this.mWebView;
        if (webView8 == null) {
            Intrinsics.m97819y("mWebView");
            webView8 = null;
        }
        webView8.clearView();
        WebView webView9 = this.mWebView;
        if (webView9 == null) {
            Intrinsics.m97819y("mWebView");
            webView9 = null;
        }
        webView9.removeAllViews();
        WebView webView10 = this.mWebView;
        if (webView10 == null) {
            Intrinsics.m97819y("mWebView");
        } else {
            webView2 = webView10;
        }
        webView2.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m85669e0(WebViewActivity webViewActivity, View view) {
        webViewActivity.finish();
    }

    /* JADX INFO: renamed from: f0 */
    private final void m85670f0() {
        WebView webView = this.mWebView;
        if (webView == null) {
            Intrinsics.m97819y("mWebView");
            webView = null;
        }
        webView.setWebChromeClient(new C20786b());
    }

    /* JADX INFO: renamed from: g0 */
    private final void m85671g0() {
        String str = this.mUrl;
        String str2 = null;
        if (str == null) {
            Intrinsics.m97819y("mUrl");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        WebView webView = this.mWebView;
        if (webView == null) {
            Intrinsics.m97819y("mWebView");
            webView = null;
        }
        String str3 = this.mUrl;
        if (str3 == null) {
            Intrinsics.m97819y("mUrl");
        } else {
            str2 = str3;
        }
        webView.loadUrl(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        this.mUrl = String.valueOf(getIntent().getStringExtra("url"));
        this.mWebView = new WebView(this);
        LinearLayout linearLayout = ((C25733s0) getMViewBinding()).f78380c;
        WebView webView = this.mWebView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.m97819y("mWebView");
            webView = null;
        }
        linearLayout.addView(webView);
        WebView webView3 = this.mWebView;
        if (webView3 == null) {
            Intrinsics.m97819y("mWebView");
        } else {
            webView2 = webView3;
        }
        WebSettings settings = webView2.getSettings();
        Intrinsics.m97801g(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        WebSettings.LayoutAlgorithm layoutAlgorithm = WebSettings.LayoutAlgorithm.SINGLE_COLUMN;
        settings.setLayoutAlgorithm(layoutAlgorithm);
        settings.supportMultipleWindows();
        settings.setAllowFileAccess(true);
        settings.setNeedInitialFocus(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setLayoutAlgorithm(layoutAlgorithm);
        settings.setDomStorageEnabled(true);
        m85670f0();
        m85671g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        AppCompatImageButton appCompatImageButton;
        C25733s0 c25733s0 = (C25733s0) getMViewBinding();
        if (c25733s0 == null || (appCompatImageButton = c25733s0.f78379b) == null) {
            return;
        }
        appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewActivity.m85669e0(this.f65454a, view);
            }
        });
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C25733s0 getViewBinding() {
        C25733s0 c25733s0M101218c = C25733s0.m101218c(getLayoutInflater());
        Intrinsics.m97801g(c25733s0M101218c, "inflate(...)");
        return c25733s0M101218c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m85668c0();
    }
}
