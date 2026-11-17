package com.transsion.postdetail.shorttv.factory;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import kotlin.jvm.internal.Intrinsics;
import p848vs.InterfaceC28220k;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C16896k implements InterfaceC28220k {

    /* JADX INFO: renamed from: a */
    private ShareDialogFragment f56783a;

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.k$a */
    public static final class a implements InterfaceC18701a {
        a() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: c */
        public void mo70523c(String url, String fileName, String fileSize, String fileImage) {
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(fileName, "fileName");
            Intrinsics.m97802h(fileSize, "fileSize");
            Intrinsics.m97802h(fileImage, "fileImage");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: d */
        public void mo70524d(String id2) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: e */
        public void mo70525e(String str) {
            InterfaceC18701a.a.m78649c(this, str);
        }
    }

    /* JADX INFO: renamed from: b */
    private final ShareDialogFragment m73717b(String str, String str2, String str3) {
        return ShareDialogFragment.INSTANCE.m78645a(PostType.SHORT_TV_TYPE, str, "", "TYPE_SUBJECT", (3328 & 16) != 0 ? "" : str2, (3328 & 32) != 0 ? "" : null, (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : false, (3328 & 256) != 0 ? false : false, str3, (3328 & 1024) != 0 ? "" : null, (3328 & 2048) != 0 ? "" : null);
    }

    @Override // p848vs.InterfaceC28220k
    /* JADX INFO: renamed from: a */
    public void mo73718a(Fragment fragment, String str, String str2, String pageName) {
        ShareDialogFragment shareDialogFragment;
        Intrinsics.m97802h(pageName, "pageName");
        if (this.f56783a == null) {
            if (str == null) {
                str = "";
            }
            ShareDialogFragment shareDialogFragmentM73717b = m73717b(str, str2, pageName);
            this.f56783a = shareDialogFragmentM73717b;
            if (shareDialogFragmentM73717b != null) {
                shareDialogFragmentM73717b.m78642G0(new a());
            }
        }
        if (fragment != null) {
            try {
                if (fragment.isAdded()) {
                    FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                    childFragmentManager.m14537g0();
                    ShareDialogFragment shareDialogFragment2 = this.f56783a;
                    if ((shareDialogFragment2 == null || !shareDialogFragment2.isAdded()) && childFragmentManager.m14547k0("share") == null && (shareDialogFragment = this.f56783a) != null) {
                        shareDialogFragment.show(childFragmentManager, "share");
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
