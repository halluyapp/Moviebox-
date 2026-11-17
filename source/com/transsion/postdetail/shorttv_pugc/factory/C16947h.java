package com.transsion.postdetail.shorttv_pugc.factory;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.usercenterapi.ReportType;
import kotlin.jvm.internal.Intrinsics;
import p920xt.InterfaceC28663h;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16947h implements InterfaceC28663h {

    /* JADX INFO: renamed from: a */
    private ShareDialogFragment f56869a;

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.h$a */
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
    private final ShareDialogFragment m73815b(String str, String str2, String str3) {
        return ShareDialogFragment.INSTANCE.m78645a(PostType.UGC_SHORT_TV, str, "", ReportType.UFC_VIDEO.getValue(), (3328 & 16) != 0 ? "" : str2, (3328 & 32) != 0 ? "" : null, (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : false, (3328 & 256) != 0 ? false : false, str3, (3328 & 1024) != 0 ? "" : null, (3328 & 2048) != 0 ? "" : null);
    }

    @Override // p920xt.InterfaceC28663h
    /* JADX INFO: renamed from: a */
    public void mo73816a(Fragment fragment, String str, String str2, String pageName) {
        ShareDialogFragment shareDialogFragment;
        Intrinsics.m97802h(pageName, "pageName");
        if (this.f56869a == null) {
            if (str == null) {
                str = "";
            }
            ShareDialogFragment shareDialogFragmentM73815b = m73815b(str, str2, pageName);
            this.f56869a = shareDialogFragmentM73815b;
            if (shareDialogFragmentM73815b != null) {
                shareDialogFragmentM73815b.m78642G0(new a());
            }
        }
        if (fragment != null) {
            try {
                if (fragment.isAdded()) {
                    FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                    childFragmentManager.m14537g0();
                    ShareDialogFragment shareDialogFragment2 = this.f56869a;
                    if ((shareDialogFragment2 == null || !shareDialogFragment2.isAdded()) && childFragmentManager.m14547k0("share") == null && (shareDialogFragment = this.f56869a) != null) {
                        shareDialogFragment.show(childFragmentManager, "share");
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
