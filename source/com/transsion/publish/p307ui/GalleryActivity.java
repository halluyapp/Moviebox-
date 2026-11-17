package com.transsion.publish.p307ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.publish.C17602n;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$string;
import com.transsion.publish.adapter.C17575o0;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.bean.BigImageBean;
import com.transsion.publish.bean.PreviewMediaConfirmEvent;
import com.transsion.publish.view.FixedViewPager;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jp.C24453c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p550kj.C24655b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u0004J\u0019\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0014¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u0018J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:¨\u0006?"}, m97100d2 = {"Lcom/transsion/publish/ui/GalleryActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Ljp/c;", "<init>", "()V", "", "initView", "Lcom/transsion/publish/api/PhotoEntity;", "photoEntity", "t0", "(Lcom/transsion/publish/api/PhotoEntity;)V", "v0", "s0", "initData", "o0", "info", "", ToolBar.REFRESH, "q0", "(Lcom/transsion/publish/api/PhotoEntity;Z)V", "i0", "u0", "w0", "r0", "()Z", "", RequestParameters.POSITION, "h0", "(I)V", "", "j0", "(Lcom/transsion/publish/api/PhotoEntity;)Ljava/lang/String;", "g0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "k0", "()Ljp/c;", "onDestroy", "isTranslucent", "isStatusDark", "isChangeStatusBar", "onBackPressed", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "a", "Ljava/util/List;", "photos", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "select", "Lcom/transsion/publish/adapter/o0;", "c", "Lcom/transsion/publish/adapter/o0;", "travelsGalleryAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "from", "e", "limit", "f", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class GalleryActivity extends BaseActivity<C24453c> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C17575o0 travelsGalleryAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int from;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List photos = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List select = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int limit = 1;

    /* JADX INFO: renamed from: com.transsion.publish.ui.GalleryActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m75456a(Context context, List select, int i11, int i12, int i13) {
            Intrinsics.m97802h(context, "context");
            Intrinsics.m97802h(select, "select");
            Intent intent = new Intent(context, (Class<?>) GalleryActivity.class);
            intent.setFlags(ASTNode.DEOP);
            intent.putExtra("select", (Serializable) select);
            intent.putExtra("index", i11);
            intent.putExtra("from", i12);
            intent.putExtra("key_list", i13);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.GalleryActivity$b */
    public static final class C17612b implements ViewPager.InterfaceC4487h {
        C17612b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC4487h
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC4487h
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC4487h
        public void onPageSelected(int i11) {
            GalleryActivity.this.m75440h0(i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private final void m75439g0() {
        TextView selectNumTV = ((C24453c) getMViewBinding()).f74527j;
        Intrinsics.m97801g(selectNumTV, "selectNumTV");
        selectNumTV.setVisibility(this.select.size() > 0 ? 0 : 8);
        ((C24453c) getMViewBinding()).f74527j.setText(getString(R$string.image_select_num_tips, Integer.valueOf(this.select.size()), Integer.valueOf(this.limit)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final void m75440h0(int position) {
        try {
            int i11 = this.from;
            if (2 != i11) {
                if (3 == i11) {
                    if (((PhotoEntity) this.photos.get(position)).getEnableSelect()) {
                        ((C24453c) getMViewBinding()).f74529l.setText("1");
                        ((C24453c) getMViewBinding()).f74529l.setBackgroundResource(R$drawable.bg_linear_r16);
                        return;
                    } else {
                        ((C24453c) getMViewBinding()).f74529l.setText("");
                        ((C24453c) getMViewBinding()).f74529l.setBackgroundResource(R$drawable.ic_select_number_bro);
                        return;
                    }
                }
                PhotoEntity photoEntity = (PhotoEntity) this.photos.get(position);
                if (photoEntity.getEnableSelect()) {
                    ((C24453c) getMViewBinding()).f74529l.setText(m75442j0(photoEntity));
                    ((C24453c) getMViewBinding()).f74529l.setBackgroundResource(R$drawable.bg_linear_r16);
                    return;
                } else {
                    ((C24453c) getMViewBinding()).f74529l.setText("");
                    ((C24453c) getMViewBinding()).f74529l.setBackgroundResource(R$drawable.ic_select_number_bro);
                    return;
                }
            }
            int i12 = position + 1;
            if (i12 > this.photos.size()) {
                ((C24453c) getMViewBinding()).f74528k.setText(position + "/" + this.photos.size());
                return;
            }
            ((C24453c) getMViewBinding()).f74528k.setText(i12 + "/" + this.photos.size());
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                C26866a.a.m104898f(C26866a.f81698a, "checkStatus", message, false, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    private final void m75441i0(PhotoEntity info) {
        if (!info.getEnableSelect()) {
            this.select.add(info);
            info.setEnableSelect(true);
        }
        ((C24453c) getMViewBinding()).f74529l.setText(m75442j0(info));
        ((C24453c) getMViewBinding()).f74529l.setBackgroundResource(R$drawable.bg_linear_r16);
        m75454w0();
        m75439g0();
    }

    private final void initData() {
        m75446o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((C24453c) getMViewBinding()).f74521d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryActivity.m75443l0(this.f58236a, view);
            }
        });
        ((C24453c) getMViewBinding()).f74526i.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryActivity.m75444m0(this.f58239a, view);
            }
        });
        TextView confirmTV = ((C24453c) getMViewBinding()).f74524g;
        Intrinsics.m97801g(confirmTV, "confirmTV");
        AbstractC26006c.m102050c(confirmTV, 0L, new Function1() { // from class: com.transsion.publish.ui.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryActivity.m75445n0(this.f58241a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: j0 */
    private final String m75442j0(PhotoEntity info) {
        int i11 = 0;
        for (Object obj : this.select) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            if (Intrinsics.m97797c(info.getLocalPath(), ((PhotoEntity) obj).getLocalPath())) {
                return String.valueOf(i12);
            }
            i11 = i12;
        }
        return TmcConstants.COLD_OPEN_TYPE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m75443l0(GalleryActivity galleryActivity, View view) {
        galleryActivity.m75454w0();
        galleryActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static final void m75444m0(GalleryActivity galleryActivity, View view) {
        int currentItem = ((C24453c) galleryActivity.getMViewBinding()).f74531n.getCurrentItem();
        if (!galleryActivity.photos.isEmpty() && currentItem <= galleryActivity.photos.size()) {
            PhotoEntity photoEntity = (PhotoEntity) galleryActivity.photos.get(currentItem);
            try {
                int i11 = galleryActivity.from;
                if (i11 == 1) {
                    galleryActivity.m75450s0(photoEntity);
                } else if (i11 == 2) {
                    galleryActivity.m75451t0(photoEntity);
                } else if (i11 == 3) {
                    galleryActivity.m75453v0(photoEntity);
                }
            } catch (Exception e11) {
                C26866a.a.m104899g(C26866a.f81698a, "ext:" + e11.getMessage(), false, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final Unit m75445n0(GalleryActivity galleryActivity, View it) {
        Intrinsics.m97802h(it, "it");
        PreviewMediaConfirmEvent previewMediaConfirmEvent = new PreviewMediaConfirmEvent(0, 1, null);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = PreviewMediaConfirmEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, previewMediaConfirmEvent, 0L);
        galleryActivity.finish();
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    private final void m75446o0() {
        List listM75372e;
        ProgressBar clipLoading = ((C24453c) getMViewBinding()).f74523f;
        Intrinsics.m97801g(clipLoading, "clipLoading");
        AbstractC26006c.m102058k(clipLoading);
        if (getIntent().hasExtra("list")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("list");
            Intrinsics.m97800f(serializableExtra, "null cannot be cast to non-null type kotlin.collections.MutableList<com.transsion.publish.api.PhotoEntity>");
            listM75372e = TypeIntrinsics.m97852c(serializableExtra);
        } else {
            listM75372e = C17602n.f58119b.m75374a().m75372e();
        }
        this.photos = listM75372e;
        if (getIntent().hasExtra("select")) {
            Serializable serializableExtra2 = getIntent().getSerializableExtra("select");
            Intrinsics.m97800f(serializableExtra2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.transsion.publish.api.PhotoEntity>");
            this.select = TypeIntrinsics.m97852c(serializableExtra2);
        }
        this.from = getIntent().getIntExtra("from", 1);
        this.limit = getIntent().getIntExtra("key_list", 1);
        int intExtra = getIntent().getIntExtra("index", 0);
        this.travelsGalleryAdapter = new C17575o0(this.photos);
        ((C24453c) getMViewBinding()).f74531n.setAdapter(this.travelsGalleryAdapter);
        ProgressBar clipLoading2 = ((C24453c) getMViewBinding()).f74523f;
        Intrinsics.m97801g(clipLoading2, "clipLoading");
        AbstractC26006c.m102054g(clipLoading2);
        ((C24453c) getMViewBinding()).f74531n.addOnPageChangeListener(new C17612b());
        ((C24453c) getMViewBinding()).f74531n.setCurrentItem(intExtra);
        int i11 = this.from;
        if (2 == i11) {
            ((C24453c) getMViewBinding()).f74528k.getVisibility();
            ImageView ivDelete = ((C24453c) getMViewBinding()).f74525h;
            Intrinsics.m97801g(ivDelete, "ivDelete");
            AbstractC26006c.m102058k(ivDelete);
            LinearLayout llSelect = ((C24453c) getMViewBinding()).f74526i;
            Intrinsics.m97801g(llSelect, "llSelect");
            AbstractC26006c.m102054g(llSelect);
            Group bottomGroup = ((C24453c) getMViewBinding()).f74519b;
            Intrinsics.m97801g(bottomGroup, "bottomGroup");
            AbstractC26006c.m102054g(bottomGroup);
            ((C24453c) getMViewBinding()).f74525h.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GalleryActivity.m75447p0(this.f58233a, view);
                }
            });
        } else if (4 == i11) {
            ((C24453c) getMViewBinding()).f74528k.getVisibility();
            ImageView ivDelete2 = ((C24453c) getMViewBinding()).f74525h;
            Intrinsics.m97801g(ivDelete2, "ivDelete");
            AbstractC26006c.m102054g(ivDelete2);
            LinearLayout llSelect2 = ((C24453c) getMViewBinding()).f74526i;
            Intrinsics.m97801g(llSelect2, "llSelect");
            AbstractC26006c.m102054g(llSelect2);
            Group bottomGroup2 = ((C24453c) getMViewBinding()).f74519b;
            Intrinsics.m97801g(bottomGroup2, "bottomGroup");
            AbstractC26006c.m102054g(bottomGroup2);
        } else {
            m75439g0();
            Group bottomGroup3 = ((C24453c) getMViewBinding()).f74519b;
            Intrinsics.m97801g(bottomGroup3, "bottomGroup");
            AbstractC26006c.m102058k(bottomGroup3);
            TextView tvNum = ((C24453c) getMViewBinding()).f74528k;
            Intrinsics.m97801g(tvNum, "tvNum");
            AbstractC26006c.m102054g(tvNum);
            ImageView ivDelete3 = ((C24453c) getMViewBinding()).f74525h;
            Intrinsics.m97801g(ivDelete3, "ivDelete");
            AbstractC26006c.m102054g(ivDelete3);
        }
        m75440h0(intExtra);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static final void m75447p0(GalleryActivity galleryActivity, View view) {
        int currentItem = ((C24453c) galleryActivity.getMViewBinding()).f74531n.getCurrentItem();
        if (!galleryActivity.photos.isEmpty() && currentItem <= galleryActivity.photos.size()) {
            try {
                galleryActivity.m75451t0((PhotoEntity) galleryActivity.photos.get(currentItem));
            } catch (Exception e11) {
                C26866a.a.m104899g(C26866a.f81698a, "ext:" + e11.getMessage(), false, 2, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    private final void m75448q0(PhotoEntity info, boolean refresh) {
        if (info.getEnableSelect()) {
            m75452u0(info);
            info.setEnableSelect(false);
            ((C24453c) getMViewBinding()).f74529l.setText("");
            ((C24453c) getMViewBinding()).f74529l.setBackgroundResource(R$drawable.ic_select_number_bro);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private final boolean m75449r0() {
        return this.select.size() >= this.limit;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m75450s0(PhotoEntity photoEntity) {
        if (m75449r0()) {
            if (photoEntity.getEnableSelect()) {
                m75448q0(photoEntity, true);
                return;
            } else {
                C13806h.f49015a.m62325l(getString(R$string.add_img_max_tips, Integer.valueOf(this.limit)));
                return;
            }
        }
        if (photoEntity.getEnableSelect()) {
            m75448q0(photoEntity, false);
        } else {
            m75441i0(photoEntity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    private final void m75451t0(PhotoEntity photoEntity) {
        if (photoEntity.getEnableSelect()) {
            PhotoEntity photoEntity2 = null;
            int i11 = 0;
            int i12 = 0;
            for (Object obj : this.photos) {
                int i13 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                PhotoEntity photoEntity3 = (PhotoEntity) obj;
                if (TextUtils.equals(photoEntity3.getLocalPath(), photoEntity.getLocalPath())) {
                    i12 = i11;
                    photoEntity2 = photoEntity3;
                }
                i11 = i13;
            }
            if (photoEntity2 == null) {
                return;
            }
            this.photos.remove(photoEntity2);
            C17575o0 c17575o0 = this.travelsGalleryAdapter;
            if (c17575o0 != null) {
                c17575o0.m75289c(this.photos);
            }
            m75452u0(photoEntity);
            if (this.photos.isEmpty()) {
                m75454w0();
                finish();
                return;
            }
            FixedViewPager vp2 = ((C24453c) getMViewBinding()).f74531n;
            Intrinsics.m97801g(vp2, "vp");
            if (i12 > vp2.getChildCount()) {
                ((C24453c) getMViewBinding()).f74531n.setCurrentItem(0, false);
            } else {
                ((C24453c) getMViewBinding()).f74531n.setCurrentItem(i12, false);
            }
            m75440h0(i12);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m75452u0(PhotoEntity info) {
        PhotoEntity photoEntity = null;
        for (PhotoEntity photoEntity2 : this.select) {
            if (TextUtils.equals(photoEntity2.getLocalPath(), info.getLocalPath())) {
                photoEntity2.setEnableSelect(false);
                photoEntity = photoEntity2;
            }
        }
        if (photoEntity != null) {
            this.select.remove(photoEntity);
        }
        m75454w0();
        m75439g0();
    }

    /* JADX INFO: renamed from: v0 */
    private final void m75453v0(PhotoEntity photoEntity) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(photoEntity);
        BigImageBean bigImageBean = new BigImageBean();
        bigImageBean.setFrom(Integer.valueOf(this.from));
        bigImageBean.setSelect(arrayList);
        if (photoEntity.getEnableSelect()) {
            photoEntity.setEnableSelect(false);
            bigImageBean.setOperator(2);
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = BigImageBean.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, bigImageBean, 0L);
            return;
        }
        photoEntity.setEnableSelect(true);
        bigImageBean.setOperator(1);
        FlowEventBus flowEventBus2 = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name2 = BigImageBean.class.getName();
        Intrinsics.m97801g(name2, "getName(...)");
        flowEventBus2.postEvent(name2, bigImageBean, 0L);
        finish();
    }

    /* JADX INFO: renamed from: w0 */
    private final void m75454w0() {
        BigImageBean bigImageBean = new BigImageBean();
        bigImageBean.setFrom(Integer.valueOf(this.from));
        bigImageBean.setSelect(this.select);
        bigImageBean.setOperator(1);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = BigImageBean.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, bigImageBean, 0L);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C24453c getViewBinding() {
        C24453c c24453cM95951c = C24453c.m95951c(getLayoutInflater());
        Intrinsics.m97801g(c24453cM95951c, "inflate(...)");
        return c24453cM95951c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b("gallery_page", false, 2, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        m75454w0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ProgressBar clipLoading = ((C24453c) getMViewBinding()).f74523f;
        Intrinsics.m97801g(clipLoading, "clipLoading");
        AbstractC26006c.m102054g(clipLoading);
    }
}
