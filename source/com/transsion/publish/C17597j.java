package com.transsion.publish;

import android.content.Context;
import android.content.Intent;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.publish.api.GroupBean;
import com.transsion.publish.p307ui.FilmReviewActivity;
import com.transsion.publish.p307ui.SelectImageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.mvel2.ast.ASTNode;
import p465hp.InterfaceC23888a;

/* JADX INFO: renamed from: com.transsion.publish.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17597j implements InterfaceC23888a {
    @Override // p465hp.InterfaceC23888a
    /* JADX INFO: renamed from: a */
    public void mo75357a(Context context, String groupId, String groupName, String groupImage) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(groupId, "groupId");
        Intrinsics.m97802h(groupName, "groupName");
        Intrinsics.m97802h(groupImage, "groupImage");
        Intent intent = new Intent(context, (Class<?>) FilmReviewActivity.class);
        intent.setFlags(ASTNode.DEOP);
        intent.putExtra("sourceType", 2);
        GroupBean groupBean = new GroupBean();
        groupBean.setGroupId(groupId);
        groupBean.setName(groupName);
        groupBean.setAvatar(groupImage);
        intent.putExtra("group", groupBean);
        context.startActivity(intent);
    }

    @Override // p465hp.InterfaceC23888a
    /* JADX INFO: renamed from: b */
    public void mo75358b(Context context) {
        Intrinsics.m97802h(context, "context");
        Intent intent = new Intent(context, (Class<?>) FilmReviewActivity.class);
        intent.setFlags(ASTNode.DEOP);
        intent.putExtra("sourceType", 2);
        context.startActivity(intent);
    }

    @Override // p465hp.InterfaceC23888a
    /* JADX INFO: renamed from: c */
    public void mo75359c() {
        PublishManager.INSTANCE.m75177a().reset();
    }

    @Override // p465hp.InterfaceC23888a
    /* JADX INFO: renamed from: d */
    public boolean mo75360d() {
        return PublishManager.INSTANCE.m75177a().getUploading();
    }

    @Override // p465hp.InterfaceC23888a
    /* JADX INFO: renamed from: e */
    public void mo75361e(Context context, String subjectId, String cover, String title, String description, int i11) {
        Subject subject;
        Intent intent;
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(cover, "cover");
        Intrinsics.m97802h(title, "title");
        Intrinsics.m97802h(description, "description");
        Intent intent2 = new Intent(context, (Class<?>) FilmReviewActivity.class);
        intent2.setFlags(ASTNode.DEOP);
        intent2.putExtra("sourceType", 2);
        intent2.putExtra("sourceMode", i11);
        Subject subject2 = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -1, 67108863, null);
        if (subject2.getCover() == null) {
            intent = intent2;
            subject = subject2;
            subject.setCover(new Cover(0, 0, 0, cover, "", "", null, null, null, 384, null));
        } else {
            subject = subject2;
            intent = intent2;
            Cover cover2 = subject.getCover();
            if (cover2 != null) {
                cover2.setUrl(cover);
            }
        }
        subject.setSubjectId(subjectId);
        subject.setTitle(title);
        subject.setDescription(description);
        intent.putExtra("subject", subject);
        context.startActivity(intent);
    }

    @Override // p465hp.InterfaceC23888a
    /* JADX INFO: renamed from: f */
    public boolean mo75362f() {
        return PublishManager.INSTANCE.m75177a().getUploadFail();
    }

    @Override // p465hp.InterfaceC23888a
    /* JADX INFO: renamed from: g */
    public void mo75363g(Context context, String subjectId, String cover, String title, String description, int i11) {
        Subject subject;
        Intent intent;
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(cover, "cover");
        Intrinsics.m97802h(title, "title");
        Intrinsics.m97802h(description, "description");
        Intent intent2 = new Intent(context, (Class<?>) FilmReviewActivity.class);
        intent2.setFlags(ASTNode.DEOP);
        intent2.putExtra("sourceType", 1);
        intent2.putExtra("sourceMode", i11);
        Subject subject2 = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -1, 67108863, null);
        if (subject2.getCover() == null) {
            intent = intent2;
            subject = subject2;
            subject.setCover(new Cover(0, 0, 0, cover, "", "", null, null, null, 384, null));
        } else {
            subject = subject2;
            intent = intent2;
            Cover cover2 = subject.getCover();
            if (cover2 != null) {
                cover2.setUrl(cover);
            }
        }
        subject.setSubjectId(subjectId);
        subject.setTitle(title);
        subject.setDescription(description);
        intent.putExtra("subject", subject);
        context.startActivity(intent);
    }

    @Override // p465hp.InterfaceC23888a
    /* JADX INFO: renamed from: h */
    public Intent mo75364h(Context context) {
        Intrinsics.m97802h(context, "context");
        Intent intent = new Intent(context, (Class<?>) SelectImageActivity.class);
        intent.putExtra("key_type", 7);
        return intent;
    }
}
