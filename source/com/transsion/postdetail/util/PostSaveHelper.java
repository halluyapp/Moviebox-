package com.transsion.postdetail.util;

import android.app.Application;
import android.os.Environment;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.ninegridview.R$string;
import com.transsion.ninegridview.helper.FileHelper;
import com.transsion.ninegridview.preview.GifImagePreviewActivity;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
public final class PostSaveHelper {

    /* JADX INFO: renamed from: a */
    public static final PostSaveHelper f57808a = new PostSaveHelper();

    /* JADX INFO: renamed from: com.transsion.postdetail.util.PostSaveHelper$a */
    public static final class C17430a implements RequestListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Ref.IntRef f57809a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Image f57810b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Ref.ObjectRef f57811c;

        C17430a(Ref.IntRef intRef, Image image, Ref.ObjectRef objectRef) {
            this.f57809a = intRef;
            this.f57810b = image;
            this.f57811c = objectRef;
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(File resource, Object model, Target target, DataSource dataSource, boolean z11) {
            Intrinsics.m97802h(resource, "resource");
            Intrinsics.m97802h(model, "model");
            Intrinsics.m97802h(target, "target");
            Intrinsics.m97802h(dataSource, "dataSource");
            this.f57809a.element++;
            PostSaveHelper.f57808a.m74904f(resource, this.f57810b.getUrl(), this.f57809a.element == ((List) this.f57811c.element).size());
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z11) {
            Intrinsics.m97802h(target, "target");
            C28951b.f88586a.m111454d(R$string.download_failed);
            return false;
        }
    }

    private PostSaveHelper() {
    }

    /* JADX INFO: renamed from: d */
    private final String m74903d(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = (String[]) StringsKt.m98117S0(str, new String[]{"[?]"}, false, 0, 6, null).toArray(new String[0]);
        if (!(strArr.length == 0)) {
            String[] strArr2 = (String[]) StringsKt.m98117S0(strArr[0], new String[]{"/"}, false, 0, 6, null).toArray(new String[0]);
            if (!(strArr2.length == 0)) {
                return System.currentTimeMillis() + "_" + strArr2[strArr2.length - 1];
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m74904f(File file, String str, boolean z11) {
        String strM74903d = m74903d(str);
        if (new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), GifImagePreviewActivity.PICTURE_SAVE + File.separator + strM74903d).exists()) {
            C28951b.f88586a.m111454d(R$string.has_been_saved);
            return;
        }
        if (file == null || strM74903d == null) {
            return;
        }
        FileHelper fileHelper = FileHelper.f55226a;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        fileHelper.m71365f(file, applicationM27275a, strM74903d, GifImagePreviewActivity.PICTURE_SAVE, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m74905b(PostSubjectItem postSubjectItem) {
        Media media;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            return;
        }
        C28951b.f88586a.m111454d(com.transsion.baseui.R$string.post_start_saving);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (postSubjectItem == null || (media = postSubjectItem.getMedia()) == null) ? 0 : media.getImage();
        Ref.IntRef intRef = new Ref.IntRef();
        List<Image> list = (List) objectRef.element;
        if (list != null) {
            for (Image image : list) {
                Glide.with(Utils.m27275a()).downloadOnly().load2(image.getUrl()).listener(new C17430a(intRef, image, objectRef)).preload();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m74906c(PostSubjectItem postSubjectItem) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PostSaveHelper$downloadVideo$1(postSubjectItem, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m74907e(PostSubjectItem postSubjectItem) {
        Media media;
        Media media2;
        Media media3;
        String mediaType = null;
        if (Intrinsics.m97797c((postSubjectItem == null || (media3 = postSubjectItem.getMedia()) == null) ? null : media3.getMediaType(), MediaType.VIDEO.getValue())) {
            m74906c(postSubjectItem);
            return;
        }
        if (!Intrinsics.m97797c((postSubjectItem == null || (media2 = postSubjectItem.getMedia()) == null) ? null : media2.getMediaType(), MediaType.IMAGE.getValue())) {
            if (postSubjectItem != null && (media = postSubjectItem.getMedia()) != null) {
                mediaType = media.getMediaType();
            }
            if (!Intrinsics.m97797c(mediaType, MediaType.IMAGE_SINGLE.getValue())) {
                return;
            }
        }
        m74905b(postSubjectItem);
    }
}
