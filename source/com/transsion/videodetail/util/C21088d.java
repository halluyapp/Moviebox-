package com.transsion.videodetail.util;

import com.transsion.moviedetailapi.bean.ResourcesSeason;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.videodetail.VideoDetailViewModel;
import com.transsion.videodetail.bean.VideoDetailMediaSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.videodetail.util.d */
/* JADX INFO: loaded from: classes7.dex */
public final class C21088d {

    /* JADX INFO: renamed from: a */
    public static final C21088d f65963a = new C21088d();

    private C21088d() {
    }

    /* JADX INFO: renamed from: a */
    public final List m86499a(VideoDetailViewModel viewModel, int i11) {
        List<ResourcesSeason> seasons;
        Intrinsics.m97802h(viewModel, "viewModel");
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) viewModel.m86130y().m14847f();
        int size = (resourcesSeasonList == null || (seasons = resourcesSeasonList.getSeasons()) == null) ? 1 : seasons.size();
        ArrayList arrayList = new ArrayList();
        List<VideoDetailMediaSource> list = (List) viewModel.m86124s().m14847f();
        if (list != null) {
            if (size <= 1) {
                arrayList.addAll(list);
            } else {
                for (VideoDetailMediaSource videoDetailMediaSource : list) {
                    if (videoDetailMediaSource.getSe() == i11) {
                        arrayList.add(videoDetailMediaSource);
                    }
                }
            }
        }
        return arrayList;
    }
}
