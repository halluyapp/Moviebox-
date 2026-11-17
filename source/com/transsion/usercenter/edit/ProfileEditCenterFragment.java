package com.transsion.usercenter.edit;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.core.app.NotificationCompat;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.bigkoo.pickerview.view.ViewOnClickListenerC5717a;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.noober.background.view.BLConstraintLayout;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$drawable;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.therouter.TheRouter;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baselib.kids.KidsProfile;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.edit.api.RequstUserEntity;
import com.transsion.usercenter.edit.dialog.EditNameDialog;
import com.transsion.usercenter.edit.widget.ProfileEditBar;
import com.transsion.usercenter.kids.DeleteKidsProfileDialog;
import com.transsion.usercenter.kids.PinInputDialog;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import io.reactivex.rxjava3.android.schedulers.AbstractC24083b;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24094k;
import io.reactivex.rxjava3.core.InterfaceC24095l;
import io.reactivex.rxjava3.core.InterfaceC24098o;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import ng.AbstractC26006c;
import p393f.C23284j;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p465hp.InterfaceC23888a;
import p585lw.C25717k0;
import p655op.C26374a;
import p663ow.C26742b;
import p732r5.C27168a;
import p743rh.C27287m;
import p779t5.InterfaceC27726c;
import p944yh.C28951b;
import pg.C26866a;
import pw.ViewOnClickListenerC26954b;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0095\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0096\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u001cH\u0002¢\u0006\u0004\b%\u0010#J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010#J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010&\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010*JA\u0010-\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020(2\b\b\u0002\u0010&\u001a\u00020\u001c2\b\b\u0002\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u0010\bJ\u0017\u00104\u001a\u00020\t2\u0006\u00103\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u0010#J\u0017\u00105\u001a\u00020\t2\u0006\u00103\u001a\u00020\u001cH\u0002¢\u0006\u0004\b5\u0010#J\u0017\u00106\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u001cH\u0002¢\u0006\u0004\b6\u0010#J\u001f\u00109\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u001c2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020(2\u0006\u0010$\u001a\u00020\u001cH\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b=\u0010\bJ!\u0010B\u001a\u00020\t2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\tH\u0016¢\u0006\u0004\bD\u0010\bJ\u0015\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u001c¢\u0006\u0004\bF\u0010#J\r\u0010G\u001a\u00020\t¢\u0006\u0004\bG\u0010\bJ\r\u0010H\u001a\u00020\t¢\u0006\u0004\bH\u0010\bJ\u0015\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020+¢\u0006\u0004\bJ\u0010KJ'\u0010M\u001a\u00020\t2\u0006\u0010L\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020+H\u0016¢\u0006\u0004\bP\u0010KJ\u0019\u0010S\u001a\u00020\t2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ#\u0010W\u001a\u00020\t2\b\u0010U\u001a\u0004\u0018\u00010\u001c2\b\u0010V\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\bW\u0010 J\u000f\u0010X\u001a\u00020\tH\u0016¢\u0006\u0004\bX\u0010\bJ\u001f\u0010[\u001a\u00020\t2\u0006\u0010Y\u001a\u00020(2\u0006\u0010Z\u001a\u00020\u001cH\u0016¢\u0006\u0004\b[\u0010\\J\u0019\u0010]\u001a\u00020\t2\b\u0010Z\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b]\u0010#J\u0017\u0010`\u001a\u00020\t2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\t2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\bb\u0010aJ\u0017\u0010e\u001a\u00020\u00022\u0006\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\be\u0010fJ!\u0010\n\u001a\u00020\t2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\b\n\u0010CR\u0014\u0010g\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\bi\u0010hR\u0014\u0010j\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\bj\u0010hR\u0014\u0010k\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010hR\u0014\u0010l\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\bl\u0010hR\u0016\u0010m\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010hR\u0016\u0010p\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010nR\u0016\u0010q\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010nR\u0016\u0010r\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010nR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010nR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010nR\u0016\u0010s\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010tR\u0016\u0010v\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010tR\u0016\u0010w\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010tR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010tR\u0016\u0010\u007f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010nR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0082\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010tR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R#\u0010\u008b\u0001\u001a\f\u0012\u0005\u0012\u00030\u008a\u0001\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R#\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0097\u0001"}, m97100d2 = {"Lcom/transsion/usercenter/edit/ProfileEditCenterFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llw/k0;", "Lcom/transsion/usercenter/edit/b;", "Lpw/b$a;", "Lcom/transsion/usercenter/edit/dialog/EditNameDialog$a;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "initView", "iniData", "Lcom/transsion/baselib/kids/KidsProfile;", "kidsProfile", "showKidsProfileData", "(Lcom/transsion/baselib/kids/KidsProfile;)V", "setOldData", "Landroid/graphics/Bitmap;", "bitmap", "showEntity", "(Landroid/graphics/Bitmap;)V", "defaultShow", "headPortrait", "headPortraitBitmap", "formattingGender", "nickNameShow", "genderShow", "birthDayShow", "", "avatarUrl", "bucket", "editAvatar", "(Ljava/lang/String;Ljava/lang/String;)V", "name", "editNickName", "(Ljava/lang/String;)V", "gender", "editGender", "birthday", "editBirthday", "", "calcAgeFromBirthday", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "newAvatarPath", "editRequest", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "showRequestLoading", "hideRequestLoading", "editTipsDialog", "showDeleteProfileOption", "localPath", "fastAvatar", "localAvatar", "showTimePicker", "Ljava/util/Calendar;", "calendar", "setCurrentBirthDay", "(Ljava/lang/String;Ljava/util/Calendar;)V", "buildGender", "(Ljava/lang/String;)I", "loadProfile", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "imagePath", "uploadImage", "checkBack", "confirmSubmit", "back", "checkEditSubmit", "(Z)V", "data", "onAvatarUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", NotificationCompat.CATEGORY_STATUS, "onEditProfile", "Lcom/transsnet/loginapi/bean/UserInfo;", "userInfo", "onUserInfo", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "code", NotificationCompat.CATEGORY_MESSAGE, "onError", "onDestroyView", RequestParameters.POSITION, "result", "onDialogSelect", "(ILjava/lang/String;)V", "onDialogConfirm", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Llw/k0;", "EDIT_AVATAR", "I", "EDIT_NAME", "EDIT_GENDER", "EDIT_REGION", "EDIT_BIRTHDAY", "editText", "Ljava/lang/String;", "editType", "oldNickName", "oldGender", "oldBirth", "isChangeAvatar", "Z", "isClearBirthday", "isClearGender", "isClearRegion", "Lcom/transsion/usercenter/edit/dialog/EditNameDialog;", "editDialog", "Lcom/transsion/usercenter/edit/dialog/EditNameDialog;", "", "respDuration", "J", "retry", "cropImage", "currentKidsProfile", "Lcom/transsion/baselib/kids/KidsProfile;", "isKidsMode", "Lcom/bigkoo/pickerview/view/a;", "timePickerView", "Lcom/bigkoo/pickerview/view/a;", "Low/b;", "presenter", "Low/b;", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "photoLaunch", "Landroidx/activity/result/b;", "Lhp/a;", "publishApi$delegate", "Lkotlin/Lazy;", "getPublishApi", "()Lhp/a;", "publishApi", "userEntity", "Lcom/transsnet/loginapi/bean/UserInfo;", "Companion", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ProfileEditCenterFragment extends BaseFragment<C25717k0> implements InterfaceC20449b, ViewOnClickListenerC26954b.a, EditNameDialog.InterfaceC20452a, TRDialogListener {
    private static final String ARG_KIDS_PROFILE = "arg_kids_profile";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "ProfileEditCenterFragment";
    private KidsProfile currentKidsProfile;
    private EditNameDialog editDialog;
    private int editType;
    private boolean isChangeAvatar;
    private boolean isClearBirthday;
    private boolean isClearGender;
    private boolean isClearRegion;
    private boolean isKidsMode;
    private AbstractC0249b photoLaunch;
    private C26742b presenter;
    private long respDuration;
    private boolean retry;
    private ViewOnClickListenerC5717a timePickerView;
    private UserInfo userEntity;
    private final int EDIT_AVATAR = 1;
    private final int EDIT_NAME = 2;
    private final int EDIT_GENDER = 3;
    private final int EDIT_REGION = 4;
    private final int EDIT_BIRTHDAY = 5;
    private String editText = "";
    private String oldNickName = "";
    private String oldGender = "";
    private String oldBirth = "";
    private String avatarUrl = "";
    private String bucket = "";
    private String cropImage = "";

    /* JADX INFO: renamed from: publishApi$delegate, reason: from kotlin metadata */
    private final Lazy publishApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.edit.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProfileEditCenterFragment.publishApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.usercenter.edit.ProfileEditCenterFragment$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ProfileEditCenterFragment m84624a(UserInfo userInfo, KidsProfile kidsProfile) {
            ProfileEditCenterFragment profileEditCenterFragment = new ProfileEditCenterFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("user", userInfo);
            if (kidsProfile != null) {
                bundle.putParcelable(ProfileEditCenterFragment.ARG_KIDS_PROFILE, kidsProfile);
            }
            profileEditCenterFragment.setArguments(bundle);
            return profileEditCenterFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.edit.ProfileEditCenterFragment$b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C20445b implements InterfaceC24098o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Ref.ObjectRef f64769a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ProfileEditCenterFragment f64770b;

        C20445b(Ref.ObjectRef objectRef, ProfileEditCenterFragment profileEditCenterFragment) {
            this.f64769a = objectRef;
            this.f64770b = profileEditCenterFragment;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap file) {
            ShapeableImageView shapeableImageView;
            Intrinsics.m97802h(file, "file");
            C25717k0 mViewBinding = this.f64770b.getMViewBinding();
            if (mViewBinding == null || (shapeableImageView = mViewBinding.f78284n) == null) {
                return;
            }
            shapeableImageView.setImageBitmap(file);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onError(Throwable e11) {
            Intrinsics.m97802h(e11, "e");
            C26866a.a.m104898f(C26866a.f81698a, "localAvatar", "onError e:" + e11, false, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onSubscribe(InterfaceC24104c d11) {
            Intrinsics.m97802h(d11, "d");
            this.f64769a.element = d11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.edit.ProfileEditCenterFragment$c */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C20446c implements InterfaceC20448a {
        C20446c() {
        }

        @Override // com.transsion.usercenter.edit.InterfaceC20448a
        /* JADX INFO: renamed from: a */
        public void mo84626a(String str, String str2) {
            C28951b.f88586a.m111454d(R$string.profile_saved_fail_retry);
            ProfileEditCenterFragment.this.hideRequestLoading();
        }

        @Override // com.transsion.usercenter.edit.InterfaceC20448a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo84627b(String str, boolean z11, String bucket) {
            Intrinsics.m97802h(bucket, "bucket");
            if (str != null) {
                ProfileEditCenterFragment.this.retry = false;
                ProfileEditCenterFragment profileEditCenterFragment = ProfileEditCenterFragment.this;
                profileEditCenterFragment.onAvatarUrl(str, profileEditCenterFragment.cropImage, bucket);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.edit.ProfileEditCenterFragment$hideRequestLoading$1 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.usercenter.edit.ProfileEditCenterFragment$hideRequestLoading$1", m97637f = "ProfileEditCenterFragment.kt", m97638l = {481}, m97639m = "invokeSuspend")
    static final class C204471 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.transsion.usercenter.edit.ProfileEditCenterFragment$hideRequestLoading$1$1, reason: invalid class name */
        @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
        @DebugMetadata(m97636c = "com.transsion.usercenter.edit.ProfileEditCenterFragment$hideRequestLoading$1$1", m97637f = "ProfileEditCenterFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ProfileEditCenterFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ProfileEditCenterFragment profileEditCenterFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = profileEditCenterFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ProgressBar progressBar;
                IntrinsicsKt.m97630f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                C25717k0 mViewBinding = this.this$0.getMViewBinding();
                if (mViewBinding != null && (progressBar = mViewBinding.f78278h) != null) {
                    AbstractC26006c.m102054g(progressBar);
                }
                return Unit.f75682a;
            }
        }

        C204471(Continuation<? super C204471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileEditCenterFragment.this.new C204471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C204471) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ProfileEditCenterFragment.this, null);
                this.label = 1;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, anonymousClass1, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    private final void birthDayShow() {
        String birthday;
        C25717k0 mViewBinding;
        ProfileEditBar profileEditBar;
        UserInfo userInfo = this.userEntity;
        if (userInfo == null || (birthday = userInfo.getBirthday()) == null || (mViewBinding = getMViewBinding()) == null || (profileEditBar = mViewBinding.f78272b) == null) {
            return;
        }
        profileEditBar.setBtnRight(birthday);
    }

    private final int buildGender(String gender) {
        if (Intrinsics.m97797c(gender, getString(R$string.profile_female))) {
            return 2;
        }
        if (Intrinsics.m97797c(gender, getString(R$string.profile_male))) {
            return 1;
        }
        Intrinsics.m97797c(gender, "");
        return 0;
    }

    private final Integer calcAgeFromBirthday(String birthday) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(birthday);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            int i11 = calendar2.get(1) - calendar.get(1);
            if (calendar2.get(6) < calendar.get(6)) {
                i11--;
            }
            return Integer.valueOf(RangesKt.m97935e(i11, 0));
        } catch (Exception unused) {
            return null;
        }
    }

    private final void defaultShow() {
    }

    private final void editAvatar(String avatarUrl, String bucket) {
        ProfileEditBar profileEditBar;
        this.avatarUrl = avatarUrl;
        this.bucket = bucket;
        this.editText = avatarUrl;
        this.editType = this.EDIT_AVATAR;
        C25717k0 mViewBinding = getMViewBinding();
        editRequest(avatarUrl, this.oldNickName, buildGender(String.valueOf((mViewBinding == null || (profileEditBar = mViewBinding.f78274d) == null) ? null : profileEditBar.getBtnTextValue())), this.oldBirth, true);
    }

    private final void editBirthday(String birthday) {
        ProfileEditBar profileEditBar;
        this.editText = birthday;
        this.editType = this.EDIT_BIRTHDAY;
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (profileEditBar = mViewBinding.f78272b) == null) {
            return;
        }
        profileEditBar.setBtnRight(birthday);
    }

    private final void editGender(String gender) {
        ProfileEditBar profileEditBar;
        this.editText = gender;
        this.editType = this.EDIT_GENDER;
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (profileEditBar = mViewBinding.f78274d) == null) {
            return;
        }
        profileEditBar.setBtnRight(gender);
    }

    private final void editNickName(String name) {
        TextView textView;
        this.editText = name;
        this.editType = this.EDIT_NAME;
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (textView = mViewBinding.f78283m) == null) {
            return;
        }
        textView.setText(name);
    }

    private final void editRequest(String avatarUrl, String name, int gender, String birthday, boolean newAvatarPath) {
        ProgressBar progressBar;
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f78278h) != null) {
            AbstractC26006c.m102058k(progressBar);
        }
        this.respDuration = System.currentTimeMillis();
        RequstUserEntity requstUserEntity = new RequstUserEntity();
        UserInfo userInfo = this.userEntity;
        requstUserEntity.setUserId(userInfo != null ? userInfo.getUserId() : null);
        if (!TextUtils.isEmpty(avatarUrl)) {
            if (newAvatarPath) {
                requstUserEntity.setNewAvatarPath(avatarUrl);
            } else {
                requstUserEntity.setAvatar(avatarUrl);
            }
        }
        if (!TextUtils.isEmpty(name)) {
            requstUserEntity.setNickname(name);
        }
        requstUserEntity.setGender(Integer.valueOf(gender));
        if (TextUtils.isEmpty(birthday)) {
            requstUserEntity.setBirthday(this.oldBirth);
        } else if (TextUtils.equals(birthday, "null")) {
            requstUserEntity.setBirthday("");
        } else {
            requstUserEntity.setBirthday(birthday);
        }
        if (!TextUtils.isEmpty(this.bucket)) {
            requstUserEntity.setTempBucket(this.bucket);
        }
        C26742b c26742b = this.presenter;
        if (c26742b != null) {
            c26742b.m104542e(requstUserEntity);
        }
    }

    static /* synthetic */ void editRequest$default(ProfileEditCenterFragment profileEditCenterFragment, String str, String str2, int i11, String str3, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            str2 = "";
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            str3 = "";
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        profileEditCenterFragment.editRequest(str, str2, i11, str3, z11);
    }

    private final void editTipsDialog() {
        try {
            TRDialog.C13786a c13786a = new TRDialog.C13786a();
            String string = getString(R$string.profile_back_edit_tips);
            Intrinsics.m97801g(string, "getString(...)");
            TRDialog.C13786a c13786aM62288g = c13786a.m62288g(string);
            String string2 = getString(R$string.profile_back_edit_yes);
            Intrinsics.m97801g(string2, "getString(...)");
            TRDialog.C13786a c13786aM62286e = c13786aM62288g.m62286e(string2);
            String string3 = getString(R$string.profile_back_edit_no);
            Intrinsics.m97801g(string3, "getString(...)");
            c13786aM62286e.m62291j(string3).m62285d(AbstractC2397b.getColor(requireContext(), R$color.text_01)).m62290i(AbstractC2397b.getColor(requireContext(), R$color.text_01)).m62289h(R$drawable.libui_sub_btn2_normal).m62284c(R$drawable.libui_sub_btn2_normal).m62287f(this).m62282a().m62248d0(this, "edit_tips");
        } catch (Exception unused) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private final void fastAvatar(String localPath) {
        try {
            localAvatar(localPath);
        } catch (Exception unused) {
        }
    }

    private final void formattingGender() {
        UserInfo userInfo = this.userEntity;
        Integer numValueOf = userInfo != null ? Integer.valueOf(userInfo.getGender()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            String string = getString(R$string.profile_female);
            Intrinsics.m97801g(string, "getString(...)");
            this.oldGender = string;
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            String string2 = getString(R$string.profile_male);
            Intrinsics.m97801g(string2, "getString(...)");
            this.oldGender = string2;
        }
    }

    private final void genderShow() {
        String string;
        ProfileEditBar profileEditBar;
        UserInfo userInfo = this.userEntity;
        if (userInfo == null || userInfo.getGender() != 2) {
            UserInfo userInfo2 = this.userEntity;
            if (userInfo2 == null || userInfo2.getGender() != 1) {
                string = "";
            } else {
                string = getString(R$string.profile_male);
                Intrinsics.m97801g(string, "getString(...)");
            }
        } else {
            string = getString(R$string.profile_female);
            Intrinsics.m97801g(string, "getString(...)");
        }
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (profileEditBar = mViewBinding.f78274d) == null) {
            return;
        }
        profileEditBar.setBtnRight(string);
    }

    private final InterfaceC23888a getPublishApi() {
        return (InterfaceC23888a) this.publishApi.getValue();
    }

    private final void headPortrait() {
        C25717k0 mViewBinding;
        ShapeableImageView shapeableImageView;
        String avatar;
        FragmentActivity activity = getActivity();
        if (activity == null || (mViewBinding = getMViewBinding()) == null || (shapeableImageView = mViewBinding.f78284n) == null) {
            return;
        }
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(activity);
        UserInfo userInfo = this.userEntity;
        if (userInfo == null || (avatar = userInfo.getAvatar()) == null) {
            avatar = "";
        }
        bVarM94457m.m94468g(avatar).m94470i(com.transsion.usercenter.R$color.color_ff999999).m94465d(shapeableImageView);
    }

    private final void headPortraitBitmap(Bitmap bitmap) {
        ShapeableImageView shapeableImageView;
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (shapeableImageView = mViewBinding.f78284n) == null) {
            return;
        }
        shapeableImageView.setImageBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideRequestLoading() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C204471(null), 3, null);
    }

    private final void iniData() {
        ProgressBar progressBar;
        ProgressBar progressBar2;
        ProfileEditBar profileEditBar;
        ProfileEditBar profileEditBar2;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        C26742b c26742b = new C26742b();
        this.presenter = c26742b;
        c26742b.m104538a(this);
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (relativeLayout2 = mViewBinding.f78280j) != null) {
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.edit.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileEditCenterFragment.iniData$lambda$2(this.f64805a, view);
                }
            });
        }
        C25717k0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (relativeLayout = mViewBinding2.f78279i) != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.edit.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileEditCenterFragment.iniData$lambda$5(this.f64787a, view);
                }
            });
        }
        C25717k0 mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (profileEditBar2 = mViewBinding3.f78274d) != null) {
            profileEditBar2.setClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.edit.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileEditCenterFragment.iniData$lambda$6(this.f64788a, view);
                }
            });
        }
        C25717k0 mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (profileEditBar = mViewBinding4.f78272b) != null) {
            profileEditBar.setClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.edit.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileEditCenterFragment.iniData$lambda$10(this.f64789a, view);
                }
            });
        }
        Bundle arguments = getArguments();
        KidsProfile kidsProfile = arguments != null ? (KidsProfile) arguments.getParcelable(ARG_KIDS_PROFILE) : null;
        if (kidsProfile != null) {
            showKidsProfileData(kidsProfile);
            showDeleteProfileOption();
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || !arguments2.containsKey("user")) {
            C25717k0 mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (progressBar = mViewBinding5.f78278h) != null) {
                AbstractC26006c.m102058k(progressBar);
            }
            C26742b c26742b2 = this.presenter;
            if (c26742b2 != null) {
                c26742b2.m104543f();
                return;
            }
            return;
        }
        Bundle arguments3 = getArguments();
        Serializable serializable = arguments3 != null ? arguments3.getSerializable("user") : null;
        if (!(serializable instanceof UserInfo)) {
            C25717k0 mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (progressBar2 = mViewBinding6.f78278h) != null) {
                AbstractC26006c.m102058k(progressBar2);
            }
            C26742b c26742b3 = this.presenter;
            if (c26742b3 != null) {
                c26742b3.m104543f();
                return;
            }
            return;
        }
        this.userEntity = (UserInfo) serializable;
        setOldData();
        formattingGender();
        C20470u.a aVar = C20470u.f64806b;
        Bitmap bitmapM84642d = aVar.m84645a().m84642d();
        if (bitmapM84642d != null) {
            aVar.m84645a().m84643e(null);
            showEntity(bitmapM84642d);
        } else {
            showEntity(null);
        }
        showDeleteProfileOption();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniData$lambda$10(ProfileEditCenterFragment profileEditCenterFragment, View view) {
        String birthday;
        ProfileEditBar profileEditBar;
        String setValue;
        ProfileEditBar profileEditBar2;
        ProfileEditBar profileEditBar3;
        String setValue2;
        if (profileEditCenterFragment.isClearBirthday) {
            C25717k0 mViewBinding = profileEditCenterFragment.getMViewBinding();
            if (mViewBinding == null || (profileEditBar3 = mViewBinding.f78272b) == null || (setValue2 = profileEditBar3.getSetValue()) == null) {
                return;
            }
            profileEditCenterFragment.showTimePicker(setValue2);
            return;
        }
        C25717k0 mViewBinding2 = profileEditCenterFragment.getMViewBinding();
        Boolean boolValueOf = (mViewBinding2 == null || (profileEditBar2 = mViewBinding2.f78272b) == null) ? null : Boolean.valueOf(profileEditBar2.isEmpty());
        Intrinsics.m97799e(boolValueOf);
        if (!boolValueOf.booleanValue()) {
            C25717k0 mViewBinding3 = profileEditCenterFragment.getMViewBinding();
            if (mViewBinding3 == null || (profileEditBar = mViewBinding3.f78272b) == null || (setValue = profileEditBar.getSetValue()) == null) {
                return;
            }
            profileEditCenterFragment.showTimePicker(setValue);
            return;
        }
        UserInfo userInfo = profileEditCenterFragment.userEntity;
        if (TextUtils.isEmpty(userInfo != null ? userInfo.getBirthday() : null)) {
            profileEditCenterFragment.showTimePicker("");
            return;
        }
        UserInfo userInfo2 = profileEditCenterFragment.userEntity;
        if (userInfo2 == null || (birthday = userInfo2.getBirthday()) == null) {
            return;
        }
        profileEditCenterFragment.showTimePicker(birthday);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniData$lambda$2(ProfileEditCenterFragment profileEditCenterFragment, View view) {
        FragmentActivity activity;
        EditNameDialog editNameDialog;
        TextView textView;
        if (profileEditCenterFragment.editDialog == null) {
            profileEditCenterFragment.editDialog = new EditNameDialog();
        }
        EditNameDialog editNameDialog2 = profileEditCenterFragment.editDialog;
        if ((editNameDialog2 != null && editNameDialog2.isShow()) || (activity = profileEditCenterFragment.getActivity()) == null || (editNameDialog = profileEditCenterFragment.editDialog) == null) {
            return;
        }
        C25717k0 mViewBinding = profileEditCenterFragment.getMViewBinding();
        editNameDialog.m84637m0(activity, profileEditCenterFragment, String.valueOf((mViewBinding == null || (textView = mViewBinding.f78283m) == null) ? null : textView.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniData$lambda$5(ProfileEditCenterFragment profileEditCenterFragment, View view) {
        AbstractC0249b abstractC0249b;
        FragmentActivity activity = profileEditCenterFragment.getActivity();
        if (activity != null) {
            InterfaceC23888a publishApi = profileEditCenterFragment.getPublishApi();
            Intent intentMo75364h = publishApi != null ? publishApi.mo75364h(activity) : null;
            if (intentMo75364h == null || (abstractC0249b = profileEditCenterFragment.photoLaunch) == null) {
                return;
            }
            abstractC0249b.m999a(intentMo75364h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniData$lambda$6(ProfileEditCenterFragment profileEditCenterFragment, View view) {
        ProfileEditBar profileEditBar;
        FragmentActivity activity = profileEditCenterFragment.getActivity();
        C25717k0 mViewBinding = profileEditCenterFragment.getMViewBinding();
        new ViewOnClickListenerC26954b(activity, profileEditCenterFragment, (mViewBinding == null || (profileEditBar = mViewBinding.f78274d) == null) ? null : profileEditBar.getBtnTextValue()).m105100b();
    }

    private final void initView() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$39(ProfileEditCenterFragment profileEditCenterFragment, ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() != -1) {
            C26866a.a.m104898f(C26866a.f81698a, "photoLaunch", "fail", false, 4, null);
            return;
        }
        Intent data = it.getData();
        String stringExtra = data != null ? data.getStringExtra("clip_result") : null;
        C26866a.a.m104898f(C26866a.f81698a, "photoLaunch", "result:" + stringExtra, false, 4, null);
        if (stringExtra != null) {
            profileEditCenterFragment.cropImage = stringExtra;
        }
        if (stringExtra != null) {
            if (profileEditCenterFragment.isKidsMode) {
                profileEditCenterFragment.fastAvatar(stringExtra);
            } else {
                profileEditCenterFragment.uploadImage(stringExtra);
            }
        }
    }

    private final void loadProfile() {
        C25717k0 mViewBinding;
        ShapeableImageView shapeableImageView;
        String str = this.avatarUrl;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringsKt.m98132c0(str, "http:", false, 2, null);
        FragmentActivity activity = getActivity();
        if (activity == null || (mViewBinding = getMViewBinding()) == null || (shapeableImageView = mViewBinding.f78284n) == null) {
            return;
        }
        C23860f.f72909a.m94457m(activity).m94468g(str).m94465d(shapeableImageView);
    }

    private final void localAvatar(final String localPath) {
        AbstractC24093j.m95062g(new InterfaceC24095l() { // from class: com.transsion.usercenter.edit.k
            @Override // io.reactivex.rxjava3.core.InterfaceC24095l
            /* JADX INFO: renamed from: a */
            public final void mo75615a(InterfaceC24094k interfaceC24094k) {
                ProfileEditCenterFragment.localAvatar$lambda$28(localPath, interfaceC24094k);
            }
        }).m95088v(AbstractC24083b.m95041c()).m95073E(AbstractC27875a.m108402c()).subscribe(new C20445b(new Ref.ObjectRef(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void localAvatar$lambda$28(String str, InterfaceC24094k emitter) {
        Intrinsics.m97802h(emitter, "emitter");
        C26866a.a.m104898f(C26866a.f81698a, " localAvatar", "start....", false, 4, null);
        Bitmap bitmapM102977b = C26374a.m102977b(str);
        if (emitter.isDisposed()) {
            return;
        }
        emitter.onNext(bitmapM102977b);
    }

    private final void nickNameShow() {
        TextView textView;
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (textView = mViewBinding.f78283m) == null) {
            return;
        }
        UserInfo userInfo = this.userEntity;
        textView.setText(userInfo != null ? userInfo.getNickname() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAvatarUrl$lambda$27(String str, ProfileEditCenterFragment profileEditCenterFragment, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            profileEditCenterFragment.hideRequestLoading();
            C28951b.f88586a.m111454d(R$string.profile_upload_fails);
        } else {
            profileEditCenterFragment.fastAvatar(str2);
            profileEditCenterFragment.isChangeAvatar = true;
            profileEditCenterFragment.editAvatar(str, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDialogConfirm$lambda$34(ProfileEditCenterFragment profileEditCenterFragment) {
        FragmentActivity activity = profileEditCenterFragment.getActivity();
        if (activity != null) {
            KeyboardUtils.m27130d(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$31(ProfileEditCenterFragment profileEditCenterFragment, String str) {
        if (profileEditCenterFragment.isChangeAvatar) {
            profileEditCenterFragment.isChangeAvatar = false;
            profileEditCenterFragment.respDuration = 0L;
            profileEditCenterFragment.hideRequestLoading();
            C28951b.f88586a.m111454d(R$string.profile_upload_fails);
            return;
        }
        profileEditCenterFragment.respDuration = 0L;
        profileEditCenterFragment.isChangeAvatar = false;
        profileEditCenterFragment.hideRequestLoading();
        C28951b.f88586a.m111455e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23888a publishApi_delegate$lambda$0() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    private final void setCurrentBirthDay(String birthday, Calendar calendar) {
        try {
            calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(birthday));
            ViewOnClickListenerC5717a viewOnClickListenerC5717a = this.timePickerView;
            if (viewOnClickListenerC5717a != null) {
                viewOnClickListenerC5717a.m27065B(calendar);
            }
        } catch (ParseException e11) {
            e11.printStackTrace();
        }
    }

    private final void setOldData() {
        UserInfo userInfo = this.userEntity;
        this.oldNickName = String.valueOf(userInfo != null ? userInfo.getNickname() : null);
        UserInfo userInfo2 = this.userEntity;
        this.oldBirth = String.valueOf(userInfo2 != null ? userInfo2.getBirthday() : null);
    }

    private final void showDeleteProfileOption() {
        BLConstraintLayout bLConstraintLayout;
        BLConstraintLayout bLConstraintLayout2;
        BLConstraintLayout bLConstraintLayout3;
        Bundle arguments = getArguments();
        final KidsProfile kidsProfile = arguments != null ? (KidsProfile) arguments.getParcelable(ARG_KIDS_PROFILE) : null;
        if (kidsProfile == null) {
            C25717k0 mViewBinding = getMViewBinding();
            if (mViewBinding == null || (bLConstraintLayout3 = mViewBinding.f78277g) == null) {
                return;
            }
            bLConstraintLayout3.setVisibility(8);
            return;
        }
        C25717k0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (bLConstraintLayout2 = mViewBinding2.f78277g) != null) {
            bLConstraintLayout2.setVisibility(0);
        }
        C25717k0 mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (bLConstraintLayout = mViewBinding3.f78277g) == null) {
            return;
        }
        bLConstraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.edit.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEditCenterFragment.showDeleteProfileOption$lambda$26(this.f64791a, kidsProfile, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeleteProfileOption$lambda$26(ProfileEditCenterFragment profileEditCenterFragment, final KidsProfile kidsProfile, View view) {
        C26866a.a.m104898f(C26866a.f81698a, TAG, "click delete profile.", false, 4, null);
        final FragmentActivity fragmentActivityRequireActivity = profileEditCenterFragment.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        Function0 function0 = new Function0() { // from class: com.transsion.usercenter.edit.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditCenterFragment.showDeleteProfileOption$lambda$26$lambda$25(kidsProfile, fragmentActivityRequireActivity);
            }
        };
        if (KidsAccountManager.f50883a.m65183i()) {
            PinInputDialog.INSTANCE.m84764c(kidsProfile.getKidsId(), true, function0).m61941X(fragmentActivityRequireActivity, "PinInputDialog");
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDeleteProfileOption$lambda$26$lambda$25(KidsProfile kidsProfile, final FragmentActivity fragmentActivity) {
        DeleteKidsProfileDialog.INSTANCE.m84700a(kidsProfile.getKidsId(), new Function0() { // from class: com.transsion.usercenter.edit.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditCenterFragment.showDeleteProfileOption$lambda$26$lambda$25$lambda$24(fragmentActivity);
            }
        }).m61941X(fragmentActivity, "DeleteKidsProfileDialog");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDeleteProfileOption$lambda$26$lambda$25$lambda$24(FragmentActivity fragmentActivity) {
        fragmentActivity.finish();
        return Unit.f75682a;
    }

    private final void showEntity(Bitmap bitmap) {
        if (this.userEntity == null) {
            defaultShow();
            return;
        }
        if (bitmap == null) {
            headPortrait();
        } else {
            headPortraitBitmap(bitmap);
        }
        nickNameShow();
        genderShow();
        birthDayShow();
    }

    private final void showKidsProfileData(KidsProfile kidsProfile) {
        ShapeableImageView shapeableImageView;
        C25717k0 mViewBinding;
        ProfileEditBar profileEditBar;
        C25717k0 mViewBinding2;
        ProfileEditBar profileEditBar2;
        ProfileEditBar profileEditBar3;
        RelativeLayout relativeLayout;
        TextView textView;
        this.isKidsMode = true;
        this.currentKidsProfile = kidsProfile;
        this.oldNickName = kidsProfile.getName();
        String avatarLocalPath = kidsProfile.getAvatarLocalPath();
        if (avatarLocalPath == null || avatarLocalPath.length() == 0) {
            C25717k0 mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (shapeableImageView = mViewBinding3.f78284n) != null) {
                shapeableImageView.setImageResource(kidsProfile.getAvatarResId());
            }
        } else {
            fastAvatar(avatarLocalPath);
        }
        C25717k0 mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (textView = mViewBinding4.f78283m) != null) {
            textView.setText(kidsProfile.getName());
        }
        C25717k0 mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (relativeLayout = mViewBinding5.f78279i) != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.edit.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileEditCenterFragment.showKidsProfileData$lambda$13(this.f64790a, view);
                }
            });
        }
        Integer gender = kidsProfile.getGender();
        if (gender != null && gender.intValue() == 1) {
            C25717k0 mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (profileEditBar3 = mViewBinding6.f78274d) != null) {
                String string = getString(R$string.profile_male);
                Intrinsics.m97801g(string, "getString(...)");
                profileEditBar3.setBtnRight(string);
            }
        } else if (gender != null && gender.intValue() == 0 && (mViewBinding = getMViewBinding()) != null && (profileEditBar = mViewBinding.f78274d) != null) {
            String string2 = getString(R$string.profile_female);
            Intrinsics.m97801g(string2, "getString(...)");
            profileEditBar.setBtnRight(string2);
        }
        String birthday = kidsProfile.getBirthday();
        if (birthday != null) {
            if (birthday.length() <= 0) {
                birthday = null;
            }
            if (birthday == null || (mViewBinding2 = getMViewBinding()) == null || (profileEditBar2 = mViewBinding2.f78272b) == null) {
                return;
            }
            profileEditBar2.setBtnRight(birthday);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKidsProfileData$lambda$13(ProfileEditCenterFragment profileEditCenterFragment, View view) {
        AbstractC0249b abstractC0249b;
        FragmentActivity activity = profileEditCenterFragment.getActivity();
        if (activity != null) {
            InterfaceC23888a publishApi = profileEditCenterFragment.getPublishApi();
            Intent intentMo75364h = publishApi != null ? publishApi.mo75364h(activity) : null;
            if (intentMo75364h == null || (abstractC0249b = profileEditCenterFragment.photoLaunch) == null) {
                return;
            }
            abstractC0249b.m999a(intentMo75364h);
        }
    }

    private final void showRequestLoading() {
        ProgressBar progressBar;
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (progressBar = mViewBinding.f78278h) == null) {
            return;
        }
        AbstractC26006c.m102058k(progressBar);
    }

    private final void showTimePicker(String birthday) {
        ViewOnClickListenerC5717a viewOnClickListenerC5717a;
        if (getContext() == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1900, 0, 1);
        if (this.timePickerView == null) {
            this.timePickerView = new C27168a(getContext(), new InterfaceC27726c() { // from class: com.transsion.usercenter.edit.l
                @Override // p779t5.InterfaceC27726c
                /* JADX INFO: renamed from: a */
                public final void mo84638a(Date date, View view) {
                    ProfileEditCenterFragment.showTimePicker$lambda$32(this.f64794a, date, view);
                }
            }).m105810d(calendar, Calendar.getInstance()).m105811e(AbstractC2397b.getColor(requireContext(), R$color.text_01)).m105812f(AbstractC2397b.getColor(requireContext(), R$color.text_03)).m105808b(AbstractC2397b.getColor(requireContext(), R$color.line_01)).m105809c("", "", "", "", "", "").m105807a();
        }
        if (TextUtils.isEmpty(birthday)) {
            ViewOnClickListenerC5717a viewOnClickListenerC5717a2 = this.timePickerView;
            if (viewOnClickListenerC5717a2 != null) {
                viewOnClickListenerC5717a2.m27065B(Calendar.getInstance());
            }
        } else {
            Intrinsics.m97799e(calendar);
            setCurrentBirthDay(birthday, calendar);
        }
        ViewOnClickListenerC5717a viewOnClickListenerC5717a3 = this.timePickerView;
        if (viewOnClickListenerC5717a3 == null || viewOnClickListenerC5717a3.m27053q() || (viewOnClickListenerC5717a = this.timePickerView) == null) {
            return;
        }
        viewOnClickListenerC5717a.m27057v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTimePicker$lambda$32(ProfileEditCenterFragment profileEditCenterFragment, Date date, View view) {
        if (date == null) {
            profileEditCenterFragment.isClearBirthday = true;
            profileEditCenterFragment.editBirthday("");
            return;
        }
        profileEditCenterFragment.isClearBirthday = false;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String str = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        Intrinsics.m97799e(str);
        profileEditCenterFragment.editBirthday(str);
    }

    public final void checkBack() {
        checkEditSubmit(true);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    public final void checkEditSubmit(boolean back) {
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        String strValueOf;
        ProfileEditBar profileEditBar;
        ProfileEditBar profileEditBar2;
        ProfileEditBar profileEditBar3;
        ProfileEditBar profileEditBar4;
        ProfileEditBar profileEditBar5;
        ProfileEditBar profileEditBar6;
        ProfileEditBar profileEditBar7;
        TextView textView;
        TextView textView2;
        String name;
        int gender;
        String birthday;
        Integer age;
        ProfileEditBar profileEditBar8;
        ProfileEditBar profileEditBar9;
        TextView textView3;
        CharSequence text;
        KidsProfile kidsProfile = this.currentKidsProfile;
        String strValueOf2 = "";
        if (kidsProfile != null) {
            C25717k0 mViewBinding = getMViewBinding();
            if (mViewBinding == null || (textView3 = mViewBinding.f78283m) == null || (text = textView3.getText()) == null || (name = text.toString()) == null) {
                name = kidsProfile.getName();
            } else {
                if (name.length() <= 0) {
                    name = null;
                }
                if (name == null) {
                    name = kidsProfile.getName();
                }
            }
            String str2 = name;
            C25717k0 mViewBinding2 = getMViewBinding();
            String btnTextValue = (mViewBinding2 == null || (profileEditBar9 = mViewBinding2.f78274d) == null) ? null : profileEditBar9.getBtnTextValue();
            strValueOf2 = btnTextValue != null ? btnTextValue : "";
            if (Intrinsics.m97797c(strValueOf2, getString(R$string.profile_male))) {
                gender = 1;
            } else {
                gender = Intrinsics.m97797c(strValueOf2, getString(R$string.profile_female)) ? 0 : kidsProfile.getGender();
            }
            Integer num = gender;
            C25717k0 mViewBinding3 = getMViewBinding();
            if (mViewBinding3 == null || (profileEditBar8 = mViewBinding3.f78272b) == null || (birthday = profileEditBar8.getSetValue()) == null) {
                birthday = kidsProfile.getBirthday();
            } else {
                if (birthday.length() <= 0) {
                    birthday = null;
                }
                if (birthday == null) {
                    birthday = kidsProfile.getBirthday();
                }
            }
            String str3 = birthday;
            if (str3 == null || (age = calcAgeFromBirthday(str3)) == null) {
                age = kidsProfile.getAge();
            }
            Integer num2 = age;
            KidsAccountManager kidsAccountManager = KidsAccountManager.f50883a;
            String avatarLocalPath = this.cropImage;
            if (avatarLocalPath.length() == 0) {
                avatarLocalPath = kidsProfile.getAvatarLocalPath();
            }
            KidsAccountManager.m65176n(kidsAccountManager, kidsProfile.copy((479 & 1) != 0 ? kidsProfile.kidsId : null, (479 & 2) != 0 ? kidsProfile.name : str2, (479 & 4) != 0 ? kidsProfile.avatarResId : 0, (479 & 8) != 0 ? kidsProfile.gender : num, (479 & 16) != 0 ? kidsProfile.birthday : str3, (479 & 32) != 0 ? kidsProfile.pinHash : null, (479 & 64) != 0 ? kidsProfile.avatarLocalPath : avatarLocalPath, (479 & 128) != 0 ? kidsProfile.favorites : null, (479 & 256) != 0 ? kidsProfile.age : num2), false, 2, null);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        String strValueOf3 = this.oldNickName;
        C25717k0 mViewBinding4 = getMViewBinding();
        if (!TextUtils.equals((mViewBinding4 == null || (textView2 = mViewBinding4.f78283m) == null) ? null : textView2.getText(), this.oldNickName)) {
            C25717k0 mViewBinding5 = getMViewBinding();
            strValueOf3 = String.valueOf((mViewBinding5 == null || (textView = mViewBinding5.f78283m) == null) ? null : textView.getText());
        }
        C25717k0 mViewBinding6 = getMViewBinding();
        Boolean boolValueOf = (mViewBinding6 == null || (profileEditBar7 = mViewBinding6.f78272b) == null) ? null : Boolean.valueOf(profileEditBar7.isEmpty());
        Intrinsics.m97799e(boolValueOf);
        if (!boolValueOf.booleanValue()) {
            C25717k0 mViewBinding7 = getMViewBinding();
            if (!TextUtils.equals((mViewBinding7 == null || (profileEditBar6 = mViewBinding7.f78272b) == null) ? null : profileEditBar6.getBtnTextValue(), this.oldBirth)) {
                C25717k0 mViewBinding8 = getMViewBinding();
                strValueOf2 = String.valueOf((mViewBinding8 == null || (profileEditBar5 = mViewBinding8.f78272b) == null) ? null : profileEditBar5.getBtnTextValue());
            }
        }
        C25717k0 mViewBinding9 = getMViewBinding();
        String strValueOf4 = String.valueOf((mViewBinding9 == null || (profileEditBar4 = mViewBinding9.f78274d) == null) ? null : profileEditBar4.getBtnTextValue());
        C25717k0 mViewBinding10 = getMViewBinding();
        if (TextUtils.equals((mViewBinding10 == null || (profileEditBar3 = mViewBinding10.f78272b) == null) ? null : profileEditBar3.getBtnTextValue(), this.oldBirth) || !this.isClearBirthday) {
            str = strValueOf2;
            z11 = false;
        } else {
            C25717k0 mViewBinding11 = getMViewBinding();
            String btnTextValue2 = (mViewBinding11 == null || (profileEditBar2 = mViewBinding11.f78272b) == null) ? null : profileEditBar2.getBtnTextValue();
            Context context = getContext();
            if (TextUtils.equals(btnTextValue2, context != null ? context.getString(R$string.profile_empty_select) : null)) {
                z11 = true;
                str = "null";
            } else {
                str = strValueOf2;
                z11 = true;
            }
        }
        C25717k0 mViewBinding12 = getMViewBinding();
        if (TextUtils.equals((mViewBinding12 == null || (profileEditBar = mViewBinding12.f78274d) == null) ? null : profileEditBar.getBtnTextValue(), this.oldGender) || !this.isClearGender) {
            z12 = false;
        } else {
            strValueOf4 = "null";
            z12 = true;
        }
        if (!z12 && !z11 && TextUtils.equals(strValueOf3, this.oldNickName) && TextUtils.isEmpty(strValueOf4) && TextUtils.isEmpty(str)) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        if (back) {
            editTipsDialog();
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.network_fail);
            return;
        }
        if (TextUtils.isEmpty(this.avatarUrl)) {
            UserInfo userInfo = this.userEntity;
            strValueOf = String.valueOf(userInfo != null ? userInfo.getAvatar() : null);
            z13 = false;
        } else {
            z13 = true;
            strValueOf = this.avatarUrl;
        }
        editRequest(strValueOf, strValueOf3, buildGender(strValueOf4), str, z13);
    }

    public final void confirmSubmit() {
        checkEditSubmit(false);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C25717k0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25717k0 c25717k0M101167c = C25717k0.m101167c(inflater);
        Intrinsics.m97801g(c25717k0M101167c, "inflate(...)");
        return c25717k0M101167c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        this.photoLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.usercenter.edit.e
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                ProfileEditCenterFragment.initView$lambda$39(this.f64786a, (ActivityResult) obj);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        initView();
        iniData();
    }

    public void onAvatarUrl(final String data, final String localPath, final String bucket) {
        Intrinsics.m97802h(data, "data");
        Intrinsics.m97802h(localPath, "localPath");
        Intrinsics.m97802h(bucket, "bucket");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.transsion.usercenter.edit.m
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileEditCenterFragment.onAvatarUrl$lambda$27(data, this, localPath, bucket);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C26742b c26742b = this.presenter;
        if (c26742b != null) {
            c26742b.mo104539b();
        }
    }

    @Override // com.transsion.usercenter.edit.dialog.EditNameDialog.InterfaceC20452a
    public void onDialogConfirm(String result) {
        RelativeLayout relativeLayout;
        if (!TextUtils.isEmpty(result)) {
            if (result != null) {
                editNickName(result);
            }
        } else {
            C25717k0 mViewBinding = getMViewBinding();
            if (mViewBinding == null || (relativeLayout = mViewBinding.f78280j) == null) {
                return;
            }
            relativeLayout.postDelayed(new Runnable() { // from class: com.transsion.usercenter.edit.p
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileEditCenterFragment.onDialogConfirm$lambda$34(this.f64802a);
                }
            }, 100L);
        }
    }

    @Override // pw.ViewOnClickListenerC26954b.a
    public void onDialogSelect(int position, String result) {
        Intrinsics.m97802h(result, "result");
        if (position == 2) {
            this.isClearGender = true;
            editGender("");
        } else {
            this.isClearGender = false;
            editGender(result);
        }
    }

    @Override // com.transsion.usercenter.edit.InterfaceC20449b
    public void onEditProfile(boolean status) {
        String string;
        String string2;
        ProfileEditBar profileEditBar;
        String btnTextValue;
        String string3;
        ProfileEditBar profileEditBar2;
        String btnTextValue2;
        TextView textView;
        CharSequence text;
        FragmentActivity activity;
        InterfaceC23704a interfaceC23704a;
        String avatar;
        String userId;
        InterfaceC23704a interfaceC23704a2;
        int iO0;
        ProgressBar progressBar;
        hideRequestLoading();
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f78278h) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        if (!status) {
            this.isChangeAvatar = false;
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            KeyboardUtils.m27130d(activity2);
        }
        C28951b.f88586a.m111454d(R$string.profile_saved_success);
        boolean z11 = this.isChangeAvatar;
        InterfaceC23704a interfaceC23704a3 = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        UserInfo userInfoMo90386h = interfaceC23704a3 != null ? interfaceC23704a3.mo90386h() : null;
        String str = "";
        if (this.isChangeAvatar) {
            this.isChangeAvatar = false;
            String str2 = this.editText;
            if (userInfoMo90386h == null || (avatar = userInfoMo90386h.getAvatar()) == null) {
                avatar = "";
            }
            if (!StringsKt.m98242W(str2, "http", false, 2, null) && StringsKt.m98242W(avatar, "http", false, 2, null) && (iO0 = StringsKt.m98156o0(avatar, "image/", 0, false, 6, null)) > 0) {
                String strSubstring = avatar.substring(0, iO0);
                Intrinsics.m97801g(strSubstring, "substring(...)");
                str2 = strSubstring + str2;
            }
            UserInfo userInfo = this.userEntity;
            if (userInfo != null) {
                userInfo.setAvatar(str2);
            }
            if (userInfoMo90386h != null) {
                userInfoMo90386h.setAvatar(str2);
            }
            this.editText = "";
            if (userInfoMo90386h != null && (userId = userInfoMo90386h.getUserId()) != null && (interfaceC23704a2 = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0])) != null) {
                interfaceC23704a2.mo90384f(userId);
            }
        } else {
            C25717k0 mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (textView = mViewBinding2.f78283m) == null || (text = textView.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            if (string.length() > 0) {
                UserInfo userInfo2 = this.userEntity;
                if (userInfo2 != null) {
                    userInfo2.setNickname(string);
                }
                if (userInfoMo90386h != null) {
                    userInfoMo90386h.setNickname(string);
                }
            }
            C25717k0 mViewBinding3 = getMViewBinding();
            if (mViewBinding3 == null || (profileEditBar2 = mViewBinding3.f78272b) == null || (btnTextValue2 = profileEditBar2.getBtnTextValue()) == null || (string2 = btnTextValue2.toString()) == null) {
                string2 = "";
            }
            if (Intrinsics.m97797c(string2, getString(R$string.profile_empty_select))) {
                string2 = "";
            }
            UserInfo userInfo3 = this.userEntity;
            if (userInfo3 != null) {
                userInfo3.setBirthday(string2);
            }
            if (userInfoMo90386h != null) {
                userInfoMo90386h.setBirthday(string2);
            }
            C25717k0 mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (profileEditBar = mViewBinding4.f78274d) != null && (btnTextValue = profileEditBar.getBtnTextValue()) != null && (string3 = btnTextValue.toString()) != null) {
                str = string3;
            }
            int iBuildGender = buildGender(str);
            UserInfo userInfo4 = this.userEntity;
            if (userInfo4 != null) {
                userInfo4.setGender(iBuildGender);
            }
            if (userInfoMo90386h != null) {
                userInfoMo90386h.setGender(iBuildGender);
            }
        }
        if (userInfoMo90386h != null && (interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0])) != null) {
            interfaceC23704a.mo90381c(userInfoMo90386h);
        }
        if (z11 || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // com.transsion.usercenter.edit.InterfaceC20449b
    public void onError(String code, final String msg) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.transsion.usercenter.edit.r
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileEditCenterFragment.onError$lambda$31(this.f64803a, msg);
                }
            });
        }
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onRightButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }

    @Override // com.transsion.usercenter.edit.InterfaceC20449b
    public void onUserInfo(UserInfo userInfo) {
        ProgressBar progressBar;
        this.userEntity = userInfo;
        C25717k0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (progressBar = mViewBinding.f78278h) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        setOldData();
        formattingGender();
        showEntity(null);
        showDeleteProfileOption();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("sourceType", 2)) : null;
        Intrinsics.m97799e(numValueOf);
        numValueOf.intValue();
        super.onViewCreated(view, savedInstanceState);
    }

    public final void uploadImage(String imagePath) {
        Intrinsics.m97802h(imagePath, "imagePath");
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.network_fail);
            return;
        }
        if (TextUtils.isEmpty(imagePath)) {
            return;
        }
        showRequestLoading();
        this.respDuration = System.currentTimeMillis();
        C26742b c26742b = this.presenter;
        if (c26742b != null) {
            c26742b.m104544g(imagePath, new C20446c());
        }
    }
}
