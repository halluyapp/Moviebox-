package com.transsion.baseui.util;

import com.blankj.utilcode.util.Utils;
import com.transsion.baseui.R$layout;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p944yh.C28951b;

/* JADX INFO: renamed from: com.transsion.baseui.util.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14567m {
    /* JADX INFO: renamed from: a */
    public static final void m65694a(int i11) {
        try {
            Result.Companion companion = Result.INSTANCE;
            C28951b.a aVar = C28951b.f88586a;
            int i12 = R$layout.base_layout_new_info_toast;
            String string = Utils.m27275a().getString(i11);
            Intrinsics.m97801g(string, "getString(...)");
            aVar.m111457g(i12, string, (24 & 4) != 0 ? 0 : 0, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m65695b(String str) {
        Intrinsics.m97802h(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            C28951b.f88586a.m111457g(R$layout.base_layout_new_info_toast, str, (24 & 4) != 0 ? 0 : 0, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m65696c(int i11) {
        try {
            Result.Companion companion = Result.INSTANCE;
            C28951b.a aVar = C28951b.f88586a;
            int i12 = R$layout.base_layout_new_success_toast;
            String string = Utils.m27275a().getString(i11);
            Intrinsics.m97801g(string, "getString(...)");
            aVar.m111457g(i12, string, (24 & 4) != 0 ? 0 : 0, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m65697d(String str) {
        Intrinsics.m97802h(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            C28951b.f88586a.m111457g(R$layout.base_layout_new_success_toast, str, (24 & 4) != 0 ? 0 : 0, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m65698e(int i11) {
        try {
            Result.Companion companion = Result.INSTANCE;
            C28951b.a aVar = C28951b.f88586a;
            int i12 = R$layout.base_layout_new_warn_toast;
            String string = Utils.m27275a().getString(i11);
            Intrinsics.m97801g(string, "getString(...)");
            aVar.m111457g(i12, string, (24 & 4) != 0 ? 0 : 0, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m65699f(String str) {
        Intrinsics.m97802h(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            C28951b.f88586a.m111457g(R$layout.base_layout_new_warn_toast, str, (24 & 4) != 0 ? 0 : 0, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }
}
