package com.transsion.usercenter.profile.see.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$mipmap;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.StaffType;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.profile.see.bean.ProfileSeeStaffItem;
import com.transsion.usercenter.profile.see.bean.ProfileSeeSubjectItem;
import com.transsion.usercenter.profile.see.bean.ProfileSeeTimeItem;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p620nn.C26038e;
import p697q6.InterfaceC27022a;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.see.adapter.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\r\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/usercenter/profile/see/adapter/a;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lq6/a;", "Lu6/i;", "<init>", "()V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "G", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20753a extends BaseProviderMultiAdapter<InterfaceC27022a> implements InterfaceC27944i {

    /* JADX INFO: renamed from: H */
    public static final int f65335H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f65336I = 2;

    /* JADX INFO: renamed from: J */
    public static final int f65337J = 3;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.see.adapter.a$b */
    public static final class b extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final int f65338e = AbstractC5776a0.m27313a(72.0f);

        /* JADX INFO: renamed from: f */
        private final int f65339f = AbstractC5776a0.m27313a(98.0f);

        /* JADX INFO: renamed from: A */
        private final void m85506A(final BaseViewHolder baseViewHolder, final ProfileSeeSubjectItem profileSeeSubjectItem) {
            AbstractC26006c.m102054g((AppCompatTextView) baseViewHolder.getView(R$id.desTv));
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.see.adapter.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20753a.b.m85507B(profileSeeSubjectItem, this, baseViewHolder, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public static final void m85507B(ProfileSeeSubjectItem profileSeeSubjectItem, b bVar, BaseViewHolder baseViewHolder, View view) {
            if (C14557c.f51100a.m65671a(view.getId(), 1000L)) {
                return;
            }
            Integer subjectType = profileSeeSubjectItem.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType == null || subjectType.intValue() != value) {
                Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
                Integer subjectType2 = profileSeeSubjectItem.getSubjectType();
                Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType2 != null ? subjectType2.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", profileSeeSubjectItem.getSubjectId()).m61857K("ops", profileSeeSubjectItem.getOps()), baseViewHolder.itemView.getContext(), null, 2, null);
            } else {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context contextM36338k = bVar.m36338k();
                Intrinsics.m97800f(contextM36338k, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                downloadManagerApiM87093a.m87086d0((FragmentActivity) contextM36338k, "movie_audio_archies", (384 & 4) != 0 ? "" : "", profileSeeSubjectItem.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : profileSeeSubjectItem, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
            }
        }

        /* JADX INFO: renamed from: C */
        private final void m85508C(BaseViewHolder baseViewHolder, ProfileSeeSubjectItem profileSeeSubjectItem) {
            String url;
            String thumbnail;
            ImageView imageView = (ImageView) baseViewHolder.getView(R$id.coverIv);
            C23860f.a aVar = C23860f.f72909a;
            Context context = imageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            Cover cover = profileSeeSubjectItem.getCover();
            String str = "";
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94464c = bVarM94457m.m94468g(url).m94474m(this.f65338e).m94464c(this.f65339f);
            Cover cover2 = profileSeeSubjectItem.getCover();
            if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
                str = thumbnail;
            }
            bVarM94464c.m94473l(str).m94465d(imageView);
            baseViewHolder.setText(R$id.nameTv, profileSeeSubjectItem.getTitle());
            baseViewHolder.setText(R$id.maskTv, profileSeeSubjectItem.getCorner());
            View view = baseViewHolder.getView(R$id.maskTv);
            String corner = profileSeeSubjectItem.getCorner();
            view.setVisibility(corner == null || corner.length() == 0 ? 8 : 0);
            ((AppCompatTextView) baseViewHolder.getView(R$id.tagTv)).setText(C26038e.f79537a.m102108f(profileSeeSubjectItem));
            AbstractC26006c.m102054g(baseViewHolder.getView(R$id.desTv));
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 2;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.profile_item_see_content;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder helper, InterfaceC27022a item) {
            Intrinsics.m97802h(helper, "helper");
            Intrinsics.m97802h(item, "item");
            ProfileSeeSubjectItem profileSeeSubjectItem = (ProfileSeeSubjectItem) item;
            m85508C(helper, profileSeeSubjectItem);
            m85506A(helper, profileSeeSubjectItem);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.see.adapter.a$c */
    public static final class c extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final int f65340e = AbstractC5776a0.m27313a(72.0f);

        /* JADX INFO: renamed from: f */
        private final int f65341f = AbstractC5776a0.m27313a(98.0f);

        /* JADX INFO: renamed from: A */
        private final void m85511A(final BaseViewHolder baseViewHolder, final ProfileSeeStaffItem profileSeeStaffItem) {
            ((ImageView) baseViewHolder.getView(R$id.jumpTv)).setImageResource(R$mipmap.ic_btn_arrow_transparent);
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.see.adapter.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20753a.c.m85512B(profileSeeStaffItem, baseViewHolder, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public static final void m85512B(ProfileSeeStaffItem profileSeeStaffItem, BaseViewHolder baseViewHolder, View view) {
            if (C14557c.f51100a.m65671a(view.getId(), 1000L)) {
                return;
            }
            Navigator.m61845x(TheRouter.m61773c("/movie/staff").m61856J("staff", profileSeeStaffItem), baseViewHolder.itemView.getContext(), null, 2, null);
        }

        /* JADX INFO: renamed from: C */
        private final void m85513C(BaseViewHolder baseViewHolder, ProfileSeeStaffItem profileSeeStaffItem) {
            ImageView imageView = (ImageView) baseViewHolder.getView(R$id.coverIv);
            C23860f.a aVar = C23860f.f72909a;
            Context context = imageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            String avatarUrl = profileSeeStaffItem.getAvatarUrl();
            String str = "";
            if (avatarUrl == null) {
                avatarUrl = "";
            }
            bVarM94457m.m94468g(avatarUrl).m94470i(com.transsion.usercenter.R$mipmap.profile_staff_default_avatar).m94474m(this.f65340e).m94464c(this.f65341f).m94465d(imageView);
            baseViewHolder.setText(R$id.nameTv, profileSeeStaffItem.getName());
            baseViewHolder.getView(R$id.maskTv).setVisibility(8);
            AppCompatTextView appCompatTextView = (AppCompatTextView) baseViewHolder.getView(R$id.tagTv);
            List<StaffType> staffTypes = profileSeeStaffItem.getStaffTypes();
            if (staffTypes != null) {
                for (StaffType staffType : staffTypes) {
                    if (str.length() > 0) {
                        str = ((Object) str) + " I ";
                    }
                    str = ((Object) str) + staffType.getName();
                }
            }
            appCompatTextView.setTextColor(m36338k().getResources().getColor(R$color.white_60));
            appCompatTextView.setText(str);
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(com.transsion.usercenter.R$mipmap.profile_ic_staff, 0, 0, 0);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) baseViewHolder.getView(R$id.desTv);
            appCompatTextView2.setText(profileSeeStaffItem.getDescription());
            String description = profileSeeStaffItem.getDescription();
            appCompatTextView2.setVisibility(description == null || description.length() == 0 ? 8 : 0);
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 3;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.profile_item_see_content;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder helper, InterfaceC27022a item) {
            Intrinsics.m97802h(helper, "helper");
            Intrinsics.m97802h(item, "item");
            ProfileSeeStaffItem profileSeeStaffItem = (ProfileSeeStaffItem) item;
            m85513C(helper, profileSeeStaffItem);
            m85511A(helper, profileSeeStaffItem);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.see.adapter.a$d */
    public static final class d extends BaseItemProvider {
        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.profile_item_see_time;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder helper, InterfaceC27022a item) {
            Intrinsics.m97802h(helper, "helper");
            Intrinsics.m97802h(item, "item");
            ((TextView) helper.getView(R$id.tv_time)).setText(((ProfileSeeTimeItem) item).getDate());
        }
    }

    public C20753a() {
        super(null, 1, null);
        mo36107F1(new d());
        mo36107F1(new b());
        mo36107F1(new c());
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends InterfaceC27022a> data, int position) {
        Intrinsics.m97802h(data, "data");
        return data.get(position).getItemType();
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
