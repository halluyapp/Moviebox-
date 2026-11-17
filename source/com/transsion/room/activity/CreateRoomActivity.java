package com.transsion.room.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.NestedScrollView;
import androidx.p1004lifecycle.InterfaceC3189c0;
import ck.C5127x;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.RoomNet;
import com.transsion.room.R$drawable;
import com.transsion.room.R$string;
import com.transsion.room.activity.CreateRoomActivity;
import com.transsion.room.bean.CheckNameBean;
import com.transsion.room.viewmodel.C18308d;
import com.transsion.upload.bean.UploadFileType;
import com.transsion.upload.bean.UploadTstTokenStorageType;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23629a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p393f.C23284j;
import p462hj.C23860f;
import p465hp.InterfaceC23888a;
import p497iw.C24233c;
import p497iw.InterfaceC24231a;
import p550kj.C24655b;
import p743rh.C27287m;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00107R$\u0010H\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00107\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\nR$\u0010L\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010\n¨\u0006N"}, m97100d2 = {"Lcom/transsion/room/activity/CreateRoomActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lgq/a;", "<init>", "()V", "", "u0", "", "groupId", "t0", "(Ljava/lang/String;)V", "initView", "n0", "path", "C0", "p0", "", "isTranslucent", "()Z", "isStatusDark", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "s0", "()Lgq/a;", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "a", "I", "TITLE_MAX", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "DESC_MAX", "c", "Z", "nameExist", "Landroidx/activity/result/b;", "Landroid/content/Intent;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroidx/activity/result/b;", "photoLaunch", "Lhp/a;", "e", "Lkotlin/Lazy;", "q0", "()Lhp/a;", "publishApi", "Lcom/transsion/room/viewmodel/d;", "f", "r0", "()Lcom/transsion/room/viewmodel/d;", "roomCreateModel", "g", "Ljava/lang/String;", "avatorUrl", "h", "bucket", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "i", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "roomItem", "j", "Ljava/lang/Boolean;", "FROM_EDIT", CampaignEx.JSON_KEY_AD_K, "currentGroupId", "l", "getName", "()Ljava/lang/String;", "setName", "name", "m", "getDesc", "setDesc", CampaignEx.JSON_KEY_DESC, "n", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class CreateRoomActivity extends BaseActivity<C23629a> {

    /* JADX INFO: renamed from: o */
    private static final String f59031o = "field_from";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean nameExist;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private AbstractC0249b photoLaunch;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private RoomItem roomItem;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String currentGroupId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String desc;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int TITLE_MAX = 50;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int DESC_MAX = 1000;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy publishApi = LazyKt.m97097b(new Function0() { // from class: eq.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateRoomActivity.m76661A0();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy roomCreateModel = LazyKt.m97097b(new Function0() { // from class: eq.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateRoomActivity.m76662B0();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String avatorUrl = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String bucket = "";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Boolean FROM_EDIT = Boolean.FALSE;

    /* JADX INFO: renamed from: com.transsion.room.activity.CreateRoomActivity$b */
    public static final class C18029b implements TextWatcher {
        C18029b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CreateRoomActivity.this.m76676n0();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.activity.CreateRoomActivity$c */
    public static final class C18030c implements TextWatcher {
        C18030c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Integer numValueOf = editable != null ? Integer.valueOf(editable.length()) : null;
            if (numValueOf == null || numValueOf.intValue() < CreateRoomActivity.this.DESC_MAX) {
                return;
            }
            C13806h.f49015a.m62325l(CreateRoomActivity.this.getString(R$string.str_community_desc_limit));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.activity.CreateRoomActivity$d */
    static final class C18031d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59047a;

        C18031d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59047a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59047a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59047a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.activity.CreateRoomActivity$e */
    public static final class C18032e implements InterfaceC24231a {
        C18032e() {
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: a */
        public void mo73889a(String localFilePath, long j11, long j12) {
            Intrinsics.m97802h(localFilePath, "localFilePath");
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: b */
        public void mo73890b(String localFilePath, String url, String bucket) {
            Intrinsics.m97802h(localFilePath, "localFilePath");
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(bucket, "bucket");
            CreateRoomActivity.this.avatorUrl = url;
            CreateRoomActivity.this.bucket = bucket;
            CreateRoomActivity.this.m76676n0();
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: c */
        public void mo73891c(String str, String str2, String str3, UploadTstTokenStorageType uploadTstTokenStorageType) {
            C26866a.a.m104899g(C26866a.f81698a, "uploadKey: " + str + "; clientMessage:" + str2 + "; serviceMessage: " + str3, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final InterfaceC23888a m76661A0() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C18308d m76662B0() {
        return new C18308d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    private final void m76663C0(String path) {
        C23860f.b bVarM94464c = C23860f.f72909a.m94457m(this).m94468g(path).m94470i(R$drawable.ic_avatar_default).m94474m(AbstractC5776a0.m27313a(96.0f)).m94464c(AbstractC5776a0.m27313a(96.0f));
        ShapeableImageView ivAvatar = ((C23629a) getMViewBinding()).f72157d;
        Intrinsics.m97801g(ivAvatar, "ivAvatar");
        bVarM94464c.m94465d(ivAvatar);
        C24233c.f73744a.m95262f(path, UploadFileType.OBJECT_NAME_IMAGE, true, new C18032e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        String avatar;
        Bundle extras = getIntent().getExtras();
        RoomItem roomItem = extras != null ? (RoomItem) extras.getParcelable("field_key") : null;
        this.roomItem = roomItem;
        this.currentGroupId = roomItem != null ? roomItem.getGroupId() : null;
        RoomItem roomItem2 = this.roomItem;
        if (roomItem2 != null && (avatar = roomItem2.getAvatar()) != null) {
            C23860f.b bVarM94464c = C23860f.f72909a.m94457m(this).m94468g(avatar).m94470i(R$drawable.ic_avatar_default).m94474m(AbstractC5776a0.m27313a(96.0f)).m94464c(AbstractC5776a0.m27313a(96.0f));
            ShapeableImageView ivAvatar = ((C23629a) getMViewBinding()).f72157d;
            Intrinsics.m97801g(ivAvatar, "ivAvatar");
            bVarM94464c.m94465d(ivAvatar);
            this.avatorUrl = avatar;
        }
        AppCompatEditText appCompatEditText = ((C23629a) getMViewBinding()).f72156c;
        RoomItem roomItem3 = this.roomItem;
        appCompatEditText.setText(roomItem3 != null ? roomItem3.getName() : null);
        AppCompatEditText appCompatEditText2 = ((C23629a) getMViewBinding()).f72155b;
        RoomItem roomItem4 = this.roomItem;
        appCompatEditText2.setText(roomItem4 != null ? roomItem4.getDescription() : null);
        if (this.roomItem != null) {
            this.FROM_EDIT = Boolean.TRUE;
            ((C23629a) getMViewBinding()).f72159f.setEnabled(true);
        }
        this.photoLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: eq.e
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                CreateRoomActivity.m76686y0(this.f70753a, (ActivityResult) obj);
            }
        });
        ((C23629a) getMViewBinding()).f72157d.setOnClickListener(new View.OnClickListener() { // from class: eq.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRoomActivity.m76687z0(this.f70754a, view);
            }
        });
        ((C23629a) getMViewBinding()).f72156c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.TITLE_MAX)});
        ((C23629a) getMViewBinding()).f72155b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.DESC_MAX)});
        ((C23629a) getMViewBinding()).f72156c.addTextChangedListener(new C18029b());
        ((C23629a) getMViewBinding()).f72155b.addTextChangedListener(new C18030c());
        ((C23629a) getMViewBinding()).f72159f.setOnClickListener(new View.OnClickListener() { // from class: eq.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRoomActivity.m76685x0(this.f70755a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final void m76676n0() {
        ThreadUtils.m27236j(new Runnable() { // from class: eq.h
            @Override // java.lang.Runnable
            public final void run() {
                CreateRoomActivity.m76677o0(this.f70756a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public static final void m76677o0(CreateRoomActivity createRoomActivity) {
        Editable text = ((C23629a) createRoomActivity.getMViewBinding()).f72156c.getText();
        int length = String.valueOf(text != null ? StringsKt.m98155n1(text) : null).length();
        if (length <= 0 || TextUtils.isEmpty(createRoomActivity.avatorUrl)) {
            ((C23629a) createRoomActivity.getMViewBinding()).f72159f.setEnabled(false);
            return;
        }
        ((C23629a) createRoomActivity.getMViewBinding()).f72159f.setEnabled(true);
        if (length >= createRoomActivity.TITLE_MAX) {
            C13806h.f49015a.m62325l(createRoomActivity.getString(R$string.str_community_title_limit));
        }
    }

    /* JADX INFO: renamed from: p0 */
    private final void m76678p0() {
        if (!Intrinsics.m97797c(this.FROM_EDIT, Boolean.TRUE)) {
            String str = this.name;
            if (str != null) {
                C18308d c18308dM76680r0 = m76680r0();
                String strValueOf = String.valueOf(this.avatorUrl);
                String str2 = this.desc;
                c18308dM76680r0.m77482g(str, strValueOf, str2 != null ? str2 : "", this.bucket);
                return;
            }
            return;
        }
        RoomItem roomItem = this.roomItem;
        String groupId = roomItem != null ? roomItem.getGroupId() : null;
        this.currentGroupId = groupId;
        String str3 = this.name;
        if (str3 == null || groupId == null) {
            return;
        }
        C18308d c18308dM76680r1 = m76680r0();
        String strValueOf2 = String.valueOf(this.avatorUrl);
        String str4 = this.desc;
        c18308dM76680r1.m77485o(groupId, str3, strValueOf2, str4 == null ? "" : str4, this.bucket);
    }

    /* JADX INFO: renamed from: q0 */
    private final InterfaceC23888a m76679q0() {
        return (InterfaceC23888a) this.publishApi.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    private final C18308d m76680r0() {
        return (C18308d) this.roomCreateModel.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m76681t0(String groupId) {
        Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", groupId), this, null, 2, null);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m76682u0() {
        m76680r0().m77484j().m14851j(this, new C18031d(new Function1() { // from class: eq.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRoomActivity.m76683v0(this.f70751a, (RoomNet) obj);
            }
        }));
        m76680r0().m77483h().m14851j(this, new C18031d(new Function1() { // from class: eq.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRoomActivity.m76684w0(this.f70752a, (CheckNameBean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m76683v0(CreateRoomActivity createRoomActivity, RoomNet roomNet) {
        if (roomNet != null) {
            C24655b logViewConfig = createRoomActivity.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            if (Intrinsics.m97797c(roomNet.getGroupId(), "update")) {
                createRoomActivity.setResult(-1);
                createRoomActivity.finish();
            } else {
                String groupId = roomNet.getGroupId();
                if (groupId != null) {
                    createRoomActivity.m76681t0(groupId);
                    createRoomActivity.setResult(-1);
                    createRoomActivity.finish();
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m76684w0(CreateRoomActivity createRoomActivity, CheckNameBean checkNameBean) {
        if (checkNameBean != null) {
            boolean zIsExist = checkNameBean.isExist();
            createRoomActivity.nameExist = zIsExist;
            if (!zIsExist || TextUtils.equals(checkNameBean.getGroupId(), createRoomActivity.currentGroupId)) {
                createRoomActivity.m76678p0();
            } else {
                C28951b.f88586a.m111455e(createRoomActivity.getString(R$string.str_rooms_duplicate));
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    public static final void m76685x0(CreateRoomActivity createRoomActivity, View view) {
        if (!C14557c.f51100a.m65671a(view.getId(), 2000L) && ((C23629a) createRoomActivity.getMViewBinding()).f72159f.isEnabled()) {
            Editable text = ((C23629a) createRoomActivity.getMViewBinding()).f72156c.getText();
            createRoomActivity.name = String.valueOf(text != null ? StringsKt.m98155n1(text) : null);
            Editable text2 = ((C23629a) createRoomActivity.getMViewBinding()).f72155b.getText();
            createRoomActivity.desc = String.valueOf(text2 != null ? StringsKt.m98155n1(text2) : null);
            if (!C27287m.f83003a.m106330e()) {
                C13806h.f49015a.m62325l(createRoomActivity.getString(com.p282tn.lib.widget.R$string.no_network_toast));
                return;
            }
            String str = createRoomActivity.name;
            if (str != null) {
                createRoomActivity.m76680r0().m77481e(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m76686y0(CreateRoomActivity createRoomActivity, ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() != -1) {
            C26866a.a.m104898f(C26866a.f81698a, "photoLaunch", "fail", false, 4, null);
            return;
        }
        Intent data = it.getData();
        String stringExtra = data != null ? data.getStringExtra("clip_result") : null;
        C26866a.a.m104898f(C26866a.f81698a, "photoLaunch", "result:" + stringExtra, false, 4, null);
        if (stringExtra != null) {
            createRoomActivity.m76663C0(stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m76687z0(CreateRoomActivity createRoomActivity, View view) {
        Intent intentMo75364h;
        AbstractC0249b abstractC0249b;
        InterfaceC23888a interfaceC23888aM76679q0 = createRoomActivity.m76679q0();
        if (interfaceC23888aM76679q0 == null || (intentMo75364h = interfaceC23888aM76679q0.mo75364h(createRoomActivity)) == null || (abstractC0249b = createRoomActivity.photoLaunch) == null) {
            return;
        }
        abstractC0249b.m999a(intentMo75364h);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b("createaroom", false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NestedScrollView root = ((C23629a) getMViewBinding()).getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102052e(root);
        initView();
        m76682u0();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C23629a getViewBinding() {
        C23629a c23629aM93493c = C23629a.m93493c(getLayoutInflater());
        Intrinsics.m97801g(c23629aM93493c, "inflate(...)");
        return c23629aM93493c;
    }
}
