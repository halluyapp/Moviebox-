package com.transsion.home.adapter.suboperate.provider;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.edcation.bean.CourseBean;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p842vl.AbstractC28126h;

/* JADX INFO: loaded from: classes5.dex */
public final class SubMyCourseProvider extends BaseItemProvider implements InterfaceC3194f {

    /* JADX INFO: renamed from: e */
    private final int f52286e;

    /* JADX INFO: renamed from: f */
    private InterfaceC25204t1 f52287f;

    /* JADX INFO: renamed from: g */
    private BaseViewHolder f52288g;

    /* JADX INFO: renamed from: h */
    private CourseBean f52289h;

    /* JADX INFO: renamed from: i */
    private final Lazy f52290i = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.suboperate.provider.e0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubMyCourseProvider.m67061P();
        }
    });

    public SubMyCourseProvider(int i11) {
        this.f52286e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m67057L(BaseViewHolder baseViewHolder, View view) {
        Navigator.m61845x(TheRouter.m61773c("/edu/courseList"), baseViewHolder.itemView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m67058M(SubMyCourseProvider subMyCourseProvider, BaseViewHolder baseViewHolder, OperateItem operateItem, View view) {
        Navigator.m61845x(TheRouter.m61773c("/home/filter").m61852F("tabId", subMyCourseProvider.f52286e), baseViewHolder.itemView.getContext(), null, 2, null);
        subMyCourseProvider.m67065T("click_my_course_explore", operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m67059N(SubMyCourseProvider subMyCourseProvider, OperateItem operateItem, View view) {
        CourseBean courseBean = subMyCourseProvider.f52289h;
        if ((courseBean != null ? courseBean.getSubjectId() : null) != null) {
            CourseBean courseBean2 = subMyCourseProvider.f52289h;
            String subjectId = courseBean2 != null ? courseBean2.getSubjectId() : null;
            CourseBean courseBean3 = subMyCourseProvider.f52289h;
            AbstractC28126h.m109239f(new Subject(subjectId, courseBean3 != null ? courseBean3.getSubjectType() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -4, 67108863, null), "operation_course");
        }
        subMyCourseProvider.m67065T("click_my_course_learn", operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final VideoDetailPlayDao m67060O() {
        return (VideoDetailPlayDao) this.f52290i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final VideoDetailPlayDao m67061P() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m67062Q(SubMyCourseProvider subMyCourseProvider) {
        subMyCourseProvider.m67068W();
    }

    /* JADX INFO: renamed from: R */
    private final void m67063R() {
        this.f52287f = AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubMyCourseProvider$registerCourse$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: S */
    private final void m67064S(OperateItem operateItem) {
        HashMap map = new HashMap();
        map.put("event_type", "browse_my_course");
        map.put(CampaignEx.JSON_KEY_TITLE, String.valueOf(operateItem.getTitle()));
        map.put("tabId", String.valueOf(this.f52286e));
        C14450a.f50860a.m65138a(SubTabFragment.INSTANCE.m68282a(this.f52286e), map);
    }

    /* JADX INFO: renamed from: T */
    private final void m67065T(String str, OperateItem operateItem) {
        String subjectId;
        HashMap map = new HashMap();
        map.put("event_type", str);
        map.put(CampaignEx.JSON_KEY_TITLE, String.valueOf(operateItem.getTitle()));
        map.put("tabId", String.valueOf(this.f52286e));
        CourseBean courseBean = this.f52289h;
        if (courseBean == null || (subjectId = courseBean.getSubjectId()) == null) {
            subjectId = "";
        }
        map.put("subjectId", subjectId);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52286e), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final void m67066U(final BaseViewHolder baseViewHolder, final float f11) {
        TextView textView;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String str = String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(f11)}, 1));
        Intrinsics.m97801g(str, "format(...)");
        String str2 = str + "%";
        if (baseViewHolder != null && (textView = (TextView) baseViewHolder.getView(R$id.sub_operation_course_item_percent_text)) != null) {
            textView.setText(str2);
        }
        final View view = baseViewHolder != null ? baseViewHolder.getView(R$id.sub_operation_course_item_percent_bg) : null;
        if (view != null) {
            view.post(new Runnable() { // from class: com.transsion.home.adapter.suboperate.provider.i0
                @Override // java.lang.Runnable
                public final void run() {
                    SubMyCourseProvider.m67067V(baseViewHolder, view, f11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m67067V(BaseViewHolder baseViewHolder, View view, float f11) {
        View view2 = baseViewHolder.getView(R$id.sub_operation_course_item_percent_view);
        view2.getLayoutParams().width = (int) ((view.getWidth() * f11) / 100);
        view2.setLayoutParams(view2.getLayoutParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final void m67068W() {
        TextView textView;
        String title;
        ImageView imageView;
        String url;
        String thumbnail;
        Cover cover;
        Cover cover2;
        View view;
        View view2;
        View view3;
        View view4;
        if (this.f52289h == null) {
            BaseViewHolder baseViewHolder = this.f52288g;
            if (baseViewHolder != null && (view4 = baseViewHolder.getView(R$id.sub_operation_course_start_liner)) != null) {
                AbstractC26006c.m102058k(view4);
            }
            BaseViewHolder baseViewHolder2 = this.f52288g;
            if (baseViewHolder2 == null || (view3 = baseViewHolder2.getView(R$id.sub_operation_course_item_liner)) == null) {
                return;
            }
            AbstractC26006c.m102055h(view3);
            return;
        }
        BaseViewHolder baseViewHolder3 = this.f52288g;
        if (baseViewHolder3 != null && (view2 = baseViewHolder3.getView(R$id.sub_operation_course_start_liner)) != null) {
            AbstractC26006c.m102055h(view2);
        }
        BaseViewHolder baseViewHolder4 = this.f52288g;
        if (baseViewHolder4 != null && (view = baseViewHolder4.getView(R$id.sub_operation_course_item_liner)) != null) {
            AbstractC26006c.m102058k(view);
        }
        BaseViewHolder baseViewHolder5 = this.f52288g;
        String str = "";
        if (baseViewHolder5 != null && (imageView = (ImageView) baseViewHolder5.getView(R$id.sub_operation_course_item_image)) != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = imageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            CourseBean courseBean = this.f52289h;
            if (courseBean == null || (cover2 = courseBean.getCover()) == null || (url = cover2.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            CourseBean courseBean2 = this.f52289h;
            if (courseBean2 == null || (cover = courseBean2.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94468g.m94473l(thumbnail).m94474m(imageView.getWidth()).m94465d(imageView);
        }
        CourseBean courseBean3 = this.f52289h;
        if (courseBean3 != null && (title = courseBean3.getTitle()) != null) {
            str = title;
        }
        BaseViewHolder baseViewHolder6 = this.f52288g;
        if (baseViewHolder6 != null && (textView = (TextView) baseViewHolder6.getView(R$id.sub_operation_course_item_title_text)) != null) {
            textView.setText(str);
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubMyCourseProvider$updateCurrentCourse$2(this, null), 3, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        helper.getView(R$id.sub_operation_course_title).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubMyCourseProvider.m67057L(helper, view);
            }
        });
        helper.getView(R$id.sub_operation_course_explore).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubMyCourseProvider.m67058M(this.f52332a, helper, item, view);
            }
        });
        helper.getView(R$id.sub_operation_course_learn).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubMyCourseProvider.m67059N(this.f52337a, item, view);
            }
        });
        m67064S(item);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.MY_COURSE.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_my_course;
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14896a(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onDestroy(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14897b(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onPause(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14898c(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public void onResume(InterfaceC3224u owner) {
        Intrinsics.m97802h(owner, "owner");
        AbstractC3192e.m14899d(this, owner);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.transsion.home.adapter.suboperate.provider.d0
            @Override // java.lang.Runnable
            public final void run() {
                SubMyCourseProvider.m67062Q(this.f52327a);
            }
        }, 1000L);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onStart(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14900e(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onStop(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14901f(this, interfaceC3224u);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: t */
    public void mo36344t(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36344t(holder);
        this.f52288g = holder;
        if (this.f52287f == null) {
            m67063R();
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        this.f52288g = null;
        InterfaceC25204t1 interfaceC25204t1 = this.f52287f;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f52287f = null;
    }
}
