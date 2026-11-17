package com.transsion.videodetail.music.adapter;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.p291db.music.MusicLikedDbBean;
import com.transsion.videodetail.R$drawable;
import com.transsion.videodetail.R$id;
import com.transsion.videodetail.R$layout;
import com.transsion.videodetail.music.bean.MusicLikedItemStateEnum;
import com.transsion.videodetail.music.bean.MusicLikedMultiItemEntity;
import com.transsion.videodetail.music.bean.MusicLikedUITypeEnum;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p626nx.C26116a;
import p626nx.C26117b;
import p743rh.C27287m;

/* JADX INFO: renamed from: com.transsion.videodetail.music.adapter.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C20979c extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final MusicLikedUITypeEnum f65796e;

    public C20979c(MusicLikedUITypeEnum uiType) {
        Intrinsics.m97802h(uiType, "uiType");
        this.f65796e = uiType;
    }

    /* JADX INFO: renamed from: A */
    private final void m86189A(BaseViewHolder baseViewHolder, MusicLikedMultiItemEntity musicLikedMultiItemEntity) {
        String coverUrl;
        ShapeableImageView shapeableImageView = (ShapeableImageView) baseViewHolder.getView(R$id.ivCover);
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
        MusicLikedDbBean musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean();
        if (musicLikedDbBean == null || (coverUrl = musicLikedDbBean.getCoverUrl()) == null) {
            coverUrl = "";
        }
        bVarM94457m.m94468g(coverUrl).m94465d(shapeableImageView);
        MusicLikedDbBean musicLikedDbBean2 = musicLikedMultiItemEntity.getMusicLikedDbBean();
        if (!TextUtils.isEmpty(musicLikedDbBean2 != null ? musicLikedDbBean2.getPath() : null) || C27287m.f83003a.m106330e()) {
            shapeableImageView.setAlpha(1.0f);
        } else {
            shapeableImageView.setAlpha(0.5f);
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m86190B(BaseViewHolder baseViewHolder, MusicLikedMultiItemEntity musicLikedMultiItemEntity) {
        String strM102282a;
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvAuthor);
        MusicLikedDbBean musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean();
        if (TextUtils.isEmpty(musicLikedDbBean != null ? musicLikedDbBean.getSingerName() : null)) {
            C26117b c26117b = C26117b.f79713a;
            MusicLikedDbBean musicLikedDbBean2 = musicLikedMultiItemEntity.getMusicLikedDbBean();
            strM102282a = c26117b.m102282a((musicLikedDbBean2 != null ? musicLikedDbBean2.getDurationSeconds() : 0L) * ((long) 1000));
        } else {
            MusicLikedDbBean musicLikedDbBean3 = musicLikedMultiItemEntity.getMusicLikedDbBean();
            String singerName = musicLikedDbBean3 != null ? musicLikedDbBean3.getSingerName() : null;
            C26117b c26117b2 = C26117b.f79713a;
            MusicLikedDbBean musicLikedDbBean4 = musicLikedMultiItemEntity.getMusicLikedDbBean();
            strM102282a = singerName + " / " + c26117b2.m102282a((musicLikedDbBean4 != null ? musicLikedDbBean4.getDurationSeconds() : 0L) * ((long) 1000));
        }
        if (musicLikedMultiItemEntity.isDownloaded()) {
            C26116a.f79712a.m102281a(textView, "  " + strM102282a, AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.music_download_icon));
        } else {
            textView.setText(strM102282a);
        }
        MusicLikedDbBean musicLikedDbBean5 = musicLikedMultiItemEntity.getMusicLikedDbBean();
        textView.setAlpha((!TextUtils.isEmpty(musicLikedDbBean5 != null ? musicLikedDbBean5.getPath() : null) || C27287m.f83003a.m106330e()) ? 1.0f : 0.5f);
    }

    /* JADX INFO: renamed from: C */
    private final void m86191C(BaseViewHolder baseViewHolder, MusicLikedMultiItemEntity musicLikedMultiItemEntity) {
    }

    /* JADX INFO: renamed from: D */
    private final void m86192D(BaseViewHolder baseViewHolder, MusicLikedMultiItemEntity musicLikedMultiItemEntity) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) baseViewHolder.getView(R$id.ivState);
        appCompatImageView.setColorFilter(new PorterDuffColorFilter(AbstractC2397b.getColor(appCompatImageView.getContext(), R$color.brand), PorterDuff.Mode.SRC_ATOP));
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m112707constructorimpl(Glide.with(appCompatImageView.getContext()).load2(Integer.valueOf(R$drawable.video_detail_ic_playing)).into((ImageView) baseViewHolder.getView(R$id.ivState)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        appCompatImageView.setVisibility(musicLikedMultiItemEntity.getState() == MusicLikedItemStateEnum.PLAYING ? 0 : 8);
        baseViewHolder.getView(R$id.viewMask).setVisibility(appCompatImageView.getVisibility());
        MusicLikedDbBean musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean();
        appCompatImageView.setAlpha((!TextUtils.isEmpty(musicLikedDbBean != null ? musicLikedDbBean.getPath() : null) || C27287m.f83003a.m106330e()) ? 1.0f : 0.5f);
    }

    /* JADX INFO: renamed from: E */
    private final void m86193E(BaseViewHolder baseViewHolder, MusicLikedMultiItemEntity musicLikedMultiItemEntity) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) baseViewHolder.getView(R$id.tvTitle);
        MusicLikedDbBean musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean();
        appCompatTextView.setText(musicLikedDbBean != null ? musicLikedDbBean.getTitle() : null);
        if (musicLikedMultiItemEntity.getState() == MusicLikedItemStateEnum.PLAYING) {
            appCompatTextView.setTextColor(AbstractC2397b.getColor(appCompatTextView.getContext(), R$color.brand));
        } else {
            appCompatTextView.setTextColor(AbstractC2397b.getColor(appCompatTextView.getContext(), R$color.text_01));
        }
        MusicLikedDbBean musicLikedDbBean2 = musicLikedMultiItemEntity.getMusicLikedDbBean();
        appCompatTextView.setAlpha((!TextUtils.isEmpty(musicLikedDbBean2 != null ? musicLikedDbBean2.getPath() : null) || C27287m.f83003a.m106330e()) ? 1.0f : 0.5f);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_music_liked_provider_layout;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, MusicLikedMultiItemEntity item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        m86189A(helper, item);
        m86192D(helper, item);
        m86193E(helper, item);
        m86190B(helper, item);
        m86191C(helper, item);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo36334f(BaseViewHolder helper, MusicLikedMultiItemEntity item, List payloads) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36334f(helper, item, payloads);
        m86192D(helper, item);
        m86193E(helper, item);
    }
}
