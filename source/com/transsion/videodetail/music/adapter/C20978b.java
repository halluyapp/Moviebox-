package com.transsion.videodetail.music.adapter;

import android.text.TextUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.transsion.baselib.p291db.music.MusicLikedDbBean;
import com.transsion.videodetail.music.bean.MusicLikedMultiItemEntity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.videodetail.music.adapter.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C20978b extends DiffUtil.AbstractC4170a {

    /* JADX INFO: renamed from: a */
    private final List f65794a;

    /* JADX INFO: renamed from: b */
    private final List f65795b;

    public C20978b(List oldList, List newList) {
        Intrinsics.m97802h(oldList, "oldList");
        Intrinsics.m97802h(newList, "newList");
        this.f65794a = oldList;
        this.f65795b = newList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4170a
    /* JADX INFO: renamed from: a */
    public boolean mo20655a(int i11, int i12) {
        return Intrinsics.m97797c(this.f65794a.get(i11), this.f65795b.get(i12));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4170a
    /* JADX INFO: renamed from: b */
    public boolean mo20656b(int i11, int i12) {
        MusicLikedDbBean musicLikedDbBean = ((MusicLikedMultiItemEntity) this.f65794a.get(i11)).getMusicLikedDbBean();
        String subjectId = musicLikedDbBean != null ? musicLikedDbBean.getSubjectId() : null;
        MusicLikedDbBean musicLikedDbBean2 = ((MusicLikedMultiItemEntity) this.f65795b.get(i12)).getMusicLikedDbBean();
        return TextUtils.equals(subjectId, musicLikedDbBean2 != null ? musicLikedDbBean2.getSubjectId() : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4170a
    /* JADX INFO: renamed from: d */
    public int mo20658d() {
        return this.f65795b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4170a
    /* JADX INFO: renamed from: e */
    public int mo20659e() {
        return this.f65794a.size();
    }
}
