package com.transsion.postdetail.p306ui.fragment;

import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$drawable;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p844vo.C28164n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0003¨\u0006\r"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/PostImageTextDetailFragment;", "Lcom/transsion/postdetail/ui/fragment/PostDetailCommonFragment;", "<init>", "()V", "", "getPageName", "()Ljava/lang/String;", "", "G0", "initAudioListener", "F0", CampaignEx.JSON_KEY_AD_K, "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PostImageTextDetailFragment extends PostDetailCommonFragment {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostImageTextDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PostImageTextDetailFragment m74402a(String str, boolean z11, String str2, PostSubjectItem postSubjectItem, String str3) {
            PostImageTextDetailFragment postImageTextDetailFragment = new PostImageTextDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putBoolean("from_comment", z11);
            bundle.putString("rec_ops", str2);
            postImageTextDetailFragment.setArguments(bundle);
            return postImageTextDetailFragment;
        }
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment
    /* JADX INFO: renamed from: F0 */
    public void mo74283F0() {
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment
    /* JADX INFO: renamed from: G0 */
    public void mo74284G0() {
        AppCompatImageView appCompatImageView;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatImageView = mViewBinding.f86550o) == null) {
            return;
        }
        appCompatImageView.setImageResource(R$drawable.libui_ic_base_left);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment
    public String getPageName() {
        return "postdetail_image_text";
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment
    public void initAudioListener() {
    }
}
