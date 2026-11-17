package com.transsion.search_pugc.speech;

import android.speech.SpeechRecognizer;
import com.blankj.utilcode.util.Utils;

/* JADX INFO: renamed from: com.transsion.search_pugc.speech.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C18683g {

    /* JADX INFO: renamed from: a */
    public static final C18683g f60329a = new C18683g();

    private C18683g() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78586a() {
        return SpeechRecognizer.isRecognitionAvailable(Utils.m27275a());
    }
}
