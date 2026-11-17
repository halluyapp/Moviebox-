package com.transsion.home.adapter.trending.provider;

import android.net.Uri;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.AbstractC2397b;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.flexbox.C9902d;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.p282tn.lib.widget.R$drawable;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14451b;
import com.transsion.home.R$id;
import com.transsion.home.adapter.trending.adapter.C15006a;
import com.transsion.moviedetailapi.bean.ExplainBean;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import org.json.JSONObject;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15028b extends BaseItemProvider {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m67270B(AbstractC15028b abstractC15028b, C15006a c15006a, Subject subject, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "view");
        abstractC15028b.m67271C(view, (ExplainBean) CollectionsKt.m97362l0(c15006a.getData(), i11), subject);
    }

    /* JADX INFO: renamed from: C */
    private final void m67271C(View view, ExplainBean explainBean, Subject subject) {
        String deeplink;
        Uri uriM65157g;
        if (explainBean == null || (deeplink = explainBean.getDeeplink()) == null || (uriM65157g = C14451b.f50862a.m65157g(Uri.parse(deeplink))) == null) {
            return;
        }
        String queryParameter = uriM65157g.getQueryParameter(NativeComponentConstants.KEY_COMPONENT_TYPE);
        if (queryParameter == null) {
            queryParameter = uriM65157g.getPath();
        }
        Navigator navigatorM61773c = TheRouter.m61773c(queryParameter);
        Set<String> setKeySet = navigatorM61773c.m61862m().keySet();
        Intrinsics.m97801g(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            Intrinsics.m97799e(str);
            if (StringsKt.m98132c0(str, "/movie/detail", false, 2, null) || StringsKt.m98132c0(str, "/playvideo/detail", false, 2, null)) {
                navigatorM61773c.m61857K("ops", m67273z("EXP", explainBean.getType(), subject));
            }
            navigatorM61773c.m61857K(str, navigatorM61773c.m61862m().getString(str));
        }
        Navigator.m61845x(navigatorM61773c, view.getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: z */
    private final String m67273z(String str, String str2, Subject subject) {
        String ops;
        String ops2;
        if (subject != null) {
            try {
                ops = subject.getOps();
            } catch (Exception e11) {
                e11.printStackTrace();
                return subject != null ? subject.getOps() : null;
            }
        } else {
            ops = null;
        }
        JSONObject jSONObject = (ops == null || ops.length() == 0 || subject == null || (ops2 = subject.getOps()) == null) ? new JSONObject() : new JSONObject(ops2);
        jSONObject.put("rec_type", str);
        jSONObject.put("label", str2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: A */
    public final void m67274A(BaseViewHolder helper, final Subject item) {
        String postTitle;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) helper.getViewOrNull(R$id.post_title_container);
        if (linearLayoutCompat != null) {
            String postTitle2 = item.getPostTitle();
            if (postTitle2 == null || postTitle2.length() == 0 || ((postTitle = item.getPostTitle()) != null && StringsKt.m98242W(postTitle, "Trailer-", false, 2, null))) {
                AbstractC26006c.m102054g(linearLayoutCompat);
                View viewOrNull = helper.getViewOrNull(R$id.tag_divider);
                if (viewOrNull != null) {
                    AbstractC26006c.m102054g(viewOrNull);
                }
            } else {
                AbstractC26006c.m102058k(linearLayoutCompat);
                View viewOrNull2 = helper.getViewOrNull(R$id.tag_divider);
                if (viewOrNull2 != null) {
                    AbstractC26006c.m102058k(viewOrNull2);
                }
            }
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getViewOrNull(R$id.postTitle);
        if (appCompatTextView != null) {
            appCompatTextView.setText(item.getPostTitle());
        }
        RecyclerView recyclerView = (RecyclerView) helper.getViewOrNull(R$id.tag_list);
        if (recyclerView != null) {
            List<ExplainBean> explains = item.getExplains();
            if (explains == null || explains.isEmpty()) {
                AbstractC26006c.m102054g(recyclerView);
                View viewOrNull3 = helper.getViewOrNull(R$id.tag_divider);
                if (viewOrNull3 != null) {
                    AbstractC26006c.m102054g(viewOrNull3);
                    return;
                }
                return;
            }
            AbstractC26006c.m102058k(recyclerView);
            List<ExplainBean> explains2 = item.getExplains();
            if (explains2 != null) {
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
                if (recyclerView.getItemDecorationCount() == 0) {
                    C9902d c9902d = new C9902d(recyclerView.getContext());
                    c9902d.m44967i(AbstractC2397b.getDrawable(recyclerView.getContext(), R$drawable.divider_flexbox));
                    recyclerView.addItemDecoration(c9902d);
                }
                flexboxLayoutManager.m44836b0(0);
                flexboxLayoutManager.m44838d0(1);
                flexboxLayoutManager.m44837c0(0);
                recyclerView.setLayoutManager(flexboxLayoutManager);
                final C15006a c15006a = new C15006a(explains2);
                c15006a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.adapter.trending.provider.a
                    @Override // p765s6.InterfaceC27566d
                    /* JADX INFO: renamed from: a */
                    public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                        AbstractC15028b.m67270B(this.f52496a, c15006a, item, baseQuickAdapter, view, i11);
                    }
                });
                recyclerView.setAdapter(c15006a);
            }
        }
    }
}
