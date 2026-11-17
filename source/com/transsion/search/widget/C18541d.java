package com.transsion.search.widget;

import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.PlayUrl;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.search.bean.GroupInfo;
import com.transsion.search.bean.HotSubject;
import com.transsion.search.bean.SuggestEntity;
import com.transsion.search.bean.VerticalRank;
import com.transsion.search.fragment.BaseSearchMainFragment;
import com.transsion.search.fragment.hot.SearchHotFragment;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.search.widget.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18541d {

    /* JADX INFO: renamed from: a */
    public static final a f60046a = new a(null);

    /* JADX INFO: renamed from: com.transsion.search.widget.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m78121a(Group group, int i11, long j11, String str, String str2, String str3, String sugSource) {
            String groupId;
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_item_browse");
            String str4 = "";
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("index", String.valueOf(i11));
            map.put("tabId", String.valueOf(str3));
            map.put("duration", String.valueOf(j11));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            if (group != null && (groupId = group.getGroupId()) != null) {
                str4 = groupId;
            }
            map.put("group_id", str4);
            map.put("hasJoin", String.valueOf(group != null ? group.getHasJoin() : null));
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65142e("searchresult", map);
        }

        /* JADX INFO: renamed from: b */
        public final void m78122b(Group group, int i11, String str, String str2, String str3, String sugSource) {
            String groupId;
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_item_click");
            String str4 = "";
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("index", String.valueOf(i11));
            map.put("tabId", String.valueOf(str3));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            if (group != null && (groupId = group.getGroupId()) != null) {
                str4 = groupId;
            }
            map.put("group_id", str4);
            map.put("hasJoin", String.valueOf(group != null ? group.getHasJoin() : null));
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f("searchresult", map);
        }

        /* JADX INFO: renamed from: c */
        public final void m78123c(String sugSource) {
            Intrinsics.m97802h(sugSource, "sugSource");
            C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, MapsKt.m97577l(TuplesKt.m97108a("event_type", "history_delete"), TuplesKt.m97108a("search_id", BaseSearchMainFragment.INSTANCE.m77677a()), TuplesKt.m97108a("sug_source", sugSource)));
        }

        /* JADX INFO: renamed from: d */
        public final void m78124d(boolean z11, String sugSource) {
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("isExpand", String.valueOf(z11));
            map.put("event_type", "history_expand");
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: e */
        public final void m78125e(String str, int i11, String sugSource) {
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            map.put("index", String.valueOf(i11));
            map.put("event_type", "history_browse");
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65138a(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: f */
        public final void m78126f(String keyWord, int i11, String sugSource) {
            Intrinsics.m97802h(keyWord, "keyWord");
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("keyword", keyWord);
            map.put("index", String.valueOf(i11));
            map.put("event_type", "history_click");
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: g */
        public final void m78127g(String str, int i11, String sugSource) {
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            map.put("index", String.valueOf(i11));
            map.put("event_type", "hot_word_browse");
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65142e(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: h */
        public final void m78128h(String keyword, int i11, String sugSource) {
            Intrinsics.m97802h(keyword, "keyword");
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("keyword", keyword);
            map.put("index", String.valueOf(i11));
            map.put("event_type", "hot_word_click");
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: i */
        public final void m78129i(String str, String str2, String sugSource) {
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("event_type", "result_empty");
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65142e("searchresult", map);
        }

        /* JADX INFO: renamed from: j */
        public final void m78130j(VerticalRank verticalRank, int i11, long j11, String str, String str2, String str3, String sugSource) {
            String title;
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_item_browse");
            String str4 = "";
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("index", String.valueOf(i11));
            map.put("tabId", String.valueOf(str3));
            map.put("duration", String.valueOf(j11));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            if (verticalRank != null && (title = verticalRank.getTitle()) != null) {
                str4 = title;
            }
            map.put("rank_title", str4);
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65142e("searchresult", map);
        }

        /* JADX INFO: renamed from: k */
        public final void m78131k(VerticalRank verticalRank, int i11, String str, String str2, String str3, String sugSource) {
            String title;
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_item_click");
            String str4 = "";
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("index", String.valueOf(i11));
            map.put("tabId", String.valueOf(str3));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            if (verticalRank != null && (title = verticalRank.getTitle()) != null) {
                str4 = title;
            }
            map.put("rank_title", str4);
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f("searchresult", map);
        }

        /* JADX INFO: renamed from: l */
        public final void m78132l(GroupInfo group, int i11, String parentCategory, int i12, boolean z11, String sugSource) {
            Intrinsics.m97802h(group, "group");
            Intrinsics.m97802h(parentCategory, "parentCategory");
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "hot_rank_browse");
            map.put("group_id", group.getGroupId());
            map.put("ops", group.getOps());
            map.put("index", String.valueOf(i11));
            map.put("lowMemoryDevice", String.valueOf(z11));
            map.put("parentTitle", parentCategory);
            map.put("parentIndex", String.valueOf(i12));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65138a(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: m */
        public final void m78133m(GroupInfo group, int i11, String parentCategory, int i12, boolean z11, String sugSource) {
            Intrinsics.m97802h(group, "group");
            Intrinsics.m97802h(parentCategory, "parentCategory");
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "hot_rank_click");
            map.put("group_id", group.getGroupId());
            map.put("index", String.valueOf(i11));
            map.put("ops", group.getOps());
            map.put("lowMemoryDevice", String.valueOf(z11));
            map.put("parentTitle", parentCategory);
            map.put("parentIndex", String.valueOf(i12));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: n */
        public final void m78134n(HotSubject hotSubject, int i11, String parentCategory, int i12, boolean z11, String sugSource) {
            Intrinsics.m97802h(hotSubject, "hotSubject");
            Intrinsics.m97802h(parentCategory, "parentCategory");
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "hot_rank_browse");
            String subjectId = hotSubject.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            map.put("subject_id", subjectId);
            map.put("index", String.valueOf(i11));
            map.put("subject_type", String.valueOf(hotSubject.getSubjectType()));
            String ops = hotSubject.getOps();
            map.put("ops", ops != null ? ops : "");
            map.put("lowMemoryDevice", String.valueOf(z11));
            map.put("parentTitle", parentCategory);
            map.put("parentIndex", String.valueOf(i12));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65138a(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: o */
        public final void m78135o(HotSubject hotSubject, int i11, String parentCategory, int i12, boolean z11, String sugSource) {
            Intrinsics.m97802h(hotSubject, "hotSubject");
            Intrinsics.m97802h(parentCategory, "parentCategory");
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "hot_rank_click");
            String subjectId = hotSubject.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            map.put("subject_id", subjectId);
            map.put("index", String.valueOf(i11));
            map.put("subject_type", String.valueOf(hotSubject.getSubjectType()));
            String ops = hotSubject.getOps();
            map.put("ops", ops != null ? ops : "");
            map.put("lowMemoryDevice", String.valueOf(z11));
            map.put("parentTitle", parentCategory);
            map.put("parentIndex", String.valueOf(i12));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f(SearchHotFragment.PAGE_NAME, map);
        }

        /* JADX INFO: renamed from: p */
        public final void m78136p(String str, String str2, long j11, int i11, String sugSource) {
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_scroll_skip");
            if (str2 == null) {
                str2 = "";
            }
            map.put("keyword", str2);
            map.put("tabId", String.valueOf(str));
            map.put("skip_item", String.valueOf(j11));
            map.put("fromIndex", String.valueOf(i11));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f("searchresult", map);
        }

        /* JADX INFO: renamed from: q */
        public final void m78137q(String keyword, String str, String sugSource) {
            Intrinsics.m97802h(keyword, "keyword");
            Intrinsics.m97802h(sugSource, "sugSource");
            if (str == null) {
                str = "";
            }
            C14450a.f50860a.m65139b("searchresult", MapsKt.m97577l(TuplesKt.m97108a("search_from", str), TuplesKt.m97108a("keyword", keyword), TuplesKt.m97108a("event_type", "search"), TuplesKt.m97108a("search_id", BaseSearchMainFragment.INSTANCE.m77677a()), TuplesKt.m97108a("sug_source", sugSource)));
        }

        /* JADX INFO: renamed from: r */
        public final void m78138r(Staff staff, int i11, long j11, String str, String str2, String str3, String sugSource) {
            String staffId;
            String ops;
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_item_browse");
            String str4 = "";
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("index", String.valueOf(i11));
            map.put("tabId", String.valueOf(str3));
            map.put("duration", String.valueOf(j11));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            if (staff == null || (staffId = staff.getStaffId()) == null) {
                staffId = "";
            }
            map.put("staff_id", staffId);
            if (staff != null && (ops = staff.getOps()) != null) {
                str4 = ops;
            }
            map.put("ops", str4);
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65142e("searchresult", map);
        }

        /* JADX INFO: renamed from: s */
        public final void m78139s(Staff staff, int i11, String str, String str2, String str3, String sugSource) {
            String staffId;
            String ops;
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_item_click");
            String str4 = "";
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("index", String.valueOf(i11));
            map.put("tabId", String.valueOf(str3));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            if (staff == null || (staffId = staff.getStaffId()) == null) {
                staffId = "";
            }
            map.put("staff_id", staffId);
            if (staff != null && (ops = staff.getOps()) != null) {
                str4 = ops;
            }
            map.put("ops", str4);
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f("searchresult", map);
        }

        /* JADX INFO: renamed from: t */
        public final void m78140t(Subject subject, int i11, long j11, String str, String str2, String str3, String sugSource) {
            String subjectId;
            String ops;
            String string;
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_item_browse");
            String str4 = "";
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("index", String.valueOf(i11));
            map.put("tabId", String.valueOf(str3));
            map.put("duration", String.valueOf(j11));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            if (subject == null || (subjectId = subject.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("subject_id", subjectId);
            map.put("subject_type", String.valueOf(subject != null ? subject.getSubjectType() : null));
            if (subject == null || (ops = subject.getOps()) == null) {
                ops = "";
            }
            map.put("ops", ops);
            if (subject != null && (string = Integer.valueOf(subject.getSeason()).toString()) != null) {
                str4 = string;
            }
            map.put("season", str4);
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65142e("searchresult", map);
        }

        /* JADX INFO: renamed from: u */
        public final void m78141u(Subject subject, int i11, String str, String str2, String str3, String sugSource) {
            String subjectId;
            String ops;
            String strValueOf;
            String string;
            PlayUrl playUrl;
            PlayUrl playUrl2;
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            map.put("event_type", "result_item_click");
            String str4 = "";
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("search_from", str2);
            map.put("index", String.valueOf(i11));
            map.put("tabId", String.valueOf(str3));
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            if (subject == null || (subjectId = subject.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("subject_id", subjectId);
            String urlType = null;
            map.put("subject_type", String.valueOf(subject != null ? subject.getSubjectType() : null));
            if (subject == null || (ops = subject.getOps()) == null) {
                ops = "";
            }
            map.put("ops", ops);
            String playUrl3 = (subject == null || (playUrl2 = subject.getPlayUrl()) == null) ? null : playUrl2.getPlayUrl();
            if (playUrl3 == null || playUrl3.length() == 0) {
                strValueOf = "NOT_URL";
            } else {
                if (subject != null && (playUrl = subject.getPlayUrl()) != null) {
                    urlType = playUrl.getUrlType();
                }
                strValueOf = String.valueOf(urlType);
            }
            map.put("jump_type", strValueOf);
            if (subject != null && (string = Integer.valueOf(subject.getSeason()).toString()) != null) {
                str4 = string;
            }
            map.put("season", str4);
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f("searchresult", map);
        }

        /* JADX INFO: renamed from: v */
        public final void m78142v(SuggestEntity suggestEntity, Integer num, String keyWord, String str, String sugSource) {
            String word;
            String subjectId;
            VerticalRank verticalRank;
            String title;
            Subject subject;
            Intrinsics.m97802h(keyWord, "keyWord");
            Intrinsics.m97802h(sugSource, "sugSource");
            try {
                Result.Companion companion = Result.INSTANCE;
                HashMap map = new HashMap();
                map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(suggestEntity != null ? suggestEntity.getType() : null));
                map.put(MBridgeConstans.KEY_WORD, keyWord);
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                map.put("ops", str);
                if (suggestEntity == null || (word = suggestEntity.getWord()) == null) {
                    word = "";
                }
                map.put(CampaignEx.JSON_KEY_TITLE, word);
                if (suggestEntity == null || (subject = suggestEntity.getSubject()) == null || (subjectId = subject.getSubjectId()) == null) {
                    subjectId = "";
                }
                map.put("subject_id", subjectId);
                if (suggestEntity != null && (verticalRank = suggestEntity.getVerticalRank()) != null && (title = verticalRank.getTitle()) != null) {
                    str2 = title;
                }
                map.put("word", str2);
                map.put("index", String.valueOf(num));
                map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
                map.put("sug_source", sugSource);
                C24662i.f75350a.m96872D("search_suggest", map);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }

        /* JADX INFO: renamed from: w */
        public final void m78143w(SuggestEntity suggestEntity, int i11, String keyWord, String str, String sugSource) {
            String word;
            String subjectId;
            String title;
            Staff staff;
            String staffId;
            VerticalRank verticalRank;
            Subject subject;
            Intrinsics.m97802h(keyWord, "keyWord");
            Intrinsics.m97802h(sugSource, "sugSource");
            try {
                Result.Companion companion = Result.INSTANCE;
                HashMap map = new HashMap();
                map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(suggestEntity != null ? suggestEntity.getType() : null));
                map.put(MBridgeConstans.KEY_WORD, keyWord);
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                map.put("ops", str);
                if (suggestEntity == null || (word = suggestEntity.getWord()) == null) {
                    word = "";
                }
                map.put(CampaignEx.JSON_KEY_TITLE, word);
                if (suggestEntity == null || (subject = suggestEntity.getSubject()) == null || (subjectId = subject.getSubjectId()) == null) {
                    subjectId = "";
                }
                map.put("subject_id", subjectId);
                if (suggestEntity == null || (verticalRank = suggestEntity.getVerticalRank()) == null || (title = verticalRank.getTitle()) == null) {
                    title = "";
                }
                map.put("word", title);
                if (suggestEntity != null && (staff = suggestEntity.getStaff()) != null && (staffId = staff.getStaffId()) != null) {
                    str2 = staffId;
                }
                map.put("staff_id", str2);
                map.put("index", String.valueOf(i11));
                map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
                map.put("sug_source", sugSource);
                C24662i.f75350a.m96881p("search_suggest", map);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }

        /* JADX INFO: renamed from: x */
        public final void m78144x(String str, String str2, String sugSource) {
            Intrinsics.m97802h(sugSource, "sugSource");
            HashMap map = new HashMap();
            if (str == null) {
                str = "";
            }
            map.put("keyword", str);
            map.put("tabId", String.valueOf(str2));
            map.put("event_type", "result_tab_click");
            map.put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
            map.put("sug_source", sugSource);
            C14450a.f50860a.m65143f("searchresult", map);
        }
    }
}
