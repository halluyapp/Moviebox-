package com.transsion.moviedetail.preload;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p843vm.InterfaceC28133c;

/* JADX INFO: renamed from: com.transsion.moviedetail.preload.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C16116d implements InterfaceC28133c {
    @Override // p843vm.InterfaceC28133c
    /* JADX INFO: renamed from: a */
    public List mo70666a(String str, Bundle bundle) {
        List listEmptyList;
        String string;
        if (Intrinsics.m97797c(str, "/movie/detail")) {
            Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("season")) : null;
            if (bundle == null || (string = bundle.getString("id")) == null || (listEmptyList = CollectionsKt.m97502h(new C16114b(string, numValueOf, false, 4, null), new MovieDetailDownloadListLoader(string), new MovieDetailResourcesSeasonLoader(string))) == null) {
                listEmptyList = Collections.emptyList();
                Intrinsics.m97801g(listEmptyList, "emptyList(...)");
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList != null) {
            return listEmptyList;
        }
        Intrinsics.m97819y("iPreloadList");
        return null;
    }

    @Override // p843vm.InterfaceC28133c
    public String getPath() {
        return "/movie/detail";
    }
}
