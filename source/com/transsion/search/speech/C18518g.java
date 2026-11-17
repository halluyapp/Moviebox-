package com.transsion.search.speech;

import android.speech.SpeechRecognizer;
import com.blankj.utilcode.util.Utils;

/* JADX INFO: renamed from: com.transsion.search.speech.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C18518g {

    /* JADX INFO: renamed from: a */
    public static final C18518g f59988a = new C18518g();

    private C18518g() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78052a() {
        return SpeechRecognizer.isRecognitionAvailable(Utils.m27275a());
    }
}
