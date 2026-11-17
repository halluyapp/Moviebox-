package com.transsion.postdetail.comment;

import android.text.Editable;
import android.text.TextWatcher;
import com.transsion.moviedetailapi.bean.CommentBean;

/* JADX INFO: renamed from: com.transsion.postdetail.comment.i0 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC16736i0 extends TextWatcher {

    /* JADX INFO: renamed from: com.transsion.postdetail.comment.i0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m72890a(InterfaceC16736i0 interfaceC16736i0, Editable editable) {
        }

        /* JADX INFO: renamed from: b */
        public static void m72891b(InterfaceC16736i0 interfaceC16736i0, CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: F */
    void mo72888F();

    /* JADX INFO: renamed from: T */
    void mo72889T(Editable editable, CommentBean commentBean);

    @Override // android.text.TextWatcher
    void afterTextChanged(Editable editable);

    @Override // android.text.TextWatcher
    void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13);
}
