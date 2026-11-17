package com.transsion.subtitle_download.task;

import android.app.Application;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19771b;
import com.transsion.subtitle_download.utils.C19774e;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.subtitle_download.task.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C19769q {

    /* JADX INFO: renamed from: a */
    public static final C19769q f63085a = new C19769q();

    private C19769q() {
    }

    /* JADX INFO: renamed from: a */
    private final String m82356a() {
        String simpleName = C19769q.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: b */
    private final void m82357b(String str, SubtitleDownloadTable subtitleDownloadTable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("resource_id", subtitleDownloadTable.getResourceId());
        String taskId = subtitleDownloadTable.getTaskId();
        if (taskId == null) {
            taskId = "";
        }
        linkedHashMap.put("taskId", taskId);
        String subjectId = subtitleDownloadTable.getSubjectId();
        if (subjectId != null && subjectId.length() != 0) {
            String subjectId2 = subtitleDownloadTable.getSubjectId();
            if (subjectId2 == null) {
                subjectId2 = "";
            }
            linkedHashMap.put("subject_id", subjectId2);
        }
        String ops = subtitleDownloadTable.getOps();
        if (ops != null && ops.length() != 0) {
            String ops2 = subtitleDownloadTable.getOps();
            if (ops2 == null) {
                ops2 = "";
            }
            linkedHashMap.put("ops", ops2);
        }
        if (subtitleDownloadTable.getEp() > 0) {
            linkedHashMap.put("ep", String.valueOf(subtitleDownloadTable.getEp()));
        }
        if (subtitleDownloadTable.getSe() > 0) {
            linkedHashMap.put("se", String.valueOf(subtitleDownloadTable.getSe()));
        }
        String lan = subtitleDownloadTable.getLan();
        if (lan == null) {
            lan = "";
        }
        linkedHashMap.put("lan", lan);
        String lanName = subtitleDownloadTable.getLanName();
        linkedHashMap.put("lan_name", lanName != null ? lanName : "");
        linkedHashMap.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(subtitleDownloadTable.getType()));
        linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(subtitleDownloadTable.getStatus()));
        linkedHashMap.put(EventConstants.KEY_ACTION, str);
        C24662i.f75350a.m96884s("st_download_v2", "subtitle_download", linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public final void m82358c(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        C19771b.f63088a.m82367c(m82356a() + " --> reportDownloadSuccess() --> 字幕任务下载成功 --> taskId = " + stDownloadTable.getTaskId() + " ");
        m82357b(NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, stDownloadTable);
    }

    /* JADX INFO: renamed from: d */
    public final void m82359d(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        if (TextUtils.isEmpty(stDownloadTable.getTaskId())) {
            String strM82377g = C19774e.f63091a.m82377g();
            stDownloadTable.setTaskId(strM82377g);
            SubtitleDownloadDatabase.Companion c19749d = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            c19749d.m82292b(applicationM27275a).mo82290l0().mo106547f(stDownloadTable);
            C19771b.f63088a.m82367c(m82356a() + " --> reportDownloadTrigger() --> 用户创建了字幕下载任务 --> taskId = " + strM82377g);
            m82357b("trigger", stDownloadTable);
        }
    }
}
