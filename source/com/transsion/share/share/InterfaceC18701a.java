package com.transsion.share.share;

import com.transsion.share.bean.PostType;

/* JADX INFO: renamed from: com.transsion.share.share.a */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC18701a {

    /* JADX INFO: renamed from: com.transsion.share.share.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78647a(InterfaceC18701a interfaceC18701a, String str, PostType postType, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i11 & 2) != 0) {
                postType = null;
            }
            interfaceC18701a.mo70521a(str, postType);
        }

        /* JADX INFO: renamed from: b */
        public static void m78648b(InterfaceC18701a interfaceC18701a, String str) {
        }

        /* JADX INFO: renamed from: c */
        public static void m78649c(InterfaceC18701a interfaceC18701a, String str) {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo70521a(String str, PostType postType);

    /* JADX INFO: renamed from: b */
    void mo70522b(String str);

    /* JADX INFO: renamed from: c */
    void mo70523c(String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: d */
    void mo70524d(String str);

    /* JADX INFO: renamed from: e */
    void mo70525e(String str);
}
