package com.transsion.postdetail.util;

import android.app.Application;
import android.net.Uri;
import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.widget.R$string;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Video;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.util.PostSaveHelper$downloadVideo$1", m97637f = "PostSaveHelper.kt", m97638l = {46}, m97639m = "invokeSuspend")
final class PostSaveHelper$downloadVideo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PostSubjectItem $item;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostSaveHelper$downloadVideo$1(PostSubjectItem postSubjectItem, Continuation<? super PostSaveHelper$downloadVideo$1> continuation) {
        super(2, continuation);
        this.$item = postSubjectItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostSaveHelper$downloadVideo$1(this.$item, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PostSaveHelper$downloadVideo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String url;
        Media media;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return Unit.f75682a;
            }
            C28951b.f88586a.m111454d(com.transsion.baseui.R$string.post_start_saving);
            PostSubjectItem postSubjectItem = this.$item;
            Video videoM74975a = AbstractC17450t.m74975a((postSubjectItem == null || (media = postSubjectItem.getMedia()) == null) ? null : media.getVideo());
            if (videoM74975a == null || (url = videoM74975a.getUrl()) == null) {
                url = "";
            }
            String str = "MB_" + System.currentTimeMillis() + ".mp4";
            VideoSaver videoSaver = VideoSaver.f57821a;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            this.label = 1;
            obj = videoSaver.m74952c(applicationM27275a, url, str, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        if (((Uri) obj) != null) {
            C28951b.f88586a.m111454d(com.transsion.baseui.R$string.post_saved_to_gallery);
        }
        return Unit.f75682a;
    }
}
