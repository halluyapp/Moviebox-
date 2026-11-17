package com.transsion.usercenter.message.adapter;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5789h;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.usercenter.R$color;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.message.bean.MessageEntity;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import tw.C27859a;
import tw.C27860b;

/* JADX INFO: renamed from: com.transsion.usercenter.message.adapter.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u001d\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006$"}, m97100d2 = {"Lcom/transsion/usercenter/message/adapter/a;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/usercenter/message/bean/MessageEntity;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "layoutResId", "<init>", "(I)V", "holder", WebConstants.FIELD_ITEM, "", "J1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/usercenter/message/bean/MessageEntity;)V", "G1", "K1", "B1", "I1", "D1", "C1", "H1", "Landroid/content/Context;", "context", "", "dpVal", "F1", "(Landroid/content/Context;F)F", "E1", "", "F", "Ljava/lang/String;", "LIKE_ITEM", "G", "LIKE_COMMENT_ITEM", "H", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20617a extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: I */
    public static final String f65080I = "SYSTEM";

    /* JADX INFO: renamed from: J */
    public static final String f65081J = "COMMENT";

    /* JADX INFO: renamed from: K */
    public static final String f65082K = "REPLY_COMMENT";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String LIKE_ITEM;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String LIKE_COMMENT_ITEM;

    public C20617a() {
        this(0, 1, null);
    }

    public C20617a(int i11) {
        super(i11, null, 2, null);
        this.LIKE_ITEM = "LIKE";
        this.LIKE_COMMENT_ITEM = "LIKE_COMMENT";
    }

    public /* synthetic */ C20617a(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? R$layout.item_message_comment : i11);
    }

    /* JADX INFO: renamed from: B1 */
    private final void m85102B1(BaseViewHolder holder, MessageEntity item) {
        holder.setText(R$id.tvContent, item.getContent());
        m85107I1(holder, item);
        m85103C1(holder, item);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m85103C1(BaseViewHolder holder, MessageEntity item) {
        int i11 = R$id.tvContent;
        String content = item.getContent();
        holder.setText(i11, content != null ? C27859a.f85653a.m108383a("", content, AbstractC5789h.m27406a(R$color.color_ff999999)) : null);
    }

    /* JADX INFO: renamed from: D1 */
    private final void m85104D1(BaseViewHolder holder, MessageEntity item) {
        View view = holder.getView(R$id.imAvatar);
        Intrinsics.m97800f(view, "null cannot be cast to non-null type com.google.android.material.imageview.ShapeableImageView");
        holder.setText(R$id.tvNickName, item.getNickname());
        holder.setText(R$id.tvTime, C27860b.f85654a.m108393b(Long.parseLong(item.getCreatedAt())));
        holder.setVisible(R$id.view_red_blank, Intrinsics.m97797c(item.getStatus(), "UNREAD"));
        int iM27313a = AbstractC5776a0.m27313a(48.0f);
        C23860f.f72909a.m94457m(getContext()).m94468g(item.getAvator()).m94474m(iM27313a).m94464c(iM27313a).m94465d((ShapeableImageView) view);
    }

    /* JADX INFO: renamed from: G1 */
    private final void m85105G1(BaseViewHolder holder, MessageEntity item) {
        holder.setText(R$id.tvContent, item.getContent());
        m85107I1(holder, item);
    }

    /* JADX INFO: renamed from: H1 */
    private final void m85106H1(BaseViewHolder holder, MessageEntity item) {
        int i11 = R$id.tvContent;
        String content = item.getContent();
        holder.setText(i11, content != null ? C27859a.f85653a.m108383a("", content, AbstractC5789h.m27406a(R$color.color_ff999999)) : null);
    }

    /* JADX INFO: renamed from: I1 */
    private final void m85107I1(BaseViewHolder holder, MessageEntity item) {
        View view = holder.getView(R$id.imCover);
        Intrinsics.m97800f(view, "null cannot be cast to non-null type android.widget.ImageView");
        int iM27313a = AbstractC5776a0.m27313a(56.0f);
        C23860f.f72909a.m94457m(getContext()).m94468g(item.getPicture()).m94470i(AbstractC5789h.m27406a(R$color.color_ff999999)).m94474m(iM27313a).m94464c(iM27313a).m94471j((int) m85111F1(getContext(), 2.0f)).m94465d((ImageView) view);
    }

    /* JADX INFO: renamed from: J1 */
    private final void m85108J1(BaseViewHolder holder, MessageEntity item) {
        holder.setText(R$id.tvContent, item.getContent());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX INFO: renamed from: K1 */
    private final void m85109K1(BaseViewHolder holder, MessageEntity item) {
        String type = item.getType();
        int iHashCode = type.hashCode();
        if (iHashCode != -1833998801) {
            if (iHashCode != 32166346) {
                if (iHashCode == 1668381247 && type.equals(f65081J)) {
                    m85103C1(holder, item);
                } else {
                    holder.setText(R$id.tvContent, item.getContent());
                }
            } else if (type.equals(f65082K)) {
                m85106H1(holder, item);
            } else {
                holder.setText(R$id.tvContent, item.getContent());
            }
        } else if (type.equals(f65080I)) {
            holder.setText(R$id.tvContent, item.getTitle());
        } else {
            holder.setText(R$id.tvContent, item.getContent());
        }
        m85107I1(holder, item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, MessageEntity item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        m85104D1(holder, item);
        m85109K1(holder, item);
    }

    /* JADX INFO: renamed from: F1 */
    public final float m85111F1(Context context, float dpVal) {
        Intrinsics.m97802h(context, "context");
        return TypedValue.applyDimension(1, dpVal, context.getApplicationContext().getResources().getDisplayMetrics());
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
