package com.transsion.room.sub.adapter.subscription;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$string;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.sub.bean.subscription.UserInfoFollowings;
import com.transsion.room.sub.bean.subscription.UserItemFollowings;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p743rh.C27287m;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p840vj.C28117b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.room.sub.adapter.subscription.s */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001e\u001fB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, m97100d2 = {"Lcom/transsion/room/sub/adapter/subscription/s;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/room/sub/bean/subscription/UserInfoFollowings;", "Lu6/i;", "", "data", "Lvj/b;", "exposureHelper", "", "showNumberTh", "<init>", "(Ljava/util/List;Lvj/b;Z)V", "", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/transsion/room/sub/adapter/subscription/b;", "itemClickListener", "", "Q1", "(Lcom/transsion/room/sub/adapter/subscription/b;)V", "G", "Lvj/b;", "H", "Z", "I", "Lcom/transsion/room/sub/adapter/subscription/b;", "clickListener", "J", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18215s extends BaseProviderMultiAdapter<UserInfoFollowings> implements InterfaceC27944i {

    /* JADX INFO: renamed from: K */
    private static final String f59422K = "FollowingsFeedAdapter";

    /* JADX INFO: renamed from: L */
    public static final int f59423L = 1;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28117b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean showNumberTh;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private InterfaceC18198b clickListener;

    /* JADX INFO: renamed from: com.transsion.room.sub.adapter.subscription.s$b */
    public static final class b extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final C28117b f59427e;

        /* JADX INFO: renamed from: f */
        private final boolean f59428f;

        /* JADX INFO: renamed from: g */
        private InterfaceC18198b f59429g;

        public b(C28117b c28117b, boolean z11) {
            this.f59427e = c28117b;
            this.f59428f = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public static final void m77173B(b bVar, UserInfoFollowings userInfoFollowings, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18198b interfaceC18198b = bVar.f59429g;
            if (interfaceC18198b != null) {
                UserItemFollowings userInfo = userInfoFollowings.getUserInfo();
                interfaceC18198b.mo77133b(userInfo != null ? userInfo.getUserId() : null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: C */
        public static final void m77174C(b bVar, UserInfoFollowings userInfoFollowings, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18198b interfaceC18198b = bVar.f59429g;
            if (interfaceC18198b != null) {
                UserItemFollowings userInfo = userInfoFollowings.getUserInfo();
                interfaceC18198b.mo77133b(userInfo != null ? userInfo.getUserId() : null);
            }
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder holder, final UserInfoFollowings userItem) {
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(userItem, "userItem");
            ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.iv_avatar);
            if (shapeableImageView != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                UserItemFollowings userInfo = userItem.getUserInfo();
                bVarM94457m.m94468g(userInfo != null ? userInfo.getAvatar() : null).m94465d(shapeableImageView);
                shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18215s.b.m77173B(this.f59430a, userItem, view);
                    }
                });
            }
            C26866a.a.m104898f(C26866a.f81698a, C18215s.f59422K, "tv_name " + userItem, false, 4, null);
            LinearLayout linearLayout = (LinearLayout) holder.getViewOrNull(R$id.container);
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18215s.b.m77174C(this.f59432a, userItem, view);
                    }
                });
            }
            int i11 = R$id.tv_name;
            UserItemFollowings userInfo2 = userItem.getUserInfo();
            holder.setText(i11, userInfo2 != null ? userInfo2.getNickname() : null);
            TextView textView = (TextView) holder.getViewOrNull(R$id.tv_name);
            if (textView != null) {
                textView.setVisibility(0);
            }
            GradientTextView gradientTextView = (GradientTextView) holder.getViewOrNull(R$id.tv_new_video);
            if (gradientTextView != null) {
                if (userItem.getHasUnread()) {
                    gradientTextView.setVisibility(0);
                } else {
                    gradientTextView.setVisibility(8);
                }
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m77178D(InterfaceC18198b interfaceC18198b) {
            this.f59429g = interfaceC18198b;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.item_subscription_list;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18215s(List<UserInfoFollowings> data, C28117b c28117b, boolean z11) {
        super(data);
        Intrinsics.m97802h(data, "data");
        this.exposureHelper = c28117b;
        this.showNumberTh = z11;
    }

    public /* synthetic */ C18215s(List list, C28117b c28117b, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, c28117b, (i11 & 4) != 0 ? false : z11);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends UserInfoFollowings> data, int position) {
        Intrinsics.m97802h(data, "data");
        return 1;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m77172Q1(InterfaceC18198b itemClickListener) {
        this.clickListener = itemClickListener;
        b bVar = new b(this.exposureHelper, this.showNumberTh);
        bVar.m77178D(this.clickListener);
        mo36107F1(bVar);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
