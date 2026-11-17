package com.transsion.postdetail.helper;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import p349dh.C22982c;
import p985zo.InterfaceC29209b;

/* JADX INFO: loaded from: classes6.dex */
public final class NegativeFeedbackHelper {

    /* JADX INFO: renamed from: a */
    public static final NegativeFeedbackHelper f56361a = new NegativeFeedbackHelper();

    /* JADX INFO: renamed from: b */
    private static final String f56362b = "NegativeFeedbackHelper";

    /* JADX INFO: renamed from: c */
    private static final Lazy f56363c = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.helper.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NegativeFeedbackHelper.m73016h();
        }
    });

    /* JADX INFO: renamed from: d */
    private static volatile String f56364d;

    /* JADX INFO: renamed from: e */
    private static volatile String f56365e;

    private NegativeFeedbackHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC29209b m73015g() {
        return (InterfaceC29209b) f56363c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC29209b m73016h() {
        return (InterfaceC29209b) C22982c.f70163e.m91553a().m91552h(InterfaceC29209b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m73017l(String str, String str2, String str3, String str4, InterfaceC25149n0 interfaceC25149n0, Function0 function0) {
        AbstractC25136k.m99058d(interfaceC25149n0, null, null, new NegativeFeedbackHelper$submitFeedback$1(str, str2, str3, str4, function0, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final String m73018e() {
        String str = f56365e;
        f56365e = null;
        return str;
    }

    /* JADX INFO: renamed from: f */
    public final String m73019f() {
        String str = f56364d;
        f56364d = null;
        return str;
    }

    /* JADX INFO: renamed from: i */
    public final void m73020i(String str) {
        f56365e = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m73021j(String str) {
        f56364d = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m73022k(String postId, String str, Context context, InterfaceC25149n0 lifecycleScope, String pageName, Function0 function0) {
        Intrinsics.m97802h(postId, "postId");
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(lifecycleScope, "lifecycleScope");
        Intrinsics.m97802h(pageName, "pageName");
        AbstractC25136k.m99058d(lifecycleScope, null, null, new NegativeFeedbackHelper$show$1(context, pageName, postId, str, lifecycleScope, function0, null), 3, null);
    }
}
